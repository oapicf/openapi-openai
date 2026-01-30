package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The per-line training example of a fine-tuning input file for chat models using the dpo method.
 **/
@ApiModel(description = "The per-line training example of a fine-tuning input file for chat models using the dpo method.")
@JsonTypeName("FineTunePreferenceRequestInput")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTunePreferenceRequestInput   {
  private FineTunePreferenceRequestInputInput input;
  private @Valid List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion = new ArrayList<>();
  private @Valid List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion = new ArrayList<>();

  public FineTunePreferenceRequestInput() {
  }

  /**
   **/
  public FineTunePreferenceRequestInput input(FineTunePreferenceRequestInputInput input) {
    this.input = input;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("input")
  @Valid public FineTunePreferenceRequestInputInput getInput() {
    return input;
  }

  @JsonProperty("input")
  public void setInput(FineTunePreferenceRequestInputInput input) {
    this.input = input;
  }

  /**
   * The preferred completion message for the output.
   **/
  public FineTunePreferenceRequestInput preferredCompletion(List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion) {
    this.preferredCompletion = preferredCompletion;
    return this;
  }

  
  @ApiModelProperty(value = "The preferred completion message for the output.")
  @JsonProperty("preferred_completion")
  @Valid  @Size(max=1)public List<@Valid FineTunePreferenceRequestInputPreferredCompletionInner> getPreferredCompletion() {
    return preferredCompletion;
  }

  @JsonProperty("preferred_completion")
  public void setPreferredCompletion(List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion) {
    this.preferredCompletion = preferredCompletion;
  }

  public FineTunePreferenceRequestInput addPreferredCompletionItem(FineTunePreferenceRequestInputPreferredCompletionInner preferredCompletionItem) {
    if (this.preferredCompletion == null) {
      this.preferredCompletion = new ArrayList<>();
    }

    this.preferredCompletion.add(preferredCompletionItem);
    return this;
  }

  public FineTunePreferenceRequestInput removePreferredCompletionItem(FineTunePreferenceRequestInputPreferredCompletionInner preferredCompletionItem) {
    if (preferredCompletionItem != null && this.preferredCompletion != null) {
      this.preferredCompletion.remove(preferredCompletionItem);
    }

    return this;
  }
  /**
   * The non-preferred completion message for the output.
   **/
  public FineTunePreferenceRequestInput nonPreferredCompletion(List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion) {
    this.nonPreferredCompletion = nonPreferredCompletion;
    return this;
  }

  
  @ApiModelProperty(value = "The non-preferred completion message for the output.")
  @JsonProperty("non_preferred_completion")
  @Valid  @Size(max=1)public List<@Valid FineTunePreferenceRequestInputPreferredCompletionInner> getNonPreferredCompletion() {
    return nonPreferredCompletion;
  }

  @JsonProperty("non_preferred_completion")
  public void setNonPreferredCompletion(List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion) {
    this.nonPreferredCompletion = nonPreferredCompletion;
  }

  public FineTunePreferenceRequestInput addNonPreferredCompletionItem(FineTunePreferenceRequestInputPreferredCompletionInner nonPreferredCompletionItem) {
    if (this.nonPreferredCompletion == null) {
      this.nonPreferredCompletion = new ArrayList<>();
    }

    this.nonPreferredCompletion.add(nonPreferredCompletionItem);
    return this;
  }

  public FineTunePreferenceRequestInput removeNonPreferredCompletionItem(FineTunePreferenceRequestInputPreferredCompletionInner nonPreferredCompletionItem) {
    if (nonPreferredCompletionItem != null && this.nonPreferredCompletion != null) {
      this.nonPreferredCompletion.remove(nonPreferredCompletionItem);
    }

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

