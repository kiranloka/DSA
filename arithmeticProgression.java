public class arithmeticProgression {
    public static void main(String[] args) {
        int[] array={2,4,6,12,10};
        if(isAritmeticProgression(array)){
            System.out.println("This sequence is in arithmetic Progression");
        }else{
            System.out.println("This sequence is not in arithmetic Progression");
        }
    }
    private static boolean isAritmeticProgression(int[] array){
        if(array.length<2){
            return true;
        }
        int commonDifference=array[1]-array[0];
        for(int i=2;i<array.length;i++){
            if(array[i]-array[i-1]!=commonDifference){
                return false;
            }
        }
        return true;
    }
    
}
