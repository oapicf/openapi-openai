package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ChatCompletionNamedToolChoice_function")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-03T11:09:06.848004747Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ChatCompletionNamedToolChoiceFunction   {
  private String name;

  /**
   * The name of the function to call.
   **/
  public ChatCompletionNamedToolChoiceFunction name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the function to call.")
  @JsonProperty("name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty("name")
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
    ChatCompletionNamedToolChoiceFunction chatCompletionNamedToolChoiceFunction = (ChatCompletionNamedToolChoiceFunction) o;
    return Objects.equals(this.name, chatCompletionNamedToolChoiceFunction.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionNamedToolChoiceFunction {\n");
    
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

