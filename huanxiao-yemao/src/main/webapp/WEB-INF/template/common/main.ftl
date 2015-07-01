<!DOCTYPE html>
<html lang="zh-CN">
<head><meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"><meta name="renderer" content="webkit" />
<link rel="icon" href="#" type="image/x-icon" />
<link rel="shortcut icon" href="#" type="image/x-icon" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>ERP - 首页</title>
<meta name="author" content="huanxiao Team" />
<meta name="copyright" content="huanxiao" />
<link rel="shortcut icon" href="${base}/favicon.ico" type="image/x-icon">
<link href="${base}/resources/erp/css/bootstrap/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="${base}/resources/erp/css/common.css" rel="stylesheet" type="text/css" />
<link href="${base}/resources/erp/css/main.css" rel="stylesheet" type="text/css" />
<style type="text/css">
table.main .nav li a {
	color: #488bd1;
}
.headTr th,
.panel-body dl dd a:hover,
.panel-body dl dd.checked,
.panel-body dl dd a:focus{
	background-color:#398be1;
}
</style>
</head>
<body>
	<script type="text/javascript">
		if (self != top) {
			top.location = self.location;
		};
	</script>
	<table class="head">
		<tr class="headTr">
			<th class="logo">
				<a href="main.jhtml?userType=${userType}">
					<img src="${base}/resources/erp/images/platform/p_logo_1.png" alt="huanxiao" />
				</a>
			</th>
			<th>
				<div class="link pull-right">
					<div class="dropdown" >
						<span class="loginName"></span>
						<a id="dLabel" data-toggle="dropdown" href="javascript:void(0)">
							<strong style="font-size:14px"></strong>
							<span class="caret"></span>
						</a>
						<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
							<li role="menuitem" tabindex="-1"><a href="../profile/edit.jhtml" target="iframe" style="color:#fff"><span>${message("erp.main.profile")}</span></a></li>
							<li role="menuitem" tabindex="-1"><a href="logout.jhtml" target="_top" style="color:#fff"><span>${message("erp.main.logout")}</span></a></li>
						</ul>
					</div>
				</div>
			</th>
		</tr>
	</table>	
	<table class="main">		
		<tr>
			<td id="menu" class="menu">
				<div class="panel-group" id="accordion">
					<!--基础信息-->
					<!--商品管理
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
       							<a data-toggle="collapse" data-parent="#accordion" href="#product">
          							<span class="orderNav"></span>商品管理<span class="navIcon"></span>
          						</a>
     	 					</h4>
						</div>
						<div id="product" class="panel-collapse collapse">
							<div class="panel-body">
								<dl>
									<dd><a href="/yemao-erp/product/list.jhtml" target="iframe">商品信息查看</a></dd>
									<dd><a href="/yemao-erp/productStock/stockList.jhtml" target="iframe">商品库存查看</a></dd>
								</dl>
							</div>
						</div>
					</div>
					-->
					<!--订单管理
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
       							<a data-toggle="collapse" data-parent="#accordion" href="#order" class="mouse">
          							<span class="supplierNav"></span>订单管理<span class="navIcon"></span>
          						</a>
     	 					</h4>
						</div>
						<div id="order" class="panel-collapse collapse">
							<div class="panel-body">
								<dl>
									<dd>
										<a href="/yemao-erp/order/list.jhtml" target="iframe">当前订单</a>
									</dd>
									<dd>
										<a href="/yemao-erp/shippedOrder/list.jhtml" target="iframe">已发货订单</a>
									</dd>
									<dd>
										<a href="/yemao-erp/completedOrder/list.jhtml" target="iframe">已完成订单</a>
									</dd>
									<dd>
										<a href="/yemao-erp/returned/list.jhtml" target="iframe">退换货订单</a>
									</dd>
								</dl>
							</div>
						</div>
					</div>
					-->
					<!--供应计划
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
       							<a data-toggle="collapse" data-parent="#accordion" href="#supplierPlan">
          							<span class="statisticsNav"></span>供应计划<span class="navIcon"></span>
          						</a>
     	 					</h4>
						</div>
						<div id="supplierPlan" class="panel-collapse collapse">
							<div class="panel-body">
								<dl>
									<dd>
										<a href="/yemao-erp/purchasement/list.jhtml" target="iframe">采购下单</a>
									</dd>
									<dd>
										<a href="/yemao-erp/purchaseapprovement/list.jhtml" target="iframe">采购审批</a>
									</dd>	
									<dd>
										<a href="/yemao-erp/purchaseReturn/list.jhtml" target="iframe">采购退货</a>
									</dd>
									<dd>
										<a href="/yemao-erp/purchaseReturnAudit/list.jhtml" target="iframe">退货审批</a>
									</dd>																			
									<dd>
										<a href="/yemao-erp/replenishment/replenishmentList.jhtml" target="iframe">补货提醒</a>
									</dd>								
									<dd>
										<a href="/yemao-erp/requisition/list.jhtml" target="iframe">调拨单</a>
									</dd>
								</dl>
							</div>
						</div>
					</div>
					-->
					<!--供应商管理-->
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
       							<a data-toggle="collapse" data-parent="#accordion" href="#purchaseconfirm">
          							<span class="memberNav"></span>供应商平台<span class="navIcon"></span>
          						</a>
     	 					</h4>
						</div>
						<div id="purchaseconfirm" class="panel-collapse collapse">
							<div class="panel-body">
								<dl>
									<dd>
										<a href="/yemao-erp/purchaseconfirm/list.jhtml" target="iframe">采购单确认</a>
									</dd>
								</dl>
							</div>
						</div>
					</div>
					<!--仓库信息管理
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
       							<a data-toggle="collapse" data-parent="#accordion" href="#warehouse">
          							<span class="matterNav"></span>仓库信息管理<span class="navIcon"></span>
          						</a>
     	 					</h4>
						</div>
						<div id="warehouse" class="panel-collapse collapse">
							<div class="panel-body">
								<dl>
									<dd>
										<a href="/yemao-erp/storage/list.jhtml" target="iframe">仓库管理</a>
									</dd>
								</dl>
							</div>
						</div>
					</div>
					-->
					<!--财务操作-->
					<!--财务对账-->
					<!--单据管理-->
				</div>
			</td>
			<td>
					<iframe id="iframe" name="iframe" src="index.jhtml" frameborder="0"></iframe>
				<input type="hidden" value=${userType} id="userType"/>
			</td>
		</tr>
	</table>
	<script type="text/javascript" src="${base}/resources/lib/jquery/jquery.js"></script>
	<script type="text/javascript" src="${base}/resources/lib/bootstrap/bootstrap.js"></script>
	<script type="text/javascript" src="${base}/resources/lib/bootstrap/bootstrap-collapse.js"></script>
	<script type="text/javascript" src="${base}/resources/erp/js/common/main.js"></script>
</body>
</html>
