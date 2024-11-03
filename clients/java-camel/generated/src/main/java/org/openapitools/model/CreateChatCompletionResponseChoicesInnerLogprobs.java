package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionTokenLogprob;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Log probability information for the choice.
 */

@Schema(name = "CreateChatCompletionResponse_choices_inner_logprobs", description = "Log probability information for the choice.")
@JsonTypeName("CreateChatCompletionResponse_choices_inner_logprobs")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-03T11:08:01.261160233Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateChatCompletionResponseChoicesInnerLogprobs {

  @Valid
  private JsonNullable<List<@Valid ChatCompletionTokenLogprob>> content = JsonNullable.<List<@Valid ChatCompletionTokenLogprob>>undefined();

  public CreateChatCompletionResponseChoicesInnerLogprobs() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateChatCompletionResponseChoicesInnerLogprobs(List<@Valid ChatCompletionTokenLogprob> content) {
    this.content = JsonNullable.of(content);
  }

  public CreateChatCompletionResponseChoicesInnerLogprobs content(List<@Valid ChatCompletionTokenLogprob> content) {
    this.content = JsonNullable.of(content);
    return this;
  }

  public CreateChatCompletionResponseChoicesInnerLogprobs addContentItem(ChatCompletionTokenLogprob contentItem) {
    if (this.content == null || !this.content.isPresent()) {
      this.content = JsonNullable.of(new ArrayList<>());
    }
    this.content.get().add(contentItem);
    return this;
  }

  /**
   * A list of message content tokens with log probability information.
   * @return content
   */
  @NotNull @Valid 
  @Schema(name = "content", description = "A list of message content tokens with log probability information.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public JsonNullable<List<@Valid ChatCompletionTokenLogprob>> getContent() {
    return content;
  }

  public void setContent(JsonNullable<List<@Valid ChatCompletionTokenLogprob>> content) {
    this.content = content;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

