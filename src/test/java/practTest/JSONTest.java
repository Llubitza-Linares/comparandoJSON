package practTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tarea.tareaJSON;

public class JSONTest {
    @Test
    public void jsonAreEqualTest1() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar5\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": 1545645456\r\n" +
                "}";

        tareaJSON tareaJSON = new tareaJSON();
        Assertions.assertThrows(Exception.class, ()->{tareaJSON.jsonAreEqual(json1, json2, "Error");});
    }

    @Test
    public void jsonAreEqualTest2() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        tareaJSON tareaJSON = new tareaJSON();
        tareaJSON.jsonAreEqual(json1, json2, "Error");
    }

    @Test
    public void jsonAreEqualTest3() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "}";

        String json2 = "{\r\n" +
                "}";

        tareaJSON tareaJSON = new tareaJSON();
        Assertions.assertThrows(Exception.class, ()->{tareaJSON.jsonAreEqual(json1, json2, "Error");});
    }

    @Test
    public void jsonAreEqualTest4() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"abcd\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        tareaJSON tareaJSON = new tareaJSON();
        tareaJSON.jsonAreEqual(json1, json2, "ErrorEnMetodo");
    }

    @Test
    public void jsonAreEqualTest5() throws Exception {
        String json1 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": false,\r\n" +
                "\"update\": true\r\n" +
                "}";

        String json2 = "{\r\n" +
                "\"name\":\"eynar\",\r\n" +
                "\"icon\": 5,\r\n" +
                "\"deleted\": true,\r\n" +
                "\"id\": 5465456,\r\n" +
                "\"createTime\": \"IGNORE\",\r\n" +
                "\"update\": true\r\n" +
                "}";

        tareaJSON tareaJSON = new tareaJSON();
        tareaJSON.jsonAreEqual(json1, json2, "ErrorEnMetodo");
    }
}
