package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.playerentity;

public class playerdao {

	String url = "jdbc:mysql://localhost:3306/batch1194db";
	String user = "root";
	String password = "root";
	String path = "com.mysql.cj.jdbc.Driver";

	Connection cnn = null;
	Statement st = null;
	ResultSet rs = null;

	public List<playerentity> ShowAllPlayer() {
		List<playerentity> db = new ArrayList<playerentity>();

		try {
			Class.forName(path);
			cnn = DriverManager.getConnection(url, user, password);
			st = cnn.createStatement();

			String query = " SELECT * FROM batch1194db.player";
			rs = st.executeQuery(query);

			while (rs.next()) {

				int id = rs.getInt("jrnumber");
				String name = rs.getString("playername");
				int runs = rs.getInt("runs");
				int whicket = rs.getInt("whicket");
				String teamname = rs.getString("teamname");

				playerentity player = new playerentity(id, name, runs, whicket, teamname);
				db.add(player);

//				System.out.println(" id " + id + " name" + name + " runs" + whicket + " teamname" + teamname);

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("id , name , whicket, teamname");

		}

		return db;

	}

	public List<playerentity> UpdatePlayerData() {
		List<playerentity> db = new ArrayList<playerentity>();

		try {
			Class.forName(path);
			cnn = DriverManager.getConnection(url, user, password);
			st = cnn.createStatement();

			String query2 = ("UPDATE batch1194db.player SET jrnumber = 28, playername = 'hrushi', runs = 300, whicket = 3 , teamname = 'HD' WHERE jrnumber = 25");

			rs = st.executeQuery(query2);

			while (rs.next()) {

				int id = rs.getInt("jrnumber");
				String name = rs.getString("playername");
				int runs = rs.getInt("runs");
				int whicket = rs.getInt("whicket");
				String teamname = rs.getString("teamname");

				playerentity player = new playerentity(id, name, runs, whicket, teamname);
				db.add(player);

//				System.out.println(" id " + id + " name" + name + " runs" + whicket + " teamname" + teamname);

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("id , name , whicket, teamname");

		}

		return db;

	}

	public List<playerentity> InsertPlayerData() {
		List<playerentity> db = new ArrayList<playerentity>();

		try {
			Class.forName(path);
			cnn = DriverManager.getConnection(url, user, password);
			st = cnn.createStatement();

		   String query3 = (" INSERT INTO batch1194db.player VALUES(24,'pratik',600,6,'csk'");

			rs = st.executeQuery(query3);

			while (rs.next()) {

				int id = rs.getInt("jrnumber");
				String name = rs.getString("playername");
				int runs = rs.getInt("runs");
				int whicket = rs.getInt("whicket");
				String teamname = rs.getString("teamname");

				playerentity player = new playerentity(id, name, runs, whicket, teamname);
				db.add(player);

//				System.out.println(" id " + id + " name" + name + " runs" + whicket + " teamname" + teamname);

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("id , name , whicket, teamname");

		}

		return db;

	}
	public List<playerentity> DeletePlayerData() {
		List<playerentity> db = new ArrayList<playerentity>();

		try {
			Class.forName(path);
			cnn = DriverManager.getConnection(url, user, password);
			st = cnn.createStatement();

			String query3 = (" DELETE * FROM batch1194db.player WHERE jrnumber = 23");

			rs = st.executeQuery(query3);

			while (rs.next()) {

				int id = rs.getInt("jrnumber");
				String name = rs.getString("playername");
				int runs = rs.getInt("runs");
				int whicket = rs.getInt("whicket");
				String teamname = rs.getString("teamname");

				playerentity player = new playerentity(id, name, runs, whicket, teamname);
				db.add(player);

//				System.out.println(" id " + id + " name" + name + " runs" + whicket + " teamname" + teamname);

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("id , name , whicket, teamname");

		}

		return db;

	}
	    }

