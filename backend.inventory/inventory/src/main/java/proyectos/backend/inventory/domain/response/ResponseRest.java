package proyectos.backend.inventory.domain.response;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
@Getter
public class ResponseRest {
    private ArrayList<HashMap<String,String>> metaData = new ArrayList<>();
    public void setMetaData(String type, String code, String date) {
        HashMap<String,String> map = new HashMap<>();
        map.put("type", type);
        map.put("code", code);
        map.put("date", date);
        metaData.add(map);

    }
}
