package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionFunctionCallOption;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Deprecated in favor of &#x60;tool_choice&#x60;.  Controls which (if any) function is called by the model.  &#x60;none&#x60; means the model will not call a function and instead generates a message.  &#x60;auto&#x60; means the model can pick between generating a message or calling a function.  Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Deprecated in favor of `tool_choice`.  Controls which (if any) function is called by the model.  `none` means the model will not call a function and instead generates a message.  `auto` means the model can pick between generating a message or calling a function.  Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. ")
public class CreateChatCompletionRequestFunctionCall   {
  
  private String name;

  /**
   * The name of the function to call.
   **/
  public CreateChatCompletionRequestFunctionCall name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the function to call.")
  @JsonProperty("name")
  @NotNull
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
    return Objects.equals(this.name, createChatCompletionRequestFunctionCall.name);
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

