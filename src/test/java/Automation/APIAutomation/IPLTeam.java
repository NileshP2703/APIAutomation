package Automation.APIAutomation;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class IPLTeam {

	
	
	@Test
	public void checkIPLTeam() {
		
		/*We can call API here to get the JSON or 
		 *We can use scanner class to get the input from USER or
		 *We can use csv for getting the JSON for the team
		 */
		//HardCoding the sample JSON into String object
		
		String inputTeamJSON = "";
		
		JSONObject teamObject = new JSONObject(inputTeamJSON);
		
		JSONArray playersList = teamObject.getJSONArray("players");
		
		int foreignPlayersCount = countForeignPlayers(playersList);
		
	}
	
	
	public int countForeignPlayers(JSONArray jsonArray) {
		
		int count =0;
		for(int i = 0 ; i < jsonArray.length(); i++) {
		
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			if(!jsonObject.getString("country").equalsIgnoreCase("INDIA"))
				count++;
		}
		
		return count;
	}
}
