<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<script>
	window.userRole = "${userModell.role}";
</script>

 <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Room Allotment System</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
        <li><a href="#"> Place</a></li>
      </ul>
    </div>
  </div>
</nav>
 
 