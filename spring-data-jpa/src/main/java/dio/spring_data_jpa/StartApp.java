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
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        List<dio.spring_data_jpa.model.User> users = userRepository.findByUsername("maxreis");
        for(dio.spring_data_jpa.model.User u: users){
            System.out.println(u);
        }
    }
    private void insertUser(){
        dio.spring_data_jpa.model.User user = new dio.spring_data_jpa.model.User();
        user.setName("GABRIEL NUNES");
        user.setUsername("gabriel");
        user.setPassword("santos");
        userRepository.save(user);

        for(dio.spring_data_jpa.model.User u: userRepository.findAll()){
            System.out.println(u);
        }
    }
}
