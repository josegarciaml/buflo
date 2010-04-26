<html>
  <head>
    <meta name="layout" content="main" />
    <title>Busqueda</title>     

  </head>
        <body>    
      <g:if test="${flash.message}">
        <div class="message">${flash.message}</div>
      </g:if>
<P>Por favor entre el nombre del Item a buscar</P>
<g:form action="search">
<input type="text" name="textToSearch" id="textToSearch" value=""/>
<input type="submit" name="buscar" value="buscar"/>
</g:form>
  </body>
</html>