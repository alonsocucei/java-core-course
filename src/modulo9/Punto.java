
public class Punto {

    private float x;
    private float y;

    public Punto(float x, float y) {
        setX(x);
        setY(y);
    }
    
    public Punto() {
        this.x = 1; // esto es igual a setX(1);
        this.y = 1; // esto es igual a setY(1);
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        if (x >= 0) {
            this.x = x;
        } else {
            System.err.println("NO se aceptan valores negativos. El valor ahora es 0.");
            this.x = 0;
        }
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        if (y >= 0) {
            this.y = y;
        } else {
            System.err.println("NO se aceptan valores negativos. El valor ahora es 0.");
            this.y = 0;
        }
    }

}
