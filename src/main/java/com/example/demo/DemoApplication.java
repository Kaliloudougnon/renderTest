package com.example.demo;

import com.example.demo.dao.entities.Etudiant;
import com.example.demo.dao.repository.EtudiantRepository;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;
import java.io.FileReader;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EtudiantRepository etudiantRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Bean
    CommandLineRunner Start() {
        return args -> {
            String pathFile = "src/tse.csv";
            String pathFile2 = "src/tsexp.csv";
            String pathFile3 = "src/bac-2020_ae-segou.csv";
            String pathFile4 = "src/bac-2021_ae-segou.csv";
            String pathFile5 = "src/bac-2022_ae-segou.csv";
            String line2 = "";
            String line = "";
            try {
                BufferedReader br = new BufferedReader(new FileReader(pathFile5));
                BufferedReader br2 = new BufferedReader(new FileReader(pathFile4));
                BufferedReader br3 = new BufferedReader(new FileReader(pathFile3));
                while ((line = br.readLine()) != null) {
                    String[] strings = line.split(",");
                    Etudiant etudiant = new Etudiant();
                    etudiant.setNumPlace(Long.valueOf(strings[0]));
                    etudiant.setLastName(strings[1]);
                    etudiant.setName(strings[2]);
                    etudiant.setSexe(strings[3]);
                    etudiant.setAnnnee_naissance(strings[4]);
                    etudiant.setEtablissement(strings[5]);
                    etudiant.setAcademie(strings[6]);
                    etudiant.setStatut(strings[7]);
                    etudiant.setMention(strings[8]);
                    etudiant.setSession(2022);
                    etudiantRepository.save(etudiant);
                }
                while ((line = br2.readLine()) != null) {
                    String[] strings = line.split(",");
                    Etudiant etudiant = new Etudiant();
                    etudiant.setNumPlace(Long.valueOf(strings[0]));
                    etudiant.setLastName(strings[1]);
                    etudiant.setName(strings[2]);
                    etudiant.setSexe(strings[3]);
                    etudiant.setAnnnee_naissance(strings[4]);
                    etudiant.setEtablissement(strings[5]);
                    etudiant.setAcademie(strings[6]);
                    etudiant.setStatut(strings[7]);
                    etudiant.setMention(strings[8]);
                    etudiant.setSession(2021);
                    etudiantRepository.save(etudiant);
                }
                while ((line = br3.readLine()) != null) {
                    String[] strings = line.split(",");
                    Etudiant etudiant = new Etudiant();
                    etudiant.setNumPlace(Long.valueOf(strings[0]));
                    etudiant.setLastName(strings[1]);
                    etudiant.setName(strings[2]);
                    etudiant.setSexe(strings[3]);
                    etudiant.setAnnnee_naissance(strings[4]);
                    etudiant.setEtablissement(strings[5]);
                    etudiant.setAcademie(strings[6]);
                    etudiant.setStatut(strings[7]);
                    etudiant.setMention(strings[8]);
                    etudiant.setSession(2020);
                    etudiantRepository.save(etudiant);
                }

            } catch (Exception e) {
                System.out.println(line.toString());
            }

        };
    }
    @GetMapping("count-users")
    public String getCountUsers() {
        long numberUsers = userRepository.count();
        return "Number of users = " + numberUsers;
    }

    @GetMapping("add-user")
    public String addUser() {
        User user = new User();
        user.setFirstName("Render");
        user.setLastName("Spring Boot");
        userRepository.save(user);
        return "User added successfully";
    }

}
