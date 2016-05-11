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

    Nombre de pièces : <input type="number" name="NombrePiece" value="0" required="required"/><br>
    Nombre d'étages : <input type="number" name="Etage" value="0" required="required"/><br>
    Nombre de salle de bain : <input type="number" name="NombreSalleBain" value="0" required="required"/><br>
    Garage : <input type="number" name="Garage" value="0" required="required"/><br><br>

    <a href="synthese"><input type="button" value="Sauvegarder"></a>
    <input type="submit" name="Continuer" value="Continuer">
    <input type="reset" name="Supprimer" value="Effacer">

</form>
</body>
</html>
