package Automation.APIAutomation;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IPLTeam {

	@Test
	public void checkNumberOfForeignPlayers() {

		/*
		 * We can call API here to get the JSON or We can use scanner class to get the
		 * input from USER or We can use csv for getting the JSON for the team
		 */
		// HardCoding the sample JSON into String object

		String inputTeamJSON = "{\r\n" + "  \"name\": \"Royal Challengers Bangalore\",\r\n"
				+ "  \"location\": \"Bangalore\",\r\n" + "  \"player\": [\r\n" + "    {\r\n"
				+ "      \"name\": \"Faf Du Plessis\",\r\n" + "      \"country\": \"South Africa\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n" + "      \"price-in-crores\": \"7\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Virat Kohli\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n" + "      \"price-in-crores\": \"15\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Glenn Maxwell\",\r\n" + "      \"country\": \"Australia\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n" + "      \"price-in-crores\": \"11\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Mohammad Siraj\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n" + "      \"price-in-crores\": \"7\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Harshal Patel\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n" + "      \"price-in-crores\": \"10.75\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Wanindu Hasaranga\",\r\n" + "      \"country\": \"Srilanka\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n" + "      \"price-in-crores\": \"10.75\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Dinesh Karthik\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Wicket-keeper\",\r\n" + "      \"price-in-crores\": \"5.5\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Shahbaz Ahmed\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"All-Rounder\",\r\n" + "      \"price-in-crores\": \"2.4\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Rajat Patidar\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n" + "      \"price-in-crores\": \"0.20\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Josh Hazlewood\",\r\n" + "      \"country\": \"Australia\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n" + "      \"price-in-crores\": \"7.75\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Mahipal Lomror\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n" + "      \"price-in-crores\": \"7.75\"\r\n" + "    }\r\n"
				+ "  ]\r\n" + "}";

		JSONObject teamObject = new JSONObject(inputTeamJSON);

		JSONArray playersList = teamObject.getJSONArray("player");

		Assert.assertTrue((countForeignPlayers(playersList) <= 4), "Team has foreigner players more than allowed");
	}
	
	
	
	@Test
	public void checkWicketKeeper() {
		
		/*
		 * We can call API here to get the JSON or We can use scanner class to get the
		 * input from USER or We can use csv for getting the JSON for the team
		 */
		// HardCoding the sample JSON into String object

		String inputTeamJSON = "{\r\n" + "  \"name\": \"Royal Challengers Bangalore\",\r\n"
				+ "  \"location\": \"Bangalore\",\r\n" + "  \"player\": [\r\n" + "    {\r\n"
				+ "      \"name\": \"Faf Du Plessis\",\r\n" + "      \"country\": \"South Africa\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n" + "      \"price-in-crores\": \"7\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Virat Kohli\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n" + "      \"price-in-crores\": \"15\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Glenn Maxwell\",\r\n" + "      \"country\": \"Australia\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n" + "      \"price-in-crores\": \"11\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Mohammad Siraj\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n" + "      \"price-in-crores\": \"7\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Harshal Patel\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n" + "      \"price-in-crores\": \"10.75\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Wanindu Hasaranga\",\r\n" + "      \"country\": \"Srilanka\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n" + "      \"price-in-crores\": \"10.75\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Dinesh Karthik\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Wicket-keeper\",\r\n" + "      \"price-in-crores\": \"5.5\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Shahbaz Ahmed\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"All-Rounder\",\r\n" + "      \"price-in-crores\": \"2.4\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Rajat Patidar\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n" + "      \"price-in-crores\": \"0.20\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Josh Hazlewood\",\r\n" + "      \"country\": \"Australia\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n" + "      \"price-in-crores\": \"7.75\"\r\n" + "    },\r\n"
				+ "    {\r\n" + "      \"name\": \"Mahipal Lomror\",\r\n" + "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n" + "      \"price-in-crores\": \"7.75\"\r\n" + "    }\r\n"
				+ "  ]\r\n" + "}";

		JSONObject teamObject = new JSONObject(inputTeamJSON);

		JSONArray playersList = teamObject.getJSONArray("player");

		Assert.assertTrue((countNumberOfWicketKeepers(playersList) >= 1), "Team has no wicket keeper");
		
	}
	

	public int countForeignPlayers(JSONArray jsonArray) {

		int count = 0;
		for (int i = 0; i < jsonArray.length(); i++) {

			JSONObject jsonObject = jsonArray.getJSONObject(i);
			if (!jsonObject.getString("country").equalsIgnoreCase("INDIA"))
				count++;
		}

		return count;
	}
	
	public int countNumberOfWicketKeepers(JSONArray jsonArray) {

		int count = 0;
		for (int i = 0; i < jsonArray.length(); i++) {

			JSONObject jsonObject = jsonArray.getJSONObject(i);
			if (jsonObject.getString("role").equalsIgnoreCase("Wicket-keeper"))
				count++;
		}

		return count;
	}
	
}
