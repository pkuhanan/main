package seedu.address.logic.commands;

import static seedu.address.model.Model.PREDICATE_SHOW_ALL_PERSONS;
import seedu.address.model.person.NameContainsKeywordsPredicate;

/**
 * Sort all persons in address book in order.
 * Keywords will be given by user through arguments.
 * Both ascending and descending order is supported.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";
    public static final String COMMAND_SHORTCUT = "so";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Finds all persons whose names contain any of "
            + "the specified keywords (case-sensitive) and displays them as a list with index numbers.\n"
            + "Parameters: KEYWORD [MORE_KEYWORDS]...\n"
            + "Example: " + COMMAND_WORD + " alice bob charlie";

    public static final String MESSAGE_SUCCESS = "Sorted all persons";

    // private final NameContainsKeywordsPredicate predicate;

    public SortCommand() {}

//    public SortCommand(NameContainsKeywordsPredicate predicate) {
//        this.predicate = predicate;
//    }

    @Override
    public CommandResult execute() {
        model.updateFilteredPersonList(PREDICATE_SHOW_ALL_PERSONS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
