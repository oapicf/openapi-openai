package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A list of the categories along with their scores as predicted by model.
 **/
@ApiModel(description = "A list of the categories along with their scores as predicted by model.")
@JsonTypeName("CreateModerationResponse_results_inner_category_scores")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  public CreateModerationResponseResultsInnerCategoryScores() {
  }

  @JsonCreator
  public CreateModerationResponseResultsInnerCategoryScores(
    @JsonProperty(required = true, value = "hate") BigDecimal hate,
    @JsonProperty(required = true, value = "hate/threatening") BigDecimal hateThreatening,
    @JsonProperty(required = true, value = "harassment") BigDecimal harassment,
    @JsonProperty(required = true, value = "harassment/threatening") BigDecimal harassmentThreatening,
    @JsonProperty(required = true, value = "illicit") BigDecimal illicit,
    @JsonProperty(required = true, value = "illicit/violent") BigDecimal illicitViolent,
    @JsonProperty(required = true, value = "self-harm") BigDecimal selfHarm,
    @JsonProperty(required = true, value = "self-harm/intent") BigDecimal selfHarmIntent,
    @JsonProperty(required = true, value = "self-harm/instructions") BigDecimal selfHarmInstructions,
    @JsonProperty(required = true, value = "sexual") BigDecimal sexual,
    @JsonProperty(required = true, value = "sexual/minors") BigDecimal sexualMinors,
    @JsonProperty(required = true, value = "violence") BigDecimal violence,
    @JsonProperty(required = true, value = "violence/graphic") BigDecimal violenceGraphic
  ) {
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

  /**
   * The score for the category &#39;hate&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryScores hate(BigDecimal hate) {
    this.hate = hate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'hate'.")
  @JsonProperty(required = true, value = "hate")
  @NotNull @Valid public BigDecimal getHate() {
    return hate;
  }

  @JsonProperty(required = true, value = "hate")
  public void setHate(BigDecimal hate) {
    this.hate = hate;
  }

  /**
   * The score for the category &#39;hate/threatening&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryScores hateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'hate/threatening'.")
  @JsonProperty(required = true, value = "hate/threatening")
  @NotNull @Valid public BigDecimal getHateThreatening() {
    return hateThreatening;
  }

  @JsonProperty(required = true, value = "hate/threatening")
  public void setHateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   * The score for the category &#39;harassment&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryScores harassment(BigDecimal harassment) {
    this.harassment = harassment;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'harassment'.")
  @JsonProperty(required = true, value = "harassment")
  @NotNull @Valid public BigDecimal getHarassment() {
    return harassment;
  }

  @JsonProperty(required = true, value = "harassment")
  public void setHarassment(BigDecimal harassment) {
    this.harassment = harassment;
  }

  /**
   * The score for the category &#39;harassment/threatening&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryScores harassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'harassment/threatening'.")
  @JsonProperty(required = true, value = "harassment/threatening")
  @NotNull @Valid public BigDecimal getHarassmentThreatening() {
    return harassmentThreatening;
  }

  @JsonProperty(required = true, value = "harassment/threatening")
  public void setHarassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  /**
   * The score for the category &#39;illicit&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryScores illicit(BigDecimal illicit) {
    this.illicit = illicit;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'illicit'.")
  @JsonProperty(required = true, value = "illicit")
  @NotNull @Valid public BigDecimal getIllicit() {
    return illicit;
  }

  @JsonProperty(required = true, value = "illicit")
  public void setIllicit(BigDecimal illicit) {
    this.illicit = illicit;
  }

  /**
   * The score for the category &#39;illicit/violent&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryScores illicitViolent(BigDecimal illicitViolent) {
    this.illicitViolent = illicitViolent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'illicit/violent'.")
  @JsonProperty(required = true, value = "illicit/violent")
  @NotNull @Valid public BigDecimal getIllicitViolent() {
    return illicitViolent;
  }

  @JsonProperty(required = true, value = "illicit/violent")
  public void setIllicitViolent(BigDecimal illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

  /**
   * The score for the category &#39;self-harm&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryScores selfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'self-harm'.")
  @JsonProperty(required = true, value = "self-harm")
  @NotNull @Valid public BigDecimal getSelfHarm() {
    return selfHarm;
  }

  @JsonProperty(required = true, value = "self-harm")
  public void setSelfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   * The score for the category &#39;self-harm/intent&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryScores selfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'self-harm/intent'.")
  @JsonProperty(required = true, value = "self-harm/intent")
  @NotNull @Valid public BigDecimal getSelfHarmIntent() {
    return selfHarmIntent;
  }

  @JsonProperty(required = true, value = "self-harm/intent")
  public void setSelfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  /**
   * The score for the category &#39;self-harm/instructions&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryScores selfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'self-harm/instructions'.")
  @JsonProperty(required = true, value = "self-harm/instructions")
  @NotNull @Valid public BigDecimal getSelfHarmInstructions() {
    return selfHarmInstructions;
  }

  @JsonProperty(required = true, value = "self-harm/instructions")
  public void setSelfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  /**
   * The score for the category &#39;sexual&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryScores sexual(BigDecimal sexual) {
    this.sexual = sexual;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'sexual'.")
  @JsonProperty(required = true, value = "sexual")
  @NotNull @Valid public BigDecimal getSexual() {
    return sexual;
  }

  @JsonProperty(required = true, value = "sexual")
  public void setSexual(BigDecimal sexual) {
    this.sexual = sexual;
  }

  /**
   * The score for the category &#39;sexual/minors&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryScores sexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'sexual/minors'.")
  @JsonProperty(required = true, value = "sexual/minors")
  @NotNull @Valid public BigDecimal getSexualMinors() {
    return sexualMinors;
  }

  @JsonProperty(required = true, value = "sexual/minors")
  public void setSexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   * The score for the category &#39;violence&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryScores violence(BigDecimal violence) {
    this.violence = violence;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'violence'.")
  @JsonProperty(required = true, value = "violence")
  @NotNull @Valid public BigDecimal getViolence() {
    return violence;
  }

  @JsonProperty(required = true, value = "violence")
  public void setViolence(BigDecimal violence) {
    this.violence = violence;
  }

  /**
   * The score for the category &#39;violence/graphic&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryScores violenceGraphic(BigDecimal violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score for the category 'violence/graphic'.")
  @JsonProperty(required = true, value = "violence/graphic")
  @NotNull @Valid public BigDecimal getViolenceGraphic() {
    return violenceGraphic;
  }

  @JsonProperty(required = true, value = "violence/graphic")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

