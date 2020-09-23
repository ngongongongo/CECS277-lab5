/** Declare a die */
public class Die {
    /** A die's number of sides */
    private int sides;
    /** Value of the face-up side*/
    private int dieValue;

    /** Default Constructor
     * A 6-sided dice
    */
    public Die(){
        sides = 6;
        roll();
    }

    /** Overload Constructor
     * @param s - Other dices have s number of sides
     */
    public Die(int s){
        if (s > 1){
            sides = s;
        } else{
            sides = 6;
        }
        roll();
    }

    /** Roll the die
     * @return int
     */
    public int roll(){
        dieValue = (int)(Math.random() * sides) + 1;
        return dieValue;
    }

    public int getdieValue(){
        return dieValue;
    }

    public boolean setDieValue(int value){
        return (value > 0  && value <= sides);
        
    }

    public String toString(){
        return "" + dieValue;
    }

}