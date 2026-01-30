/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * A list of the categories, and whether they are flagged or not.
 */

@ApiModel(description = "A list of the categories, and whether they are flagged or not.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateModerationResponseResultsInnerCategories   {
  
  private Boolean hate;
  private Boolean hateThreatening;
  private Boolean harassment;
  private Boolean harassmentThreatening;
  private Boolean illicit;
  private Boolean illicitViolent;
  private Boolean selfHarm;
  private Boolean selfHarmIntent;
  private Boolean selfHarmInstructions;
  private Boolean sexual;
  private Boolean sexualMinors;
  private Boolean violence;
  private Boolean violenceGraphic;

  /**
   * Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
   */
  public CreateModerationResponseResultsInnerCategories hate(Boolean hate) {
    this.hate = hate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.")
  @JsonProperty("hate")
  public Boolean getHate() {
    return hate;
  }
  public void setHate(Boolean hate) {
    this.hate = hate;
  }

  /**
   * Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
   */
  public CreateModerationResponseResultsInnerCategories hateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.")
  @JsonProperty("hate/threatening")
  public Boolean getHateThreatening() {
    return hateThreatening;
  }
  public void setHateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   * Content that expresses, incites, or promotes harassing language towards any target.
   */
  public CreateModerationResponseResultsInnerCategories harassment(Boolean harassment) {
    this.harassment = harassment;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Content that expresses, incites, or promotes harassing language towards any target.")
  @JsonProperty("harassment")
  public Boolean getHarassment() {
    return harassment;
  }
  public void setHarassment(Boolean harassment) {
    this.harassment = harassment;
  }

  /**
   * Harassment content that also includes violence or serious harm towards any target.
   */
  public CreateModerationResponseResultsInnerCategories harassmentThreatening(Boolean harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Harassment content that also includes violence or serious harm towards any target.")
  @JsonProperty("harassment/threatening")
  public Boolean getHarassmentThreatening() {
    return harassmentThreatening;
  }
  public void setHarassmentThreatening(Boolean harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  /**
   * Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.
   */
  public CreateModerationResponseResultsInnerCategories illicit(Boolean illicit) {
    this.illicit = illicit;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.")
  @JsonProperty("illicit")
  public Boolean getIllicit() {
    return illicit;
  }
  public void setIllicit(Boolean illicit) {
    this.illicit = illicit;
  }

  /**
   * Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
   */
  public CreateModerationResponseResultsInnerCategories illicitViolent(Boolean illicitViolent) {
    this.illicitViolent = illicitViolent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.")
  @JsonProperty("illicit/violent")
  public Boolean getIllicitViolent() {
    return illicitViolent;
  }
  public void setIllicitViolent(Boolean illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

  /**
   * Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
   */
  public CreateModerationResponseResultsInnerCategories selfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.")
  @JsonProperty("self-harm")
  public Boolean getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   * Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
   */
  public CreateModerationResponseResultsInnerCategories selfHarmIntent(Boolean selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.")
  @JsonProperty("self-harm/intent")
  public Boolean getSelfHarmIntent() {
    return selfHarmIntent;
  }
  public void setSelfHarmIntent(Boolean selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  /**
   * Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
   */
  public CreateModerationResponseResultsInnerCategories selfHarmInstructions(Boolean selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.")
  @JsonProperty("self-harm/instructions")
  public Boolean getSelfHarmInstructions() {
    return selfHarmInstructions;
  }
  public void setSelfHarmInstructions(Boolean selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  /**
   * Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
   */
  public CreateModerationResponseResultsInnerCategories sexual(Boolean sexual) {
    this.sexual = sexual;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).")
  @JsonProperty("sexual")
  public Boolean getSexual() {
    return sexual;
  }
  public void setSexual(Boolean sexual) {
    this.sexual = sexual;
  }

  /**
   * Sexual content that includes an individual who is under 18 years old.
   */
  public CreateModerationResponseResultsInnerCategories sexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Sexual content that includes an individual who is under 18 years old.")
  @JsonProperty("sexual/minors")
  public Boolean getSexualMinors() {
    return sexualMinors;
  }
  public void setSexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   * Content that depicts death, violence, or physical injury.
   */
  public CreateModerationResponseResultsInnerCategories violence(Boolean violence) {
    this.violence = violence;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Content that depicts death, violence, or physical injury.")
  @JsonProperty("violence")
  public Boolean getViolence() {
    return violence;
  }
  public void setViolence(Boolean violence) {
    this.violence = violence;
  }

  /**
   * Content that depicts death, violence, or physical injury in graphic detail.
   */
  public CreateModerationResponseResultsInnerCategories violenceGraphic(Boolean violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Content that depicts death, violence, or physical injury in graphic detail.")
  @JsonProperty("violence/graphic")
  public Boolean getViolenceGraphic() {
    return violenceGraphic;
  }
  public void setViolenceGraphic(Boolean violenceGraphic) {
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
    CreateModerationResponseResultsInnerCategories createModerationResponseResultsInnerCategories = (CreateModerationResponseResultsInnerCategories) o;
    return Objects.equals(hate, createModerationResponseResultsInnerCategories.hate) &&
        Objects.equals(hateThreatening, createModerationResponseResultsInnerCategories.hateThreatening) &&
        Objects.equals(harassment, createModerationResponseResultsInnerCategories.harassment) &&
        Objects.equals(harassmentThreatening, createModerationResponseResultsInnerCategories.harassmentThreatening) &&
        Objects.equals(illicit, createModerationResponseResultsInnerCategories.illicit) &&
        Objects.equals(illicitViolent, createModerationResponseResultsInnerCategories.illicitViolent) &&
        Objects.equals(selfHarm, createModerationResponseResultsInnerCategories.selfHarm) &&
        Objects.equals(selfHarmIntent, createModerationResponseResultsInnerCategories.selfHarmIntent) &&
        Objects.equals(selfHarmInstructions, createModerationResponseResultsInnerCategories.selfHarmInstructions) &&
        Objects.equals(sexual, createModerationResponseResultsInnerCategories.sexual) &&
        Objects.equals(sexualMinors, createModerationResponseResultsInnerCategories.sexualMinors) &&
        Objects.equals(violence, createModerationResponseResultsInnerCategories.violence) &&
        Objects.equals(violenceGraphic, createModerationResponseResultsInnerCategories.violenceGraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, harassment, harassmentThreatening, illicit, illicitViolent, selfHarm, selfHarmIntent, selfHarmInstructions, sexual, sexualMinors, violence, violenceGraphic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategories {\n");
    
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

