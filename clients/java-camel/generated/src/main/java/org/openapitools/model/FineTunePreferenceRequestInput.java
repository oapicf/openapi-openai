package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FineTunePreferenceRequestInputInput;
import org.openapitools.model.FineTunePreferenceRequestInputPreferredCompletionInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The per-line training example of a fine-tuning input file for chat models using the dpo method.
 */

@Schema(name = "FineTunePreferenceRequestInput", description = "The per-line training example of a fine-tuning input file for chat models using the dpo method.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTunePreferenceRequestInput {

  private FineTunePreferenceRequestInputInput input;

  @Valid
  private List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion = new ArrayList<>();

  @Valid
  private List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion = new ArrayList<>();

  public FineTunePreferenceRequestInput input(FineTunePreferenceRequestInputInput input) {
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
   */
  @Valid 
  @Schema(name = "input", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("input")
  public FineTunePreferenceRequestInputInput getInput() {
    return input;
  }

  public void setInput(FineTunePreferenceRequestInputInput input) {
    this.input = input;
  }

  public FineTunePreferenceRequestInput preferredCompletion(List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion) {
    this.preferredCompletion = preferredCompletion;
    return this;
  }

  public FineTunePreferenceRequestInput addPreferredCompletionItem(FineTunePreferenceRequestInputPreferredCompletionInner preferredCompletionItem) {
    if (this.preferredCompletion == null) {
      this.preferredCompletion = new ArrayList<>();
    }
    this.preferredCompletion.add(preferredCompletionItem);
    return this;
  }

  /**
   * The preferred completion message for the output.
   * @return preferredCompletion
   */
  @Valid @Size(max = 1) 
  @Schema(name = "preferred_completion", description = "The preferred completion message for the output.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferred_completion")
  public List<FineTunePreferenceRequestInputPreferredCompletionInner> getPreferredCompletion() {
    return preferredCompletion;
  }

  public void setPreferredCompletion(List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion) {
    this.preferredCompletion = preferredCompletion;
  }

  public FineTunePreferenceRequestInput nonPreferredCompletion(List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion) {
    this.nonPreferredCompletion = nonPreferredCompletion;
    return this;
  }

  public FineTunePreferenceRequestInput addNonPreferredCompletionItem(FineTunePreferenceRequestInputPreferredCompletionInner nonPreferredCompletionItem) {
    if (this.nonPreferredCompletion == null) {
      this.nonPreferredCompletion = new ArrayList<>();
    }
    this.nonPreferredCompletion.add(nonPreferredCompletionItem);
    return this;
  }

  /**
   * The non-preferred completion message for the output.
   * @return nonPreferredCompletion
   */
  @Valid @Size(max = 1) 
  @Schema(name = "non_preferred_completion", description = "The non-preferred completion message for the output.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

