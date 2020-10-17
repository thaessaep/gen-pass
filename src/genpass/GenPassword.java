
import java.util.regex.Pattern;

public class GenPassword extends PassLength{

    private StringBuilder password = new StringBuilder();

    public void GenPassword(){
        int random;

        inputLength(this.password.length());

        for (int i = 0; i < getMaxLength(); i++){
            random = (int)(Math.random()*120);
            if(Pattern.matches("[a-zA-Z0-9!._]", String.valueOf((char)random))){
                setPassword((char)random);
            }
            if(i == getMaxLength() - 1 && password.length() < getMinLength()){
                i--;
            }
        }
    }

    public void setPassword(char litter) {
        this.password.insert(this.password.length(), litter);
    }

    public StringBuilder getPassword(){
        return password;
    }

}
