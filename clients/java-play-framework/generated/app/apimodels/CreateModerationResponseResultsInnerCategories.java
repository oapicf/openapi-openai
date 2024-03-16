package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateModerationResponseResultsInnerCategories
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateModerationResponseResultsInnerCategories   {
  @JsonProperty("hate")
  @NotNull

  private Boolean hate;

  @JsonProperty("hate/threatening")
  @NotNull

  private Boolean hateThreatening;

  @JsonProperty("self-harm")
  @NotNull

  private Boolean selfHarm;

  @JsonProperty("sexual")
  @NotNull

  private Boolean sexual;

  @JsonProperty("sexual/minors")
  @NotNull

  private Boolean sexualMinors;

  @JsonProperty("violence")
  @NotNull

  private Boolean violence;

  @JsonProperty("violence/graphic")
  @NotNull

  private Boolean violenceGraphic;

  public CreateModerationResponseResultsInnerCategories hate(Boolean hate) {
    this.hate = hate;
    return this;
  }

   /**
   * Get hate
   * @return hate
  **/
  public Boolean getHate() {
    return hate;
  }

  public void setHate(Boolean hate) {
    this.hate = hate;
  }

  public CreateModerationResponseResultsInnerCategories hateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

   /**
   * Get hateThreatening
   * @return hateThreatening
  **/
  public Boolean getHateThreatening() {
    return hateThreatening;
  }

  public void setHateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  public CreateModerationResponseResultsInnerCategories selfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

   /**
   * Get selfHarm
   * @return selfHarm
  **/
  public Boolean getSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
  }

  public CreateModerationResponseResultsInnerCategories sexual(Boolean sexual) {
    this.sexual = sexual;
    return this;
  }

   /**
   * Get sexual
   * @return sexual
  **/
  public Boolean getSexual() {
    return sexual;
  }

  public void setSexual(Boolean sexual) {
    this.sexual = sexual;
  }

  public CreateModerationResponseResultsInnerCategories sexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

   /**
   * Get sexualMinors
   * @return sexualMinors
  **/
  public Boolean getSexualMinors() {
    return sexualMinors;
  }

  public void setSexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  public CreateModerationResponseResultsInnerCategories violence(Boolean violence) {
    this.violence = violence;
    return this;
  }

   /**
   * Get violence
   * @return violence
  **/
  public Boolean getViolence() {
    return violence;
  }

  public void setViolence(Boolean violence) {
    this.violence = violence;
  }

  public CreateModerationResponseResultsInnerCategories violenceGraphic(Boolean violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

   /**
   * Get violenceGraphic
   * @return violenceGraphic
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

