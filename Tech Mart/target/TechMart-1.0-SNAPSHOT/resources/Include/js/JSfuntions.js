var myModal = document.getElementById('myModal')
var myInput = document.getElementById('myInput')

myModal.addEventListener('shown.bs.modal', function () {
  myInput.focus()
})
	

		

var xmlHttp = createXmlHttpRq();

function createXmlHttpRq(){
	var xmlHttp;
	if(window.ActiveXObject){
		try{
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		catch(e){
			xmlHttp=false;
		}
	}
	else{
		try{
			xmlHttp = new XMLHttpRequest();
		}
		catch(e){
			xmlHttp=false;
		}
	}
	if(!xmlHttp){
		alert("Erro creating XMLHttpRequest object");
	}
	else{
		return xmlHttp;
	}
	
}


function process(){
	if(xmlHttp.readyState==4 || xmlHttp.readyState==0){
		var msg=document.getElementById("id1");
		var x=parseInt(msg.innerText);
		//name = encodeURIComponent(document.getElementById("id1").value);
		xmlHttp.open("GET","Include/getDataFromHomepageToCart.jsp?name="+x,true)
		xmlHttp.onreadystatechange=handleSeverRes;
		xmlHttp.send(null);
	}
	else{
		setTimeout('process',1000);
	}
}


function handleSeverRes(){
	if(xmlHttp.readyState==4){
		if(xmlHttp.status==200){
			var xmlResponse=xmlHttp.responseXML;
			var xmlDocumentElement=xmlResponse.documentElement;
			var helloMg=xmlDocumentElement.firstChild.data;
			
			document.getElementById("id2").innerHTML='<strong>'+helloMg+'</strong>';
			
			setTimeout('process',1000);
		}
		else{
			alert("There was a problem in the server "+xmlHttp.statusText);
		}
	}
}

