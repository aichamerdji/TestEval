import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJPA {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("eval");
        EntityManager em = emf.createEntityManager();


        //pour chercher qqch en bdd = "find"
        Animaux a1 = em.find(Animaux.class, 1);
        System.out.println(a1);

        em.close();
        emf.close();
    }


}
