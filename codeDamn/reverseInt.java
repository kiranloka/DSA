package  codeDamn;
class reverseInt{
    public int reverseNum(int num){
        int result=0;
        while(num!=0){
            int lastDigit=num%10;
            result=result*10+lastDigit;
            num=num/10;
        }
        return result;
    }
    public static void main(String args[]){
        reverseInt reverseNumber =new reverseInt();
        int answer=reverseNumber.reverseNum(154);
        System.out.println("The number after reversing will be: "+answer);
    }
}
