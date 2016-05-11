<%--
  Created by IntelliJ IDEA.
  User: le1cool
  Date: 09/05/16
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Devis Habitation Part.3</title>
</head>
<body>
<form method="post" action="/habitationWizard4">

    Surface du terrain : <input type="number" name="surfaceTerrain" value="0" required="required"/><br>
    Surface de la terrasse : <input type="number" name="surfaceTerrasse" value="0" required="required"/><br>
    Type de chauffage : <input type="text" name="typeChauffage" value="Gaz" required="required"/><br><br>

    <a href="/"><input type="button" value="Quitter"></a>
    <input type="submit" name="Continuer" value="Continuer">
    <input type="reset" name="Supprimer" value="Effacer">

</form>
</body>
</html>
