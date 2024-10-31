package Guias.Guia4.Ej5;

public class PlainText extends BasicText{
    protected String text;

    public PlainText(String text){
        setText(text);
    }

    public void setText(String text){
        this.text = text;
    }

    public String source(){
        return text;
    }
}
