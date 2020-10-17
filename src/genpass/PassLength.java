
import java.util.Scanner;

public class PassLength {

    private int minLength = 0, maxLength = 0;

    public void setMinLength(int minLength){
        this.minLength = minLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMinLength(){
        return this.minLength;
    }

    public int getMaxLength(){
        return this.maxLength;
    }

    private boolean checkLength(int minLength, int maxLength, int passwordLength){
        return (minLength >= 0 && maxLength > 0 && maxLength > minLength);
    }

    public void inputLength(int passLen){
        while (checkLength(getMinLength(), getMaxLength(), passLen) == false){
            System.out.print("Input minLength: ");
            Scanner scan1 = new Scanner(System.in);
            setMinLength(scan1.nextInt());
            System.out.print("Input maxLength: ");
            Scanner scan2 = new Scanner(System.in);
            setMaxLength(scan2.nextInt());
        }
    }

}
