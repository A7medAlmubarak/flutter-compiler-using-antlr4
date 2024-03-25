import AST.program;
import antlr.dartLexer;
import antlr.dartParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.BaseVisitor;

import java.io.IOException;


import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "Files/errors.txt";
        CharStream cs = fromFileName(source);
        dartLexer lexer = new dartLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        dartParser parser = new dartParser(token);
        ParseTree tree = parser.program();
        //BaseVisitor firstScan = new BaseVisitor();
        BaseVisitor firstScan = new BaseVisitor();
        program program = (program) firstScan.visit(tree);

        System.out.println("-------------------------errors------------------------");
        if( !BaseVisitor.errors.getErrors().isEmpty() ){
            BaseVisitor.errors.print();
        }
        else {
            System.out.println("-------------------------program------------------------");
            System.out.println();
            System.out.println(program);
            System.out.println("-------------------------code------------------------");
            System.out.println();
            System.out.println(program.generateCode());
        }


    }
}