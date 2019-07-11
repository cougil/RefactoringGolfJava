import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FootballScoreStatsTests {

	@Test
	public void totalsFootballScoresForTeam() {
		FootballScoreStats stats = new FootballScoreStats();
		assertEquals(6, stats.teamTotal("Liverpool"));
	}

}
