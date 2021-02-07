<%
String nomeEmpresa = (String) request.getAttribute("empresa"); // presisa ser o nome request, mesmo se or req lá no servlet
System.out.println(nomeEmpresa);
// tentando comentar
%>



<html>
<body> 
Empresa ${ empresa } cadastrada com sucesso!
</body>
</html>