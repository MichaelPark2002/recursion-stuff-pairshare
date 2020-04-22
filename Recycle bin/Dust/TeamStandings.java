public class TeamStandings
{
	TeamInfo[] standings;

	public void recordGameREsult(GameResult result) //c
	{
		if(result.homeScore() > result.awayScore())
		{
			adjust(teamIndex(result.homeTeam()), 2);
		}
		else if(results.homeScore() == result.awayScore())
		{
			adjust(teamIndex(result.homeTeam()), 1);
			adjust(teamIndex(result.awayTeam()), 1);
		}
		else
		{
			adjust(teamIndex(result.awayTeam()), 2);
		}

		for(int a = 0; a < standings.length; a++)
		{
			int b = a;
			for(int c = a + 1; c < standings.length; c++)
			{
				if(standings[c].points() > standings[b].points())
					b = c;
			}
			TeamInfo t = standings[a];
			standings[a] = standings[b];
			standings[b] = t;
		}
	}
	private int teamIndex(String name) //a
	{
		for(int i = 0; i < standings.length; i++)
		{
			if(teamName.equals((standings[i].teamName())))
				return i;
			return -1;
		}
	}
	private void adjust(int index, int points) //b
	{
		standings[index].increasePoints(points);
		for(int a = 0; a < standings.length; a++)
		{
			int b = a;
			for(int c = a + 1; c < standings.length; c++)
			{
				if(standings[c].points() > standings[b].points())
					b = c;
			}
			TeamInfo t = standings[a];
			standings[a] = standings[b];
			standings[b] = t;
		}
	}
}