package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A list of the categories along with their scores as predicted by model.
 **/
@ApiModel(description="A list of the categories along with their scores as predicted by model.")

public class CreateModerationResponseResultsInnerCategoryScores  {
  
  @ApiModelProperty(required = true, value = "The score for the category 'hate'.")
 /**
   * The score for the category 'hate'.
  **/
  private BigDecimal hate;

  @ApiModelProperty(required = true, value = "The score for the category 'hate/threatening'.")
 /**
   * The score for the category 'hate/threatening'.
  **/
  private BigDecimal hateThreatening;

  @ApiModelProperty(required = true, value = "The score for the category 'harassment'.")
 /**
   * The score for the category 'harassment'.
  **/
  private BigDecimal harassment;

  @ApiModelProperty(required = true, value = "The score for the category 'harassment/threatening'.")
 /**
   * The score for the category 'harassment/threatening'.
  **/
  private BigDecimal harassmentThreatening;

  @ApiModelProperty(required = true, value = "The score for the category 'self-harm'.")
 /**
   * The score for the category 'self-harm'.
  **/
  private BigDecimal selfHarm;

  @ApiModelProperty(required = true, value = "The score for the category 'self-harm/intent'.")
 /**
   * The score for the category 'self-harm/intent'.
  **/
  private BigDecimal selfHarmIntent;

  @ApiModelProperty(required = true, value = "The score for the category 'self-harm/instructions'.")
 /**
   * The score for the category 'self-harm/instructions'.
  **/
  private BigDecimal selfHarmInstructions;

  @ApiModelProperty(required = true, value = "The score for the category 'sexual'.")
 /**
   * The score for the category 'sexual'.
  **/
  private BigDecimal sexual;

  @ApiModelProperty(required = true, value = "The score for the category 'sexual/minors'.")
 /**
   * The score for the category 'sexual/minors'.
  **/
  private BigDecimal sexualMinors;

  @ApiModelProperty(required = true, value = "The score for the category 'violence'.")
 /**
   * The score for the category 'violence'.
  **/
  private BigDecimal violence;

  @ApiModelProperty(required = true, value = "The score for the category 'violence/graphic'.")
 /**
   * The score for the category 'violence/graphic'.
  **/
  private BigDecimal violenceGraphic;
 /**
   * The score for the category &#39;hate&#39;.
   * @return hate
  **/
  @JsonProperty("hate")
  public BigDecimal getHate() {
    return hate;
  }

  public void setHate(BigDecimal hate) {
    this.hate = hate;
  }

  public CreateModerationResponseResultsInnerCategoryScores hate(BigDecimal hate) {
    this.hate = hate;
    return this;
  }

 /**
   * The score for the category &#39;hate/threatening&#39;.
   * @return hateThreatening
  **/
  @JsonProperty("hate/threatening")
  public BigDecimal getHateThreatening() {
    return hateThreatening;
  }

  public void setHateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  public CreateModerationResponseResultsInnerCategoryScores hateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

 /**
   * The score for the category &#39;harassment&#39;.
   * @return harassment
  **/
  @JsonProperty("harassment")
  public BigDecimal getHarassment() {
    return harassment;
  }

  public void setHarassment(BigDecimal harassment) {
    this.harassment = harassment;
  }

  public CreateModerationResponseResultsInnerCategoryScores harassment(BigDecimal harassment) {
    this.harassment = harassment;
    return this;
  }

 /**
   * The score for the category &#39;harassment/threatening&#39;.
   * @return harassmentThreatening
  **/
  @JsonProperty("harassment/threatening")
  public BigDecimal getHarassmentThreatening() {
    return harassmentThreatening;
  }

