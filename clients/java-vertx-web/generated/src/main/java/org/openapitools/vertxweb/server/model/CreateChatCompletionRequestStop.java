package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Up to 4 sequences where the API will stop generating further tokens. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateChatCompletionRequestStop   {
  

  public CreateChatCompletionRequestStop () {

  }

  public CreateChatCompletionRequestStop () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionRequestStop createChatCompletionRequestStop = (CreateChatCompletionRequestStop) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionRequestStop {\n");
    
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
