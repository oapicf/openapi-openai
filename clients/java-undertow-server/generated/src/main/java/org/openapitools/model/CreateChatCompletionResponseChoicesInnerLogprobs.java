/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionTokenLogprob;



/**
 * Log probability information for the choice.
 */

@ApiModel(description = "Log probability information for the choice.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionResponseChoicesInnerLogprobs   {
  
  private List<ChatCompletionTokenLogprob> content;
  private List<ChatCompletionTokenLogprob> refusal;

  /**
   * A list of message content tokens with log probability information.
   */
  public CreateChatCompletionResponseChoicesInnerLogprobs content(List<ChatCompletionTokenLogprob> content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of message content tokens with log probability information.")
  @JsonProperty("content")
  public List<ChatCompletionTokenLogprob> getContent() {
    return content;
  }
  public void setContent(List<ChatCompletionTokenLogprob> content) {
    this.content = content;
  }

  /**
   * A list of message refusal tokens with log probability information.
   */
  public CreateChatCompletionResponseChoicesInnerLogprobs refusal(List<ChatCompletionTokenLogprob> refusal) {
    this.refusal = refusal;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of message refusal tokens with log probability information.")
  @JsonProperty("refusal")
  public List<ChatCompletionTokenLogprob> getRefusal() {
    return refusal;
  }
  public void setRefusal(List<ChatCompletionTokenLogprob> refusal) {
    this.refusal = refusal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionResponseChoicesInnerLogprobs createChatCompletionResponseChoicesInnerLogprobs = (CreateChatCompletionResponseChoicesInnerLogprobs) o;
    return Objects.equals(content, createChatCompletionResponseChoicesInnerLogprobs.content) &&
        Objects.equals(refusal, createChatCompletionResponseChoicesInnerLogprobs.refusal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, refusal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponseChoicesInnerLogprobs {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
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

