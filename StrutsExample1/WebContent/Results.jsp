<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<body bgcolor="#777788">
	<center>

		<logic:notEmpty name="name">
Name:<bean:write name="name" />
			<br>
		</logic:notEmpty>
		<logic:notEmpty name="age">
age:<bean:write name="age" />
			<br>
		</logic:notEmpty>
		<logic:notEmpty name="gen">
Genderrr:<%=request.getAttribute("gen")%></br>
		</logic:notEmpty>

		<logic:notEmpty name="Add">
ADD:<%=request.getAttribute("Add")%></br>
		</logic:notEmpty>

		<logic:notEmpty name="ms">
MS:<%=request.getAttribute("ms")%></br>
		</logic:notEmpty>
		<logic:notEmpty name="qlfy">
Qulaification:<%=request.getAttribute("qlfy")%></br>
		</logic:notEmpty>

		<logic:notEmpty name="crs">
Courses:
<logic:iterate id="item" collection='<%=request.getAttribute("crs")%>'>
				<bean:write name="item"/>
			</logic:iterate>
		</logic:notEmpty>
		</br>

		<logic:notEmpty name="Hb">
Hobbies:
<logic:iterate id="item" collection='<%=request.getAttribute("Hb")%>'>
				<bean:write name="item" />
			</logic:iterate>
		</logic:notEmpty>
		</br>
		<logic:notEmpty name="msg">
Result is : <%=request.getAttribute("msg")%>>
</logic:notEmpty>
	</center>
</body>
