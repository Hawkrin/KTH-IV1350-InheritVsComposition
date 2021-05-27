package task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    List<String> listExample = Arrays.asList("dog", "cat", "bird", "human", "lizard");
    CreateStringUsingInheritance inheritance = new CreateStringUsingInheritance();
    CreateStringUsingComposition composition = new CreateStringUsingComposition();
    public static void main(String[] args) {
        Main mainObject = new Main();

        //mainObject.inheritanceExample();
        mainObject.compositionExample(); 
    }

    public void inheritanceExample() {
        System.out.println(inheritance.listToString(listExample));

        StringBuilder sb = new StringBuilder();
        inheritance.appendLine(sb , "Test1");
        inheritance.appendNewRow(sb);
        inheritance.appendLine(sb, "Test2");
        inheritance.appendSpace(sb);
        inheritance.appendLine(sb, "Test3");
        inheritance.appendNewRow(sb);
        inheritance.appendLine(sb, "The size of this string is: " + inheritance.sizeOfString(sb));
        inheritance.appendNewRow(sb);
        inheritance.appendLine(sb, "END");
        inheritance.printOutString(sb);  
    }

    public void compositionExample() {
        System.out.println(composition.listToString(listExample));

        StringBuilder sb = new StringBuilder();
        composition.appendLine(sb , "Test1");
        composition.appendNewRow(sb);
        composition.appendLine(sb, "Test2");
        composition.appendSpace(sb);
        composition.appendLine(sb, "Test3");
        composition.appendNewRow(sb);
        composition.appendLine(sb, "The size of this string is: " + inheritance.sizeOfString(sb));
        composition.appendNewRow(sb);
        composition.appendLine(sb, "END");
        composition.printOutString(sb);  
    }
    
}