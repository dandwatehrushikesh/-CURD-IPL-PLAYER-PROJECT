package com.entity;

public class playerentity {
	private int jrnumber;
	private String playername;
	private int runs;
	private  int whicket;
	private String teamname;
	public playerentity() {
		super();
	}
	public playerentity(int jrnumber, String playername, int runs, int whicket, String teamname) {
		super();
		this.jrnumber = jrnumber;
		this.playername = playername;
		this.runs = runs;
		this.whicket = whicket;
		this.teamname = teamname;
	}
	public int getJrnumber() {
		return jrnumber;
	}
	public void setJrnumber(int jrnumber) {
		this.jrnumber = jrnumber;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWhicket() {
		return whicket;
	}
	public void setWhicket(int whicket) {
		this.whicket = whicket;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	@Override
	public String toString() {
		return "playerentity [jrnumber=" + jrnumber + ", playername=" + playername + ", runs=" + runs + ", whicket="
				+ whicket + ", teamname=" + teamname + "]";
	}
	

}
