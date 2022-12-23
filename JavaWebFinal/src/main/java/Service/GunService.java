package Service;

import com.example.javawebfinal.Entity.Gun;
import com.example.javawebfinal.Repository.GunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class GunService {
    @Autowired
    GunRepository gunRepository;

    public List<Gun> getAllGuns()
    {
        return(List<Gun>) gunRepository.findAll();
    }
}
