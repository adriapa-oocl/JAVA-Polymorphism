class Printer{
    public void doPrint(String colorChoice) {
        System.out.println("Printing...");
    }
    public void doPrint(String colorChoice, String colorShade) {
    }
}

class coloredPrinter extends Printer{
    @Override
    //Override Method -> for static printing with a colored ink using Colored Printer
    public void doPrint(String colorChoice){
        System.out.println("Used Colored Printer and "+colorChoice+" ink");
    }
    //Overload Method -> Used overload since it is also possible for a Colored Printer to print in black color to apply a more dynamic polymorphism
    public void doPrint(String colorChoice, String colorShade){
        System.out.println("Used Colored Printer and "+colorChoice+" ink with "+colorShade+" shade");
    }
}

class greyscalePrinter extends Printer{
    @Override
    //Override Method -> for static printing with a black ink using Black and White Printer
    public void doPrint(String colorChoice){
        System.out.println("Used Black and White Printer and "+colorChoice+" ink");
    }
}

public class Main {
    public static void main(String[] args) {
        String printerType = "Black and White";
        String colorChoice = "Black";
        String colorShade;

        if (printerType == "Black and White" && (colorChoice == "Black" || colorChoice == "black")){
            colorShade = "Greyscale";
        }
        else{
            colorShade = "Colored";
        }

        System.out.println("Printer Type: "+printerType);
        System.out.println("Color to be printed: "+colorChoice);
        System.out.println("Color Shade: "+colorShade);
        Printer printQueue = new Printer();
        printQueue.doPrint(colorChoice);

        if (colorShade == "Colored" && (colorChoice == "Black" || colorChoice == "black")){
            Printer coloredPrintBlack = new coloredPrinter();
            coloredPrintBlack.doPrint(colorChoice, colorShade);
        }
        else if (colorShade == "Colored"){
            Printer coloredPrint = new coloredPrinter();
            coloredPrint.doPrint(colorChoice);
        }
        else{
            Printer greyscalePrint = new greyscalePrinter();
            greyscalePrint.doPrint(colorChoice);
        }
    }
} 