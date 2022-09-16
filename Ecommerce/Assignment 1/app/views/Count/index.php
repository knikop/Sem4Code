<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

		
		<div id="counter"></div>

		<script>
		$(document).ready(
			function(){
				$.getJSON("/Count/index", 
					function(data){
						$('#counter').html(data.count + " times");
					}
				);
			}
		);
</script>