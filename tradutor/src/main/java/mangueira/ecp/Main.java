package mangueira.ecp;

public class Main {
    public static void main(String[] args) throws Exception {
        
        /* 
        String input = "45  + preco - 876";
            Scanner scan = new Scanner (input.getBytes());
            for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk = scan.nextToken()) {
                System.out.println(tk);
        }
        */
        
        String input = "45  + preco - 876";
        Parser p = new Parser (input.getBytes());
        p.parse();
    } 
}
