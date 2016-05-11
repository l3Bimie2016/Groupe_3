package fr.imie.groupe3.project.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by le1cool on 11/05/16.
 */
@Entity
public class DevisVehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Integer id;
    private String nom;
    private String prenom;
    @Column(name = "nom_devis")
    private String nomDevis;
    private String Marque;
    private String Modele;
    private String Carburant;
    private Integer Chevaux;
    @Column(name = "date_permis")
    private Date DatePermis;
    @Column(name = "nb_accident")
    private Integer NbAccident;
    @Column(name = "bonus_malus")
    private Integer BonusMalus;
    @Column(name = "nom_principal")
    private String NomPrincipal;
    @Column(name = "prenom_principal")
    private String PrenomPrincipal;
    @Column(name = "nom_secondaire")
    private String NomSecondaire;
    @Column(name = "prenom_secondaire")
    private String PrenomSecondaire;
    @Column(name = "adresse_garage")
    private String AdresseGarage;
    private String Assure;
    private Integer Montant;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public String getModele() {
        return Modele;
    }

    public void setModele(String modele) {
        Modele = modele;
    }

    public String getCarburant() {
        return Carburant;
    }

    public void setCarburant(String carburant) {
        Carburant = carburant;
    }

    public Integer getChevaux() {
        return Chevaux;
    }

    public void setChevaux(Integer chevaux) {
        Chevaux = chevaux;
    }

    public Date getDatePermis() {
        return DatePermis;
    }

    public void setDatePermis(Date datePermis) {
        DatePermis = datePermis;
    }

    public Integer getNbAccident() {
        return NbAccident;
    }

    public void setNbAccident(Integer nbAccident) {
        NbAccident = nbAccident;
    }

    public Integer getBonusMalus() {
        return BonusMalus;
    }

    public void setBonusMalus(Integer bonusMalus) {
        BonusMalus = bonusMalus;
    }

    public String getNomPrincipal() {
        return NomPrincipal;
    }

    public void setNomPrincipal(String nomPrincipal) {
        NomPrincipal = nomPrincipal;
    }

    public String getPrenomPrincipal() {
        return PrenomPrincipal;
    }

    public void setPrenomPrincipal(String prenomPrincipal) {
        PrenomPrincipal = prenomPrincipal;
    }

    public String getNomSecondaire() {
        return NomSecondaire;
    }

    public void setNomSecondaire(String nomSecondaire) {
        NomSecondaire = nomSecondaire;
    }

    public String getPrenomSecondaire() {
        return PrenomSecondaire;
    }

    public void setPrenomSecondaire(String prenomSecondaire) {
        PrenomSecondaire = prenomSecondaire;
    }

    public String getAdresseGarage() {
        return AdresseGarage;
    }

    public void setAdresseGarage(String adresseGarage) {
        AdresseGarage = adresseGarage;
    }

    public String getAssure() {
        return Assure;
    }

    public void setAssure(String assure) {
        Assure = assure;
    }

    public Integer getMontant() {
        return Montant;
    }

    public void setMontant(Integer montant) {
        Montant = montant;
    }
}
