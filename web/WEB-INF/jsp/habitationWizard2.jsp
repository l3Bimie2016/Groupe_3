<%--
  Created by IntelliJ IDEA.
  User: le1cool
  Date: 09/05/16
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Devis Habitation Part.2</title>
</head>
<body>
<form method="post" action="/habitationWizard3">

    Nombre de pièces : <input type="number" name="NbPieces" value="Y" required="required"/><br>
    Nombre d'étages : <input type="number" name="Etage" value="Y" required="required"/><br>
    Nombre de salle de bain : <input type="number" name="NbSalleDeBain" value="Y" required="required"/><br>
    Garage : <input type="checkbox" name="Garage" value="Y"/>

    <input type="submit" name="Valider">
    <input type="reset" name="Supprimer">

</form>
</body>
</html>
