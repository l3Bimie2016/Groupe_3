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
<form method="post" action="/vehiculeWizard4">

    Conducteur Principal : <br>
    Nom : <input type="text" name="NomPrincipal" value="NomUser" required="required"/>
    Prenom : <input type="text" name="PrenomPrincipal" value="PrenomUser" required="required"/><br><br>

    Conducteur Secondaire : <br>
    Nom : <input type="text" name="NomSecondaire" value="NomAutre" required="required"/>
    Prenom : <input type="text" name="PrenomSecondaire" value="PrenomAutre" required="required"/><br>

    Garage : <input type="checkbox" id="chk" name="Garage" onchange="myFunction()"/><br>
    <p id="adresse"></p>
    <br><br>

    <a href="/"><input type="button" value="Sauvegarder"></a>
    <input type="submit" name="Continuer" value="Continuer">
    <input type="reset" name="Supprimer" value="Effacer">

</form>
<script>
    function myFunction() {
        if (document.getElementById('chk').checked) {
            document.getElementById('adresse').innerHTML =
                    'Adresse : <input type="text" name="Adresse" value="3 Rue Machin" required="required"/>';
        } else {
            document.getElementById('adresse').innerHTML = ' ';
        }
    }
</script>
</body>
</html>


