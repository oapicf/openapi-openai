package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * CreateModerationResponseResultsInnerCategoryScores
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateModerationResponseResultsInnerCategoryScores   {
  @JsonProperty("hate")
  private BigDecimal hate;

  @JsonProperty("hate/threatening")
  private BigDecimal hateThreatening;

  @JsonProperty("self-harm")
  private BigDecimal selfHarm;

  @JsonProperty("sexual")
  private BigDecimal sexual;

  @JsonProperty("sexual/minors")
  private BigDecimal sexualMinors;

  @JsonProperty("violence")
  private BigDecimal violence;

  @JsonProperty("violence/graphic")
  private BigDecimal violenceGraphic;

  public CreateModerationResponseResultsInnerCategoryScores hate(BigDecimal hate) {
    this.hate = hate;
    return this;
  }

   /**
   * Get hate
   * @return hate
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getHate() {
    return hate;
  }

  public void setHate(BigDecimal hate) {
    this.hate = hate;
  }

  public CreateModerationResponseResultsInnerCategoryScores hateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

   /**
   * Get hateThreatening
   * @return hateThreatening
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getHateThreatening() {
    return hateThreatening;
  }

  public void setHateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  public CreateModerationResponseResultsInnerCategoryScores selfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

   /**
   * Get selfHarm
   * @return selfHarm
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
  }

  public CreateModerationResponseResultsInnerCategoryScores sexual(BigDecimal sexual) {
    this.sexual = sexual;
    return this;
  }

   /**
   * Get sexual
   * @return sexual
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getSexual() {
    return sexual;
  }

  public void setSexual(BigDecimal sexual) {
    this.sexual = sexual;
  }

  public CreateModerationResponseResultsInnerCategoryScores sexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

   /**
   * Get sexualMinors
   * @return sexualMinors
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getSexualMinors() {
    return sexualMinors;
  }

  public void setSexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  public CreateModerationResponseResultsInnerCategoryScores violence(BigDecimal violence) {
    this.violence = violence;
    return this;
  }

   /**
   * Get violence
   * @return violence
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getViolence() {
    return violence;
  }

  public void setViolence(BigDecimal violence) {
    this.violence = violence;
  }

  public CreateModerationResponseResultsInnerCategoryScores violenceGraphic(BigDecimal violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

   /**
   * Get violenceGraphic
   * @return violenceGraphic
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getViolenceGraphic() {
    return violenceGraphic;
  }

  public void setViolenceGraphic(BigDecimal violenceGraphic) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

