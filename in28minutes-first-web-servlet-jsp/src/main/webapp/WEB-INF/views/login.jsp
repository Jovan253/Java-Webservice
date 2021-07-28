${error}
<form method="post" action="/login">
	<input type = "text" name="name" placeholder="Username" value="${requestScope.name}"/>
	<input type ="email" name="email" placeholder="Email" value="${requestScope.email}"/>
	<input type ="password" name="password" placeholder="Password" />
	<input type ="submit" value="submit"/>
</form>
