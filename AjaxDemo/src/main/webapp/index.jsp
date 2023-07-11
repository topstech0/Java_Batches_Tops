<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
var request = new XMLHttpRequest();
function searchInfo()
{
	var name=document.myform.name.value;
	var url = "AjaxSearch2.jsp?val="+name;
	try {
		request.onreadystatechange=function()
		{
			if(request.readyState==4)
			{
				var val = request.responseText;
				document.getElementById('tops').innerHTML="";
			}
		}
	} catch (e) {
		alert("Unable to connect to server.")
	}
}

</script>


</head>
<body>
<h1>AJAX Example</h1>
<form name="myform">
Enter Email : 
<input type="text" name="name" onblur="searchInfo">
<input type="submit" name="submit" id="submit" value="Submit">

</form>
<span id="tops"></span>
</body>
</html>