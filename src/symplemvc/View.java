package symplemvc;

public class View {
   private Controller controller = new Controller();


    public void fireEventShowData() {

        System.out.println(controller.onDataListShow());
    }

}