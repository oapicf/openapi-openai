package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The role of the author of a message
 */
public enum ChatCompletionRole {
  
  SYSTEM("system"),
  
  USER("user"),
  
  ASSISTANT("assistant"),
  
  TOOL("tool"),
  
  FUNCTION("function");

  private final String value;

  ChatCompletionRole(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChatCompletionRole fromValue(String value) {
    for (ChatCompletionRole b : ChatCompletionRole.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

