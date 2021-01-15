package ua.kpi.controller.commands;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import ua.kpi.model.Calculator;

@Setter
@Component("sub")
@AllArgsConstructor
public class SubCommand implements Command {

  private Calculator calculator;
  @Override
  public String execute(String[] args) {
    Integer first = Integer.valueOf(args[0]);
    Integer second = Integer.valueOf(args[1]);
    int result = calculator.sub(first, second);
    return Integer.toString(result);
  }
}
