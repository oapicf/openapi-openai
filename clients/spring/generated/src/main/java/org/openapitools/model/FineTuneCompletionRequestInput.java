package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The per-line training example of a fine-tuning input file for completions models
 */

@Schema(name = "FineTuneCompletionRequestInput", description = "The per-line training example of a fine-tuning input file for completions models")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneCompletionRequestInput {

  private @Nullable String prompt;

  private @Nullable String completion;

  public FineTuneCompletionRequestInput prompt(@Nullable String prompt) {
    this.prompt = prompt;
    return this;
  }

  /**
   * The input prompt for this training example.
   * @return prompt
   */
  
  @Schema(name = "prompt", description = "The input prompt for this training example.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prompt")
  public @Nullable String getPrompt() {
    return prompt;
  }

  public void setPrompt(@Nullable String prompt) {
    this.prompt = prompt;
  }

  public FineTuneCompletionRequestInput completion(@Nullable String completion) {
    this.completion = completion;
    return this;
  }

  /**
   * The desired completion for this training example.
   * @return completion
   */
  
  @Schema(name = "completion", description = "The desired completion for this training example.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completion")
  public @Nullable String getCompletion() {
    return completion;
  }

  public void setCompletion(@Nullable String completion) {
    this.completion = completion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuneCompletionRequestInput fineTuneCompletionRequestInput = (FineTuneCompletionRequestInput) o;
    return Objects.equals(this.prompt, fineTuneCompletionRequestInput.prompt) &&
        Objects.equals(this.completion, fineTuneCompletionRequestInput.completion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, completion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneCompletionRequestInput {\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
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

