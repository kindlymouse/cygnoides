<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib prefix="sitemesh"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="ctxs" value="${fn:split(pageContext.request.servletPath,'/')}" />
<script>
 $(document).ready(function(){
         $("#nav_<c:out value="${ctxs[0]}"/>").addClass("active");
 });
</script>

<div id="header">
	<div id="title">
		<h1>
			鸿雁气象综合管理系统<small>--通航气象整体解决方案</small>
		</h1>
	</div>

	<div class="navbar">
		<div class="navbar-inner">
			<div class="container">
				<div class="nav-collapse">
					<ul class="nav">
						<li id="nav_home"><a href="#">首页</a>
						</li>
						<li id="nav_monitor"><a href="${ctx}/monitor">实时气象</a>
						</li>
						<li id="nav_profile"><a href="${ctx}/profile">历史分析</a>
						</li>
						<li id="nav_admin" class="dropdown"><a href="#"
							data-toggle="dropdown">系统设置 <b class="caret"></b>
						</a>
							<ul class="dropdown-menu">
								<li><a href="${ctx}/admin/user">Action</a>
								</li>
								<li><a href="#">Another action</a>
								</li>
								<li><a href="#">Something else here</a>
								</li>
								<li class="divider"></li>
								<li class="nav-header">Nav header</li>
								<li><a href="#">Separated link</a>
								</li>
								<li><a href="#">One more separated link</a>
								</li>
							</ul></li>
					</ul>
					<ul class="nav pull-right">
						<li class="divider-vertical"></li>
						<li class="dropdown"><shiro:user>
								<div class="btn-group pull-right">
									<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
										<i class="icon-user"></i> <shiro:principal property="name" />
										<span class="caret"></span> </a>

									<ul class="dropdown-menu">
										<shiro:hasRole name="admin">
											<li><a href="${ctx}/admin/user">Admin Users</a>
											</li>
											<li class="divider"></li>
										</shiro:hasRole>
										<li><a href="${ctx}/profile">Edit Profile</a>
										</li>
										<li><a href="${ctx}/logout">Logout</a>
										</li>
									</ul>
								</div>
							</shiro:user></li>
					</ul>
				</div>
				<!-- /.nav-collapse -->
			</div>
		</div>
		<!-- /navbar-inner -->
	</div>
	<!-- /navbar -->

</div>