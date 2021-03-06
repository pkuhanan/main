//@@author chenchongsong
package seedu.address.model.item;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.address.testutil.Assert;

public class ItemTest {

    private static final String VALID_ITEM_NAME_1 = "Taxi Fare Split";
    private static final String VALID_ITEM_NAME_2 = "Taxi_Fare_Split";
    private static final String VALID_ITEM_NAME_3 = "Taxi  Fare  Split";
    private static final String VALID_ITEM_NAME_4 = "Taxi__Fare__Split";
    private static final String INVALID_ITEM_NAME = "";
    private static final String INVALID_ITEM_VALUE_1 = "";

    @Test
    public void constructor_null_throwsNullPointerException() {
        Assert.assertThrows(NullPointerException.class, () -> new Item(null, null));
    }

    @Test
    public void constructor_invalidItemName_throwsIllegalArgumentException() {
        Assert.assertThrows(IllegalArgumentException.class, () -> new Item(INVALID_ITEM_NAME, INVALID_ITEM_VALUE_1));
    }

    @Test
    public void isValidItemName() throws Exception {
        // null name
        Assert.assertThrows(NullPointerException.class, () -> Item.isValidItemName(null));

        // invalid name
        assertFalse(Item.isValidItemName("")); // empty string
        assertFalse(Item.isValidItemName("^")); // only non-alphanumeric characters
        assertFalse(Item.isValidItemName("item*")); // contains non-alphanumeric characters

        // valid name
        assertTrue(Item.isValidItemName("someitemname")); // alphabets only
        assertTrue(Item.isValidItemName("12345")); // numbers only
        assertTrue(Item.isValidItemName("some item name 123456")); // alphanumeric characters
        assertTrue(Item.isValidItemName("Some Item Name")); // with capital letters
        assertTrue(Item.isValidItemName(VALID_ITEM_NAME_1)); // separated by space
        assertTrue(Item.isValidItemName(VALID_ITEM_NAME_2)); // separated by _
        assertTrue(Item.isValidItemName(VALID_ITEM_NAME_3)); // separated by two spaces
        assertTrue(Item.isValidItemName(VALID_ITEM_NAME_4)); // separated by __
    }

    @Test
    public void isValidItemValue() throws Exception {
        // null name
        Assert.assertThrows(NullPointerException.class, () -> Item.isValidItemValue(null));

        // valid item value
        assertTrue(Item.isValidItemValue("0")); // numbers only
        assertTrue(Item.isValidItemValue("123456")); // multiple digits
        assertTrue(Item.isValidItemValue("10.2345")); // with multiple decimal places
        assertTrue(Item.isValidItemValue("12345678978978987978987987987987")); // long digits
        assertTrue(Item.isValidItemValue("123456.123E8")); // scientific representation of floating point numbers

        // invalid item value
        assertFalse(Item.isValidItemValue(""));
        assertFalse(Item.isValidItemValue("10."));
        assertFalse(Item.isValidItemValue("123E8E6"));
        assertFalse(Item.isValidItemValue("10k"));
    }

}
