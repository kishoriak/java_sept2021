function getProductByCategory(){
	//step 1--- generate object
   var xhr=new XMLHttpRequest();
   //step 2  ---generate request
    let url="http://localhost:8080/ProductServletApp/getProductsByCategory?cid=2";
    clist=document.getElementById("categorylist");
	var cid=clist.options[clist.selectedIndex].value;
    xhr.open("GET","getProductsByCategory?cid="+cid,true);
	///step 3 configure the request
	xhr.onreadystatechange=function(){
		if(xhr.readyState===4 && xhr.status==200){
			alert(xhr.responseText);
		}
	}
	//step 4
	xhr.send();

	
}