<%--
  Created by IntelliJ IDEA.
  User: le1cool
  Date: 10/05/16
  Time: 09:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Devis Habitation Part.4</title>
</head>
<body>
<form method="post" action="/habitationWizardSave">

    <input type="text" name="Nom" value="X" disabled="disabled"/>
    <input type="text" name="Prenom" value="Y" disabled="disabled"/>

    <input type="text" name="Resume" value="Y"/>
    <input type="checkbox" name="Formule1" value="Y"/>
    <input type="checkbox" name="Formule2" value="Y"/>
    <input type="number" name="Prix" value="Y"/>

    <input type="submit" name="Valider">
    <input type="reset" name="Supprimer">

</form>
</body>
</html>
