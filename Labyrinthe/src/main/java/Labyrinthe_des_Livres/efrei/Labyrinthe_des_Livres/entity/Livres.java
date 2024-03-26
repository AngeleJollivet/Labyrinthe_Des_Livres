import javax.persistence.*;

@Entity
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    double prix;

    @Enumerated(EnumType.STRING)
    GenreLitteraire genreLitteraire;

    String auteur;
    String paysOrigine;
    int anneeSortie;

    @ManyToOne
    @JoinColumn(name = "stand_id")
    Stand stand;

}
