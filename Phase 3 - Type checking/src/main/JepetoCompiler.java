package main;

import main.ast.nodes.Program;
import main.visitor.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parsers.*;

public class JepetoCompiler {

    public void compile(CharStream textStream) {
        JepetoLexer jepetoLexer = new JepetoLexer(textStream);
        CommonTokenStream tokenStream = new CommonTokenStream(jepetoLexer);

        JepetoParser jepetoParser = new JepetoParser(tokenStream);
        Program program = jepetoParser.jepeto().jepetoProgram;
        ErrorReporter errorReporter = new ErrorReporter();
        ASTTreePrinter astTreePrinter = new ASTTreePrinter();

        NameAnalyser nameAnalyser = new NameAnalyser();
        program.accept(nameAnalyser);

        int numberOfErrors = program.accept(errorReporter);

        if(numberOfErrors > 0)
            System.exit(1);

        //program.accept(astTreePrinter);   //Not used anymore in phase 3

        TypeSetter typeSetter = new TypeSetter();
        TypeErrorFinder typeErrorFinder = new TypeErrorFinder();
        program.accept(typeSetter);
        program.accept(typeErrorFinder);
        int numberOfTypeErrors = program.accept(errorReporter);

        if(numberOfTypeErrors == 0)
            System.out.println("Compilation successful");
    }
}
