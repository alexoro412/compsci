public class BinaryToDecimalBetter {
    public static void main (String[] args){
        //Largest number: 524287 || (2^19)-1
        long binaryNum = 1011100101110001L;
        int total = (int)(Math.log10(binaryNum) + 1), result = 0;
        for(int i = 0; i < total; i++)
            result += (((int)(binaryNum / (Math.pow(10,i))) % 2) * Math.pow(2,i));
        System.out.println(result);
    }
}