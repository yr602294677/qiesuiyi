import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class list {

  public static void main(String[] args) {
    List<Map<String, String>> list = getInitList();
    JSONArray jsonArray = getJsonArrayBySelectResult(list);
    System.out.println("111"+jsonArray);
    Set<Entry<String, Object>> entrySet = jsonArray.getJSONObject(0).entrySet();
    String[] keys=new String[entrySet.size()];
    int m=0;
    for(Entry<String, Object> entry:entrySet){
      keys[m]=entry.getKey();
      m++;
    }

    JSONArray resultArray = new JSONArray();
    JSONObject jobject=new JSONObject();
    StringBuffer sqlbf=new StringBuffer();
    for (int j = 0; j <keys.length ; j++) {
      //遍历key
      sqlbf.append("{\"data\":");
      sqlbf.append("[\"").append(jsonArray.getJSONObject(0).getString(keys[j]));
      for (int i = 1; i < jsonArray.size(); i++) {
        JSONObject jsonObject = jsonArray.getJSONObject(i);
          jobject.put("name",keys[j]);
          sqlbf.append("\",\"").append(jsonObject.getString(keys[j]));
        }
      sqlbf.append("\"],\"name\":\"").append(keys[j]).append("\"}");
      jobject= JSONObject.parseObject(sqlbf.toString());
      resultArray.add(JSONObject.parseObject(sqlbf.toString()));

      sqlbf.setLength(0);

    }
    System.out.println(resultArray);
  }

  private static JSONArray getJsonArrayBySelectResult(List<Map<String, String>> resultList) {
    Map<String, String> map = new HashMap<String, String>();
    StringBuffer sqlBf = new StringBuffer("[");
    for (int i = 0; i < resultList.size(); i++) {
      map = resultList.get(i);
      sqlBf.append(JSON.toJSONString(map)).append(",");
    }
    sqlBf.append("]");
    String result = sqlBf.toString();
    return JSONArray.parseArray(result);
  }


  private static List<Map<String, String>> getInitList() {
    List<Map<String, String>> list = new ArrayList<>();
    Map<String, String> map1 = new HashMap<>();
    Map<String, String> map = new HashMap<>();
    Map<String, String> map2 = new HashMap<>();
    Map<String, String> map3 = new HashMap<>();
    map.put("jyl", "26");
    map.put("zfl", "16");
    map.put("jcsj", "2019-12-11");
    list.add(0, map);

    map1.put("jyl", "48");
    map1.put("zfl", "9");
    map1.put("jcsj", "2019-12-09");
    list.add(1, map1);

    map2.put("jyl","35");
    map2.put("zfl","16");
    map2.put("jcsj","2019-12-07");
    list.add(map2);
    map3.put("jyl","18");
    map3.put("zfl","11");
    map3.put("jcsj","2019-12-06");
    list.add(map3);
    return list;
//    map.clear();
//    map.put("jyl","12");
//    map.put("zfl","18");
//    map.put("jcsj","2019-12-11");
//    list.add(map);
//    map.clear();
//    map.put("jyl","9");
//    map.put("zfl","22");
//    map.put("jcsj","2019-12-04");
//    list.add(map);
//    map.clear();
//    map.put("jyl","20");
//    map.put("zfl","15");
//    map.put("jcsj","2019-12-02");
//    list.add(map);
  }
}
