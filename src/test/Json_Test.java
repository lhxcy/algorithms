package test;
import org.json.*;
/**
 * Created by XCY on 2017/12/8.
 */
public class Json_Test {
    public static void main(String[] args){
        String str = "{ \"_id\" : { \"$oid\" : \"57fd0e9c0d00f0458ea0b372\" }," +
                " \"title\" : \"基于FPGA的Turbo码译码算法实现\", \"journal\" : \"系统工程与电子技术\"," +
                " \"quote\" : \"11\", \"abstract\" : { \"Chinese\" : \"在分析Turbo码编译码中MAP类译码算法的基础上," +
                "重点研究了Max-Log-MAP译码算法的工程实现方法.为解决Turbo码译码嚣FPGA实现时的复杂性高、存储量大的问题," +
                "提出了一种基于FPGA的优化译码器结构和译码算法实现方案,有效减少了存储容量,提高了处理速度," +
                "并在Altera的EP2S90芯片上实现了10MHz速率的Turbo码译码器,通过时序仿真验证了译码结构的有效性.\"," +
                " \"English\" : null }, \"date\" : { \"period\" : \"8\", \"year\" : \"2008\" }," +
                " \"link\" : \"http://d.wanfangdata.com.cn/Periodical/xtgcydzjs200808046\"," +
                " \"authors\" : { \"桑会平\" : { \"institution\" : \"电子科技集团54所\", " +
                "\"location\" : \"石家庄\" }, \"张桂华\" : { \"institution\" : \"西安电子科技大学电子工程学院\"," +
                " \"location\" : \"西安\" }, \"姬红兵\" : { \"institution\" : \"电子科技集团54所\", \"location\" : \"石家庄\" } }, " +
                "\"keywords\" : [ \"Turbo码\", \"Max-Log-MAP算法\", \"FPGA\", \"译码器\" ], " +
                "\"include\" : \"ISTIC\", \"institutions\" : { \"电子科技集团54所\" : \"石家庄\", " +
                "\"西安电子科技大学电子工程学院\" : \"西安\" } }";
        JSONObject jsonObject = new JSONObject(str);
        printObject(jsonObject.getString("title"));
        printObject(jsonObject.getString("quote"));
        printObject(jsonObject.getString("link"));
//        printObject(jsonObject.getString("abstract"));
//        JSONArray abstractJsonArray = jsonObject.getJSONArray("key")
//        printObject(jsonObject.getString("keywords"));
        JSONArray keywordsJsonArray = jsonObject.getJSONArray("keywords");
        printObject(keywordsJsonArray.length());
        for (Object object : keywordsJsonArray){
            printObject(object);
        }
        if (jsonObject.get("abstract").getClass().equals(JSONObject.class)){
            JSONObject abstractJsonObject = jsonObject.getJSONObject("abstract");
            printObject(abstractJsonObject.getString("Chinese"));
            printObject(abstractJsonObject.getString("English"));
        }
        printObject(JSONObject.class);
//        if (jsonObject.get("date").getClass().equals(JSONObject.class)){
//
//        }

//        printObject();
    }

    public static void printObject(Object object){
        System.out.println(object);
    }


}
