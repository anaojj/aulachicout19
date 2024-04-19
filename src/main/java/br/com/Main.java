package br.com;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String arquivoCSV = "funcionarios.csv";
        Scanner scanner = new Scanner(System.in);

        try (CSVWriter writer = new CSVWriter(new FileWriter(arquivoCSV, true))) {
            System.out.println("Adicionar novo funcionário:");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            // Escrever os dados do funcionário no arquivo CSV
            String[] linha = {nome, cargo, String.valueOf(salario)};
            writer.writeNext(linha);

            System.out.println("Funcionário adicionado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
