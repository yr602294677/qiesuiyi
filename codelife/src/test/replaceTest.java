package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class replaceTest {

  public static void main(String[] args) {
    String tableName="CC_CFXX";
    List keyList=new ArrayList();
    keyList.add("cc_cfxx_cfnm");
    List valList=new ArrayList();
    valList.add("40288007602e9a2b01602fe1587a007a");
    valList.add("40288007602e9a2b01603008b8a900ad");
    valList.add("40288007602e9a2b01603045fcc70102");
    System.out.println(getRowdata(tableName,keyList,valList));
  }
  //查询表中数据
  private static  String getRowdata(String tableName, List<String> keyList, List valList) {
    StringBuilder sql = new StringBuilder();
    sql.append("SELECT * FROM ").append(tableName).append(" WHERE ");
    String key, val;
    sql.append("(");
    Map rowdata;
    for (int m = 0; m < keyList.size() - 1; m++) {
      rowdata = (HashMap) valList.get(m);
      key = keyList.get(m);
      val = (String) rowdata.get(key);
      sql.append(key).append("='").append(val).append("'");
      sql.append("and ");
    }
    key = keyList.get(keyList.size() - 1);
//    rowdata = (HashMap) valList.get(keyList.size() - 1);
   // val = rowdata.get("DATA_PRI_VAL").toString();
    val = (String) valList.get(0);
    sql.append(key).append("='").append(val).append("'");
    for (int j = 1; j <valList.size() ; j++) {
      val = (String) valList.get(j);
      sql.append(" or ").append(key).append("='").append(val).append("'");
    }

    sql.append(")");
    if (keyList.size() > 1) {
      for (int i = 1; i < valList.size(); i++) {
        sql.append("or ( ");
        for (int j = 0; j < keyList.size() - 1; j++) {
          key = keyList.get(j);
          rowdata = (HashMap) valList.get(j);
          val = (String) rowdata.get(key);
          sql.append(key).append("='").append(val).append("'and ");
        }
        key = keyList.get(keyList.size() - 1);
        rowdata = (HashMap) valList.get(keyList.size() - 1);
        val = (String) rowdata.get(key);
        sql.append(key).append("='").append(val).append("'");
        sql.append(") ");
      }
    }
    return sql.toString();
  }
}