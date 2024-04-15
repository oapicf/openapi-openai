/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A list of the categories, and whether they are flagged or not.
 **/
@ApiModel(description = "A list of the categories, and whether they are flagged or not.")
public class CreateModerationResponseResultsInnerCategories {
  
  @SerializedName("hate")
  private Boolean hate = null;
  @SerializedName("hate/threatening")
  private Boolean hateThreatening = null;
  @SerializedName("harassment")
  private Boolean harassment = null;
  @SerializedName("harassment/threatening")
  private Boolean harassmentThreatening = null;
  @SerializedName("self-harm")
  private Boolean selfHarm = null;
  @SerializedName("self-harm/intent")
  private Boolean selfHarmIntent = null;
  @SerializedName("self-harm/instructions")
  private Boolean selfHarmInstructions = null;
  @SerializedName("sexual")
  private Boolean sexual = null;
  @SerializedName("sexual/minors")
  private Boolean sexualMinors = null;
  @SerializedName("violence")
  private Boolean violence = null;
  @SerializedName("violence/graphic")
  private Boolean violenceGraphic = null;

  /**
   * Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
   **/
  @ApiModelProperty(required = true, value = "Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.")
  public Boolean getHate() {
    return hate;
  }
  public void setHate(Boolean hate) {
    this.hate = hate;
  }

  /**
   * Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
   **/
  @ApiModelProperty(required = true, value = "Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.")
  public Boolean getHateThreatening() {
    return hateThreatening;
  }
  public void setHateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   * Content that expresses, incites, or promotes harassing language towards any target.
   **/
  @ApiModelProperty(required = true, value = "Content that expresses, incites, or promotes harassing language towards any target.")
  public Boolean getHarassment() {
    return harassment;
  }
  public void setHarassment(Boolean harassment) {
    this.harassment = harassment;
  }

  /**
   * Harassment content that also includes violence or serious harm towards any target.
   **/
  @ApiModelProperty(required = true, value = "Harassment content that also includes violence or serious harm towards any target.")
  public Boolean getHarassmentThreatening() {
    return harassmentThreatening;
  }
  public void setHarassmentThreatening(Boolean harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  /**
   * Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
   **/
  @ApiModelProperty(required = true, value = "Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.")
  public Boolean getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   * Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
   **/
  @ApiModelProperty(required = true, value = "Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.")
  public Boolean getSelfHarmIntent() {
    return selfHarmIntent;
  }
  public void setSelfHarmIntent(Boolean selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  /**
   * Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
   **/
  @ApiModelProperty(required = true, value = "Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.")
  public Boolean getSelfHarmInstructions() {
    return selfHarmInstructions;
  }
  public void setSelfHarmInstructions(Boolean selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  /**
   * Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
   **/
  @ApiModelProperty(required = true, value = "Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).")
  public Boolean getSexual() {
    return sexual;
  }
  public void setSexual(Boolean sexual) {
    this.sexual = sexual;
  }

  /**
   * Sexual content that includes an individual who is under 18 years old.
   **/
  @ApiModelProperty(required = true, value = "Sexual content that includes an individual who is under 18 years old.")
  public Boolean getSexualMinors() {
    return sexualMinors;
  }
  public void setSexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   * Content that depicts death, violence, or physical injury.
   **/
  @ApiModelProperty(required = true, value = "Content that depicts death, violence, or physical injury.")
  public Boolean getViolence() {
    return violence;
  }
  public void setViolence(Boolean violence) {
    this.violence = violence;
  }

  /**
   * Content that depicts death, violence, or physical injury in graphic detail.
   **/
  @ApiModelProperty(required = true, value = "Content that depicts death, violence, or physical injury in graphic detail.")
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
    return (this.hate == null ? createModerationResponseResultsInnerCategories.hate == null : this.hate.equals(createModerationResponseResultsInnerCategories.hate)) &&
        (this.hateThreatening == null ? createModerationResponseResultsInnerCategories.hateThreatening == null : this.hateThreatening.equals(createModerationResponseResultsInnerCategories.hateThreatening)) &&
        (this.harassment == null ? createModerationResponseResultsInnerCategories.harassment == null : this.harassment.equals(createModerationResponseResultsInnerCategories.harassment)) &&
        (this.harassmentThreatening == null ? createModerationResponseResultsInnerCategories.harassmentThreatening == null : this.harassmentThreatening.equals(createModerationResponseResultsInnerCategories.harassmentThreatening)) &&
        (this.selfHarm == null ? createModerationResponseResultsInnerCategories.selfHarm == null : this.selfHarm.equals(createModerationResponseResultsInnerCategories.selfHarm)) &&
        (this.selfHarmIntent == null ? createModerationResponseResultsInnerCategories.selfHarmIntent == null : this.selfHarmIntent.equals(createModerationResponseResultsInnerCategories.selfHarmIntent)) &&
        (this.selfHarmInstructions == null ? createModerationResponseResultsInnerCategories.selfHarmInstructions == null : this.selfHarmInstructions.equals(createModerationResponseResultsInnerCategories.selfHarmInstructions)) &&
        (this.sexual == null ? createModerationResponseResultsInnerCategories.sexual == null : this.sexual.equals(createModerationResponseResultsInnerCategories.sexual)) &&
        (this.sexualMinors == null ? createModerationResponseResultsInnerCategories.sexualMinors == null : this.sexualMinors.equals(createModerationResponseResultsInnerCategories.sexualMinors)) &&
        (this.violence == null ? createModerationResponseResultsInnerCategories.violence == null : this.violence.equals(createModerationResponseResultsInnerCategories.violence)) &&
        (this.violenceGraphic == null ? createModerationResponseResultsInnerCategories.violenceGraphic == null : this.violenceGraphic.equals(createModerationResponseResultsInnerCategories.violenceGraphic));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.hate == null ? 0: this.hate.hashCode());
    result = 31 * result + (this.hateThreatening == null ? 0: this.hateThreatening.hashCode());
    result = 31 * result + (this.harassment == null ? 0: this.harassment.hashCode());
    result = 31 * result + (this.harassmentThreatening == null ? 0: this.harassmentThreatening.hashCode());
    result = 31 * result + (this.selfHarm == null ? 0: this.selfHarm.hashCode());
    result = 31 * result + (this.selfHarmIntent == null ? 0: this.selfHarmIntent.hashCode());
    result = 31 * result + (this.selfHarmInstructions == null ? 0: this.selfHarmInstructions.hashCode());
    result = 31 * result + (this.sexual == null ? 0: this.sexual.hashCode());
    result = 31 * result + (this.sexualMinors == null ? 0: this.sexualMinors.hashCode());
    result = 31 * result + (this.violence == null ? 0: this.violence.hashCode());
    result = 31 * result + (this.violenceGraphic == null ? 0: this.violenceGraphic.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategories {\n");
    
    sb.append("  hate: ").append(hate).append("\n");
    sb.append("  hateThreatening: ").append(hateThreatening).append("\n");
    sb.append("  harassment: ").append(harassment).append("\n");
    sb.append("  harassmentThreatening: ").append(harassmentThreatening).append("\n");
    sb.append("  selfHarm: ").append(selfHarm).append("\n");
    sb.append("  selfHarmIntent: ").append(selfHarmIntent).append("\n");
    sb.append("  selfHarmInstructions: ").append(selfHarmInstructions).append("\n");
    sb.append("  sexual: ").append(sexual).append("\n");
    sb.append("  sexualMinors: ").append(sexualMinors).append("\n");
    sb.append("  violence: ").append(violence).append("\n");
    sb.append("  violenceGraphic: ").append(violenceGraphic).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}