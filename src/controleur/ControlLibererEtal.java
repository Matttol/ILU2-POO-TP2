package controleur;

import villagegaulois.Etal;

public class ControlLibererEtal {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	public ControlLibererEtal(
			ControlTrouverEtalVendeur controlTrouverEtalVendeur) {
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	public boolean isVendeur(String nomVendeur){
		Etal etal = null;
		etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		return (etal != null);
		}


	/**
	 * 
	 * @param nomVendeur
	 * @return donneesEtal est un tableau de chaine contenant
	 * 		[0] : un boolean indiquant si l'étal est occupé
	 * 		[1] : nom du vendeur
	 * 		[2] : produit vendu
	 * 		[3] : quantité de produit à vendre au début du marché
	 * 		[4] : quantité de produit vendu
	 */
	public String[] libererEtal(String nomVendeur) {
		Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		return etal.etatEtal();
	}


		/* Etal etal = null;
		etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		String[] donneesEtal = null;
		if (isVendeur(nomVendeur)){
			donneesEtal[0] = "true";
		} else {
			donneesEtal[0] = "false";
		}
		if (isVendeur(nomVendeur)) {
			donneesEtal[1] = nomVendeur;
			String produit;
			etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
			produit = etal.getProduit();
			String vendus = String.valueOf(etal.getQuantite());
			return donneesEtal;
		}
	} */
}
