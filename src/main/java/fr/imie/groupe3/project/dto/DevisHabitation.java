package fr.imie.groupe3.project.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Created by Axel on 09/05/2016.
 */
@Entity
public class DevisHabitation {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonIgnore
    private Integer id;
    @JsonProperty("id_devis_habitations")
    private Integer idDevisHabitations;
    private String nom;
    private String prenom;
    @Column(name="nom_devis")
    @JsonProperty("nom_devis")
    private String nomDevis;
    @JsonProperty("type_habitation")
    @Column(name="type_habitation")
    private String typeHabitation;
    private Integer surface;
    @Column(name="nombre_piece")
    @JsonProperty("nombre_piece")
    private Integer nombrePiece;
    private Integer etage;
    @JsonProperty("nombre_salle_bain")
    @Column(name="nombre_salle_bain")
    private Integer nombreSalleBain;
    private Integer garage;
    @Column(name="surface_terrain")
    @JsonProperty("surface_terrain")
    private Integer surfaceTerrain;
    @JsonProperty("surface_terrasse")
    @Column(name="surface_terrasse")
    private Integer surfaceTerrasse;
    @Column(name="type_chauffage")
    @JsonProperty("type_chauffage")
    private String typeChauffage;
    private String formule;
    private Integer prix;

    public Integer getIdDevisHabitations() {
        return idDevisHabitations;
    }

    public void setIdDevisHabitations(Integer idDevisHabitations) {
        this.idDevisHabitations = idDevisHabitations;
    }

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNombreSalleBain() {
        return nombreSalleBain;
    }

    public void setNombreSalleBain(Integer nombreSalleBain) {
        this.nombreSalleBain = nombreSalleBain;
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

    public String getFormule() {
        return formule;
    }

    public void setFormule(String formule) {
        this.formule = formule;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }
}
