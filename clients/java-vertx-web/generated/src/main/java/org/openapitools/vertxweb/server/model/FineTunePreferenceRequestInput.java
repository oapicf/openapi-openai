package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.FineTunePreferenceRequestInputInput;
import org.openapitools.vertxweb.server.model.FineTunePreferenceRequestInputPreferredCompletionInner;

/**
 * The per-line training example of a fine-tuning input file for chat models using the dpo method.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTunePreferenceRequestInput   {
  
  private FineTunePreferenceRequestInputInput input;
  private List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion = new ArrayList<>();
  private List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion = new ArrayList<>();

  public FineTunePreferenceRequestInput () {

  }

  public FineTunePreferenceRequestInput (FineTunePreferenceRequestInputInput input, List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion, List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion) {
    this.input = input;
    this.preferredCompletion = preferredCompletion;
    this.nonPreferredCompletion = nonPreferredCompletion;
  }

    
  @JsonProperty("input")
  public FineTunePreferenceRequestInputInput getInput() {
    return input;
  }
  public void setInput(FineTunePreferenceRequestInputInput input) {
    this.input = input;
  }

    
  @JsonProperty("preferred_completion")
  public List<FineTunePreferenceRequestInputPreferredCompletionInner> getPreferredCompletion() {
    return preferredCompletion;
  }
  public void setPreferredCompletion(List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion) {
    this.preferredCompletion = preferredCompletion;
  }

    
  @JsonProperty("non_preferred_completion")
  public List<FineTunePreferenceRequestInputPreferredCompletionInner> getNonPreferredCompletion() {
    return nonPreferredCompletion;
  }
  public void setNonPreferredCompletion(List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion) {
    this.nonPreferredCompletion = nonPreferredCompletion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTunePreferenceRequestInput fineTunePreferenceRequestInput = (FineTunePreferenceRequestInput) o;
    return Objects.equals(input, fineTunePreferenceRequestInput.input) &&
        Objects.equals(preferredCompletion, fineTunePreferenceRequestInput.preferredCompletion) &&
        Objects.equals(nonPreferredCompletion, fineTunePreferenceRequestInput.nonPreferredCompletion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, preferredCompletion, nonPreferredCompletion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTunePreferenceRequestInput {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    preferredCompletion: ").append(toIndentedString(preferredCompletion)).append("\n");
    sb.append("    nonPreferredCompletion: ").append(toIndentedString(nonPreferredCompletion)).append("\n");
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
