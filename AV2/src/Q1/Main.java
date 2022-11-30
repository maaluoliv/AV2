package Q1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws FileNotFoundException, FullStackException {
        ArrayStack nomes = new ArrayStack();
        LinkedList<String> nomesLl = new LinkedList<String>();

        Scanner nome = new Scanner(new File("C:\\Users/12112747/IdeaProjects/AV2/src/Q1/nomes.txt"));

        while (nome.hasNextLine()){
            nomes.push(nome.nextLine());
        }
        while (!nomes.isEmpty()){
            nomesLl.add(String.valueOf(nomes.pop()));
        }
        System.out.println(nomesLl);
    }
}

