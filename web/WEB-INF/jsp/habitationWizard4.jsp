<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: le1cool
  Date: 10/05/16
  Time: 09:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="fr.imie.groupe3.project.dto.DevisHabitation" %>
<%@ page import="java.lang.reflect.Field" %>
<html>
<head>
    <title>Devis Habitation Part.4</title>
</head>
<body>
<form method="post" action="/habitationWizardSave">

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

    <input type="radio" name="Formule" value=1 onClick="document.getElementById('Prix').value='42'" required> Formule 1<br>
    <input type="radio" name="Formule" value=2 onClick="document.getElementById('Prix').value='10'" required> Formule 2<br>

    Prix : <input type="text" name="Prix" id="Prix" readonly/><br><br>

    <a href="synthese"><input type="button" value="Sauvegarder"></a>
    <input type="submit" name="Continuer" value="Continuer">
    <input type="reset" name="Supprimer" value="Effacer">

</form>
</body>
</html>
