package exercicicos.nomeenascimento;

public class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }
    public void setName(String name){
        if(name.isEmpty()){
            throw new IllegalArgumentException("Insira um caracter valido na proxima!");
        }
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(this.age < 0){
            System.out.println("nao se pode ter idade negativa.");
            return;
        }
        this.age=age;
    }
}
