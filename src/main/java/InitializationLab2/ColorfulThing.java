package InitializationLab2;

/**
 * Created by evanhitchings on 9/10/16.
 */
public class ColorfulThing {

    private Color color;


    public ColorfulThing(Color color) {
        this.color = color;

    }

    public Color getColor(){
        return this.color;
    }

    @Override
    public String toString(){
        return color.toString();
    }

    public enum Color {PINK, PURPLE, BLACK}




}
