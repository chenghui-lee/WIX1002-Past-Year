
public class Essay extends GradedActivity{
    private int grammar,spelling,length,content;

    public Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
    }
    
    
    public String toString(){
        return "Grammar: " + grammar + "\n" +
                "Spelling: " + spelling + "\n" + 
                "Length: " + length + "\n" + 
                "Content: " + content + "\n"; 
    }
    
}
