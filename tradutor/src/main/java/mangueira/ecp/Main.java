package mangueira.ecp;

public class Main {
    public static void main(String[] args) throws Exception {
        
         
        String input = "let a = 42 + 5;";
            Scanner scan = new Scanner (input.getBytes());
            for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk = scan.nextToken()) {
                System.out.println(tk);
        }
        
        /*
        String input = "let a = 42 + 5";
        Parser p = new Parser (input.getBytes());
        p.parse();*/
    } 
}
