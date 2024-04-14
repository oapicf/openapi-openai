package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A list of the categories, and whether they are flagged or not.
 */
@ApiModel(description="A list of the categories, and whether they are flagged or not.")

public class CreateModerationResponseResultsInnerCategories  {
  
 /**
  * Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
  */
  @ApiModelProperty(required = true, value = "Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.")
  private Boolean hate;

 /**
  * Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
  */
  @ApiModelProperty(required = true, value = "Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.")
  private Boolean hateThreatening;

 /**
  * Content that expresses, incites, or promotes harassing language towards any target.
  */
  @ApiModelProperty(required = true, value = "Content that expresses, incites, or promotes harassing language towards any target.")
  private Boolean harassment;

 /**
  * Harassment content that also includes violence or serious harm towards any target.
  */
  @ApiModelProperty(required = true, value = "Harassment content that also includes violence or serious harm towards any target.")
  private Boolean harassmentThreatening;

 /**
  * Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
  */
  @ApiModelProperty(required = true, value = "Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.")
  private Boolean selfHarm;

 /**
  * Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
  */
  @ApiModelProperty(required = true, value = "Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.")
  private Boolean selfHarmIntent;

 /**
  * Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
  */
  @ApiModelProperty(required = true, value = "Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.")
  private Boolean selfHarmInstructions;

 /**
  * Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
  */
  @ApiModelProperty(required = true, value = "Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).")
  private Boolean sexual;

 /**
  * Sexual content that includes an individual who is under 18 years old.
  */
  @ApiModelProperty(required = true, value = "Sexual content that includes an individual who is under 18 years old.")
  private Boolean sexualMinors;

 /**
  * Content that depicts death, violence, or physical injury.
  */
  @ApiModelProperty(required = true, value = "Content that depicts death, violence, or physical injury.")
  private Boolean violence;

 /**
  * Content that depicts death, violence, or physical injury in graphic detail.
  */
  @ApiModelProperty(required = true, value = "Content that depicts death, violence, or physical injury in graphic detail.")
  private Boolean violenceGraphic;
 /**
  * Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
  * @return hate
  */
  @JsonProperty("hate")
  @NotNull
  public Boolean getHate() {
    return hate;
  }

  /**
   * Sets the <code>hate</code> property.
   */
 public void setHate(Boolean hate) {
    this.hate = hate;
  }

  /**
   * Sets the <code>hate</code> property.
   */
  public CreateModerationResponseResultsInnerCategories hate(Boolean hate) {
    this.hate = hate;
    return this;
  }

 /**
  * Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
  * @return hateThreatening
  */
  @JsonProperty("hate/threatening")
  @NotNull
  public Boolean getHateThreatening() {
    return hateThreatening;
  }

  /**
   * Sets the <code>hateThreatening</code> property.
   */
 public void setHateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   * Sets the <code>hateThreatening</code> property.
   */
  public CreateModerationResponseResultsInnerCategories hateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

 /**
  * Content that expresses, incites, or promotes harassing language towards any target.
  * @return harassment
  */
  @JsonProperty("harassment")
  @NotNull
  public Boolean getHarassment() {
    return harassment;
  }

  /**
   * Sets the <code>harassment</code> property.
   */
 public void setHarassment(Boolean harassment) {
    this.harassment = harassment;
  }

  /**
   * Sets the <code>harassment</code> property.
   */
  public CreateModerationResponseResultsInnerCategories harassment(Boolean harassment) {
    this.harassment = harassment;
    return this;
  }

 /**
  * Harassment content that also includes violence or serious harm towards any target.
  * @return harassmentThreatening
  */
  @JsonProperty("harassment/threatening")
  @NotNull
  public Boolean getHarassmentThreatening() {
    return harassmentThreatening;
  }

