package module;
public class Player {

    // - Variable - //

    private String nom;
    private int couleur; //1 = Rouge & 0 = Jaunne

    // - Constructor - //

    public Player(String nom, int couleur) {
        this.nom = nom;
        this.couleur = couleur;
    }

    // - Fonction - //

    public String getNom() {
        return nom;
    }

    public int getCouleur() {
        return couleur;
    }
}