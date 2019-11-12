<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>
<script type="text/javascript">
$(function(){	
	//顶部导航切换
	$(".nav li a").click(function(){
		$(".nav li a.selected").removeClass("selected")
		$(this).addClass("selected");
	})	
})	
</script>


</head>

<body style="background:url(images/topbg.gif) repeat-x;">

    <div class="topleft">
    <a href="main.html" target="_parent"><img src="images/logo.png" title="系统首页" /></a>
    </div>
        
    <ul class="nav">
    <li><a href="userlist.action" target="rightFrame" class="selected"><img src="images/icon01.png" title="用户列表" /><h2>用户</h2></a></li>
    <li><a href="officelist.action" target="rightFrame"><img src="images/icon02.png" title="办公用品" /><h2>办公用品</h2></a></li>
    <li><a href="registerpage.action"  target="rightFrame"><img src="images/icon03.png" title="用户添加" /><h2>用户添加</h2></a></li>
    <li><a href="projectlist.action"  target="rightFrame"><img src="images/icon04.png" title="项目列表" /><h2>项目列表</h2></a></li>
    <li><a href="createprojectpage.action" target="rightFrame"><img src="images/icon05.png" title="项目创建" /><h2>项目创建</h2></a></li>
    <li><a href="tab.html"  target="rightFrame"><img src="images/icon06.png" title="系统设置" /><h2>系统设置</h2></a></li>
    </ul>
            
    <div class="topright">    
    <ul>
    <li><span><img src="images/help.png" title="帮助"  class="helpimg"/></span><a href="#">帮助</a></li>
    <li><a href="#">关于</a></li>
    <li><a href="login.action" target="_parent">退出</a></li>
    </ul>
     
    <div class="user">
    <span>${current_user.uName}</span>
    <i>消息</i>
    <b>99</b>
    </div>    
    
    </div>
</body>
</html>
