package basics.classes;

class Main {
    public static void main(String[] args) {
        // Create instances of the Cookie class
        Cookie chocolateCookie = new Cookie("Brown");
        Cookie vanillaCookie = new Cookie("White");

        // Print the color of each cookie
        System.out.println("Chocolate Cookie Color: " + chocolateCookie.getColor());
        System.out.println("Vanilla Cookie Color: " + vanillaCookie.getColor());

        // Change the color of the chocolate cookie
        chocolateCookie.setColor("Dark Brown");
        System.out.println("Updated Chocolate Cookie Color: " + chocolateCookie.getColor());
    }
}
