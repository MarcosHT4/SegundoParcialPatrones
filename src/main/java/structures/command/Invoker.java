package command.structure;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<ICommand> commands = new ArrayList<>();

    public Invoker() {}

    public void addCommands(ICommand command) {

        commands.add(command);

    }

    public void runCommands() {

        for(ICommand command : commands) {

            command.execute();

        }

    }

}
