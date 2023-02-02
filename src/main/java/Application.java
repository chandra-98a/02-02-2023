import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceimpl;

public class Application {
    public static void main(String[] args) {
        SpeakerService service = new SpeakerServiceimpl();
        System.out.println(service.findAll().get(0).getFirstName() + " " +service.findAll().get(0).getLastName());
    }

}