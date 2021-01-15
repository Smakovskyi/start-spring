package ua.kpi.controller.commands;

import org.springframework.stereotype.Component;

@Component("default")
public class DefaultCommand implements Command {

  @Override
  public String execute(String[] args) {
    return "usage: \nadd 2 3 \nexit";
  }
}
