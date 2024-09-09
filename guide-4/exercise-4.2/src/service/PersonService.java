package service;

import model.Person;

import java.util.Objects;
import java.util.Random;

public class PersonService {
    public Integer calculateIMC(Person p) {
        double imc = p.getWeight() / Math.pow(p.getHeight(), 2);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public Boolean isOverAge(Person p) {
        return p.getAge() >= 18;
    }

    public String checkGender(Person p, String gender) {
        if (!Objects.equals(gender, "Masculine") && !Objects.equals(gender, "Feminine")) {
            p.setGender("Masculine");
        }
        return "The gender is not correct";
    }

    public String generateRandomDNI(Person p) {
        Random random = new Random();

        p.setDni(String.valueOf(10000000 + random.nextInt(30000000)));

        return p.getDni();
    }
}
