package Labyrinthe_des_Livres.efrei.Labyrinthe_des_Livres.entity;
import Labyrinthe_des_Livres.efrei.Labyrinthe_des_Livres.enumm.GenreLitteraire;
import Labyrinthe_des_Livres.efrei.Labyrinthe_des_Livres.enumm.TypeEmployes;
import jakarta.persistence.*;
@Entity

public class Employes {
    @Id
    @Enumerated(EnumType.STRING)
    private TypeEmployes typeEmployes;
}
