package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ChatCompletionTokenLogprob;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Log probability information for the choice.
 */
@ApiModel(description = "Log probability information for the choice.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionResponseChoicesInnerLogprobs   {
  @JsonProperty("content")
  
  private List<ChatCompletionTokenLogprob> content = ;

  @JsonProperty("refusal")
  
  private List<ChatCompletionTokenLogprob> refusal = ;

  public CreateChatCompletionResponseChoicesInnerLogprobs content(List<ChatCompletionTokenLogprob> content) {
    this.content = content;
    return this;
  }

  public CreateChatCompletionResponseChoicesInnerLogprobs addContentItem(ChatCompletionTokenLogprob contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * A list of message content tokens with log probability information.
   * @return content
   */
  @ApiModelProperty(required = true, value = "A list of message content tokens with log probability information.")
  public List<ChatCompletionTokenLogprob> getContent() {
    return content;
  }

  public void setContent(List<ChatCompletionTokenLogprob> content) {
    this.content = content;
  }

  public CreateChatCompletionResponseChoicesInnerLogprobs refusal(List<ChatCompletionTokenLogprob> refusal) {
    this.refusal = refusal;
    return this;
  }

  public CreateChatCompletionResponseChoicesInnerLogprobs addRefusalItem(ChatCompletionTokenLogprob refusalItem) {
    if (this.refusal == null) {
      this.refusal = new ArrayList<>();
    }
    this.refusal.add(refusalItem);
    return this;
  }

  /**
   * A list of message refusal tokens with log probability information.
   * @return refusal
   */
  @ApiModelProperty(required = true, value = "A list of message refusal tokens with log probability information.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

