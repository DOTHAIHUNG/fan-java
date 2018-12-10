public class Fan {
    public final int slow = 1;
    public final int medium = 2;
    public final int fast = 3;

    private int speed = slow;
    boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSlow() {
        return slow;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public String changeToString() {
        if (this.on) {
            return "Speed of fan " + this.speed + "\n" + "Color of fan " + this.color + "\n" + "Radius of fan " + this.radius + "\n"
                    + "Fan is on";
        } else {
            return "Color of fan " + this.color + "\n" + "Radius of fan " + this.radius + "\n" + "Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.println("Quat 1 o trang thai mac dinh");
        System.out.println(fan1.changeToString());
        fan1.setOn(true);
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println("Quat 1 sau khi thay doi trang thai");
        System.out.println(fan1.changeToString());

        Fan fan2 = new Fan();
        System.out.println("Quat 2 co trang thai");
        fan2.setOn(false);
        fan1.setSpeed(fan1.medium);
        fan1.setRadius(5);
        fan1.setColor("blue");
        System.out.println(fan2.changeToString());
    }
}
