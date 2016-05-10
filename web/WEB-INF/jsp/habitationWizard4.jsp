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

    Resume : <input type="text" name="Resume" value="Y"/>
    Formule 1 : <input type="checkbox" name="Formule1" value="Y"/>
    Formule 2 :<input type="checkbox" name="Formule2" value="Y"/>
    Prix : <input type="number" name="Prix" value="Y"/>

    <input type="submit" name="Valider">
    <input type="reset" name="Supprimer">

</form>
</body>
</html>
