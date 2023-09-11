// Functional Interface and use of lamda expression (example)


import java.lang.FunctionalInterface;
    // functional interface 
@FunctionalInterface
interface FunInterface {
    //abstract method
    String reverse(String str);

}


public class FuncInterface{

public static void main(String [] args){
    // object (refrence ) of the interface 
    FunInterface fnRef;

    fnRef=(str)->{
       String result ="";
       for(int i=str.length()-1;i>=0;i--){
         result += str.charAt(i);

       }
      
       return result;
    }; // lambda expression 
    System.out.println("the Value of pi "+fnRef.reverse("helloword"));

}
}


