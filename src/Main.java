public class Main {

    public static void main(String[] args) {
        String bericht = "Vandaag is het weer mooi.";

        System.out.println(bericht);
        System.out.println("5.karakter :"+bericht.charAt(5));

        String combineren=bericht.concat("Prima");
        System.out.println(bericht.concat("Prima"));
        System.out.println(combineren);
        System.out.println(bericht.startsWith("A"));
        System.out.println(bericht.endsWith("."));
        char[] karakterler=new char[7];
        bericht.getChars(0,7,karakterler,0);
        System.out.println(karakterler);
        System.out.println("H harfi metinde kacinci karakter:"+bericht.indexOf('h')+". karakter");
        System.out.println("w harfi metinde kacinci karakter:"+bericht.lastIndexOf('w')+". karakter");
        System.out.println("e harfi metinde kacinci karakter:"+bericht.indexOf('e')+". karakter");
        System.out.println("e harfi metinde kacinci karakter:"+bericht.lastIndexOf('e')+". karakter");
    }
}
