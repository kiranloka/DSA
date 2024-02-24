package codeDamn;
class isPoweroftwo{
    public  boolean isPowerOfTwo(int num){
        if(num <= 0) return false;
    
        while(num != 1){
            int lastBit = num & 1;
            if(lastBit == 1){
                return false;
            }
            num = num >> 1;
        }
        return true;
    }
    

    
    public static void main(String args[]) {
        int num = 10;
        isPoweroftwo answer = new isPoweroftwo();
        boolean solution = answer.isPowerOfTwo(10);
        System.out.println("Is " + num + " a power of two? " + solution);
    }
}