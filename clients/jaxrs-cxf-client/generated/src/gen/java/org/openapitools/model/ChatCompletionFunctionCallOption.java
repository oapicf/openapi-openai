package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
 **/
@ApiModel(description="Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. ")

public class ChatCompletionFunctionCallOption  {
  
  @ApiModelProperty(required = true, value = "The name of the function to call.")
 /**
   * The name of the function to call.
  **/
  private String name;
 /**
   * The name of the function to call.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChatCompletionFunctionCallOption name(String name) {
    this.name = name;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionFunctionCallOption chatCompletionFunctionCallOption = (ChatCompletionFunctionCallOption) o;
    return Objects.equals(this.name, chatCompletionFunctionCallOption.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionFunctionCallOption {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

