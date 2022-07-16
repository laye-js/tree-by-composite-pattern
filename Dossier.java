import java.util.ArrayList;

public class Dossier extends Composant {

    ArrayList<Composant> composants = new ArrayList<Composant>();

    public Dossier(String nom, int niveau) {
        super(nom, niveau);
    }

    public void ajouter(Composant c) {
        composants.add(c);
    }

    public void Show() {

        int level = getLevel();
        for (int i = 0; i < level; i++) {
            System.out.print("│\t");
        }
        System.out.println("├──" + getName());
        for (Composant c : composants) {
            c.Show();
        }
    }
}
