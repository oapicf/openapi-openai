package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A list of the categories, and whether they are flagged or not.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public CreateModerationResponseResultsInnerCategories () {

  }

  public CreateModerationResponseResultsInnerCategories (Boolean hate, Boolean hateThreatening, Boolean harassment, Boolean harassmentThreatening, Boolean illicit, Boolean illicitViolent, Boolean selfHarm, Boolean selfHarmIntent, Boolean selfHarmInstructions, Boolean sexual, Boolean sexualMinors, Boolean violence, Boolean violenceGraphic) {
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
  public Boolean getHate() {
    return hate;
  }
  public void setHate(Boolean hate) {
    this.hate = hate;
  }

    
  @JsonProperty("hate/threatening")
  public Boolean getHateThreatening() {
    return hateThreatening;
  }
  public void setHateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

    
  @JsonProperty("harassment")
  public Boolean getHarassment() {
    return harassment;
  }
  public void setHarassment(Boolean harassment) {
    this.harassment = harassment;
  }

    
  @JsonProperty("harassment/threatening")
  public Boolean getHarassmentThreatening() {
    return harassmentThreatening;
  }
  public void setHarassmentThreatening(Boolean harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

    
  @JsonProperty("illicit")
  public Boolean getIllicit() {
    return illicit;
  }
  public void setIllicit(Boolean illicit) {
    this.illicit = illicit;
  }

    
  @JsonProperty("illicit/violent")
  public Boolean getIllicitViolent() {
    return illicitViolent;
  }
  public void setIllicitViolent(Boolean illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

    
  @JsonProperty("self-harm")
  public Boolean getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
  }

    
  @JsonProperty("self-harm/intent")
  public Boolean getSelfHarmIntent() {
    return selfHarmIntent;
  }
  public void setSelfHarmIntent(Boolean selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

    
  @JsonProperty("self-harm/instructions")
  public Boolean getSelfHarmInstructions() {
    return selfHarmInstructions;
  }
  public void setSelfHarmInstructions(Boolean selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

    
  @JsonProperty("sexual")
  public Boolean getSexual() {
    return sexual;
  }
  public void setSexual(Boolean sexual) {
    this.sexual = sexual;
  }

    
  @JsonProperty("sexual/minors")
  public Boolean getSexualMinors() {
    return sexualMinors;
  }
  public void setSexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

    
  @JsonProperty("violence")
  public Boolean getViolence() {
    return violence;
  }
  public void setViolence(Boolean violence) {
    this.violence = violence;
  }

    
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
