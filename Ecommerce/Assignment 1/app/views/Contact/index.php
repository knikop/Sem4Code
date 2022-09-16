<html>
  <head>
    <title>Contact Us</title>
      <link rel="stylesheet" type="text/css" href="/app/css/layout.css">
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
  </head>

    <body>
      
        <aside>
          <ul>
            <li><a href='/Main/index'>landing</a></li>
            <li><a href='/Main/about_us'>about us</a></li>
            <li><a href='/Contact/contact'>Contact us</a></li>
            <li><a href='/Contact/read'>See the messages we get</a></li>
          </ul>
        </aside>
        <h2>Contact Us</h2>
        <p>See our incredible team of devs</p>
    <form method = "POST" action = "">
      
      <label class ="form-label">Email address: 
      <input id = "email" class = "form-label" type="email" class="form-control" name = "email"/></label></br>
      <label class="form-label">Message: <textarea class= "form-control" rows = "2" cols = "100" name = "message">
      </textarea></label></br>
      <input class = "form-control" type = "submit" name = "action" value = "SEND IT!"/>
  </form>

  <?php
    $this->view('Count/index');
  ?>

  </body>
</html>