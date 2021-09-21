package DukeUtility;

import java.sql.SQLOutput;

public class OwlException extends Exception{
    public OwlException(String description) {
        super(description);
    }
    public void printErrorMsg() {
        String description = this.getMessage();
        System.out.println(description);
    }

    public static void checkException(String[] inputs) throws OwlException {
        if(inputs[0].isEmpty()) {
            throw new OwlException("Command should not be blank!");
        }
        if(inputs[0].equals("todo")) {
            throw new OwlException("The description of todo cannot be empty!");
        }
        if(inputs[0].equals("done")) {
            throw new OwlException("The description of done cannot be empty!");
        }
        if(inputs[0].equals("find")) {
            throw new OwlException("The description of find cannot be empty!");
        }
        if(inputs[0].equals("event")) {
            throw new OwlException("The description of event cannot be empty!");
        }
        if(inputs[0].equals("deadline")) {
            throw new OwlException("The description of deadline cannot be empty!");
        }
        if(inputs[0].equals("list")) {
            throw new OwlException("list does not have description!");
        }
        if(inputs[0].equals("delete")) {
            throw new OwlException("The description of delete cannot be empty!");
        }
    }
}
