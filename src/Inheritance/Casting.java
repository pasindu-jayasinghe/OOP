package Inheritance;

public class Casting {

    public static void main(String[] args) {
        var control = new UIControl(true);
        var textBox = new TextBox();
        show(control);
    }

    public static void show(UIControl uiControl){
        if(uiControl instanceof  TextBox){
            var textBox = (TextBox) uiControl;
            textBox.setText("Hello");
        }
        System.out.println(uiControl);


    }
}
