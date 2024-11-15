package mangueira.ecp;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
        String input = "8+5-7";
        Parser p = new Parser (input.getBytes());
        p.parse();
        */
        
        
        String input = "289-85+0+69";
        Scanner scan = new Scanner (input.getBytes());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        System.out.println(scan.nextToken());
        
    }
}