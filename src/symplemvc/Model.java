package symplemvc;

import java.util.List;

public class Model extends Service {
   private Service service = new Service();

    public List<String> getStringDataList() {
        return service.getData();
    }
}