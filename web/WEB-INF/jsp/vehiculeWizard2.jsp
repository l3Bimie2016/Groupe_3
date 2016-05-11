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
<form method="post" action="/vehiculeWizard3">

    Date du Permis : <input type="date" name="DatePermis" value="11.05.2016" required="required"/><br>
    Nombre d'accident : <input type="number" name="NbAccident" value="0" required="required"/><br>
    Bonus / Malus : <input type="number" name="BonusMalus" value="0" required="required"/><br><br>

    <a href="/"><input type="button" value="Sauvegarder"></a>
    <input type="submit" name="Continuer" value="Continuer">
    <input type="reset" name="Supprimer" value="Effacer">

</form>
</body>
</html>
