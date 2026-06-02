import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal que demonstra os conceitos de POO aplicados no sistema de personagens de Eldoria.
 * Demonstra: herança, polimorfismo, encapsulamento, instanceof, equals() e hashCode().
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        System.out.println("Os Guardiões se preparam para a batalha!\n");
        
        // Criando uma lista polimórfica de personagens
        ArrayList<Personagem> personagens = new ArrayList<>();
        
        // Adicionando Magos à lista
        personagens.add(new Mago("Gandalf", 10, 100, 50.0));
        personagens.add(new Mago("Merlin", 15, 120, 60.0));
        if (personagens.get(0) instanceof Mago) {
            System.out.println(personagens.get(0).getNome() + " é um Mago!");
            ((Mago) personagens.get(0)).registrarAcao("Gandalf conjurou um feitiço de proteção.");
            ((Mago) personagens.get(0)).auditarAcoes();
        }
        
        // Adicionando Guerreiros à lista
        personagens.add(new Guerreiro("Aragorn", 20, 150, 70.0));
        personagens.add(new Guerreiro("Legolas", 25, 130, 80.0));
        
        // Adicionando Curandeiros à lista
        personagens.add(new Curandeiro("Elrond", 18, 110, 40.0));
        personagens.add(new Curandeiro("Galadriel", 22, 90, 45.0));

        // Percorrendo a lista e demonstrando polimorfismo
        for (Personagem p : personagens) {
            System.out.println(p);
            p.usarHabilidade();
        }
    }
}

