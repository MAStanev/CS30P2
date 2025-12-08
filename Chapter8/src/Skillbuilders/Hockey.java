package Skillbuilders;

public class Hockey 
{
    public static void main(String[] args) 
    {
        Puck youthPuck = new Puck(4);
        Puck adultPuck = new Puck(5.5);
        
        // Youth Puck
        System.out.println(youthPuck.getDivision());
        System.out.println(youthPuck.getRadius());
        System.out.println(youthPuck.getWeight());
    }
}
