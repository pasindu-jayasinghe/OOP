package Inheritance;

public class TextBox extends UIControl{

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }


    @Override
    public String toString(){
        return text;
    }

    public String text = "";

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        this.text = "";
    }
}
