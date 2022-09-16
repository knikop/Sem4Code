<html>
  <head>
	  <title>Contact Us - Messages sent</title>
    <link rel="stylesheet" type="text/css" href="/app/css/layout.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
  </head>

    <body>
        
          <aside>
            <ul>
                <li><a href='/Main/index'>landing</a></li>
                <li><a href='/Main/about_us'>about us</a></li>
                <li><a href='/Contact/index'>Contact us</a></li>
                <li><a href='/Contact/read'>See the messages we get</a></li>
            </ul>
          </aside>  
           <h2>Contact Us - messages sent</h2>
          <p>See our incredible team of devs</p>
          
          <dl>
            <?php
              foreach($data as $item) {
                  $object = json_decode($item);
                  echo "<dt>$object->author</dt><dd>$object->message</dd>";
              }
            ?>
            </dl>
            <?php
               $this->view('Count/index');
            ?>
            
    </body>
</html>