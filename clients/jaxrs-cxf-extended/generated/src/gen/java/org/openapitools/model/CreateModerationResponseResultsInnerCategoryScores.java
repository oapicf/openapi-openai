package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateModerationResponseResultsInnerCategoryScores  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal hate;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal hateThreatening;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal selfHarm;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal sexual;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal sexualMinors;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal violence;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal violenceGraphic;
 /**
  * Get hate
  * @return hate
  */
  @JsonProperty("hate")
  @NotNull
  public BigDecimal getHate() {
    return hate;
  }

  /**
   * Sets the <code>hate</code> property.
   */
 public void setHate(BigDecimal hate) {
    this.hate = hate;
  }

  /**
   * Sets the <code>hate</code> property.
   */
  public CreateModerationResponseResultsInnerCategoryScores hate(BigDecimal hate) {
    this.hate = hate;
    return this;
  }

 /**
  * Get hateThreatening
  * @return hateThreatening
  */
  @JsonProperty("hate/threatening")
  @NotNull
  public BigDecimal getHateThreatening() {
    return hateThreatening;
  }

  /**
   * Sets the <code>hateThreatening</code> property.
   */
 public void setHateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   * Sets the <code>hateThreatening</code> property.
   */
  public CreateModerationResponseResultsInnerCategoryScores hateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

 /**
  * Get selfHarm
  * @return selfHarm
  */
  @JsonProperty("self-harm")
  @NotNull
  public BigDecimal getSelfHarm() {
    return selfHarm;
  }

  /**
   * Sets the <code>selfHarm</code> property.
   */
 public void setSelfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   * Sets the <code>selfHarm</code> property.
   */
  public CreateModerationResponseResultsInnerCategoryScores selfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

 /**
  * Get sexual
  * @return sexual
  */
  @JsonProperty("sexual")
  @NotNull
  public BigDecimal getSexual() {
    return sexual;
  }

  /**
   * Sets the <code>sexual</code> property.
   */
 public void setSexual(BigDecimal sexual) {
    this.sexual = sexual;
  }

  /**
   * Sets the <code>sexual</code> property.
   */
  public CreateModerationResponseResultsInnerCategoryScores sexual(BigDecimal sexual) {
    this.sexual = sexual;
    return this;
  }

 /**
  * Get sexualMinors
  * @return sexualMinors
  */
  @JsonProperty("sexual/minors")
  @NotNull
  public BigDecimal getSexualMinors() {
    return sexualMinors;
  }

  /**
   * Sets the <code>sexualMinors</code> property.
   */
 public void setSexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   * Sets the <code>sexualMinors</code> property.
   */
  public CreateModerationResponseResultsInnerCategoryScores sexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

 /**
  * Get violence
  * @return violence
  */
  @JsonProperty("violence")
  @NotNull
  public BigDecimal getViolence() {
    return violence;
  }

  /**
   * Sets the <code>violence</code> property.
   */
 public void setViolence(BigDecimal violence) {
    this.violence = violence;
  }

  /**
   * Sets the <code>violence</code> property.
   */
  public CreateModerationResponseResultsInnerCategoryScores violence(BigDecimal violence) {
    this.violence = violence;
    return this;
  }

 /**
  * Get violenceGraphic
  * @return violenceGraphic
  */
  @JsonProperty("violence/graphic")
  @NotNull
  public BigDecimal getViolenceGraphic() {
    return violenceGraphic;
  }

  /**
   * Sets the <code>violenceGraphic</code> property.
   */
 public void setViolenceGraphic(BigDecimal violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
  }

  /**
   * Sets the <code>violenceGraphic</code> property.
   */
  public CreateModerationResponseResultsInnerCategoryScores violenceGraphic(BigDecimal violenceGraphic) {
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
    CreateModerationResponseResultsInnerCategoryScores createModerationResponseResultsInnerCategoryScores = (CreateModerationResponseResultsInnerCategoryScores) o;
    return Objects.equals(this.hate, createModerationResponseResultsInnerCategoryScores.hate) &&
        Objects.equals(this.hateThreatening, createModerationResponseResultsInnerCategoryScores.hateThreatening) &&
        Objects.equals(this.selfHarm, createModerationResponseResultsInnerCategoryScores.selfHarm) &&
        Objects.equals(this.sexual, createModerationResponseResultsInnerCategoryScores.sexual) &&
        Objects.equals(this.sexualMinors, createModerationResponseResultsInnerCategoryScores.sexualMinors) &&
        Objects.equals(this.violence, createModerationResponseResultsInnerCategoryScores.violence) &&
        Objects.equals(this.violenceGraphic, createModerationResponseResultsInnerCategoryScores.violenceGraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, selfHarm, sexual, sexualMinors, violence, violenceGraphic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategoryScores {\n");
    
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

