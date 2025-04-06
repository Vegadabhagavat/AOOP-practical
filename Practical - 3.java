public class Rev{
    public static void main(String[]args){
        int num = 321;
        int RevNum = 0;
        while(num !=0){
            int digit = num %10 ;
            RevNum=RevNum*10+digit;
            num /=10;
        }
        System.out.println(RevNum);
    }
}
