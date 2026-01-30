package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * ID of the model to use. See the [model endpoint compatibility](/docs/models#model-endpoint-compatibility) table for details on which models work with the Chat API.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateChatCompletionRequestModel   {
  

  public CreateChatCompletionRequestModel () {

  }

  public CreateChatCompletionRequestModel () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionRequestModel createChatCompletionRequestModel = (CreateChatCompletionRequestModel) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionRequestModel {\n");
    
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
