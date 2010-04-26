<html>
  <head>
    <meta name="layout" content="main" />
    <title>Busqueda</title>     

  </head>
        <body>    
      <g:if test="${flash.message}">
        <div class="message">${flash.message}</div>
      </g:if>
<table border="1">
<g:each var="item" in="${itemList}">
    <tr>
    <td><g:link controller="vip" action="show" id="${item.id}">Ver item</g:link></td><td>${item.name}</td><td>${item.desc}</td>
    </tr>
</g:each>
</table>
  </body>
</html>