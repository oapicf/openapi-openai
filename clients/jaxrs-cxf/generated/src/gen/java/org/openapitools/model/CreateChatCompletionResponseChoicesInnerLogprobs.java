package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionTokenLogprob;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Log probability information for the choice.
 */
@ApiModel(description="Log probability information for the choice.")

public class CreateChatCompletionResponseChoicesInnerLogprobs  {
  
 /**
  * A list of message content tokens with log probability information.
  */
  @ApiModelProperty(required = true, value = "A list of message content tokens with log probability information.")

  @Valid

  private List<@Valid ChatCompletionTokenLogprob> content;

 /**
  * A list of message refusal tokens with log probability information.
  */
  @ApiModelProperty(required = true, value = "A list of message refusal tokens with log probability information.")

  @Valid

  private List<@Valid ChatCompletionTokenLogprob> refusal;
 /**
   * A list of message content tokens with log probability information.
   * @return content
  **/
  @JsonProperty("content")
  @NotNull
  public List<@Valid ChatCompletionTokenLogprob> getContent() {
    return content;
  }

  public void setContent(List<@Valid ChatCompletionTokenLogprob> content) {
    this.content = content;
  }

  public CreateChatCompletionResponseChoicesInnerLogprobs content(List<@Valid ChatCompletionTokenLogprob> content) {
    this.content = content;
    return this;
  }

  public CreateChatCompletionResponseChoicesInnerLogprobs addContentItem(ChatCompletionTokenLogprob contentItem) {
    this.content.add(contentItem);
    return this;
  }

 /**
   * A list of message refusal tokens with log probability information.
   * @return refusal
  **/
  @JsonProperty("refusal")
  @NotNull
  public List<@Valid ChatCompletionTokenLogprob> getRefusal() {
    return refusal;
  }

  public void setRefusal(List<@Valid ChatCompletionTokenLogprob> refusal) {
    this.refusal = refusal;
  }

  public CreateChatCompletionResponseChoicesInnerLogprobs refusal(List<@Valid ChatCompletionTokenLogprob> refusal) {
    this.refusal = refusal;
    return this;
  }

  public CreateChatCompletionResponseChoicesInnerLogprobs addRefusalItem(ChatCompletionTokenLogprob refusalItem) {
    this.refusal.add(refusalItem);
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
    CreateChatCompletionResponseChoicesInnerLogprobs createChatCompletionResponseChoicesInnerLogprobs = (CreateChatCompletionResponseChoicesInnerLogprobs) o;
    return Objects.equals(this.content, createChatCompletionResponseChoicesInnerLogprobs.content) &&
        Objects.equals(this.refusal, createChatCompletionResponseChoicesInnerLogprobs.refusal);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

