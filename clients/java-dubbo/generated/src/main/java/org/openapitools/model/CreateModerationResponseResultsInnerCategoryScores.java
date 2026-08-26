package org.openapitools.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A list of the categories along with their scores as predicted by model.
 */
public class CreateModerationResponseResultsInnerCategoryScores implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The score for the category &#39;hate&#39;.
   */
  @JsonProperty("hate")
  private BigDecimal hate;

  /**
   * The score for the category &#39;hate/threatening&#39;.
   */
  @JsonProperty("hate/threatening")
  private BigDecimal hateThreatening;

  /**
   * The score for the category &#39;harassment&#39;.
   */
  @JsonProperty("harassment")
  private BigDecimal harassment;

  /**
   * The score for the category &#39;harassment/threatening&#39;.
   */
  @JsonProperty("harassment/threatening")
  private BigDecimal harassmentThreatening;

  /**
   * The score for the category &#39;illicit&#39;.
   */
  @JsonProperty("illicit")
  private BigDecimal illicit;

  /**
   * The score for the category &#39;illicit/violent&#39;.
   */
  @JsonProperty("illicit/violent")
  private BigDecimal illicitViolent;

  /**
   * The score for the category &#39;self-harm&#39;.
   */
  @JsonProperty("self-harm")
  private BigDecimal selfHarm;

  /**
   * The score for the category &#39;self-harm/intent&#39;.
   */
  @JsonProperty("self-harm/intent")
  private BigDecimal selfHarmIntent;

  /**
   * The score for the category &#39;self-harm/instructions&#39;.
   */
  @JsonProperty("self-harm/instructions")
  private BigDecimal selfHarmInstructions;

  /**
   * The score for the category &#39;sexual&#39;.
   */
  @JsonProperty("sexual")
  private BigDecimal sexual;

  /**
   * The score for the category &#39;sexual/minors&#39;.
   */
  @JsonProperty("sexual/minors")
  private BigDecimal sexualMinors;

  /**
   * The score for the category &#39;violence&#39;.
   */
  @JsonProperty("violence")
  private BigDecimal violence;

  /**
   * The score for the category &#39;violence/graphic&#39;.
   */
  @JsonProperty("violence/graphic")
  private BigDecimal violenceGraphic;

  /**
   * The score for the category &#39;hate&#39;.
   * @return hate
   */
  public BigDecimal getHate() {
    return hate;
  }

  public void setHate(BigDecimal hate) {
    this.hate = hate;
  }

  /**
   * The score for the category &#39;hate/threatening&#39;.
   * @return hateThreatening
   */
  public BigDecimal getHateThreatening() {
    return hateThreatening;
  }

  public void setHateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   * The score for the category &#39;harassment&#39;.
   * @return harassment
   */
  public BigDecimal getHarassment() {
    return harassment;
  }

  public void setHarassment(BigDecimal harassment) {
    this.harassment = harassment;
  }

  /**
   * The score for the category &#39;harassment/threatening&#39;.
   * @return harassmentThreatening
   */
  public BigDecimal getHarassmentThreatening() {
    return harassmentThreatening;
  }

  public void setHarassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  /**
   * The score for the category &#39;illicit&#39;.
   * @return illicit
   */
  public BigDecimal getIllicit() {
    return illicit;
  }

  public void setIllicit(BigDecimal illicit) {
    this.illicit = illicit;
  }

  /**
   * The score for the category &#39;illicit/violent&#39;.
   * @return illicitViolent
   */
  public BigDecimal getIllicitViolent() {
    return illicitViolent;
  }

  public void setIllicitViolent(BigDecimal illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

  /**
   * The score for the category &#39;self-harm&#39;.
   * @return selfHarm
   */
  public BigDecimal getSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   * The score for the category &#39;self-harm/intent&#39;.
   * @return selfHarmIntent
   */
  public BigDecimal getSelfHarmIntent() {
    return selfHarmIntent;
  }

  public void setSelfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  /**
   * The score for the category &#39;self-harm/instructions&#39;.
   * @return selfHarmInstructions
   */
  public BigDecimal getSelfHarmInstructions() {
    return selfHarmInstructions;
  }

  public void setSelfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  /**
   * The score for the category &#39;sexual&#39;.
   * @return sexual
   */
  public BigDecimal getSexual() {
    return sexual;
  }

  public void setSexual(BigDecimal sexual) {
    this.sexual = sexual;
  }

  /**
   * The score for the category &#39;sexual/minors&#39;.
   * @return sexualMinors
   */
  public BigDecimal getSexualMinors() {
    return sexualMinors;
  }

  public void setSexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   * The score for the category &#39;violence&#39;.
   * @return violence
   */
  public BigDecimal getViolence() {
    return violence;
  }

  public void setViolence(BigDecimal violence) {
    this.violence = violence;
  }

  /**
   * The score for the category &#39;violence/graphic&#39;.
   * @return violenceGraphic
   */
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
        Objects.equals(this.harassment, createModerationResponseResultsInnerCategoryScores.harassment) &&
        Objects.equals(this.harassmentThreatening, createModerationResponseResultsInnerCategoryScores.harassmentThreatening) &&
        Objects.equals(this.illicit, createModerationResponseResultsInnerCategoryScores.illicit) &&
        Objects.equals(this.illicitViolent, createModerationResponseResultsInnerCategoryScores.illicitViolent) &&
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
