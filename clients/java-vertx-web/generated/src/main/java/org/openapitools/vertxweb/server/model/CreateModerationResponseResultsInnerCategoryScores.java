package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * A list of the categories along with their scores as predicted by model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModerationResponseResultsInnerCategoryScores   {
  
  private BigDecimal hate;
  private BigDecimal hateThreatening;
  private BigDecimal harassment;
  private BigDecimal harassmentThreatening;
  private BigDecimal illicit;
  private BigDecimal illicitViolent;
  private BigDecimal selfHarm;
  private BigDecimal selfHarmIntent;
  private BigDecimal selfHarmInstructions;
  private BigDecimal sexual;
  private BigDecimal sexualMinors;
  private BigDecimal violence;
  private BigDecimal violenceGraphic;

  public CreateModerationResponseResultsInnerCategoryScores () {

  }

  public CreateModerationResponseResultsInnerCategoryScores (BigDecimal hate, BigDecimal hateThreatening, BigDecimal harassment, BigDecimal harassmentThreatening, BigDecimal illicit, BigDecimal illicitViolent, BigDecimal selfHarm, BigDecimal selfHarmIntent, BigDecimal selfHarmInstructions, BigDecimal sexual, BigDecimal sexualMinors, BigDecimal violence, BigDecimal violenceGraphic) {
    this.hate = hate;
    this.hateThreatening = hateThreatening;
    this.harassment = harassment;
    this.harassmentThreatening = harassmentThreatening;
    this.illicit = illicit;
    this.illicitViolent = illicitViolent;
    this.selfHarm = selfHarm;
    this.selfHarmIntent = selfHarmIntent;
    this.selfHarmInstructions = selfHarmInstructions;
    this.sexual = sexual;
    this.sexualMinors = sexualMinors;
    this.violence = violence;
    this.violenceGraphic = violenceGraphic;
  }

    
  @JsonProperty("hate")
  public BigDecimal getHate() {
    return hate;
  }
  public void setHate(BigDecimal hate) {
    this.hate = hate;
  }

    
  @JsonProperty("hate/threatening")
  public BigDecimal getHateThreatening() {
    return hateThreatening;
  }
  public void setHateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

    
  @JsonProperty("harassment")
  public BigDecimal getHarassment() {
    return harassment;
  }
  public void setHarassment(BigDecimal harassment) {
    this.harassment = harassment;
  }

    
  @JsonProperty("harassment/threatening")
  public BigDecimal getHarassmentThreatening() {
    return harassmentThreatening;
  }
  public void setHarassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

    
  @JsonProperty("illicit")
  public BigDecimal getIllicit() {
    return illicit;
  }
  public void setIllicit(BigDecimal illicit) {
    this.illicit = illicit;
  }

    
  @JsonProperty("illicit/violent")
  public BigDecimal getIllicitViolent() {
    return illicitViolent;
  }
  public void setIllicitViolent(BigDecimal illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

    
  @JsonProperty("self-harm")
  public BigDecimal getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
  }

    
  @JsonProperty("self-harm/intent")
  public BigDecimal getSelfHarmIntent() {
    return selfHarmIntent;
  }
  public void setSelfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

    
  @JsonProperty("self-harm/instructions")
  public BigDecimal getSelfHarmInstructions() {
    return selfHarmInstructions;
  }
  public void setSelfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

    
  @JsonProperty("sexual")
  public BigDecimal getSexual() {
    return sexual;
  }
  public void setSexual(BigDecimal sexual) {
    this.sexual = sexual;
  }

    
  @JsonProperty("sexual/minors")
  public BigDecimal getSexualMinors() {
    return sexualMinors;
  }
  public void setSexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

    
  @JsonProperty("violence")
  public BigDecimal getViolence() {
    return violence;
  }
  public void setViolence(BigDecimal violence) {
    this.violence = violence;
  }

    
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
