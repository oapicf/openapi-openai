package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModerationResponseResultsInnerCategories   {
  
  private Boolean hate;
  private Boolean hateThreatening;
  private Boolean selfHarm;
  private Boolean sexual;
  private Boolean sexualMinors;
  private Boolean violence;
  private Boolean violenceGraphic;

  public CreateModerationResponseResultsInnerCategories () {

  }

  public CreateModerationResponseResultsInnerCategories (Boolean hate, Boolean hateThreatening, Boolean selfHarm, Boolean sexual, Boolean sexualMinors, Boolean violence, Boolean violenceGraphic) {
    this.hate = hate;
    this.hateThreatening = hateThreatening;
    this.selfHarm = selfHarm;
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

    
  @JsonProperty("self-harm")
  public Boolean getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
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
        Objects.equals(selfHarm, createModerationResponseResultsInnerCategories.selfHarm) &&
        Objects.equals(sexual, createModerationResponseResultsInnerCategories.sexual) &&
        Objects.equals(sexualMinors, createModerationResponseResultsInnerCategories.sexualMinors) &&
        Objects.equals(violence, createModerationResponseResultsInnerCategories.violence) &&
        Objects.equals(violenceGraphic, createModerationResponseResultsInnerCategories.violenceGraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, selfHarm, sexual, sexualMinors, violence, violenceGraphic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategories {\n");
    
    sb.append("    hate: ").append(toIndentedString(hate)).append("\n");
    sb.append("    hateThreatening: ").append(toIndentedString(hateThreatening)).append("\n");
    sb.append("    selfHarm: ").append(toIndentedString(selfHarm)).append("\n");
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
