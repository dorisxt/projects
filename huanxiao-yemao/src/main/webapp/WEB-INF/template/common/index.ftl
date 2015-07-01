<!DOCTYPE html>
<html lang="zh-CN">
<head><meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"><meta name="renderer" content="webkit" />
<link rel="icon" href="#" type="image/x-icon" />
<link rel="shortcut icon" href="#" type="image/x-icon" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>ERP - 系统信息</title>
<meta name="author" content="huanxiao Team" />
<meta name="copyright" content="huanxiao" />
<link href="${base}/resources/erp/css/common.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.input .powered {
	font-size: 11px;
	text-align: right;
	color: #cccccc;
}
</style>
</head>
<body>
	<div class="path">
		<#--${message("admin.index.title")}-->
	</div>
	<table class="input firstTable">
		<tr>
			<th>
				<#--${message("admin.index.systemName")}:-->
			</th>
			<td>
				${systemName}
			</td>
			<th>
				<#--${message("admin.index.systemVersion")}:-->
			</th>
			<td>
				${systemVersion}
			</td>
		</tr>
		<tr>
			<th>
				<#--${message("admin.index.official")}:-->
			</th>
			<td>
				<a href="#" target="_blank">暂无</a>
			</td>
			<th>
				<#--${message("admin.index.bbs")}:-->
			</th>
			<td>
				<a href="#" target="_blank">暂无</a>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				&nbsp;
			</td>
		</tr>
		<tr>
			<th>
				<#--${message("admin.index.javaVersion")}:-->
			</th>
			<td>
				${javaVersion}
			</td>
			<th>
				<#--${message("admin.index.javaHome")}:-->
			</th>
			<td>
				${javaHome}
			</td>
		</tr>
		<tr>
			<th>
				<#--${message("admin.index.osName")}:-->
			</th>
			<td>
				${osName}
			</td>
			<th>
				<#--${message("admin.index.osArch")}:-->
			</th>
			<td>
				${osArch}
			</td>
		</tr>
		<tr>
			<th>
				<#--${message("admin.index.serverInfo")}:-->
			</th>
			<td>
				${serverInfo}
			</td>
			<th>
				<#--${message("admin.index.servletVersion")}:-->
			</th>
			<td>
				${servletVersion}
			</td>
		</tr>
		<tr>
			<td colspan="4">
				&nbsp;
			</td>
		</tr>
		<tr>
			<td class="powered" colspan="4">
				COPYRIGHT © 2014 huanxiao.com ALL RIGHTS RESERVED.
			</td>
		</tr>
	</table>
	<script type="text/javascript" src="${base}/resources/erp/js/common/index.js"></script>
</body>
</html>
