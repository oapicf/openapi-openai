package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * A list of the categories along with their scores as predicted by model.
 **/

@ApiModel(description = "A list of the categories along with their scores as predicted by model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateModerationResponseResultsInnerCategoryScores   {
  @JsonProperty("hate")
  private BigDecimal hate;

  @JsonProperty("hate/threatening")
  private BigDecimal hateThreatening;

  @JsonProperty("harassment")
  private BigDecimal harassment;

  @JsonProperty("harassment/threatening")
  private BigDecimal harassmentThreatening;

  @JsonProperty("illicit")
  private BigDecimal illicit;

  @JsonProperty("illicit/violent")
  private BigDecimal illicitViolent;

  @JsonProperty("self-harm")
  private BigDecimal selfHarm;

  @JsonProperty("self-harm/intent")
  private BigDecimal selfHarmIntent;

  @JsonProperty("self-harm/instructions")
  private BigDecimal selfHarmInstructions;

  @JsonProperty("sexual")
  private BigDecimal sexual;

  @JsonProperty("sexual/minors")
  private BigDecimal sexualMinors;

  @JsonProperty("violence")
  private BigDecimal violence;

  @JsonProperty("violence/graphic")
  private BigDecimal violenceGraphic;

  /**
   * The score for the category 'hate'.
   **/
  public CreateModerationResponseResultsInnerCategoryScores hate(BigDecimal hate) {
    this.hate = hate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'hate'.")
  @JsonProperty("hate")
  public BigDecimal getHate() {
    return hate;
  }
  public void setHate(BigDecimal hate) {
    this.hate = hate;
  }

  /**
   * The score for the category 'hate/threatening'.
   **/
  public CreateModerationResponseResultsInnerCategoryScores hateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'hate/threatening'.")
  @JsonProperty("hate/threatening")
  public BigDecimal getHateThreatening() {
    return hateThreatening;
  }
  public void setHateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   * The score for the category 'harassment'.
   **/
  public CreateModerationResponseResultsInnerCategoryScores harassment(BigDecimal harassment) {
    this.harassment = harassment;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'harassment'.")
  @JsonProperty("harassment")
  public BigDecimal getHarassment() {
    return harassment;
  }
  public void setHarassment(BigDecimal harassment) {
    this.harassment = harassment;
  }

  /**
   * The score for the category 'harassment/threatening'.
   **/
  public CreateModerationResponseResultsInnerCategoryScores harassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'harassment/threatening'.")
  @JsonProperty("harassment/threatening")
  public BigDecimal getHarassmentThreatening() {
    return harassmentThreatening;
  }
  public void setHarassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  /**
   * The score for the category 'illicit'.
   **/
  public CreateModerationResponseResultsInnerCategoryScores illicit(BigDecimal illicit) {
    this.illicit = illicit;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'illicit'.")
  @JsonProperty("illicit")
  public BigDecimal getIllicit() {
    return illicit;
  }
  public void setIllicit(BigDecimal illicit) {
    this.illicit = illicit;
  }

  /**
   * The score for the category 'illicit/violent'.
   **/
  public CreateModerationResponseResultsInnerCategoryScores illicitViolent(BigDecimal illicitViolent) {
    this.illicitViolent = illicitViolent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'illicit/violent'.")
  @JsonProperty("illicit/violent")
  public BigDecimal getIllicitViolent() {
    return illicitViolent;
  }
  public void setIllicitViolent(BigDecimal illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

  /**
   * The score for the category 'self-harm'.
   **/
  public CreateModerationResponseResultsInnerCategoryScores selfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'self-harm'.")
  @JsonProperty("self-harm")
  public BigDecimal getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   * The score for the category 'self-harm/intent'.
   **/
  public CreateModerationResponseResultsInnerCategoryScores selfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'self-harm/intent'.")
  @JsonProperty("self-harm/intent")
  public BigDecimal getSelfHarmIntent() {
    return selfHarmIntent;
  }
  public void setSelfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  /**
   * The score for the category 'self-harm/instructions'.
   **/
  public CreateModerationResponseResultsInnerCategoryScores selfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'self-harm/instructions'.")
  @JsonProperty("self-harm/instructions")
  public BigDecimal getSelfHarmInstructions() {
    return selfHarmInstructions;
  }
  public void setSelfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  /**
   * The score for the category 'sexual'.
   **/
  public CreateModerationResponseResultsInnerCategoryScores sexual(BigDecimal sexual) {
    this.sexual = sexual;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'sexual'.")
  @JsonProperty("sexual")
  public BigDecimal getSexual() {
    return sexual;
  }
  public void setSexual(BigDecimal sexual) {
    this.sexual = sexual;
  }

  /**
   * The score for the category 'sexual/minors'.
   **/
  public CreateModerationResponseResultsInnerCategoryScores sexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'sexual/minors'.")
  @JsonProperty("sexual/minors")
  public BigDecimal getSexualMinors() {
    return sexualMinors;
  }
  public void setSexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   * The score for the category 'violence'.
   **/
  public CreateModerationResponseResultsInnerCategoryScores violence(BigDecimal violence) {
    this.violence = violence;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'violence'.")
  @JsonProperty("violence")
  public BigDecimal getViolence() {
    return violence;
  }
  public void setViolence(BigDecimal violence) {
    this.violence = violence;
  }

  /**
   * The score for the category 'violence/graphic'.
   **/
  public CreateModerationResponseResultsInnerCategoryScores violenceGraphic(BigDecimal violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'violence/graphic'.")
  @JsonProperty("violence/graphic")
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
    return Objects.equals(hate, createModerationResponseResultsInnerCategoryScores.hate) &&
        Objects.equals(hateThreatening, createModerationResponseResultsInnerCategoryScores.hateThreatening) &&
        Objects.equals(harassment, createModerationResponseResultsInnerCategoryScores.harassment) &&
        Objects.equals(harassmentThreatening, createModerationResponseResultsInnerCategoryScores.harassmentThreatening) &&
        Objects.equals(illicit, createModerationResponseResultsInnerCategoryScores.illicit) &&
        Objects.equals(illicitViolent, createModerationResponseResultsInnerCategoryScores.illicitViolent) &&
        Objects.equals(selfHarm, createModerationResponseResultsInnerCategoryScores.selfHarm) &&
        Objects.equals(selfHarmIntent, createModerationResponseResultsInnerCategoryScores.selfHarmIntent) &&
        Objects.equals(selfHarmInstructions, createModerationResponseResultsInnerCategoryScores.selfHarmInstructions) &&
        Objects.equals(sexual, createModerationResponseResultsInnerCategoryScores.sexual) &&
        Objects.equals(sexualMinors, createModerationResponseResultsInnerCategoryScores.sexualMinors) &&
        Objects.equals(violence, createModerationResponseResultsInnerCategoryScores.violence) &&
        Objects.equals(violenceGraphic, createModerationResponseResultsInnerCategoryScores.violenceGraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, harassment, harassmentThreatening, illicit, illicitViolent, selfHarm, selfHarmIntent, selfHarmInstructions, sexual, sexualMinors, violence, violenceGraphic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategoryScores {\n");
    
    sb.append("    hate: ").append(toIndentedString(hate)).append("\n");
    sb.append("    hateThreatening: ").append(toIndentedString(hateThreatening)).append("\n");
    sb.append("    harassment: ").append(toIndentedString(harassment)).append("\n");
    sb.append("    harassmentThreatening: ").append(toIndentedString(harassmentThreatening)).append("\n");
    sb.append("    illicit: ").append(toIndentedString(illicit)).append("\n");
    sb.append("    illicitViolent: ").append(toIndentedString(illicitViolent)).append("\n");
    sb.append("    selfHarm: ").append(toIndentedString(selfHarm)).append("\n");
    sb.append("    selfHarmIntent: ").append(toIndentedString(selfHarmIntent)).append("\n");
    sb.append("    selfHarmInstructions: ").append(toIndentedString(selfHarmInstructions)).append("\n");
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

