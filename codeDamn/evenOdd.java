package codeDamn;
public class evenOdd{
    static boolean isEven(int num){
        if((num^1)==(num+1)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
            int num=19;
            System.out.println(isEven(num)==true?"Even":"Odd");
        }
    }
