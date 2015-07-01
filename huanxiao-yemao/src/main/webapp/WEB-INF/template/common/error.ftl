<!DOCTYPE html>
<html lang="zh-CN">
<head><meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"><meta name="renderer" content="webkit" /><link rel="icon" href="${setting.shopSiteUrl}/favicon.ico" type="image/x-icon" /><link rel="shortcut icon" href="${setting.shopSiteUrl}/favicon.ico" type="image/x-icon" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("admin.error.title")} - ${message("shop.common.adminCenterAlias")}</title>
<meta name="author" content="huanxiao Team" />
<meta name="copyright" content="huanxiao" />
<link href="${base}/resources/erp/css/common.css" rel="stylesheet" type="text/css" />
<link href="${base}/resources/erp/css/error.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="wrap">
		<div class="error">
			<dl>
				<dt>${message("admin.error.message")}</dt>
				[#if content??]
					<dd>${content}</dd>
				[/#if]
				[#if constraintViolations?has_content]
					[#list constraintViolations as constraintViolation]
						<dd>[${constraintViolation.propertyPath}] ${constraintViolation.message}</dd>
					[/#list]
				[/#if]
				<dd>
					<a href="javascript:;" onclick="window.history.back(); return false;">${message("admin.error.back")}</a>
				</dd>
			</dl>
		</div>
	</div>
</body>
</html>
