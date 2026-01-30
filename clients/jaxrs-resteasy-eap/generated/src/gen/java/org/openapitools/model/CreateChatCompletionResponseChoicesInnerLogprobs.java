package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionTokenLogprob;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Log probability information for the choice.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionResponseChoicesInnerLogprobs   {
  
  private List<@Valid ChatCompletionTokenLogprob> content;
  private List<@Valid ChatCompletionTokenLogprob> refusal;

  /**
   * A list of message content tokens with log probability information.
   **/
  
  @ApiModelProperty(required = true, value = "A list of message content tokens with log probability information.")
  @JsonProperty("content")
  @NotNull
  public List<@Valid ChatCompletionTokenLogprob> getContent() {
    return content;
  }
  public void setContent(List<@Valid ChatCompletionTokenLogprob> content) {
    this.content = content;
  }

  /**
   * A list of message refusal tokens with log probability information.
   **/
  
  @ApiModelProperty(required = true, value = "A list of message refusal tokens with log probability information.")
  @JsonProperty("refusal")
  @NotNull
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

