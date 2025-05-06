package mythosforge.flyweight;

public class Font implements FontFlyweight{
    private String family;
    private int size;
    private String style;
    public Font(String family, int size, String style) {
        this.family = family; 
        this.size = size; 
        this.style = style;
    }
    @Override
    public void apply(char c) {
        System.out.println("Char '" + c + "' com fonte " + family +
                           " tamanho " + size + " estilo " + style);
    }
}
