package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The per-line training example of a fine-tuning input file for completions models
 */
public class FineTuneCompletionRequestInput implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The input prompt for this training example.
   */
  @JsonProperty("prompt")
  private String prompt;

  /**
   * The desired completion for this training example.
   */
  @JsonProperty("completion")
  private String completion;

  /**
   * The input prompt for this training example.
   * @return prompt
   */
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  /**
   * The desired completion for this training example.
   * @return completion
   */
  public String getCompletion() {
    return completion;
  }

  public void setCompletion(String completion) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
