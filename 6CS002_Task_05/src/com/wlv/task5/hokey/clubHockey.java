package com.wlv.task5.hokey;

/****************************************************************************************
 * This class stores the details of a National Hockey club including the 
 * performance measures that determine their played and received points in the tournament.
 * The class implements the Comparable interface, which determines how clubs will be sorted.     
 *****************************************************************************************/

public class clubHockey implements Comparable<clubHockey> {
	
	  private int team_id;
	  private int gameId;
	  private String opposingTeam;
	  private String home_or_away;
	  private String position;
	  private String situation;
	  private int shotsOnGoalFor;
	  private int missedShotsFor;
	  private int blockedShotAttemptsFor;
	  private int shotAttemptsFor;
	  private int goalsFor;
	  private int reboundsFor;
	  private int freezeFor;
	  private int playStoppedFor;
	  private int playContinuedInZoneFor;
	  private int playContinuedOutsideZoneFor;
	  private int savedShotsOnGoalFor;
	  private int playoffGame;

	  public clubHockey(int team_id, int gameId, String opposingTeam, String home_or_away,
			  String position,String situation, int shotsOnGoalFor, int missedShotsFor, int blockedShotAttemptsFor, 
			  int shotAttemptsFor, int goalsFor, int reboundsFor, int reboundGoalsFor, int freezeFor, int playStoppedFor,
			  int playContinuedInZoneFor, int playContinuedOutsideZoneFor, int savedShotsOnGoalFor, int playoffGame) {
	   
		  this.team_id = team_id;
		  this.gameId =	gameId;
		  this.opposingTeam = opposingTeam;
		  this.home_or_away = home_or_away;
		  this.position = position;
		  this.situation = situation;
		  this.shotsOnGoalFor = shotsOnGoalFor;
		  this.missedShotsFor =	missedShotsFor;
		  this.blockedShotAttemptsFor =	blockedShotAttemptsFor;
		  this.shotAttemptsFor = shotAttemptsFor;
		  this.goalsFor = goalsFor;
		  this.reboundsFor = reboundsFor;
		  this.freezeFor = freezeFor;
		  this.playStoppedFor = playStoppedFor;
		  this.playContinuedInZoneFor =	playContinuedInZoneFor;
		  this.playContinuedOutsideZoneFor = playContinuedOutsideZoneFor;
		  this.savedShotsOnGoalFor = savedShotsOnGoalFor;
		  this.playoffGame = playoffGame;
  
		 
	  }

	  public String toString() {
	    return String.format("%-3d%-20s%10d%10d%10d", team_id, gameId, opposingTeam, shotsOnGoalFor,
	    		blockedShotAttemptsFor, shotAttemptsFor,playoffGame);
	  }

	  public int getTeam_id() {
	    return team_id;
	  }

	  public void setTeam_id(int team_id) {
	    this.team_id = team_id;
	  }
	  
	  public int getGameId() {
		    return gameId;
	  }

	   public void setGameId(int gameId) {
		    this.gameId = gameId;
	  }

	   public String getOpposingTeam() {
			return opposingTeam;
	   }

	  public void setOpposingTeam(String opposingTeam) {
			this.opposingTeam = opposingTeam;
		
	  }
	  public String getHome_or_away() {
		    return home_or_away;
			
	  }	  
	  public void getHome_or_away(String home_or_away) {
		  this.home_or_away = home_or_away;
	  }
	  	  
	  public String setPosition() {
		  return position;
	  }
	  
	  public void getPosition(String position) {
		  this.position = position;
	  }
	  
	  public String setSituation() {
		  return situation;
	  }
	  public void getSituation(String situation) {
		  this.situation=situation;
	  }

	   public int getShotsOnGoalFor() {
	    return shotsOnGoalFor;
	  }

	  public void setShotsOnGoalFor(int shotsOnGoalFor) {
	    this.shotsOnGoalFor = shotsOnGoalFor;
	  }
	  
	  public int getMissedShotsFor() {
		  return missedShotsFor;
	  }
	  public void setMissedShotsFor(int missedShotsFor) {
		  this.missedShotsFor=missedShotsFor;
	  }
	  
	  public int getGoalsFor() {
		  return goalsFor;
	  }
	  public void setGoalsFor(int goalsFor) {
		  this.goalsFor=goalsFor;
	  }

	  public int getReboundsFor() {
	    return reboundsFor;
	  }

	  public void setReboundsFor(int reboundsFor) {
	    this.reboundsFor = reboundsFor;
	  }

	  public int getBlockedShotAttemptsFor() {
	    return blockedShotAttemptsFor;
	  }

	  public void setBlockedShotAttemptsFor(int blockedShotAttemptsFor) {
	    this.blockedShotAttemptsFor = blockedShotAttemptsFor;
	  }

	  public int getShotAttemptsFor() {
	    return shotAttemptsFor;
	  }

	  public void setShotAttemptsFor(int shotAttemptsFor) {
	    this.shotAttemptsFor = shotAttemptsFor;
	  }

	  public int getPlayoffGame() {
	    return playoffGame;
	  }

	  public void setPlayoffGame(int playoffGame) {
	    this.playoffGame = playoffGame;
	  }

	  public int getfreezeFor() {
	    return freezeFor;
	  }

	  public void setFreezeFor(int freezeFor) {
	    this.freezeFor = freezeFor;
	  }

	  public int getPlayStoppedFor() {
	    return playStoppedFor;
	  }

	  public void setPlayStoppedFor(int playStoppedFor) {
	    this.playStoppedFor = playStoppedFor;
	  }

	  public int getPlayContinuedInZoneFor() {
	    return playContinuedInZoneFor;
	  }

	  public void setPlayContinuedInZoneFor(int playContinuedInZoneFor) {
	    this.playContinuedInZoneFor = playContinuedInZoneFor;
	  }

	  public int getPlayContinuedOutsideZoneFor() {
	    return playContinuedOutsideZoneFor;
	  }

	  public void setPlayContinuedOutsideZoneFor(int playContinuedOutsideZoneFor) {
	    this.playContinuedOutsideZoneFor = playContinuedOutsideZoneFor;
	  }

	  public int getSavedShotsOnGoalFor() {
	    return savedShotsOnGoalFor;
	  }

	  public void setSavedShotsOnGoalFor(int savedShotsOnGoalFor) {
	    this.savedShotsOnGoalFor = savedShotsOnGoalFor;
	  }

	  
	  public int compareTo(clubHockey c) {
	    return ((Integer) playoffGame).compareTo(c.playoffGame);
	  }
	}


