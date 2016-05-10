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

    Nom : <input type="text" name="Nom" value="X" disabled="disabled"/>
    Prenom : <input type="text" name="Prenom" value="Y" disabled="disabled"/></br>
    Nom du Devis : <input type="text" name="NomDevis" value="Devis" required="required"/></br>
    d'Habitation : <input type="text" name="TypeHabitation" value="Devis" required="required"/></br>
    Surface : <input type="number" name="Surface" value="Devis" required="required"/></br>

    <input type="submit" name="Valider">
    <input type="reset" name="Supprimer">

</form>
</body>
</html>
