<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
  <title>Developer</title>
</head>
<body>

<h2>Enter developer information</h2>
<form:form method="post" action="addDeveloper">
  <table>
    <tr>
      <td><form:label path="num1"> Enter first number: </form:label></td>
      <td><form:input path="num1" /></td>
    </tr>
    <tr>
      <td><form:label path="num2"> Enter second number: </form:label></td>
      <td><form:input path="num2" /></td>
    </tr>
    <tr>

        <input type="submit" value="Submit"/>
      </td>
    </tr>
  </table>
</form:form>
</body>
</html>