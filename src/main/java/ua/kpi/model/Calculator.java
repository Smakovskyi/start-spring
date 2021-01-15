package ua.kpi.model;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Calculator implements Calculable {

  private int lastResult;

  public int add(int first, int second){
    int result = first + second;
    lastResult = result;
    return result;
  }

  public int sub(int first, int second){
    return first - second;
  }

  public int divide(int first, int second) {
    int result = first / second;
    lastResult = result;
    return result;
  }
}
