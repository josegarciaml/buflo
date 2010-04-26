<html>
  <head>
    <meta name="layout" content="main" />
    <title>Busqueda</title>     

  </head>
        <body>    
      <g:if test="${flash.message}">
        <div class="message">${flash.message}</div>
      </g:if>
<H3>${item.name}</H3><br>
<H4>${item.desc}</H4><br>

<P>En stock actualmente ${item.quantity}</P> 
<g:form action="buy">
<input type="submit" name="Comprar" value="comprar"/>
<input type="hidden" name="itemId" value="${item.id}"/>
</g:form>
  </body>
</html>