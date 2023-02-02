
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceimpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig
{
    @Bean(name="speakerService")
    public SpeakerService getSpeakerService(){
        return new SpeakerServiceimpl();
    }
}
