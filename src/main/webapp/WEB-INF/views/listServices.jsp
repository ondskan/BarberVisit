<%--
  Created by IntelliJ IDEA.
  User: Marcin
  Date: 2015-02-21
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>.: BarberVisitApp :. - New Visit</title>
    <link href="<c:url value="/resources/css/sheet.css" />" rel="stylesheet">
    <script src="/resources/js/script.js"></script>
    <c:url var="text/javascript" value="/resources/js/script.js" />
    <script type="text/javascript" src="/resources/js/script.js"></script>

</head>
<body>

<div id="navigation">


    <%-- <p style="text-align:left;">
         This text is left aligned
         <span style="float:right;">This text is right aligned</span>
     </p>--%>


    <%--<li style="text-align: left">LOGO</li>
        <li style="text-align: left"><a href="http://">Barber Visit</a></li>--%>

    <nav class="horizontal_menu">
        <ul>
            <li class="logo">LOGO</li>
            <li class="logo_font"><a href="/">Barber Shop Visit</a></li>

            <li class="reservation_button" style="float:right;"><a href="/newVisit">REZERWACJA</a></li>
            <li style="float:right;"><a href="/myprofile">moj profil</a></li>
            <li style="float:right;"><a href="/myvisits">moje wizyty</a></li>


        </ul>

    </nav>

</div>

<div id="top-sheet">

    <center><font size="22px"> Strona powitalna</font></center>



</div>
<hr/>


<div id="bottom-sheet">
    <center>
        <br/>
        USŁUGI:
        <br/><br/>


        <div class="datagrid">
            <table>
                <thead>
                <tr class="alt">
                    <th>Nazwa</th>
                    <th>Czas trwania</th>
                    <th>Cena</th>


                </tr>
                </thead>


                <tbody>
                <c:forEach items="${listServices}" var="s">
                    <tr>
                        <td><c:out value="${s.name}"/></td>
                        <td><c:out value="${s.duration}"/></td>
                        <td><c:out value="${s.price}"/></td>


                    </tr>
                    <%--<tr class="alt">
                        <td><c:out value="${s.name}"/></td>
                        <td><c:out value="${s.duration}"/></td>
                        <td><c:out value="${s.cost}"/></td>

                    </tr>
                    <tr>
                        <td><c:out value="${s.name}"/></td>
                        <td><c:out value="${s.duration}"/></td>
                        <td><c:out value="${s.cost}"/></td>

                    </tr>--%>
                </c:forEach>
                </tbody>
            </table>
        </div>

    </center>
</div>
<hr/>


<div id="footer">


    <ul>
        <li class="footer-facebook">facebook</li>
        <li class="footer-address">Adres zakładu</li>
        <li class="footer-phone"><a href="">123 456 789</a></li>
        <li class="footer-email"><a href="">adresemail@gmail.com</a></li>
    </ul>



</div>


</body>
</html>
