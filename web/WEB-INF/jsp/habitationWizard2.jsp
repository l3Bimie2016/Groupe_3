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

    <input type="text" name="Nom" value="X" disabled="disabled"/>
    <input type="text" name="Prenom" value="Y" disabled="disabled"/>

    <input type="number" name="NbPieces" value="Y" required="required"/>
    <input type="number" name="Etage" value="Y" required="required"/>
    <input type="number" name="NbSalleDeBain" value="Y" required="required"/>
    <input type="checkbox" name="Garage" value="Y" required="required"/>

    <input type="submit" name="Valider">
    <input type="reset" name="Supprimer">

</form>
</body>
</html>
