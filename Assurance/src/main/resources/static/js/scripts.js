/**
 * 
 */

function CalculeBC() {

	var genre_v = document.getElementById('categorie').value;
	var puissance = document.getElementById('puissance').value;
	var chargeUtile=document.getElementById("chargeUtile").value;
	var nbrePlace=document.getElementById('nbrePlace').value;
	var cylindre=document.getElementById('cylindre').value;
	if (genre_v == 1) {

		document.getElementById("nbrePlace").disabled = true;
		document.getElementById("chargeUtile").disabled = false;

	}

	if (genre_v == 2) {
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
		document.getElementById("nbrePlace").disabled = false;
		/* document.getElementById("places1").disabled=true;
		 document.getElementById("pack").options[0].selected=true;*/
		/*document.getElementById("chargeUtile").options[0].selected=false;*/
		document.getElementById("chargeUtile").disabled = true;
	}
	if (genre_v == 3) {
		document.getElementById("nbrePlace").disabled = false;
		document.getElementById("chargeUtile").disabled = false;
	}
	if (genre_v == 4) {
		document.getElementById("nbrePlace").disabled = false;
		document.getElementById("chargeUtile").disabled = true;

	}
	if (genre_v == 5) {
		document.getElementById("puissance").disabled = true;
		document.getElementById("puissance").value = null;
		document.getElementById('chassis').disabled = false;
		document.getElementById('cylindre').disabled = false;
		document.getElementById("nbrePlace").disabled = true;
		document.getElementById("chargeUtile").disable = true;
	}
	if (genre_v != 5) {

		document.getElementById('chassis').disabled = true;
		document.getElementById('cylindre').disabled = true;
		document.getElementById('cylindre').value = null;
		document.getElementById("puissance").disabled = false;
	}
	if (genre_v != 4) {
		document.getElementById("places").disabled = false;
		/*document.getElementById("places1").disabled=true;*/
		var places = document.getElementById('nbrePlace').value;
	}
	/*alert('je suis la');*/
	/*document.getElementById("nbrePlace").disabled=true;*/
	/*document.getElementById('nomAssure').value=document.getElementById('nomSouscripteur').value;
	document.getElementById('prenomAssure').value=document.getElementById('prenomSouscripteur').value;*/
	var mois = document.getElementById('duree').value;
	var lib = document.getElementById('libelleGarantie').value;
	if (mois == 1) {
		var taux = 8.75;
	} else if (mois == 2) {
		var taux = 2 * (8.75)
	} else if (mois == 3) {
		var taux = 3 * (8.75)
	} else if (mois == 4) {
		var taux = 4 * (8.75)
	} else if (mois == 5) {
		var taux = 5 * (8.75)
	} else if (mois == 6) {
		var taux = 6 * (8.75)
	} else if (mois == 7) {
		var taux = 7 * (8.75)
	} else if (mois == 8) {
		var taux = 8 * (8.75)
	} else if (mois == 9) {
		var taux = 9 * (8.75)
	} else {
		var taux = 100
	}
	var nrj = document.getElementById('energie').value;
	var respo= document.getElementById('libelleGarantie').value;
	if (respo == 1) {
		//alert("checked0");
		if (genre_v == 1 || genre_v == 6) {
			//alert("checked1");
			if (puissance <= 2) {
				var lim_gant_ck1 = 'ILLIMITE' // garantie
				var franch_1 = 0; //franchise
				var primebrute_1 = 37601 //prime brute
				// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
			}
			var primebrute_prorata_1 = parseInt(primebrute_1 * (taux / 100));
		}
		if (respo == 2) {
			if (puissance == 3 || puissance == 4 || puissance == 5
					|| puissance == 6) {
				var lim_gant_ck1 = 'ILLIMITE' // garantie
				var franch_1 = 0; //franchise
				var primebrute_1 = 45181; //prime brute
				// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);

			}
			var primebrute_prorata_1 = parseInt(primebrute_1 * (taux / 100));
		}
		if (respo == 3) {
			if (puissance == 7 || puissance == 8 || puissance == 9
					|| puissance == 10) {
				var lim_gant_ck1 = 'ILLIMITE' // garantie
				var franch_1 = 0; //franchise
				var primebrute_1 = 51078; //prime brute
				//alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);

			}
			var primebrute_prorata_1 = parseInt(primebrute_1 * (taux / 100));
		}
		if (respo == 4) {
			if (puissance == 11 || puissance == 12 || puissance == 13
					|| puissance == 14) {
				var lim_gant_ck1 = 'ILLIMITE' // garantie
				var franch_1 = 0; //franchise
				var primebrute_1 = 65677;//prime brute
				//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);

			}
			var primebrute_prorata_1 = parseInt(primebrute_1 * (taux / 100));
		}
		if (respo == 5) {
			if (puissance >= 15 || puissance == 16 || puissance == 17
					|| puissance == 18 || puissance == 19 || puissance == 20
					|| puissance == 21 || puissance == 22 || puissance == 23
					|| puissance == 24) {
				var lim_gant_ck1 = 'ILLIMITE' // garantie
				var franch_1 = 0; //franchise
				var primebrute_1 = 86456; //prime brute
				//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);

			}
			var primebrute_prorata_1 = parseInt(primebrute_1 * (taux / 100));
		}
		if (respo == 6) {
			if (puissance > 24) {
				var lim_gant_ck1 = 'ILLIMITE' // garantie
				var franch_1 = 0; //franchise
				var primebrute_1 = 104143; //prime brute
				//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);

			}
			var primebrute_prorata_1 = parseInt(primebrute_1 * (taux / 100));
		}
			var primebrute_prorata_1 = parseInt(primebrute_1 * (taux / 100));
		
		if (genre_v == 2) {
			// alert("checked2");
			if (nrj == 'essence') {
				// alert('energie='+nrj);

				if (chargeUtile == 'Break') {
					//   alert('charge_utile='+charge_utile);
					if (puissance <= 2) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 56958 //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 3 || puissance == 4 || puissance == 5
							|| puissance == 6) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 67644; //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 7 || puissance == 8 || puissance == 9
							|| puissance == 10) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 78974; //prime brute
						//alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 11 || puissance == 12 || puissance == 13
							|| puissance == 14) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 113944;//prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance >= 15 || puissance == 16 || puissance == 17
							|| puissance == 18 || puissance == 19
							|| puissance == 20 || puissance == 21
							|| puissance == 22 || puissance == 23
							|| puissance == 24) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 146969; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance > 24) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 174491; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
				}
				if (chargeUtile == 'Moins de 3,5T') {
					//  alert('charge_utile='+charge_utile);
					if (puissance <= 2) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 88759 //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 3 || puissance == 4 || puissance == 5
							|| puissance == 6) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 101048; //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 7 || puissance == 8 || puissance == 9
							|| puissance == 10) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 127880; //prime brute
						//alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 11 || puissance == 12 || puissance == 13
							|| puissance == 14) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 168085;//prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance >= 15 || puissance == 16 || puissance == 17
							|| puissance == 18 || puissance == 19
							|| puissance == 20 || puissance == 21
							|| puissance == 22 || puissance == 23
							|| puissance == 24) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 206063; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance > 24) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 237710; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
				}
				if (chargeUtile == 'Plus de 3,5T') {
					//  alert('charge_utile='+charge_utile);
					if (puissance <= 2) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 91294 //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 3 || puissance == 4 || puissance == 5
							|| puissance == 6) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 103580; //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 7 || puissance == 8 || puissance == 9
							|| puissance == 10) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 130415; //prime brute
						//alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);

					}
					if (puissance == 11 || puissance == 12 || puissance == 13
							|| puissance == 14) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 170617;//prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance >= 15 || puissance == 16 || puissance == 17
							|| puissance == 18 || puissance == 19
							|| puissance == 20 || puissance == 21
							|| puissance == 22 || puissance == 23
							|| puissance == 24) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 208597; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance > 24) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 240245; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}

				}
			}
			if (nrj == 'diesel') {
				// alert('energie='+nrj);

				if (chargeUtile == 'Break') {
					//   alert('charge_utile='+charge_utile);
					if (puissance < 2) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 56958 //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 2 || puissance == 3 || puissance == 4) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 67644; //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 5 || puissance == 6 || puissance == 7) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 78974; //prime brute
						//alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 8 || puissance == 9 || puissance == 10) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 113944;//prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 11 || puissance == 12 || puissance == 13
							|| puissance == 14 || puissance == 15
							|| puissance == 16) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 146969; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 17 || puissance > 17) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 174491; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
				}
				if (chargeUtile == 'Moins de 3,5T') {
					// alert('charge_utile='+charge_utile);
					if (puissance < 2) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 88759 //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 2 || puissance == 3 || puissance == 4) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 101048; //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 5 || puissance == 6 || puissance == 7) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 127880; //prime brute
						//alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 8 || puissance == 9 || puissance == 10) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 168085;//prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 11 || puissance == 12 || puissance == 13
							|| puissance == 14 || puissance == 15
							|| puissance == 16) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 206063; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 17 || puissance > 17) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 237710; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
				}
				if (chargeUtile == 'Plus de 3,5T') {
					// alert('charge_utile='+charge_utile);
					if (puissance < 2) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 91294 //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 2 || puissance == 3 || puissance == 4) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 103580; //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 5 || puissance == 6 || puissance == 7) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 130415; //prime brute
						//alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 8 || puissance == 9 || puissance == 10) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 170617;//prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 11 || puissance == 12 || puissance == 13
							|| puissance == 14 || puissance == 15
							|| puissance == 16) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 208597; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 17 || puissance > 17) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 240245; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
				}

			}
			var primebrute_prorata_1 = parseInt(primebrute_1 * (taux / 100));
		}
		if (genre_v == 3) {
			//  alert("checked3");
			if (nrj == 'essence') {
				//   alert('energie='+nrj);
				if (charge_utile == 'Moins de 3,5T') {
					//  alert('charge_utile='+charge_utile);
					if (puissance <= 2) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 115559 //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 3 || puissance == 4 || puissance == 5
							|| puissance == 6) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 133050; //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 7 || puissance == 8 || puissance == 9
							|| puissance == 10) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 165601; //prime brute
						//alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 11 || puissance == 12 || puissance == 13
							|| puissance == 14) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 222270;//prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance >= 15 || puissance == 16 || puissance == 17
							|| puissance == 18 || puissance == 19
							|| puissance == 20 || puissance == 21
							|| puissance == 22 || puissance == 23
							|| puissance == 24) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 293130; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance > 24) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 328955; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
				}
				if (chargeUtile == 'Plus de 3,5T') {
					//  alert('charge_utile='+charge_utile);
					if (puissance <= 2) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 117937 //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 3 || puissance == 4 || puissance == 5
							|| puissance == 6) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 135437; //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 7 || puissance == 8 || puissance == 9
							|| puissance == 10) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 167982; //prime brute
						//alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 11 || puissance == 12 || puissance == 13
							|| puissance == 14) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 224650;//prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance >= 15 || puissance == 16 || puissance == 17
							|| puissance == 18 || puissance == 19
							|| puissance == 20 || puissance == 21
							|| puissance == 22 || puissance == 23
							|| puissance == 24) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 285510; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance > 24) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 331336; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
				}
			}
			if (nrj == 'diesel') {
				// alert('energie='+nrj);
				if (chargeUtile == 'Moins de 3,5T') {
					//   alert('charge_utile='+charge_utile);
					if (puissance < 2) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 115559 //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 2 || puissance == 3 || puissance == 4) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 133050; //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 5 || puissance == 6 || puissance == 7) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 165601; //prime brute
						//alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 8 || puissance == 9 || puissance == 10) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 222270;//prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 11 || puissance == 12 || puissance == 13
							|| puissance == 14 || puissance == 15
							|| puissance == 16) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 283130; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 17 || puissance > 17) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 328955; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
				}
				if (chargeUtile == 'Plus de 3,5T') {
					//  alert('charge_utile='+charge_utile);
					if (puissance < 2) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 117937 //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 2 || puissance == 3 || puissance == 4) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 135437; //prime brute
						// alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 5 || puissance == 6 || puissance == 7) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 167982; //prime brute
						//alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 8 || puissance == 9 || puissance == 10) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 224650;//prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 11 || puissance == 12 || puissance == 13
							|| puissance == 14 || puissance == 15
							|| puissance == 16) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 285510; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
					if (puissance == 17 || puissance > 17) {
						var lim_gant_ck1 = 'ILLIMITE' // garantie
						var franch_1 = 0; //franchise
						var primebrute_1 = 331336; //prime brute
						//  alert('garantie: '+lim_gant_ck1+" franchise: "+franch_1+" prime brute: "+primebrute_1);
					}
				}

			}
			var primebrute_prorata_1 = parseInt(primebrute_1 * (taux / 100));
		}
		if (genre_v == 5) {
			// alert('categorie='+genre_v);
			if (cylindre <= 49) {
				var lim_gant_ck1 = 'ILLIMITE' // garantie
				var franch_1 = 0; //franchise
				var primebrute_1 = 18780; //prime brute
			}
			if (cylindre >= 50 && cylindre <= 125) {
				var lim_gant_ck1 = 'ILLIMITE' // garantie
				var franch_1 = 0; //franchise
				var primebrute_1 = 29448; //prime brute
			}
			if (cylindre > 125) {
				var lim_gant_ck1 = 'ILLIMITE' // garantie
				var franch_1 = 0; //franchise
				var primebrute_1 = 34021; //prime brute
			}
			var primebrute_prorata_1 = parseInt(primebrute_1 * (taux / 100));
		}
		if (genre_v == 4) {
			var placeSup = (document.getElementById('placeSup').value) * 589;
			var lim_gant_ck1 = 'ILLIMITE' // garantie
			var franch_1 = 0; //franchise
			// document.getElementById('puissance').style.backgroundColor='#ff1309';
			if (nrj == 'essence') {
				if (places == 4) {
					if (puissance >= 7 && puissance <= 10) {
						//alert('allo papa');
						var primebrute_1 = 12772; //prime brute
					}
					if (puissance >= 11 && puissance <= 14) {
						// alert("nooooooooo");
						var primebrute_1 = 17162; //prime brute
					}

					// var primebrute_1=34021;    //prime brute
				}
				if (nbrePlace == 7) {
					if (puissance >= 7 && puissance <= 10) {
						//alert('allo papa');
						var primebrute_1 = 18912; //prime brute
					}
					if (puissance >= 11 && puissance <= 14) {
						// alert("nooooooooo");
						var primebrute_1 = 23302; //prime brute
					}
				}
				if (nbrePlace == 23) {
					if (puissance >= 15 && puissance <= 23) {
						// alert('allo papa');
						var primebrute_1 = 38557; //prime brute
					}
				}
				if (nbrePlace == 24) {
					if (puissance >= 15 && puissance <= 23) {
						var primebrute_1 = 39381; //prime brute
					}
				}
				if (nbrePlace == 39) {
					if (puissance >= 15 && puissance <= 23) {
						var primebrute_1 = 49621; //prime brute
					}
				}
			}
			if (nrj == 'diesel') {
				if (places == 4) {
					if (puissance >= 5 && puissance <= 7) {
						//alert('allo papa');
						var primebrute_1 = 12772; //prime brute
					}
					if (puissance >= 8 && puissance <= 10) {
						// alert("nooooooooo");
						var primebrute_1 = 17162; //prime brute
					}

				}
				if (nbrePlace == 7) {
					if (puissance >= 5 && puissance <= 7) {
						//alert('allo papa');
						var primebrute_1 = 18912; //prime brute
					}
					if (puissance >= 8 && puissance <= 10) {
						// alert("nooooooooo");
						var primebrute_1 = 23302; //prime brute
					}

				}
				if (nbrePlace == 23) {
					if (puissance >= 11 && puissance <= 16) {
						var primebrute_1 = 38557;
					}
				}
				if (places == 24) {
					if (puissance >= 8 && puissance <= 10) {
						// alert("nooooooooo");
						var primebrute_1 = 34450; //prime brute
					}
					if (puissance >= 11 && puissance <= 16) {
						var primebrute_1 = 39381;
					}
				}
				if (nbrePlace == 39) {
					if (puissance >= 11 && puissance <= 16) {
						var primebrute_1 = 49621;
					}
				}
				if (nbrePlace == 60) {
					if (puissance >= 5 && puissance <= 7) {
						if (mois == 1) {
							var primebrute_1 = 52071;
						}
						if (mois == 2) {
							var primebrute_1 = 104142;
						}
						if (mois == 3) {
							var primebrute_1 = 156213;
						}
						if (mois == 4) {
							var primebrute_1 = 208284;
						}
						if (mois == 5) {
							var primebrute_1 = 260355;
						}
						if (mois == 6) {
							var primebrute_1 = 312426;
						}
					}
					if (puissance >= 8 && puissance <= 10) {
						if (mois == 1) {
							var primebrute_1 = 56421;
						}
						if (mois == 2) {
							var primebrute_1 = 112922;
						}
						if (mois == 3) {
							var primebrute_1 = 169383;
						}
						if (mois == 4) {
							var primebrute_1 = 225844;
						}
						if (mois == 5) {
							var primebrute_1 = 282305;
						}
						if (mois == 6) {
							var primebrute_1 = 338766;
						}
					}
					if (puissance >= 11 && puissance <= 16) {
						if (mois == 1) {
							var primebrute_1 = 61391;
						}
						if (mois == 2) {
							var primebrute_1 = 122782;
						}
						if (mois == 3) {
							var primebrute_1 = 184173;
						}
						if (mois == 4) {
							var primebrute_1 = 245564;
						}
						if (mois == 5) {
							var primebrute_1 = 306955;
						}
						if (mois == 6) {
							var primebrute_1 = 368346;
						}
					}
				}
			}
			var primebrute_prorata_1 = parseInt(primebrute_1 + nbrePlace);
		}

		// var primebrute_prorata_1=parseInt(primebrute_1*(taux/100));
		// alert('garantie check1: '+lim_gant_ck1+" franchise check1: "+franch_1+" prime brute check1: "+primebrute_1+" prorata1:"+primebrute_prorata_1);
		document.getElementById('mtnLimite').value = lim_gant_ck1;
		document.getElementById('mtnFranchise').value = franch_1;
		document.getElementById('primeBrute').value = primebrute_1;
		document.getElementById('primeBruteProrata').value = primebrute_prorata_1;
		document.getElementById('PrimeRC').value = primebrute_prorata_1;
		// alert("prime brute RC:"+primebrute_prorata_1);
	}

}
