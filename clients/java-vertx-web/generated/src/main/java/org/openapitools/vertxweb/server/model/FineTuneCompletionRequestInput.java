package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The per-line training example of a fine-tuning input file for completions models
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTuneCompletionRequestInput   {
  
  private String prompt;
  private String completion;

  public FineTuneCompletionRequestInput () {

  }

  public FineTuneCompletionRequestInput (String prompt, String completion) {
    this.prompt = prompt;
    this.completion = completion;
  }

    
  @JsonProperty("prompt")
  public String getPrompt() {
    return prompt;
  }
  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
