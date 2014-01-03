function HomePage(){
	this.init();
}

HomePage.prototype = {
	init : function(){
		this._bindEvent();
	},
	_bindEvent : function(){
		$("#cygp-box .tabs-box li").click(function(){
			var data = $(this).attr("data");
			$("#cygp-box .tabs-box li").removeClass("sel-li");
			$(this).addClass("sel-li");
			$("#cygp-box .cygp-box-content").hide();
			$("#cygp-box #" + data).show();
			
		});
		
		
		$("#gslk-box .gslk-body .body-left dd").click(function(){
			var data = $(this).attr("data");
			$("#gslk-box .gslk-body .body-left dd").removeClass("dd-sel");
			$(this).addClass("dd-sel");
			$("#gslk-box .gslk-body .body-right").hide();
			$("#gslk-box #gslk-" + data).show();
			
		});
		
		
		$("#shineichuxing .snjt-title dl dd").click(function(){
			$("#shineichuxing .snjt-title dl dd").removeClass("dd-sel");
			$(this).addClass("dd-sel");
		});
		
		$("#gsgljtsj .gsgljtsj-title dl dd").click(function(){
			$("#gsgljtsj .gsgljtsj-title dl dd").removeClass("dd-sel");
			$(this).addClass("dd-sel");
		});
	}
};

$(function(){
	//0.7196064652143359
	var page = new HomePage();
});