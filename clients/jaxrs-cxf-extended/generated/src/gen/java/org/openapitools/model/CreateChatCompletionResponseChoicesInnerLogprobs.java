package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionTokenLogprob;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  * A list of message content tokens with log probability information.
  * @return content
  */
  @JsonProperty("content")
  @NotNull
  public List<@Valid ChatCompletionTokenLogprob> getContent() {
    return content;
  }

  /**
   * Sets the <code>content</code> property.
   */
 public void setContent(List<@Valid ChatCompletionTokenLogprob> content) {
    this.content = content;
  }

  /**
   * Sets the <code>content</code> property.
   */
  public CreateChatCompletionResponseChoicesInnerLogprobs content(List<@Valid ChatCompletionTokenLogprob> content) {
    this.content = content;
    return this;
  }

  /**
   * Adds a new item to the <code>content</code> list.
   */
  public CreateChatCompletionResponseChoicesInnerLogprobs addContentItem(ChatCompletionTokenLogprob contentItem) {
    this.content.add(contentItem);
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
    return Objects.equals(this.content, createChatCompletionResponseChoicesInnerLogprobs.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponseChoicesInnerLogprobs {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

