package Labyrinthe_des_Livres.efrei.Labyrinthe_des_Livres.entity;

import Labyrinthe_des_Livres.efrei.Labyrinthe_des_Livres.enumm.GenreLitteraire;
import Labyrinthe_des_Livres.efrei.Labyrinthe_des_Livres.enumm.PublicCible;
import jakarta.persistence.*;
@Entity

public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double prix;
    @Enumerated(EnumType.STRING)
    private GenreLitteraire genreLitteraire;
    private String auteur;
    @Enumerated(EnumType.STRING)
    private PublicCible publicCible;
    private int anneeSortie;



    // Getters and setters
}
