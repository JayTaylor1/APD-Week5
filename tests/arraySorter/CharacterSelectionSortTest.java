package arraySorter;

import arrayGenerator.ArrayGenerator;
import arrayGenerator.CharacterArrayGenerator;

/**
 * Tests bubble sort for character arrays.
 *
 * @author Hugh Osborne
 * @version October 2019
 */
public class CharacterSelectionSortTest extends SelectionSortTest<Character> {
    @Override
    ArrayGenerator<Character> getGenerator() {
        return new CharacterArrayGenerator();
    }
}
