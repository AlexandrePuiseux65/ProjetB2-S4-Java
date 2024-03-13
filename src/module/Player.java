package module;
public class Player {
    private String nom;
    private int couleur; //1 = Rouge & 0 = Jaunne

    public Player(String nom, int couleur) {
        this.nom = nom;
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public int getCouleur() {
        return couleur;
    }
}