
$(function(){
/**add dropdown toggle for language**/
	$(".dropdown-toggle").dropdown();
/**Show the menu up icon and active menu when user scroll page**/
	$(window).scroll(function(){
         var windowpos = $(window).scrollTop();
         var home = $("#home").offset().top;
         if(windowpos > home ){
   	      $("#menu li").removeClass("active");
   	      $("a[href$='#home']").parent().addClass("active");
    }
         var howtoapply = $("#howtoapply").offset().top;
         if(windowpos >= howtoapply ){
        	      $("#menu li").removeClass("active");
        	      $("a[href$='#howtoapply']").parent().addClass("active");
         }
         var service = $("#service").offset().top;
         if(windowpos >= service ){
   	      $("#menu li").removeClass("active");
   	      $("a[href$='#service']").parent().addClass("active");
    }
         var partner = $("#partner").offset().top;
         if(windowpos >= partner ){
   	      $("#menu li").removeClass("active");
   	      $("a[href$='#partner']").parent().addClass("active");
    }
         var staff = $("#staff").offset().top;
         if(windowpos >= staff ){
   	      $("#menu li").removeClass("active");
   	      $("a[href$='#staff']").parent().addClass("active");
    }
         var contact = $("#contact").offset().top;
         if(windowpos >= contact ){
   	      $("#menu li").removeClass("active");
   	      $("a[href$='#contact']").parent().addClass("active");
    }
	});/** scroll magic **/

/**add animation for dom**/
	$(".navbar-nav a, footer a[href$='#home']").on("click", function(event){
		if(this.hash !== ""){
			event.preventDefault();
			var hash = this.hash;
			$('html, body').animate({
				scrollTop: $(hash).offset().top
			}, 900, function(){
				window.location.hash = hash;
			});
		}
	});
	
/** Call geolocation google api **/
    var lat = 52.528230;
    var lng = 13.489571;
	teeMap(lat, lng);
});/** document load **/

/**add geolocation api**/	
function teeMap(lat, lng){
		var show = document.getElementById("map");
		var pos = {
			lat: lat,
			lng: lng
		}
		var options = {
			zoom: 4,
			center: pos,
			mapTypeId: 'hybrid',
			labels: true
		}
		var map = new google.maps.Map(show, options);
	    var marker = new google.maps.Marker({
	    	position: pos,
	    	map: map
	    });
	}