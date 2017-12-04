package generics.examples.boundbytype;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedPairTest {
	@Test
	public void shouldMaintainTheAscendingOrderOfSortedPair(){
		SortedPair<Integer> pair=new SortedPair<Integer>(8, 9);
	    assertEquals(8,pair.getFirst().intValue());
	    assertEquals(9, pair.getSecond().intValue());
	}
	
	@Test
	public void shouldMaintainAscendingOrderWhenValuesAreFlipped(){
		SortedPair<Integer> pair=new SortedPair<Integer>(9, 8);
		assertEquals(8, pair.getFirst().intValue());
		assertEquals(9,pair.getSecond().intValue());
	}
}
