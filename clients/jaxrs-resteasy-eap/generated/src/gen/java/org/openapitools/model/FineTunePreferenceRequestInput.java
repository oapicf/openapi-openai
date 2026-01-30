package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FineTunePreferenceRequestInputInput;
import org.openapitools.model.FineTunePreferenceRequestInputPreferredCompletionInner;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The per-line training example of a fine-tuning input file for chat models using the dpo method.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTunePreferenceRequestInput   {
  
  private FineTunePreferenceRequestInputInput input;
  private List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion = new ArrayList<>();
  private List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("input")
  public FineTunePreferenceRequestInputInput getInput() {
    return input;
  }
  public void setInput(FineTunePreferenceRequestInputInput input) {
    this.input = input;
  }

  /**
   * The preferred completion message for the output.
   **/
  
  @ApiModelProperty(value = "The preferred completion message for the output.")
  @JsonProperty("preferred_completion")
 @Size(max=1)  public List<FineTunePreferenceRequestInputPreferredCompletionInner> getPreferredCompletion() {
    return preferredCompletion;
  }
  public void setPreferredCompletion(List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion) {
    this.preferredCompletion = preferredCompletion;
  }

  /**
   * The non-preferred completion message for the output.
   **/
  
  @ApiModelProperty(value = "The non-preferred completion message for the output.")
  @JsonProperty("non_preferred_completion")
 @Size(max=1)  public List<FineTunePreferenceRequestInputPreferredCompletionInner> getNonPreferredCompletion() {
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
    return Objects.equals(this.input, fineTunePreferenceRequestInput.input) &&
        Objects.equals(this.preferredCompletion, fineTunePreferenceRequestInput.preferredCompletion) &&
        Objects.equals(this.nonPreferredCompletion, fineTunePreferenceRequestInput.nonPreferredCompletion);
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

