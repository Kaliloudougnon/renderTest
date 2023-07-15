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

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author HP
 */
@SpringBootApplication
public class DemoApplication {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Bean
    CommandLineRunner Start() {
        return args -> {
            String pathFileTse = "src/bac-ae-segou-2022/tse.csv";
            String pathFileTsexp = "src/bac-ae-segou-2022/tsexp.csv";
            String pathFileTseco = "src/bac-ae-segou-2022/tseco.csv";
            String pathFileTss = "src/bac-ae-segou-2022/tss.csv";
            String pathFileTll = "src/bac-ae-segou-2022/tll.csv";
            String pathFileTal = "src/bac-ae-segou-2022/tal.csv";
            String pathFile3 = "src/bac-2020_ae-segou.csv";
            String pathFile4 = "src/bac-2021_ae-segou.csv";
            String pathFile5 = "src/bac-2022_ae-segou.csv";
            String line = "";
            String line0 = "";
            String line1 = "";
            String line2 = "";
            String line3 = "";
            String line4 = "";
            String line5 = "";
            try {
                BufferedReader fileTse = new BufferedReader(new FileReader(pathFileTse));
                BufferedReader fileTsexp = new BufferedReader(new FileReader(pathFileTsexp));
                BufferedReader fileTseco = new BufferedReader(new FileReader(pathFileTseco));
                BufferedReader fileTss = new BufferedReader(new FileReader(pathFileTss));
                BufferedReader fileTll = new BufferedReader(new FileReader(pathFileTll));
                BufferedReader fileTal = new BufferedReader(new FileReader(pathFileTal));
                BufferedReader br2 = new BufferedReader(new FileReader(pathFile4));
                BufferedReader br3 = new BufferedReader(new FileReader(pathFile3));
                while ((line0 = fileTse.readLine()) != null) {
                    String[] strings = line0.split(",");
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
                    etudiant.setSerie("TSE");
                    etudiantRepository.save(etudiant);
                }
                while ((line1 = fileTsexp.readLine()) != null) {
                    String[] strings = line1.split(",");
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
                    etudiant.setSerie("TSEXP");
                    etudiantRepository.save(etudiant);
                }
                while ((line2 = fileTseco.readLine()) != null) {
                    String[] strings = line2.split(",");
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
                    etudiant.setSerie("TSECO");
                    etudiantRepository.save(etudiant);
                }
                while ((line3 = fileTss.readLine()) != null) {
                    String[] strings = line3.split(",");
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
                    etudiant.setSerie("TSS");
                    etudiantRepository.save(etudiant);
                }
                while ((line4 = fileTll.readLine()) != null) {
                    String[] strings = line4.split(",");
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
                    etudiant.setSerie("TLL");
                    etudiantRepository.save(etudiant);
                }
                while ((line5 = fileTal.readLine()) != null) {
                    String[] strings = line5.split(",");
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
                    etudiant.setSerie("TAL");
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


}
