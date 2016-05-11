<%--
  Created by IntelliJ IDEA.
  User: le1cool
  Date: 09/05/16
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Synthese</title>
</head>
<body>
<a href="/habitationWizard">Nouveau devis d'habitation</a>
<a href="/vehiculeWizard">Nouveau devis Voiture</a>
Nom devis :
<center>
    <table width="50%" border="1">
        <c:forEach var="quote" items="${tupleDevisList}">
            <tr>
                <td><c:out value="${quote.name}"/></td>
                <td><c:out value="${quote.id}"/></td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>
