package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="A list of the categories along with their scores as predicted by model.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-03T11:08:49.636855747Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateModerationResponseResultsInnerCategoryScores   {
  
  private BigDecimal hate;
  private BigDecimal hateThreatening;
  private BigDecimal harassment;
  private BigDecimal harassmentThreatening;
  private BigDecimal selfHarm;
  private BigDecimal selfHarmIntent;
  private BigDecimal selfHarmInstructions;
  private BigDecimal sexual;
  private BigDecimal sexualMinors;
  private BigDecimal violence;
  private BigDecimal violenceGraphic;

  /**
   * The score for the category &#39;hate&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The score for the category 'hate'.")
  @JsonProperty("hate")
  @NotNull
  @Valid
  public BigDecimal getHate() {
    return hate;
  }
  public void setHate(BigDecimal hate) {
    this.hate = hate;
  }

  /**
   * The score for the category &#39;hate/threatening&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The score for the category 'hate/threatening'.")
  @JsonProperty("hate/threatening")
  @NotNull
  @Valid
  public BigDecimal getHateThreatening() {
    return hateThreatening;
  }
  public void setHateThreatening(BigDecimal hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   * The score for the category &#39;harassment&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The score for the category 'harassment'.")
  @JsonProperty("harassment")
  @NotNull
  @Valid
  public BigDecimal getHarassment() {
    return harassment;
  }
  public void setHarassment(BigDecimal harassment) {
    this.harassment = harassment;
  }

  /**
   * The score for the category &#39;harassment/threatening&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The score for the category 'harassment/threatening'.")
  @JsonProperty("harassment/threatening")
  @NotNull
  @Valid
  public BigDecimal getHarassmentThreatening() {
    return harassmentThreatening;
  }
  public void setHarassmentThreatening(BigDecimal harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  /**
   * The score for the category &#39;self-harm&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The score for the category 'self-harm'.")
  @JsonProperty("self-harm")
  @NotNull
  @Valid
  public BigDecimal getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(BigDecimal selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   * The score for the category &#39;self-harm/intent&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The score for the category 'self-harm/intent'.")
  @JsonProperty("self-harm/intent")
  @NotNull
  @Valid
  public BigDecimal getSelfHarmIntent() {
    return selfHarmIntent;
  }
  public void setSelfHarmIntent(BigDecimal selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  /**
   * The score for the category &#39;self-harm/instructions&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The score for the category 'self-harm/instructions'.")
  @JsonProperty("self-harm/instructions")
  @NotNull
  @Valid
  public BigDecimal getSelfHarmInstructions() {
    return selfHarmInstructions;
  }
  public void setSelfHarmInstructions(BigDecimal selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  /**
   * The score for the category &#39;sexual&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The score for the category 'sexual'.")
  @JsonProperty("sexual")
  @NotNull
  @Valid
  public BigDecimal getSexual() {
    return sexual;
  }
  public void setSexual(BigDecimal sexual) {
    this.sexual = sexual;
  }

  /**
   * The score for the category &#39;sexual/minors&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The score for the category 'sexual/minors'.")
  @JsonProperty("sexual/minors")
  @NotNull
  @Valid
  public BigDecimal getSexualMinors() {
    return sexualMinors;
  }
  public void setSexualMinors(BigDecimal sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   * The score for the category &#39;violence&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The score for the category 'violence'.")
  @JsonProperty("violence")
  @NotNull
  @Valid
  public BigDecimal getViolence() {
    return violence;
  }
  public void setViolence(BigDecimal violence) {
    this.violence = violence;
  }

  /**
   * The score for the category &#39;violence/graphic&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The score for the category 'violence/graphic'.")
  @JsonProperty("violence/graphic")
  @NotNull
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

