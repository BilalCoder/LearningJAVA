public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0)
            System.out.println("Invalid Value");
        else {
            int megas = kiloBytes / 1024;
            int kilos = kiloBytes % 1024;
            System.out.println(kiloBytes+" KB = "+megas+" MB and "+kilos+" KB");
        }
    }
}
