 // validate name
   validatename=function(){
	   var name=document.getElementById("nm").value;
	    var ptag=document.getElementById("nmerr");
	    if(name.trim().length>0){
	    	ptag.innerHTML="";
	    	//alert(name);
	    	return true;
	    }
	    ptag.innerHTML="name cannot be blank";
	    //alert("name cannot be blank");
	    return false;
   }
   //validatepassword
   function validatepassword(){
	   var pass=document.getElementById("pass").value;
	   var cpass=document.getElementById("cpass").value;
	   if(pass===cpass){
		   document.getElementById("passerr").innerHTML="";
		   return true;
	   }
	   document.getElementById("passerr").innerHTML="password and confirm password doesnot match";
	   return false;
   }
   validatehobbies=()=>{
	   var hobbies=document.getElementsByName("hb");
	   var cnt=0;
	   for(var i=0;i<hobbies.length;i++){
		   if(hobbies[i].checked){
			   cnt++;
			   if(cnt>=2){
				   document.getElementById("hberr").innerHTML="";
				   return true;
			   }
		   }
	   }
	   document.getElementById("hberr").innerHTML="select minimum 2 hobbies";
	   return false;
	   /*for(hb of hobbies){
		   alert(hb.value);
		   
	   }*/
	   
	   
   }
   function displayData(){
	   var name=document.getElementById("nm").value;
	   var pass=document.getElementById("pass").value;
	   var mob=document.getElementById("mob").value;
        str="<table>";
         str+="<tr><td>"+name+"</td></tr></table>"

	   //document.getElementById("mydata").innerHTML+="Hello "+name+" Password: "+pass+"Mobile : "+mob;
	   document.write("Hello "+name+" Password: "+pass+"Mobile : "+mob);
   }
   //vlaidation for all fields
   function validateData(){
	   var nmflag=validatename();
	   var passflag=validatepassword();
	   var hbflag=validatehobbies();
	   if(nmflag && passflag && hbflag){
		   displayData();
	   }
	   return false;
   }
  /* validateData()=function{
	   
	   
   }
   validateData=()=>{
	   
	   
   }*/