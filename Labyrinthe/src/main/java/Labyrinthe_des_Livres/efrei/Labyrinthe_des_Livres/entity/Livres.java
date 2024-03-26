package Labyrinthe_des_Livres.efrei.Labyrinthe_des_Livres.entity;

import Labyrinthe_des_Livres.efrei.Labyrinthe_des_Livres.enumm.GenreLitteraire;
import Labyrinthe_des_Livres.efrei.Labyrinthe_des_Livres.enumm.PublicCible;
import jakarta.persistence.*;
@Entity

public class Livres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public double prix;
    @Enumerated(EnumType.STRING)
    public GenreLitteraire genreLitteraire;
    public String auteur;
    @Enumerated(EnumType.STRING)
    public PublicCible publicCible;
    public int anneeSortie;
    public long numStand;


    // Getters and setters
}
