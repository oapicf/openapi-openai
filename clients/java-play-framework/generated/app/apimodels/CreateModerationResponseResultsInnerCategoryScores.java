package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A list of the categories along with their scores as predicted by model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateModerationResponseResultsInnerCategoryScores   {
  @JsonProperty("hate")
  @NotNull
@Valid

  private BigDecimal hate;

  @JsonProperty("hate/threatening")
  @NotNull
@Valid

  private BigDecimal hateThreatening;

  @JsonProperty("harassment")
  @NotNull
@Valid

  private BigDecimal harassment;

  @JsonProperty("harassment/threatening")
  @NotNull
@Valid

  private BigDecimal harassmentThreatening;

  @JsonProperty("illicit")
  @NotNull
@Valid

  private BigDecimal illicit;

  @JsonProperty("illicit/violent")
  @NotNull
@Valid

  private BigDecimal illicitViolent;

  @JsonProperty("self-harm")
  @NotNull
@Valid

  private BigDecimal selfHarm;

  @JsonProperty("self-harm/intent")
  @NotNull
@Valid

  private BigDecimal selfHarmIntent;

  @JsonProperty("self-harm/instructions")
  @NotNull
@Valid

  private BigDecimal selfHarmInstructions;

  @JsonProperty("sexual")
  @NotNull
@Valid

  private BigDecimal sexual;

  @JsonProperty("sexual/minors")
  @NotNull
@Valid

  private BigDecimal sexualMinors;

  @JsonProperty("violence")
  @NotNull
@Valid

  private BigDecimal violence;

  @JsonProperty("violence/graphic")
  @NotNull
@Valid

  private BigDecimal violenceGraphic;

  public CreateModerationResponseResultsInnerCategoryScores hate(BigDecimal hate) {
    this.hate = hate;
    return this;
  }

   /**
   * The score for the category 'hate'.
   * @return hate
  **/
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
   * The score for the category 'hate/threatening'.
   * @return hateThreatening
  **/
  public BigDecimal getHateThreatening() {
    return hateThreatening;
  }

  public void setHateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  public CreateModerationResponseResultsInnerCategoryScores harassment(BigDecimal harassment) {
    this.harassment = harassment;
    return this;
  }

   /**
   * The score for the category 'harassment'.
   * @return harassment
  **/
  public BigDecimal getHarassment() {
    return harassment;
  }

  public void setHarassment(BigDecimal harassment) {
    this.harassment = harassment;
  }

  public CreateModerationResponseResultsInnerCategoryScores harassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
    return this;
  }

   /**
   * The score for the category 'harassment/threatening'.
   * @return harassmentThreatening
  **/
  public BigDecimal getHarassmentThreatening() {
    return harassmentThreatening;
  }

  public void setHarassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  public CreateModerationResponseResultsInnerCategoryScores illicit(BigDecimal illicit) {
    this.illicit = illicit;
    return this;
  }

   /**
   * The score for the category 'illicit'.
   * @return illicit
  **/
  public BigDecimal getIllicit() {
    return illicit;
  }

  public void setIllicit(BigDecimal illicit) {
    this.illicit = illicit;
  }

  public CreateModerationResponseResultsInnerCategoryScores illicitViolent(BigDecimal illicitViolent) {
    this.illicitViolent = illicitViolent;
    return this;
  }

   /**
   * The score for the category 'illicit/violent'.
   * @return illicitViolent
  **/
  public BigDecimal getIllicitViolent() {
    return illicitViolent;
  }

  public void setIllicitViolent(BigDecimal illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

  public CreateModerationResponseResultsInnerCategoryScores selfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

   /**
   * The score for the category 'self-harm'.
   * @return selfHarm
  **/
  public BigDecimal getSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
  }

  public CreateModerationResponseResultsInnerCategoryScores selfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
    return this;
  }

   /**
   * The score for the category 'self-harm/intent'.
   * @return selfHarmIntent
  **/
  public BigDecimal getSelfHarmIntent() {
    return selfHarmIntent;
  }

  public void setSelfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  public CreateModerationResponseResultsInnerCategoryScores selfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
    return this;
  }

   /**
   * The score for the category 'self-harm/instructions'.
   * @return selfHarmInstructions
  **/
  public BigDecimal getSelfHarmInstructions() {
    return selfHarmInstructions;
  }

  public void setSelfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  public CreateModerationResponseResultsInnerCategoryScores sexual(BigDecimal sexual) {
    this.sexual = sexual;
    return this;
  }

   /**
   * The score for the category 'sexual'.
   * @return sexual
  **/
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
   * The score for the category 'sexual/minors'.
   * @return sexualMinors
  **/
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
   * The score for the category 'violence'.
   * @return violence
  **/
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
   * The score for the category 'violence/graphic'.
   * @return violenceGraphic
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

