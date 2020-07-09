package test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MetaDataTest {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

      HashMap<String, Object> computer_mall = (HashMap<String, Object>) getAllTableColumn();

      Set<String> tableNames = computer_mall.keySet();
      System.out.println("一共有表：" + tableNames.size() + "张");
      for (String tableName : tableNames) {
        System.out.println("===========================\r\n");
        System.out.println("表名：" + tableName);

        // <字段名,类型>  HashMap 集合
        HashMap<String, String> columnNames = (HashMap<String, String>) computer_mall.get(tableName);

        Set<String> columns = columnNames.keySet();

        for (String column : columns) {
          System.out.println("字段名：" + column + " 类型：" + columnNames.get(column));
        }

        System.out.println("===========================\r\n");
      }


    }

    public static Map getAllTableColumn () throws ClassNotFoundException, SQLException {

      String driver = "com.mysql.jdbc.Driver";
      String url = "jdbc:mysql://127.0.0.1:3306/yrtest";
      String username = "root";
      String password = "lcwkd123";
      Map<String, Object> tableNameMap = new HashMap<>();


      //加载驱动
      Class.forName(driver);

      //获得数据库连接
      Connection connection = DriverManager.getConnection(url, username, password);
      //获得元数据
      DatabaseMetaData metaData = connection.getMetaData();
      //获得表信息
      ResultSet tables = metaData.getTables(null, null, null, new String[]{"TABLE"});

      while (tables.next()) {
        Map<String, String> columnNameMap = new HashMap<>(); //保存字段名

        //获得表名
        String table_name = tables.getString("TABLE_NAME");
        //通过表名获得所有字段名
        ResultSet columns = metaData.getColumns(null, null, table_name, "%");
        //获得所有字段名
        while (columns.next()) {
          //获得字段名
          String column_name = columns.getString("COLUMN_NAME");
          //获得字段类型
          String type_name = columns.getString("TYPE_NAME");
//获得字段注释   注意： 对于此列，SQL Server 始终会返回 Null。
          String remarks = columns.getString("REMARKS");
//   https://docs.microsoft.com/zh-cn/sql/connect/jdbc/reference/getcolumns-method-sqlserverdatabasemetadata?view=sql-server-2017
//                System.out.println(table_name+":"+column_name+":"+remarks);

          columnNameMap.put(column_name, type_name);
        }

        tableNameMap.put(table_name, columnNameMap);

      }

      return tableNameMap;
    }



}
