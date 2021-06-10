package commons;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {

    public Faker faker;
    public String fullName;
    public String email;
    public String telephone;
    public String password;
    public String cpf;

    public DataGenerator() {
        double x = (Math.random() * ((999 - 0) + 1)) + 0;
        GeraCpfCnpj gerador = new GeraCpfCnpj();
        this.faker = new Faker(new Locale("pt-BR"));
        this.setFullName(faker.name().fullName());
        this.setEmail(faker.internet().emailAddress()+(int)x);
        this.setTelephone(faker.phoneNumber().cellPhone());
        this.setPassword(faker.internet().password(4,20));
        this.setCpf(gerador.cpf(false));
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
