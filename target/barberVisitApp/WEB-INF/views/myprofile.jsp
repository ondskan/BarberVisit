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
    <title>.: BarberVisitApp :. - My profile</title>
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
            <li class="logo_font"><a href="http://">Barber Shop Visit</a></li>

            <li class="reservation_button" style="float:right;"><a href="http://">REZERWACJA</a></li>
            <li style="float:right;"><a href="http://">moj profil</a></li>
            <li style="float:right;"><a href="http://">moje wizyty</a></li>


        </ul>

    </nav>

</div>
<div id="container">
    <center>
        <br/>
        Moje wizyty:
        <br/><br/>


        <div class="datagrid">
            <table>
                <thead>
                <tr class="alt">
                    <th>email</th>

                </tr>
                </thead>


                <tbody>
                <c:forEach items="${myprofile}" var="s">
                    <tr>
                        <td><c:out value="${s.email}"/></td>
                    </tr>

                </c:forEach>
                </tbody>
            </table>

            <br/>

            <table>
                <thead>
                <tr class="alt">
                    <th>hasło</th>

                </tr>
                </thead>


                <tbody>
                <c:forEach items="${myprofile}" var="s">
                    <tr>
                        <td><c:out value="${s.password}"/></td>
                    </tr>

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

</div>
</body>
</html>