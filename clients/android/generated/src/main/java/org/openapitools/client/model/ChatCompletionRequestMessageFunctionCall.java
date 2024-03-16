/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The name and arguments of a function that should be called, as generated by the model.
 **/
@ApiModel(description = "The name and arguments of a function that should be called, as generated by the model.")
public class ChatCompletionRequestMessageFunctionCall {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("arguments")
  private String arguments = null;

  /**
   * The name of the function to call.
   **/
  @ApiModelProperty(value = "The name of the function to call.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
   **/
  @ApiModelProperty(value = "The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.")
  public String getArguments() {
    return arguments;
  }
  public void setArguments(String arguments) {
    this.arguments = arguments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestMessageFunctionCall chatCompletionRequestMessageFunctionCall = (ChatCompletionRequestMessageFunctionCall) o;
    return (this.name == null ? chatCompletionRequestMessageFunctionCall.name == null : this.name.equals(chatCompletionRequestMessageFunctionCall.name)) &&
        (this.arguments == null ? chatCompletionRequestMessageFunctionCall.arguments == null : this.arguments.equals(chatCompletionRequestMessageFunctionCall.arguments));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.arguments == null ? 0: this.arguments.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessageFunctionCall {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  arguments: ").append(arguments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
