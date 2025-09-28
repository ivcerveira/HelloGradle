import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorBat {
    public static void main(String[] args) {
        // Nome do arquivo .bat
        String nomeArquivo = "executar-ivping.bat";

        // Conteúdo do .bat
        String conteudo = "@echo off\n" +
                "REM ================================\n" +
                "REM Script para executar o Ivping.jar\n" +
                "REM ================================\n\n" +
                "set DIR=%~dp0\n" +
                "set JAVA_HOME=%DIR%jdk-21.0.8-full\n\n" +
                "\"%JAVA_HOME%\\bin\\java.exe\" -jar \"%DIR%Ivping.jar\"\n\n" +
                "pause\n";

        try {
            File arquivo = new File(nomeArquivo);

            // Se já existir, apaga antes de recriar
            if (arquivo.exists()) {
                arquivo.delete();
            }

            try (FileWriter fw = new FileWriter(arquivo)) {
                fw.write(conteudo);
            }

            System.out.println("Arquivo " + nomeArquivo + " criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
