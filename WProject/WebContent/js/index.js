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
	}
};

$(function(){
	//0.7196064652143359
	var page = new HomePage();
});