public class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String not;

    public CodeWordChecker(int min, int max, String str){
        this.min=min;
        this.max=max;
        this.not=str;
    }

    public CodeWordChecker(String str){
    this.min=6;
    this.max=20;
    this.not=str;
    }
    public boolean isValid(String str) {
        if (str.length() < min || str.length() > max || str.indexOf(not) != -1) {
            return false;
        }
        else
        {
            return true;
        }
    }

}
