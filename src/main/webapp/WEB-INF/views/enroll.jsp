
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SB Admin - Bootstrap Admin Template</title>

        <!-- Bootstrap Core CSS -->
        <link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>

        <link href="<c:url value='/static/css/bootstrap.min.css' />" rel="stylesheet"></link>

        <!-- Custom CSS -->
        <link href="<c:url value='/static/css/sb-admin.css' />" rel="stylesheet"></link>

        <!-- Morris Charts CSS -->
        <link href="<c:url value= '/static/css/plugins/morris.css' />" rel="stylesheet"></link>

        <!-- Custom Fonts -->
        <link href="<c:url value='/static/font-awesome/css/font-awesome.min.css' />" rel="stylesheet" type="text/css"></link>

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <div id="wrapper">

            <!-- Navigation -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp">SB Admin</a>
                </div>
                <!-- Top Menu Items -->
                <ul class="nav navbar-right top-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
                        <ul class="dropdown-menu message-dropdown">
                            <li class="message-preview">
                                <a href="#">
                                    <div class="media">
                                        <span class="pull-left">
                                            <img class="media-object" src="http://placehold.it/50x50" alt="">
                                        </span>
                                        <div class="media-body">
                                            <h5 class="media-heading">
                                                <strong>John Smith</strong>
                                            </h5>
                                            <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                            <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="message-preview">
                                <a href="#">
                                    <div class="media">
                                        <span class="pull-left">
                                            <img class="media-object" src="http://placehold.it/50x50" alt="">
                                        </span>
                                        <div class="media-body">
                                            <h5 class="media-heading">
                                                <strong>John Smith</strong>
                                            </h5>
                                            <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                            <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="message-preview">
                                <a href="#">
                                    <div class="media">
                                        <span class="pull-left">
                                            <img class="media-object" src="http://placehold.it/50x50" alt="">
                                        </span>
                                        <div class="media-body">
                                            <h5 class="media-heading">
                                                <strong>John Smith</strong>
                                            </h5>
                                            <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                            <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="message-footer">
                                <a href="#">Read All New Messages</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
                        <ul class="dropdown-menu alert-dropdown">
                            <li>
                                <a href="#">Alert Name <span class="label label-default">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-success">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-info">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">View All</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav side-nav">
                        <li>
                            <a href="index.jsp"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
                        </li>
                        <li>
                            <a href="charts.jsp"><i class="fa fa-fw fa-bar-chart-o"></i> Charts</a>
                        </li>
                        <li>
                            <a href="tables.jsp"><i class="fa fa-fw fa-table"></i> Tables</a>
                        </li>
                        <li>
                            <a href="forms.jsp"><i class="fa fa-fw fa-edit"></i> Forms</a>
                        </li>
                        <li>
                            <a href="bootstrap-elements.jsp"><i class="fa fa-fw fa-desktop"></i> Bootstrap Elements</a>
                        </li>
                        <li>
                            <a href="bootstrap-grid.jsp"><i class="fa fa-fw fa-wrench"></i> Bootstrap Grid</a>
                        </li>
                        <li>
                            <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Dropdown <i class="fa fa-fw fa-caret-down"></i></a>
                            <ul id="demo" class="collapse">
                                <li>
                                    <a href="#">Dropdown Item</a>
                                </li>
                                <li>
                                    <a href="#">Dropdown Item</a>
                                </li>
                            </ul>
                        </li>
                        <li class="active">
                            <a href="blank-page.jsp"><i class="fa fa-fw fa-file"></i> Blank Page</a>
                        </li>
                        <li>
                            <a href="index-rtl.jsp"><i class="fa fa-fw fa-dashboard"></i> RTL Dashboard</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </nav>

            <div id="page-wrapper">

                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="row">
                        <div class="col-lg-12">
                            
                            <ol class="breadcrumb">
                                <li>
                                    <i class="fa fa-dashboard"></i>  <a href="index.jsp">Dashboard</a>
                                </li>
                                <li class="active">
                                    <i class="fa fa-file"></i> Blank Page
                                </li>
                            </ol>


                            <div class="form-container">

                                <h1>Enrollment Form</h1>

                                <form:form method="POST" modelAttribute="student" class="form-horizontal">

                                    <div class="row">
                                        <div class="form-group col-md-12">
                                            <label class="col-md-3 control-lable" for="firstName">First Name</label>
                                            <div class="col-md-7">
                                                <form:input type="text" path="firstName" id="firstName" class="form-control input-sm"/>
                                                <div class="has-error">
                                                    <form:errors path="firstName" class="help-inline"/>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="form-group col-md-12">
                                            <label class="col-md-3 control-lable" for="lastName">Last Name</label>
                                            <div class="col-md-7">
                                                <form:input type="text" path="lastName" id="lastName" class="form-control input-sm"/>
                                                <div class="has-error">
                                                    <form:errors path="lastName" class="help-inline"/>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="form-group col-md-12">
                                            <label class="col-md-3 control-lable" for="sex">Sex</label>
                                            <div class="col-md-7" class="form-control input-sm">
                                                <form:radiobutton path="sex" value="M" />Male 
                                                <form:radiobutton path="sex" value="F" />Female
                                                <div class="has-error">
                                                    <form:errors path="sex" class="help-inline"/>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                   

                                    <div class="row">
                                        <div class="form-group col-md-12">
                                            <label class="col-md-3 control-lable" for="email">Email</label>
                                            <div class="col-md-7">
                                                <form:input type="text" path="email" id="email" class="form-control input-sm"/>
                                                <div class="has-error">
                                                    <form:errors path="email" class="help-inline"/>
                                                </div>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="row">
                                        <div class="form-group col-md-12">
                                            <label class="col-md-3 control-lable" for="section">Section</label>
                                            <div class="col-md-7" class="form-control input-sm">
                                                <form:radiobuttons path="section" items="${sections}" />
                                                <div class="has-error">
                                                    <form:errors path="section" class="help-inline"/>
                                                </div>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="row">
                                        <div class="form-group col-md-12">
                                            <label class="col-md-3 control-lable" for="country">Country</label>
                                            <div class="col-md-7">
                                                <form:select path="country" id="country" class="form-control input-sm">
                                                    <form:option value="">Select Country</form:option>
                                                    <form:options items="${countries}" />
                                                </form:select>
                                                <div class="has-error">
                                                    <form:errors path="country" class="help-inline"/>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="form-group col-md-12">
                                            <label class="col-md-3 control-lable" for="firstAttempt">First Attempt ?</label>
                                            <div class="col-md-1">
                                                <form:checkbox path="firstAttempt" class="form-control input-sm"/>
                                                <div class="has-error">
                                                    <form:errors path="firstAttempt" class="help-inline"/>
                                                </div>
                                            </div>
                                        </div>
                                    </div>


                                     <div class="row">
                                        <div class="form-actions floatRight">
                                            <input type="submit" value="Register" class="btn btn-primary btn-sm">
                                        </div>
                                    </div>
                                </form:form>
                            </div>
                        </div>
                    </div>
                    <!-- /.row -->

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="<c:url value='/js/jquery.js' />"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="<c:url value='/js/bootstrap.min.js' />"></script>

        <!-- Morris Charts JavaScript -->
        <script src="<c:url value='/js/plugins/morris/raphael.min.js' />"></script>
        <script src="<c:url value='/js/plugins/morris/morris.min.js' />"></script>
        <script src="<c:url value='/js/plugins/morris/morris-data.js' />"></script>

    </body>

</html>
