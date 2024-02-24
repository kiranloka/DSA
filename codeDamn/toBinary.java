package codeDamn;
public class toBinary{
    public int toDecimal(int binary){
        int result=0;
        int index=0;

        while(binary!=0){
            int lastDigit=binary%10;
            if(lastDigit==1){
                result=result+(int)Math.pow(2,index);

            }
            index=index+1;
            binary=binary/10;
            
        }
        return result;
    }
    public String toBin(int decimal){
        String result="";

        while(decimal!=0){
            int lastBit=decimal&1;
            result=lastBit+result;
            decimal=decimal>>1;
        }
        return result;

    }    
    public static void main(String args[]){
        toBinary toBinary=new toBinary();
        String answer=toBinary.toBin(19);
        System.out.println("The value after converting is: "+answer);
        int answer2=toBinary.toDecimal(1011);
        System.err.println("AFter converting to binart: "+answer2);

    }
}