  /**
   * Sets the <code>harassmentThreatening</code> property.
   */
 public void setHarassmentThreatening(Boolean harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  /**
   * Sets the <code>harassmentThreatening</code> property.
   */
  public CreateModerationResponseResultsInnerCategories harassmentThreatening(Boolean harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
    return this;
  }

 /**
  * Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
  * @return selfHarm
  */
  @JsonProperty("self-harm")
  @NotNull
  public Boolean getSelfHarm() {
    return selfHarm;
  }

  /**
   * Sets the <code>selfHarm</code> property.
   */
 public void setSelfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   * Sets the <code>selfHarm</code> property.
   */
  public CreateModerationResponseResultsInnerCategories selfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

 /**
  * Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
  * @return selfHarmIntent
  */
  @JsonProperty("self-harm/intent")
  @NotNull
  public Boolean getSelfHarmIntent() {
    return selfHarmIntent;
  }

  /**
   * Sets the <code>selfHarmIntent</code> property.
   */
 public void setSelfHarmIntent(Boolean selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  /**
   * Sets the <code>selfHarmIntent</code> property.
   */
  public CreateModerationResponseResultsInnerCategories selfHarmIntent(Boolean selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
    return this;
  }

 /**
  * Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
  * @return selfHarmInstructions
  */
  @JsonProperty("self-harm/instructions")
  @NotNull
  public Boolean getSelfHarmInstructions() {
    return selfHarmInstructions;
  }

  /**
   * Sets the <code>selfHarmInstructions</code> property.
   */
 public void setSelfHarmInstructions(Boolean selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  /**
   * Sets the <code>selfHarmInstructions</code> property.
   */
  public CreateModerationResponseResultsInnerCategories selfHarmInstructions(Boolean selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
    return this;
  }

 /**
  * Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
  * @return sexual
  */
  @JsonProperty("sexual")
  @NotNull
  public Boolean getSexual() {
    return sexual;
  }

  /**
   * Sets the <code>sexual</code> property.
   */
 public void setSexual(Boolean sexual) {
    this.sexual = sexual;
  }

  /**
   * Sets the <code>sexual</code> property.
   */
  public CreateModerationResponseResultsInnerCategories sexual(Boolean sexual) {
    this.sexual = sexual;
    return this;
  }

 /**
  * Sexual content that includes an individual who is under 18 years old.
  * @return sexualMinors
  */
  @JsonProperty("sexual/minors")
  @NotNull
  public Boolean getSexualMinors() {
    return sexualMinors;
  }

  /**
   * Sets the <code>sexualMinors</code> property.
   */
 public void setSexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   * Sets the <code>sexualMinors</code> property.
   */
  public CreateModerationResponseResultsInnerCategories sexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

 /**
  * Content that depicts death, violence, or physical injury.
  * @return violence
  */
  @JsonProperty("violence")
  @NotNull
  public Boolean getViolence() {
    return violence;
  }

  /**
   * Sets the <code>violence</code> property.
   */
 public void setViolence(Boolean violence) {
    this.violence = violence;
  }

  /**
   * Sets the <code>violence</code> property.
   */
  public CreateModerationResponseResultsInnerCategories violence(Boolean violence) {
    this.violence = violence;
    return this;
  }

 /**
  * Content that depicts death, violence, or physical injury in graphic detail.
  * @return violenceGraphic
  */
  @JsonProperty("violence/graphic")
  @NotNull
  public Boolean getViolenceGraphic() {
    return violenceGraphic;
  }

  /**
   * Sets the <code>violenceGraphic</code> property.
   */
 public void setViolenceGraphic(Boolean violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
  }

  /**
   * Sets the <code>violenceGraphic</code> property.
   */
  public CreateModerationResponseResultsInnerCategories violenceGraphic(Boolean violenceGraphic) {
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
    CreateModerationResponseResultsInnerCategories createModerationResponseResultsInnerCategories = (CreateModerationResponseResultsInnerCategories) o;
    return Objects.equals(this.hate, createModerationResponseResultsInnerCategories.hate) &&
        Objects.equals(this.hateThreatening, createModerationResponseResultsInnerCategories.hateThreatening) &&
        Objects.equals(this.harassment, createModerationResponseResultsInnerCategories.harassment) &&
        Objects.equals(this.harassmentThreatening, createModerationResponseResultsInnerCategories.harassmentThreatening) &&
        Objects.equals(this.selfHarm, createModerationResponseResultsInnerCategories.selfHarm) &&
        Objects.equals(this.selfHarmIntent, createModerationResponseResultsInnerCategories.selfHarmIntent) &&
        Objects.equals(this.selfHarmInstructions, createModerationResponseResultsInnerCategories.selfHarmInstructions) &&
        Objects.equals(this.sexual, createModerationResponseResultsInnerCategories.sexual) &&
        Objects.equals(this.sexualMinors, createModerationResponseResultsInnerCategories.sexualMinors) &&
        Objects.equals(this.violence, createModerationResponseResultsInnerCategories.violence) &&
        Objects.equals(this.violenceGraphic, createModerationResponseResultsInnerCategories.violenceGraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, harassment, harassmentThreatening, selfHarm, selfHarmIntent, selfHarmInstructions, sexual, sexualMinors, violence, violenceGraphic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategories {\n");
    
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

