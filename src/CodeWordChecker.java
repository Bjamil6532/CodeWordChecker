public class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String not;

    public CodeWordChecker(int min, int max, String str){
        this.min=min;
        this.max=max;
        this.not=str;
    }
}
