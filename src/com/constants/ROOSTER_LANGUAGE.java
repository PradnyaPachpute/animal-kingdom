package com.constants;

public enum ROOSTER_LANGUAGE {
	DANISH("kykyliky"),
	DUTCH("kukeleku"),
	FINNISH("kukko kiekuu"),
	FRENCH("cocorico"),
	GERMAN("kikeriki"),
	GREEK("kikiriki"),
	HEBREW("coo-koo-ri-koo"),
	HUNGARIAN("kukuriku"),
	ITALIAN("chicchirichi"),
	JAPANESE("ko-ke-kok-ko-o"),
	PORTUGESE("cucurucu"),
	RUSSIAN("kukareku"),
	SWEDISH("kukeliku"),
	TURKISH("kuk-kurri-kuu"),
	URDU("kuklooku"),
	MARATHI("kukdookoo");
	
	String language;
	
	private ROOSTER_LANGUAGE(String language){
		this.language = language;
	}
	
	public String getLanguage(){
		return language;
	}
	
}
