<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html:html>
<head>
<script type="text/javascript">
function myValidate(frm){
	var un = frm.username.value;
	var pwd = frm.password.value;
	
	if(un==""){
				alert("user name is mandatory");
				frm.username.focus();
				return false;
	}else{
		var val=un.charCodeAt(0);
		if(!(val>=65 && val<=90) && !(val>=97 && val<=122))
		{
			alert("First name Must be an alphabet");
			frm.username.focus();
			return false;
		}
	}
	if(pwd=="")
	{
		alert("Password is mandatory");
		frm.password.focus();
		return fasle;
	}
		frm.vflag.value="true";
		return true;
	}
	</script>
	</head>
	
	<center><h1><bean:message key="my.title"/></h1></center>
	<html:form action ="register" onsubmit="return myValidate(this)">
	<bean:message key="my.user"/><html:text property="username"/>
	<html:errors property="err1"/><br>
	<bean:message key="my.pwd"/><html:password property="password"/>
	<html:errors property="err2"/><br>
	<html:submit><bean:message key="my.btn.cap"/></html:submit>
	<html:hidden property="vflag" value="false"/>
	</html:form>
	<logic:notEmpty name="msg">
	 	<bean:message key="my.res"/><bean:write name="msg"/>
	</logic:notEmpty>
	<br>
	<bean:message key="my.footer"/>
	</html:html>
	</h1>
	</center>


</head>