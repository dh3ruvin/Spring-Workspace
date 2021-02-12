import com.springdemo.repository.SpeakerRepository;
import com.springdemo.service.SpeakerService;
import com.springdemo.service.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {

        // hardcoded reference using new
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
