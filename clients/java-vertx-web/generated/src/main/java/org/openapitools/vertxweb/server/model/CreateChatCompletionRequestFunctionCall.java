package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CreateChatCompletionRequestFunctionCallOneOf;

/**
 * Controls how the model responds to function calls. \&quot;none\&quot; means the model does not call a function, and responds to the end-user. \&quot;auto\&quot; means the model can pick between an end-user or calling a function.  Specifying a particular function via &#x60;{\&quot;name\&quot;:\\ \&quot;my_function\&quot;}&#x60; forces the model to call that function. \&quot;none\&quot; is the default when no functions are present. \&quot;auto\&quot; is the default if functions are present.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateChatCompletionRequestFunctionCall   {
  
  private String name;

  public CreateChatCompletionRequestFunctionCall () {

  }

  public CreateChatCompletionRequestFunctionCall (String name) {
    this.name = name;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionRequestFunctionCall createChatCompletionRequestFunctionCall = (CreateChatCompletionRequestFunctionCall) o;
    return Objects.equals(name, createChatCompletionRequestFunctionCall.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionRequestFunctionCall {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
