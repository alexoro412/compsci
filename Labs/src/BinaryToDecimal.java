public class BinaryToDecimal
{
    public static void main (String[] args)
    {
        int result = 0, i = 0, binaryNum = 10101101;
        result += ((int)(binaryNum / (Math.pow(10,i))) % 2) * Math.pow(2,i); i++;
        result += ((int)(binaryNum / (Math.pow(10,i))) % 2) * Math.pow(2,i); i++;
        result += ((int)(binaryNum / (Math.pow(10,i))) % 2) * Math.pow(2,i); i++;
        result += ((int)(binaryNum / (Math.pow(10,i))) % 2) * Math.pow(2,i); i++;
        result += ((int)(binaryNum / (Math.pow(10,i))) % 2) * Math.pow(2,i); i++;
        result += ((int)(binaryNum / (Math.pow(10,i))) % 2) * Math.pow(2,i); i++;
        result += ((int)(binaryNum / (Math.pow(10,i))) % 2) * Math.pow(2,i); i++;
        result += ((int)(binaryNum / (Math.pow(10,i))) % 2) * Math.pow(2,i);
        System.out.println(result);
    }
}