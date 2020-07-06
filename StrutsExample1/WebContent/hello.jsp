<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html:form action="/hello">
<html:text property="name"></html:text>
<html:submit></html:submit>
<html:errors/>
</html:form>