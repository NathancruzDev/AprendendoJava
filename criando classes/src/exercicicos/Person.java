package exercicicos;

public class Person {
    private String nome;
    private Integer age;

    public String getNome(String nome){
        return nome;
    }
    public void setNome(){
       //palavra reservada para indicar a variaverl que eu quero acessar
        this.nome =nome;
    }

    public Integer getAge(Integer age) {
        return age;
    }
    public void setAge(){
        this.age=age;
    }
}
