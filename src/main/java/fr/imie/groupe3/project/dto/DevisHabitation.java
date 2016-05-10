package fr.imie.groupe3.project.dto;

import javax.persistence.*;

/**
 * Created by Axel on 09/05/2016.
 */
@Entity
public class DevisHabitation {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    @Column(name="nom_devis")
    private String nomDevis;
    @Column(name="type_habitation")
    private String typeHabitation;
    private Integer surface;
    @Column(name="nombre_piece")
    private Integer nombrePiece;
    private Integer etage;
    @Column(name="nombre_salle_bain")
    private Integer nombreSalleDeBain;
    private Integer garage;
    @Column(name="surface_terrain")
    private Integer surfaceTerrain;
    private Integer surfaceTerrasse;
    @Column(name="surface_terasse")
    @Column(name="type_chauffage")
    private String typeChauffage;
    private String formule1;
    private String formule2;
    private Integer prix;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDevis() {
        return nomDevis;
    }

    public void setNomDevis(String nomDevis) {
        this.nomDevis = nomDevis;
    }

    public String getTypeHabitation() {
        return typeHabitation;
    }

    public void setTypeHabitation(String typeHabitation) {
        this.typeHabitation = typeHabitation;
    }

    public Integer getSurface() {
        return surface;
    }

    public void setSurface(Integer surface) {
        this.surface = surface;
    }

    public Integer getNombrePiece() {
        return nombrePiece;
    }

    public void setNombrePiece(Integer nombrePiece) {
        this.nombrePiece = nombrePiece;
    }

    public Integer getEtage() {
        return etage;
    }

    public void setEtage(Integer etage) {
        this.etage = etage;
    }

    public Integer getNombreSalleDeBain() {
        return nombreSalleDeBain;
    }

    public void setNombreSalleDeBain(Integer nombreSalleDeBain) {
        this.nombreSalleDeBain = nombreSalleDeBain;
    }

    public Integer getGarage() {
        return garage;
    }

    public void setGarage(Integer garage) {
        this.garage = garage;
    }

    public Integer getSurfaceTerrain() {
        return surfaceTerrain;
    }

    public void setSurfaceTerrain(Integer surfaceTerrain) {
        this.surfaceTerrain = surfaceTerrain;
    }

    public Integer getSurfaceTerrasse() {
        return surfaceTerrasse;
    }

    public void setSurfaceTerrasse(Integer surfaceTerrasse) {
        this.surfaceTerrasse = surfaceTerrasse;
    }

    public String getTypeChauffage() {
        return typeChauffage;
    }

    public void setTypeChauffage(String typeChauffage) {
        this.typeChauffage = typeChauffage;
    }

    public String getFormule1() {
        return formule1;
    }

    public void setFormule1(String formule1) {
        this.formule1 = formule1;
    }

    public String getFormule2() {
        return formule2;
    }

    public void setFormule2(String formule2) {
        this.formule2 = formule2;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }
}
