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

    Surface du terrain : <input type="number" name="SurfaceTerrain" value="Y" required="required"/><br>
    Surface de la terrasse : <input type="number" name="SurfaceTerrasse" value="Y" required="required"/><br>
    Type de chauffage : <input type="text" name="TypeChauffage" value="Y" required="required"/><br>

    <input type="submit" name="Valider">
    <input type="reset" name="Supprimer">

</form>
</body>
</html>
