/**
 * 
 */

function CalculeBC()
{
	
	var genre_v= document.getElementById('categorie').value;
	if (genre_v==1)
    {
        
        document.getElementById("nbrePlace").disabled=true;
        document.getElementById("chargeUtile").disabled=false;
        
    }
	
	if(genre_v==2)
    {
        /*document.getElementById("Checkbox2").checked = true;//recours des tiers et incendie
        document.getElementById("Checkbox265").checked = true;//
        document.getElementById("Checkbox10").checked = true;
        document.getElementById("Checkbox101").checked = true;
        //alert('salut les amis');
        $("#pack").fadeOut();
        $("#charge").fadeOut();
        $("#places").fadeIn();
        $("#places1").fadeOut();
        $("#placeSup").fadeOut();*/
        //$("#places1").fadeOut();
        document.getElementById("nbrePlace").disabled=false;
       /* document.getElementById("places1").disabled=true;
        document.getElementById("pack").options[0].selected=true;*/
        /*document.getElementById("chargeUtile").options[0].selected=false;*/
        document.getElementById("chargeUtile").disabled=true;
    }
	if (genre_v==3)
    {
		 document.getElementById("nbrePlace").disabled=false;
	     document.getElementById("chargeUtile").disabled=false;
    }
	if (genre_v==4)
    {
		 document.getElementById("nbrePlace").disabled=false;
		 document.getElementById("chargeUtile").disabled=true;
	        
    }
	if (genre_v==5)
	{
		document.getElementById("puissance").disabled=true;
        document.getElementById("puissance").value=null;
		document.getElementById('chassis').disabled = false;
        document.getElementById('cylindre').disabled = false;
        document.getElementById("nbrePlace").disabled=true;
        document.getElementById("chargeUtile").disable=true;
	}
	if(genre_v !=5)
    {
        
        document.getElementById('chassis').disabled = true;
        document.getElementById('cylindre').disabled = true;
        document.getElementById('cylindre').value = null;
        document.getElementById("puissance").disabled=false;
    }
	if(genre_v !=4)
    {
        document.getElementById("places").disabled=false;
        /*document.getElementById("places1").disabled=true;*/
        var places=document.getElementById('nbrePlace').value;
    }
    /*alert('je suis la');*/
    /*document.getElementById("nbrePlace").disabled=true;*/
    /*document.getElementById('nomAssure').value=document.getElementById('nomSouscripteur').value;
    document.getElementById('prenomAssure').value=document.getElementById('prenomSouscripteur').value;*/
	var mois =document.getElementById('duree').value;
	var lib =document.getElementById('libelleGarantie').value;
	if (mois==1) {var taux=8.75;  }
    else if(mois==2) {var taux=2*(8.75)}
    else if(mois==3) {var taux=3*(8.75)}
    else if(mois==4) {var taux=4*(8.75)}
    else if(mois==5) {var taux=5*(8.75)}
    else if(mois==6) {var taux=6*(8.75)}
    else if(mois==7) {var taux=7*(8.75)}
    else if(mois==8) {var taux=8*(8.75)}
    else if(mois==9) {var taux=9*(8.75)}
    else{ var taux=100}
	var nrj =document.getElementById('energie').value;
	
}
