
package empresaapp;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author X601533
 */
public class EmpresaApp {


    public static void main(String[] args) {
        
            ArrayList<Funcionario> funcs;
            FuncionarioDao dao = new FuncionarioDao();
            Funcionario f = new Funcionario();
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("NUMMAT: ");
            f.setNummat(scanner.nextInt());
            scanner.nextLine();
            System.out.print("NOME: ");
            f.setNome(scanner.nextLine());
            System.out.print("SALÁRIO: ");
            f.setSalario(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("SEXO: ");
            f.setSexo(scanner.nextLine().charAt(0));
            scanner.nextLine();
            System.out.print("NDPTO: ");
            f.setNdepto(scanner.nextInt());
            scanner.nextLine();
            System.out.print("NSUPER: ");
            f.setNsuper(scanner.nextInt());
            scanner.nextLine();
            dao.adiciona(f);
            System.out.println(" ");
            funcs = dao.getLista();
            for(Funcionario funcionario : funcs){
                funcionario.print();
                System.out.println(" ");
            }
    }
    
}
