package Guias.Guia4.Ej5;

public class LinkText extends FormatText{

    public LinkText(HTMLText element, String format){
        super(element, format);
    }

    @Override
    public String source() {
        return "<a href:%s>%s</a>".formatted(format, element.source());
    }
}