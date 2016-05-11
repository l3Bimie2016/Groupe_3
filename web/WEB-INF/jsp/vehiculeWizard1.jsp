<%--
  Created by IntelliJ IDEA.
  User: le1cool
  Date: 09/05/16
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Devis Véhicule Part.1</title>
</head>
<body>
<form method="post" action="/vehiculeWizard2">

    Nom : <input type="text" name="Nom" value="Nom" readonly/>
    Prenom : <input type="text" name="Prenom" value="Prenom" readonly/><br>
    Nom du Devis : <input type="text" name="NomDevis" value="Devis" required="required"/><br>
    Marque : <input type="text" name="Marque" value="Marque" required="required"/><br>
    Modèle : <input type="text" name="Modele" value="Modele" required="required"/><br>
    Carburant : <input type="text" name="Carburant" value="Carburant" required="required"/><br>
    Chevaux : <input type="number" name="Chevaux" value="0" required="required"/><br><br>

    <a href="/"><input type="button" value="Sauvegarder"></a>
    <input type="submit" name="Continuer" value="Continuer">
    <input type="reset" name="Supprimer" value="Effacer">

</form>
</body>
</html>
