import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        String rout = "C:/Users/luism/OneDrive/Documentos/GitHub/CuiCui/AnalizadorLexico/src/tokens/Lexer.flex";
        lexicGenerator(rout);
    }
    public static void lexicGenerator(String rout) {
        File file = new File(rout);
        jflex.Main.generate(file);
    }
}
