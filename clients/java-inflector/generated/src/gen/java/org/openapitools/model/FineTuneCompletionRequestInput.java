package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * The per-line training example of a fine-tuning input file for completions models
 **/

@ApiModel(description = "The per-line training example of a fine-tuning input file for completions models")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-26T05:15:28.776347668Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class FineTuneCompletionRequestInput   {
  @JsonProperty("prompt")
  private String prompt;

  @JsonProperty("completion")
  private String completion;

  /**
   * The input prompt for this training example.
   **/
  public FineTuneCompletionRequestInput prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

  
  @ApiModelProperty(value = "The input prompt for this training example.")
  @JsonProperty("prompt")
  public String getPrompt() {
    return prompt;
  }
  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  /**
   * The desired completion for this training example.
   **/
  public FineTuneCompletionRequestInput completion(String completion) {
    this.completion = completion;
    return this;
  }

  
  @ApiModelProperty(value = "The desired completion for this training example.")
  @JsonProperty("completion")
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
    return Objects.equals(prompt, fineTuneCompletionRequestInput.prompt) &&
        Objects.equals(completion, fineTuneCompletionRequestInput.completion);
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

