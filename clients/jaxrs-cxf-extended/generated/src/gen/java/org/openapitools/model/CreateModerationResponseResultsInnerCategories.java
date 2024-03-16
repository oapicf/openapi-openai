package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateModerationResponseResultsInnerCategories  {
  
  @ApiModelProperty(required = true, value = "")
  private Boolean hate;

  @ApiModelProperty(required = true, value = "")
  private Boolean hateThreatening;

  @ApiModelProperty(required = true, value = "")
  private Boolean selfHarm;

  @ApiModelProperty(required = true, value = "")
  private Boolean sexual;

  @ApiModelProperty(required = true, value = "")
  private Boolean sexualMinors;

  @ApiModelProperty(required = true, value = "")
  private Boolean violence;

  @ApiModelProperty(required = true, value = "")
  private Boolean violenceGraphic;
 /**
  * Get hate
  * @return hate
  */
  @JsonProperty("hate")
  @NotNull
  public Boolean getHate() {
    return hate;
  }

  /**
   * Sets the <code>hate</code> property.
   */
 public void setHate(Boolean hate) {
    this.hate = hate;
  }

  /**
   * Sets the <code>hate</code> property.
   */
  public CreateModerationResponseResultsInnerCategories hate(Boolean hate) {
    this.hate = hate;
    return this;
  }

 /**
  * Get hateThreatening
  * @return hateThreatening
  */
  @JsonProperty("hate/threatening")
  @NotNull
  public Boolean getHateThreatening() {
    return hateThreatening;
  }

  /**
   * Sets the <code>hateThreatening</code> property.
   */
 public void setHateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   * Sets the <code>hateThreatening</code> property.
   */
  public CreateModerationResponseResultsInnerCategories hateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

 /**
  * Get selfHarm
  * @return selfHarm
  */
  @JsonProperty("self-harm")
  @NotNull
  public Boolean getSelfHarm() {
    return selfHarm;
  }

  /**
   * Sets the <code>selfHarm</code> property.
   */
 public void setSelfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   * Sets the <code>selfHarm</code> property.
   */
  public CreateModerationResponseResultsInnerCategories selfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

 /**
  * Get sexual
  * @return sexual
  */
  @JsonProperty("sexual")
  @NotNull
  public Boolean getSexual() {
    return sexual;
  }

  /**
   * Sets the <code>sexual</code> property.
   */
 public void setSexual(Boolean sexual) {
    this.sexual = sexual;
  }

  /**
   * Sets the <code>sexual</code> property.
   */
  public CreateModerationResponseResultsInnerCategories sexual(Boolean sexual) {
    this.sexual = sexual;
    return this;
  }

 /**
  * Get sexualMinors
  * @return sexualMinors
  */
  @JsonProperty("sexual/minors")
  @NotNull
  public Boolean getSexualMinors() {
    return sexualMinors;
  }

  /**
   * Sets the <code>sexualMinors</code> property.
   */
 public void setSexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   * Sets the <code>sexualMinors</code> property.
   */
  public CreateModerationResponseResultsInnerCategories sexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

 /**
  * Get violence
  * @return violence
  */
  @JsonProperty("violence")
  @NotNull
  public Boolean getViolence() {
    return violence;
  }

  /**
   * Sets the <code>violence</code> property.
   */
 public void setViolence(Boolean violence) {
    this.violence = violence;
  }

  /**
   * Sets the <code>violence</code> property.
   */
  public CreateModerationResponseResultsInnerCategories violence(Boolean violence) {
    this.violence = violence;
    return this;
  }

 /**
  * Get violenceGraphic
  * @return violenceGraphic
  */
  @JsonProperty("violence/graphic")
  @NotNull
  public Boolean getViolenceGraphic() {
    return violenceGraphic;
  }

  /**
   * Sets the <code>violenceGraphic</code> property.
   */
 public void setViolenceGraphic(Boolean violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
  }

  /**
   * Sets the <code>violenceGraphic</code> property.
   */
  public CreateModerationResponseResultsInnerCategories violenceGraphic(Boolean violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

