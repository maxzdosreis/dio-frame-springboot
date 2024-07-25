package dio.spring_data_jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Component;

import dio.spring_data_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        dio.spring_data_jpa.model.User user = new dio.spring_data_jpa.model.User();
        user.setName("Max Reis");
        user.setUsername("maxreis");
        user.setPassword("dio123");

        repository.save(user);

        for(dio.spring_data_jpa.model.User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
