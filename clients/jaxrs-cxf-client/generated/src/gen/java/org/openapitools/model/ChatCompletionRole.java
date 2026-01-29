package org.openapitools.model;



/**
 * The role of the author of a message
 */
public enum ChatCompletionRole {
  
  SYSTEM("system"),
  
  USER("user"),
  
  ASSISTANT("assistant"),
  
  TOOL("tool"),
  
  FUNCTION("function");

  private String value;

  ChatCompletionRole(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChatCompletionRole fromValue(String value) {
    for (ChatCompletionRole b : ChatCompletionRole.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

