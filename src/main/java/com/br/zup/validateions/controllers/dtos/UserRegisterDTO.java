package com.br.zup.validateions.controllers.dtos;

public class UserRegisterDTO {
    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 2, message = "Deve conter nome e sobrenome")
    private String name;

    @Min(value = 18, message = "Deve ser maior de idade")
    @Max(value = 110, message = "Deve ser menor que 110 anos")
    private int age;

    @Min(value = 1914, message = "Deve ter menos que 110 anos")
    @Max(value = 2024, message = "Deve ter menos que 110 anos")
    private int yearOfBirth;

    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email deve estar em um formato válido")
    @Pattern(regexp = "^[a-zA-Z0-9._]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$",
            message = "Email deve seguir o padrão válido (exemplo: usuario@dominio.com)")
    private String email;

    public UserRegisterDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
