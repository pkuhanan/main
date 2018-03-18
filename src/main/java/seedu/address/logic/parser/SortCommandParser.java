package seedu.address.logic.parser;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.logic.commands.SortCommand;
import seedu.address.logic.parser.exceptions.ParseException;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CliSyntax.*;

/**
 * Parses input arguments and creates a new SortCommand object
 */
public class SortCommandParser implements Parser<SortCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the SortCommand
     * and returns an SortCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public SortCommand parse(String args) throws ParseException {
        requireNonNull(args);
        ArgumentMultimap argMultimap =
                ArgumentTokenizer.tokenize(args, PREFIX_NAME, PREFIX_PHONE, PREFIX_EMAIL, PREFIX_ADDRESS, PREFIX_MONEY,
                        PREFIX_TAG);
        Index index;
        return new SortCommand();
    }

//        try {
//            index = ParserUtil.parseIndex(argMultimap.getPreamble());
//        } catch (IllegalValueException ive) {
//            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, EditCommand.MESSAGE_USAGE));
//        }
//
//        EditPersonDescriptor editPersonDescriptor = new EditPersonDescriptor();
//        try {
//            ParserUtil.parseName(argMultimap.getValue(PREFIX_NAME)).ifPresent(editPersonDescriptor::setName);
//            ParserUtil.parsePhone(argMultimap.getValue(PREFIX_PHONE)).ifPresent(editPersonDescriptor::setPhone);
//            ParserUtil.parseEmail(argMultimap.getValue(PREFIX_EMAIL)).ifPresent(editPersonDescriptor::setEmail);
//            ParserUtil.parseAddress(argMultimap.getValue(PREFIX_ADDRESS)).ifPresent(editPersonDescriptor::setAddress);
//            ParserUtil.parseMoney(argMultimap.getValue(PREFIX_MONEY)).ifPresent(editPersonDescriptor::setMoney);
//        } catch (IllegalValueException ive) {
//            throw new ParseException(ive.getMessage(), ive);
//        }
//
//        if (!editPersonDescriptor.isAnyFieldEdited()) {
//            throw new ParseException(EditCommand.MESSAGE_NOT_EDITED);
//        }
//
//        return new EditCommand(index, editPersonDescriptor);
//  }

}
