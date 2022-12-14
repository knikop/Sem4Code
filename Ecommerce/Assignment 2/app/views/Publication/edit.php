<html>
<head>
	<title>Edit Publication</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</head>


<h1>Edit Publication</h1>
<form action='' method='post' enctype="multipart/form-data">
<label>Picture:<input type="file" name="picture" id="picture" /></label><img id='profile_pic_preview' src='/images/blank.jpg' style="max-width:200px;max-height:200px" /><br>
<label>Caption:<input type="text" name="caption"/></label><br>
<input type="submit" name="action" value="Edit Publication" />
</form>

<script>
picture.onchange = evt => {
  const [file] = picture.files
  if (file) {
    profile_pic_preview.src = URL.createObjectURL(file)
  }
}

file = "<?= $data['publication']->picture ?>";
if (file != "") {
	document.getElementById("profile_pic_preview").src = "/images/" + file;
}


</script>

<a href="/Publication/index">Cancel</a>

</body>
</html>