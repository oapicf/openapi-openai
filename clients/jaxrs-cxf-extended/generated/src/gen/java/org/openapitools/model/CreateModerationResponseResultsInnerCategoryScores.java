package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A list of the categories along with their scores as predicted by model.
 */
@ApiModel(description="A list of the categories along with their scores as predicted by model.")

public class CreateModerationResponseResultsInnerCategoryScores  {
  
 /**
  * The score for the category 'hate'.
  */
  @ApiModelProperty(required = true, value = "The score for the category 'hate'.")
  @Valid
  private BigDecimal hate;

 /**
  * The score for the category 'hate/threatening'.
  */
  @ApiModelProperty(required = true, value = "The score for the category 'hate/threatening'.")
  @Valid
  private BigDecimal hateThreatening;

 /**
  * The score for the category 'harassment'.
  */
  @ApiModelProperty(required = true, value = "The score for the category 'harassment'.")
  @Valid
  private BigDecimal harassment;

 /**
  * The score for the category 'harassment/threatening'.
  */
  @ApiModelProperty(required = true, value = "The score for the category 'harassment/threatening'.")
  @Valid
  private BigDecimal harassmentThreatening;

 /**
  * The score for the category 'self-harm'.
  */
  @ApiModelProperty(required = true, value = "The score for the category 'self-harm'.")
  @Valid
  private BigDecimal selfHarm;

 /**
  * The score for the category 'self-harm/intent'.
  */
  @ApiModelProperty(required = true, value = "The score for the category 'self-harm/intent'.")
  @Valid
  private BigDecimal selfHarmIntent;

 /**
  * The score for the category 'self-harm/instructions'.
  */
  @ApiModelProperty(required = true, value = "The score for the category 'self-harm/instructions'.")
  @Valid
  private BigDecimal selfHarmInstructions;

 /**
  * The score for the category 'sexual'.
  */
  @ApiModelProperty(required = true, value = "The score for the category 'sexual'.")
  @Valid
  private BigDecimal sexual;

 /**
  * The score for the category 'sexual/minors'.
  */
  @ApiModelProperty(required = true, value = "The score for the category 'sexual/minors'.")
  @Valid
  private BigDecimal sexualMinors;

 /**
  * The score for the category 'violence'.
  */
  @ApiModelProperty(required = true, value = "The score for the category 'violence'.")
  @Valid
  private BigDecimal violence;

 /**
  * The score for the category 'violence/graphic'.
  */
  @ApiModelProperty(required = true, value = "The score for the category 'violence/graphic'.")
  @Valid
  private BigDecimal violenceGraphic;
 /**
  * The score for the category &#39;hate&#39;.
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
  * The score for the category &#39;hate/threatening&#39;.
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
  * The score for the category &#39;harassment&#39;.
  * @return harassment
  */
  @JsonProperty("harassment")
  @NotNull
  public BigDecimal getHarassment() {
    return harassment;
  }

  /**
   * Sets the <code>harassment</code> property.
   */
 public void setHarassment(BigDecimal harassment) {
    this.harassment = harassment;
  }

  /**
   * Sets the <code>harassment</code> property.
   */
  public CreateModerationResponseResultsInnerCategoryScores harassment(BigDecimal harassment) {
    this.harassment = harassment;
    return this;
  }

 /**
  * The score for the category &#39;harassment/threatening&#39;.
  * @return harassmentThreatening
  */
  @JsonProperty("harassment/threatening")
  @NotNull
  public BigDecimal getHarassmentThreatening() {
    return harassmentThreatening;
  }

  /**
   * Sets the <code>harassmentThreatening</code> property.
   */
 public void setHarassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  /**
   * Sets the <code>harassmentThreatening</code> property.
   */
  public CreateModerationResponseResultsInnerCategoryScores harassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
    return this;
  }

 /**
  * The score for the category &#39;self-harm&#39;.
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
  * The score for the category &#39;self-harm/intent&#39;.
  * @return selfHarmIntent
  */
  @JsonProperty("self-harm/intent")
  @NotNull
  public BigDecimal getSelfHarmIntent() {
    return selfHarmIntent;
  }

  /**
   * Sets the <code>selfHarmIntent</code> property.
   */
 public void setSelfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  /**
   * Sets the <code>selfHarmIntent</code> property.
   */
  public CreateModerationResponseResultsInnerCategoryScores selfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
    return this;
  }

 /**
  * The score for the category &#39;self-harm/instructions&#39;.
  * @return selfHarmInstructions
  */
  @JsonProperty("self-harm/instructions")
  @NotNull
  public BigDecimal getSelfHarmInstructions() {
    return selfHarmInstructions;
  }

  /**
   * Sets the <code>selfHarmInstructions</code> property.
   */
 public void setSelfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  /**
   * Sets the <code>selfHarmInstructions</code> property.
   */
  public CreateModerationResponseResultsInnerCategoryScores selfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
    return this;
  }

 /**
  * The score for the category &#39;sexual&#39;.
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
  * The score for the category &#39;sexual/minors&#39;.
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
  * The score for the category &#39;violence&#39;.
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
  * The score for the category &#39;violence/graphic&#39;.
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

