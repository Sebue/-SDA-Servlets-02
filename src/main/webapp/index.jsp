<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>SDA Servlets - zajęcia drugie</title>
    <meta charset="utf-8">
</head>
<body>
<h1>Servlets 02</h1>

<h3>Servlet 1: Configuration</h3>
<a href="/servlets02/hi">Default</a>
<FORM ACTION="http://localhost:8080/servlets02/hi"
      METHOD="GET">
    Imię:
    <INPUT TYPE="TEXT" NAME="who"><BR>
    <INPUT TYPE="SUBMIT" VALUE="Wyslij">
</FORM>
<hr>
<h3>Servlet 2: Redirects</h3>
<a href="/servlets02/clientRedirect">Po stronie klienta</a><br>
<a href="/servlets02/serverRedirect">Po stronie serwera</a><br>
<hr>
<h3>Servlet 3: Filter</h3>
<a href="/servlets02/filter">Domyślne przywitanie bez parametru</a><br>
Z parametrem<br>
<FORM ACTION="/servlets02/filter"
      METHOD="GET">
    Użytkownik:
    <INPUT TYPE="TEXT" NAME="user"><BR>
    <INPUT TYPE="SUBMIT" VALUE="Wyślij">
</FORM>
<hr>

</body>
</html>