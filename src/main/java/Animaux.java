import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Animaux implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    public Animaux() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Animaux(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    //pour convertir l'objet en chaine de caractères
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animaux {");
        sb.append("id=").append( id );
        sb.append(", nom=' ").append( nom);
        sb.append('}');
        return sb.toString();
    }
}
