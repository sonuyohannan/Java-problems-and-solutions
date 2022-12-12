import java.util.*;
class CheckStack{

    Stack<character> stack = new Stack<Character>();

   boolean checkwheather(String expr){

        for(i=0;i<expr.length;i++){
             char chtr=expr.charAt(i);

             if(chtr=='('|| chtr='['|| chtr='{'){
                 stack.push(chtr);
                 continue;

             }

             if(stack.isEmpty){
                 return false;
             }

             char check ;
             switch(expr){
                 case '}':
                     stack.pop();
                    break;
                case ']':
                    stack.pop();
                    break;
                case ')':
                    stack.pop();
                    break;
             }

             return (stack.isEmpty);

        }
       
    }
    
}

class Main{
    public static void main(String args[]){
        String expr="([{}])";

        CheckStack ch=new CheckStack();

     

       if(  ch.checkwheather(expr)){
           System.oup.print("String is balanced");
       }
       else{
           System.out.print("String is unbalanced");
       }
       

       
    }
}