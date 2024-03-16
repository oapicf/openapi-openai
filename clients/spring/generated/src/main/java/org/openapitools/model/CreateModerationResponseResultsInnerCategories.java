package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateModerationResponseResultsInnerCategories
 */

@JsonTypeName("CreateModerationResponse_results_inner_categories")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-16T01:17:43.141820780Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateModerationResponseResultsInnerCategories {

  private Boolean hate;

  private Boolean hateThreatening;

  private Boolean selfHarm;

  private Boolean sexual;

  private Boolean sexualMinors;

  private Boolean violence;

  private Boolean violenceGraphic;

  public CreateModerationResponseResultsInnerCategories() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateModerationResponseResultsInnerCategories(Boolean hate, Boolean hateThreatening, Boolean selfHarm, Boolean sexual, Boolean sexualMinors, Boolean violence, Boolean violenceGraphic) {
    this.hate = hate;
    this.hateThreatening = hateThreatening;
    this.selfHarm = selfHarm;
    this.sexual = sexual;
    this.sexualMinors = sexualMinors;
    this.violence = violence;
    this.violenceGraphic = violenceGraphic;
  }

  public CreateModerationResponseResultsInnerCategories hate(Boolean hate) {
    this.hate = hate;
    return this;
  }

  /**
   * Get hate
   * @return hate
  */
  @NotNull 
  @Schema(name = "hate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hate")
  public Boolean getHate() {
    return hate;
  }

  public void setHate(Boolean hate) {
    this.hate = hate;
  }

  public CreateModerationResponseResultsInnerCategories hateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

  /**
   * Get hateThreatening
   * @return hateThreatening
  */
  @NotNull 
  @Schema(name = "hate/threatening", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hate/threatening")
  public Boolean getHateThreatening() {
    return hateThreatening;
  }

  public void setHateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  public CreateModerationResponseResultsInnerCategories selfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

  /**
   * Get selfHarm
   * @return selfHarm
  */
  @NotNull 
  @Schema(name = "self-harm", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("self-harm")
  public Boolean getSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
  }

  public CreateModerationResponseResultsInnerCategories sexual(Boolean sexual) {
    this.sexual = sexual;
    return this;
  }

  /**
   * Get sexual
   * @return sexual
  */
  @NotNull 
  @Schema(name = "sexual", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sexual")
  public Boolean getSexual() {
    return sexual;
  }

  public void setSexual(Boolean sexual) {
    this.sexual = sexual;
  }

  public CreateModerationResponseResultsInnerCategories sexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

  /**
   * Get sexualMinors
   * @return sexualMinors
  */
  @NotNull 
  @Schema(name = "sexual/minors", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sexual/minors")
  public Boolean getSexualMinors() {
    return sexualMinors;
  }

  public void setSexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  public CreateModerationResponseResultsInnerCategories violence(Boolean violence) {
    this.violence = violence;
    return this;
  }

  /**
   * Get violence
   * @return violence
  */
  @NotNull 
  @Schema(name = "violence", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("violence")
  public Boolean getViolence() {
    return violence;
  }

  public void setViolence(Boolean violence) {
    this.violence = violence;
  }

  public CreateModerationResponseResultsInnerCategories violenceGraphic(Boolean violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

  /**
   * Get violenceGraphic
   * @return violenceGraphic
  */
  @NotNull 
  @Schema(name = "violence/graphic", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("violence/graphic")
  public Boolean getViolenceGraphic() {
    return violenceGraphic;
  }

  public void setViolenceGraphic(Boolean violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationResponseResultsInnerCategories createModerationResponseResultsInnerCategories = (CreateModerationResponseResultsInnerCategories) o;
    return Objects.equals(this.hate, createModerationResponseResultsInnerCategories.hate) &&
        Objects.equals(this.hateThreatening, createModerationResponseResultsInnerCategories.hateThreatening) &&
        Objects.equals(this.selfHarm, createModerationResponseResultsInnerCategories.selfHarm) &&
        Objects.equals(this.sexual, createModerationResponseResultsInnerCategories.sexual) &&
        Objects.equals(this.sexualMinors, createModerationResponseResultsInnerCategories.sexualMinors) &&
        Objects.equals(this.violence, createModerationResponseResultsInnerCategories.violence) &&
        Objects.equals(this.violenceGraphic, createModerationResponseResultsInnerCategories.violenceGraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, selfHarm, sexual, sexualMinors, violence, violenceGraphic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategories {\n");
    sb.append("    hate: ").append(toIndentedString(hate)).append("\n");
    sb.append("    hateThreatening: ").append(toIndentedString(hateThreatening)).append("\n");
    sb.append("    selfHarm: ").append(toIndentedString(selfHarm)).append("\n");
    sb.append("    sexual: ").append(toIndentedString(sexual)).append("\n");
    sb.append("    sexualMinors: ").append(toIndentedString(sexualMinors)).append("\n");
    sb.append("    violence: ").append(toIndentedString(violence)).append("\n");
    sb.append("    violenceGraphic: ").append(toIndentedString(violenceGraphic)).append("\n");
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

