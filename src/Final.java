public class Final {


    void div(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        else {
            int c=a/b;
            System.out.println(c);

        }
    }
    public static void main(String[]args) throws ArithmeticException{
        Final dm =new Final();
        try {
            dm.div(10,0);
        }
        catch (Exception e){
            System.out.println("value of zero");
        }


    }
    }

