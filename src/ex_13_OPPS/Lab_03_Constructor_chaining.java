package ex_13_OPPS;

import java.lang.reflect.Constructor;

public class Lab_03_Constructor_chaining {
    String email;
    String Password;
    String submitButton;

    Lab_03_Constructor_chaining(String email, String Password)
    {
       this.email = email;
       this.Password= Password;
    }
    Lab_03_Constructor_chaining(String email, String password, String submitButton)
    {
       this(email,password);   //this is constructor chaning
       this.submitButton = submitButton;
    }
}
