package ua.kpi.controller;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lombok.Setter;
import org.springframework.stereotype.Component;
import ua.kpi.controller.commands.Command;
import ua.kpi.view.View;


@Setter
public class Controller {

  private View view;

  private InputStream in = System.in;
  private BufferedReader reader = new BufferedReader(
      new InputStreamReader(in));

  private Map<String, Command> commands = new HashMap<>();

  public Controller(View view, List<Command> commands) {
    this.view = view;
    for(Command command : commands){
      String beanName = command.getClass().getAnnotation(Component.class).value();
      this.commands.put(beanName, command);
    }
  }

  // add 2 3
  // exit
  public void handleUserInput() throws IOException {

    while (true) {
      String line = reader.readLine();
      if("exit".equalsIgnoreCase(line.trim())){
        return;
      }
      String[] args = line.split("\\s");
      String commandName = args[0];
      Command command = commands.getOrDefault(commandName,
          commands.get("default"));
      String result = command.execute(
          Arrays.copyOfRange(args,1, args.length ));
      view.print(result);
    }

  }
}
