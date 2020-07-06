<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html:form action="/ipath">
<table border="3" width="1" bgcolor="#993300" align="left" cellspacing="1" cellpadding="1">
<tr>
	<td>Name:</td>
	<td><html:text property="name"></html:text></td>
</tr>
<tr>
	<td>Age:</td>
	<td><html:text property="age"></html:text></td>
</tr>
<tr>
	<td>Address:</td>
	<td>
	<html:textarea property="addrs" cols="20" rows="5">
	Enter Address
	</html:textarea>
	</td>
</tr>
<tr>
	<td>Gender:</td>
	<td>
	<html:radio property="gender" value="M"/>Male
	<html:radio property="gender" value="F"/>Female
	</td>
</tr>
<tr>
	<td>MaritalStatus:</td>
	<td>
<	<html:checkbox property="ms" value="Married"/>Married
	</td>
</tr>
<tr>
	<td>Courses:</td>
	<td>
	<html:select multiple="yes" property="crs">
	<html:option value="Java">Java Package</html:option>
	<html:option value=".net">.Net Package</html:option>
	<html:option value="oracle">Oracle</html:option>
	<html:option value="php">PHP</html:option>
	</html:select>
	</td>
</tr>
<tr>
	<td>Qualifications:</td>
	<td>
	<html:select multiple="yes" property="qlfy">
	<html:option value="Engg">Engg</html:option>
	<html:option value="arts">arts</html:option>
	<html:option value="cmrs">cmrs</html:option>
	<html:option value="Medico">Medical</html:option>
	</html:select>
	</td>
</tr>
<tr>
	<td>Hobies</td>
	<td>
	<html:checkbox property="hb" value="Stamps"/>StampsCollection</br>
	<html:checkbox property="hb" value="reading"/>Reading</br>
	<html:checkbox property="hb" value="Stamps"/>Travelling</br>
	</td>
</tr>
<tr>
<td><html:submit value="send"/></td>
<td><html:submit value="Reset"/></td>
</tr>
</table>
</html:form>