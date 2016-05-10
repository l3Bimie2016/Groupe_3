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
    <title>Devis Habitation Part.1</title>
</head>
<body>
<form method="post" action="/habitationWizard2">

    Nom : <input type="text" name="Nom" value="Nom" readonly/>
    Prenom : <input type="text" name="Prenom" value="Prenom" readonly/><br>
    Nom du Devis : <input type="text" name="NomDevis" value="Devis" required="required"/><br>
    Type d'Habitation : <input type="text" name="TypeHabitation" value="Devis" required="required"/><br>
    Surface : <input type="number" name="Surface" value="0" required="required"/><br><br>

    <a href="synthese"><input type="button" value="Sauvegarder"></a>
    <input type="submit" name="Continuer" value="Continuer">
    <input type="reset" name="Supprimer" value="Effacer">

</form>
</body>
</html>
