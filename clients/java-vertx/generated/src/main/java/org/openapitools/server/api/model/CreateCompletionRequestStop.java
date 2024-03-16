package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCompletionRequestStop   {
  

  public CreateCompletionRequestStop () {

  }

  public CreateCompletionRequestStop () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompletionRequestStop createCompletionRequestStop = (CreateCompletionRequestStop) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionRequestStop {\n");
    
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
