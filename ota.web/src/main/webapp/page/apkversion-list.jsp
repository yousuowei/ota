<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/base/page/base.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>apk版本列表</title>
</head>
<body>
	<f:form id="mainForm" action="list" method="get" commandName="page">
		<table width="100%">
			<tr>
				<td colspan="6" style="background: #5CACEE">
					<div class="top clearfix">
						<b>应用列表</b>
						<div>
							[<a href="null">添加应用</a>]
						</div>
					</div>
				</td>
			</tr>
			<tr>
				<td colspan="6">
					<div class="search clearfix">
						<div class="form">
							应用包名：<input name="filter_LIKES_name"
								value="${param['filter_LIKES_name']}"> 版本描述：<input
								name="filter_LIKES_desc" value="${param['filter_LIKES_desc']}"><input
								type="button" value="搜索" onclick="search();" />
						</div>
					</div>
				</td>
			</tr>
			<tr>
				<td>应用包名</td>
				<td>版本描述</td>
				<td>应用版本</td>
				<td>文件md5值</td>
				<td>应用文件地址</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${page.result}" var="e">
				<tr>
					<td>${e.name}</td>
					<td>${e.desc}</td>
					<td>${e.version}</td>
					<td>${e.fileMd5}</td>
					<td>${e.url}</td>
					<td><a href="${e.id}">编辑</a> <a
						href="javascript:base.remove('${e.id }');">删除</a></td>
				</tr>
			</c:forEach>
			<tr>
		</table>
		<%@include file="/base/page/page.jsp"%>
	</f:form>

</body>
</html>