package apimodels;

import apimodels.ChatCompletionTokenLogprob;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Log probability information for the choice.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateChatCompletionResponseChoicesInnerLogprobs   {
  @JsonProperty("content")
  @NotNull
@Valid

  private List<@Valid ChatCompletionTokenLogprob> content = ;

  @JsonProperty("refusal")
  @NotNull
@Valid

  private List<@Valid ChatCompletionTokenLogprob> refusal = ;

  public CreateChatCompletionResponseChoicesInnerLogprobs content(List<@Valid ChatCompletionTokenLogprob> content) {
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
  **/
  public List<@Valid ChatCompletionTokenLogprob> getContent() {
    return content;
  }

  public void setContent(List<@Valid ChatCompletionTokenLogprob> content) {
    this.content = content;
  }

  public CreateChatCompletionResponseChoicesInnerLogprobs refusal(List<@Valid ChatCompletionTokenLogprob> refusal) {
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
  **/
  public List<@Valid ChatCompletionTokenLogprob> getRefusal() {
    return refusal;
  }

  public void setRefusal(List<@Valid ChatCompletionTokenLogprob> refusal) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

