package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The per-line training example of a fine-tuning input file for completions models
 */
@ApiModel(description="The per-line training example of a fine-tuning input file for completions models")

public class FineTuneCompletionRequestInput  {
  
 /**
  * The input prompt for this training example.
  */
  @ApiModelProperty(value = "The input prompt for this training example.")

  private String prompt;

 /**
  * The desired completion for this training example.
  */
  @ApiModelProperty(value = "The desired completion for this training example.")

  private String completion;
 /**
   * The input prompt for this training example.
   * @return prompt
  **/
  @JsonProperty("prompt")
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public FineTuneCompletionRequestInput prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

 /**
   * The desired completion for this training example.
   * @return completion
  **/
  @JsonProperty("completion")
  public String getCompletion() {
    return completion;
  }

  public void setCompletion(String completion) {
    this.completion = completion;
  }

  public FineTuneCompletionRequestInput completion(String completion) {
    this.completion = completion;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

