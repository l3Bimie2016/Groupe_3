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
<form method="post" action="/vehiculeWizardSave">

    Resumé :
    <center>
        <table width="50%" border="1">
            <c:forEach var="quote" items="${resumes}">
                <tr>
                    <td><c:out value="${quote.name}"/></td>
                    <td><c:out value="${quote.value}"/></td>
                </tr>
            </c:forEach>
        </table>
    </center>

    <input type="radio" name="Assure" value=1 onClick="document.getElementById('Montant').value='42'" required> Formule
    1<br>
    <input type="radio" name="Assure" value=2 onClick="document.getElementById('Montant').value='101010'" required> Formule
    2<br>

    Prix : <input type="text" name="Montant" id="Montant" readonly/><br><br>

    <a href="/"><input type="button" value="Sauvegarder"></a>
    <input type="submit" name="Continuer" value="Continuer">
    <input type="reset" name="Supprimer" value="Effacer">

</form>
</body>
</html>