  public void setHarassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  public CreateModerationResponseResultsInnerCategoryScores harassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
    return this;
  }

 /**
   * The score for the category &#39;self-harm&#39;.
   * @return selfHarm
  **/
  @JsonProperty("self-harm")
  public BigDecimal getSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
  }

  public CreateModerationResponseResultsInnerCategoryScores selfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

 /**
   * The score for the category &#39;self-harm/intent&#39;.
   * @return selfHarmIntent
  **/
  @JsonProperty("self-harm/intent")
  public BigDecimal getSelfHarmIntent() {
    return selfHarmIntent;
  }

  public void setSelfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  public CreateModerationResponseResultsInnerCategoryScores selfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
    return this;
  }

 /**
   * The score for the category &#39;self-harm/instructions&#39;.
   * @return selfHarmInstructions
  **/
  @JsonProperty("self-harm/instructions")
  public BigDecimal getSelfHarmInstructions() {
    return selfHarmInstructions;
  }

  public void setSelfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  public CreateModerationResponseResultsInnerCategoryScores selfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
    return this;
  }

 /**
   * The score for the category &#39;sexual&#39;.
   * @return sexual
  **/
  @JsonProperty("sexual")
  public BigDecimal getSexual() {
    return sexual;
  }

  public void setSexual(BigDecimal sexual) {
    this.sexual = sexual;
  }

  public CreateModerationResponseResultsInnerCategoryScores sexual(BigDecimal sexual) {
    this.sexual = sexual;
    return this;
  }

 /**
   * The score for the category &#39;sexual/minors&#39;.
   * @return sexualMinors
  **/
  @JsonProperty("sexual/minors")
  public BigDecimal getSexualMinors() {
    return sexualMinors;
  }

  public void setSexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  public CreateModerationResponseResultsInnerCategoryScores sexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

 /**
   * The score for the category &#39;violence&#39;.
   * @return violence
  **/
  @JsonProperty("violence")
  public BigDecimal getViolence() {
    return violence;
  }

  public void setViolence(BigDecimal violence) {
    this.violence = violence;
  }

  public CreateModerationResponseResultsInnerCategoryScores violence(BigDecimal violence) {
    this.violence = violence;
    return this;
  }

 /**
   * The score for the category &#39;violence/graphic&#39;.
   * @return violenceGraphic
  **/
  @JsonProperty("violence/graphic")
  public BigDecimal getViolenceGraphic() {
    return violenceGraphic;
  }

  public void setViolenceGraphic(BigDecimal violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
  }

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
        Objects.equals(this.harassment, createModerationResponseResultsInnerCategoryScores.harassment) &&
        Objects.equals(this.harassmentThreatening, createModerationResponseResultsInnerCategoryScores.harassmentThreatening) &&
        Objects.equals(this.selfHarm, createModerationResponseResultsInnerCategoryScores.selfHarm) &&
        Objects.equals(this.selfHarmIntent, createModerationResponseResultsInnerCategoryScores.selfHarmIntent) &&
        Objects.equals(this.selfHarmInstructions, createModerationResponseResultsInnerCategoryScores.selfHarmInstructions) &&
        Objects.equals(this.sexual, createModerationResponseResultsInnerCategoryScores.sexual) &&
        Objects.equals(this.sexualMinors, createModerationResponseResultsInnerCategoryScores.sexualMinors) &&
        Objects.equals(this.violence, createModerationResponseResultsInnerCategoryScores.violence) &&
        Objects.equals(this.violenceGraphic, createModerationResponseResultsInnerCategoryScores.violenceGraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, harassment, harassmentThreatening, selfHarm, selfHarmIntent, selfHarmInstructions, sexual, sexualMinors, violence, violenceGraphic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategoryScores {\n");
    
    sb.append("    hate: ").append(toIndentedString(hate)).append("\n");
    sb.append("    hateThreatening: ").append(toIndentedString(hateThreatening)).append("\n");
    sb.append("    harassment: ").append(toIndentedString(harassment)).append("\n");
    sb.append("    harassmentThreatening: ").append(toIndentedString(harassmentThreatening)).append("\n");
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

