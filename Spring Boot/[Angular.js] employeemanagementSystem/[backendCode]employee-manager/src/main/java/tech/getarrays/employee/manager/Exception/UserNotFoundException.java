package tech.getarrays.employee.manager.Exception;

public class UserNotFoundException extends RuntimeException {
  public UserNotFoundException(String message){
    super(message);
  }
}
