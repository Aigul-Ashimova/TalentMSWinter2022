import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter




public class User {
 private String name;
 private int age;




    public void sayHi() {
    System.out.println("Hello from "+name);

}
public  void  login(String username,String password){
    System.out.println("login");


}

}
