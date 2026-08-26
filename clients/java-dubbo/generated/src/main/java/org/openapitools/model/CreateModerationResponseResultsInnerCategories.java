package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A list of the categories, and whether they are flagged or not.
 */
public class CreateModerationResponseResultsInnerCategories implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
   */
  @JsonProperty("hate")
  private Boolean hate;

  /**
   * Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
   */
  @JsonProperty("hate/threatening")
  private Boolean hateThreatening;

  /**
   * Content that expresses, incites, or promotes harassing language towards any target.
   */
  @JsonProperty("harassment")
  private Boolean harassment;

  /**
   * Harassment content that also includes violence or serious harm towards any target.
   */
  @JsonProperty("harassment/threatening")
  private Boolean harassmentThreatening;

  /**
   * Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \&quot;how to shoplift\&quot; would fit this category.
   */
  @JsonProperty("illicit")
  private Boolean illicit;

  /**
   * Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
   */
  @JsonProperty("illicit/violent")
  private Boolean illicitViolent;

  /**
   * Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
   */
  @JsonProperty("self-harm")
  private Boolean selfHarm;

  /**
   * Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
   */
  @JsonProperty("self-harm/intent")
  private Boolean selfHarmIntent;

  /**
   * Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
   */
  @JsonProperty("self-harm/instructions")
  private Boolean selfHarmInstructions;

  /**
   * Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
   */
  @JsonProperty("sexual")
  private Boolean sexual;

  /**
   * Sexual content that includes an individual who is under 18 years old.
   */
  @JsonProperty("sexual/minors")
  private Boolean sexualMinors;

  /**
   * Content that depicts death, violence, or physical injury.
   */
  @JsonProperty("violence")
  private Boolean violence;

  /**
   * Content that depicts death, violence, or physical injury in graphic detail.
   */
  @JsonProperty("violence/graphic")
  private Boolean violenceGraphic;

  /**
   * Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
   * @return hate
   */
  public Boolean getHate() {
    return hate;
  }

  public void setHate(Boolean hate) {
    this.hate = hate;
  }

  /**
   * Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
   * @return hateThreatening
   */
  public Boolean getHateThreatening() {
    return hateThreatening;
  }

  public void setHateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   * Content that expresses, incites, or promotes harassing language towards any target.
   * @return harassment
   */
  public Boolean getHarassment() {
    return harassment;
  }

  public void setHarassment(Boolean harassment) {
    this.harassment = harassment;
  }

  /**
   * Harassment content that also includes violence or serious harm towards any target.
   * @return harassmentThreatening
   */
  public Boolean getHarassmentThreatening() {
    return harassmentThreatening;
  }

  public void setHarassmentThreatening(Boolean harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  /**
   * Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \&quot;how to shoplift\&quot; would fit this category.
   * @return illicit
   */
  public Boolean getIllicit() {
    return illicit;
  }

  public void setIllicit(Boolean illicit) {
    this.illicit = illicit;
  }

  /**
   * Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
   * @return illicitViolent
   */
  public Boolean getIllicitViolent() {
    return illicitViolent;
  }

  public void setIllicitViolent(Boolean illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

  /**
   * Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
   * @return selfHarm
   */
  public Boolean getSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   * Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
   * @return selfHarmIntent
   */
  public Boolean getSelfHarmIntent() {
    return selfHarmIntent;
  }

  public void setSelfHarmIntent(Boolean selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  /**
   * Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
   * @return selfHarmInstructions
   */
  public Boolean getSelfHarmInstructions() {
    return selfHarmInstructions;
  }

  public void setSelfHarmInstructions(Boolean selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  /**
   * Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
   * @return sexual
   */
  public Boolean getSexual() {
    return sexual;
  }

  public void setSexual(Boolean sexual) {
    this.sexual = sexual;
  }

  /**
   * Sexual content that includes an individual who is under 18 years old.
   * @return sexualMinors
   */
  public Boolean getSexualMinors() {
    return sexualMinors;
  }

  public void setSexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   * Content that depicts death, violence, or physical injury.
   * @return violence
   */
  public Boolean getViolence() {
    return violence;
  }

  public void setViolence(Boolean violence) {
    this.violence = violence;
  }

  /**
   * Content that depicts death, violence, or physical injury in graphic detail.
   * @return violenceGraphic
   */
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
    return Objects.equals(this.hate, createModerationResponseResultsInnerCategories.hate) &&
        Objects.equals(this.hateThreatening, createModerationResponseResultsInnerCategories.hateThreatening) &&
        Objects.equals(this.harassment, createModerationResponseResultsInnerCategories.harassment) &&
        Objects.equals(this.harassmentThreatening, createModerationResponseResultsInnerCategories.harassmentThreatening) &&
        Objects.equals(this.illicit, createModerationResponseResultsInnerCategories.illicit) &&
        Objects.equals(this.illicitViolent, createModerationResponseResultsInnerCategories.illicitViolent) &&
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
