package org.openapitools.model;

import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A list of the categories along with the input type(s) that the score applies to.
 */
public class CreateModerationResponseResultsInnerCategoryAppliedInputTypes implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The applied input type(s) for the category &#39;hate&#39;.
   */
  @JsonProperty("hate")
  private List<String> hate = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;hate/threatening&#39;.
   */
  @JsonProperty("hate/threatening")
  private List<String> hateThreatening = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;harassment&#39;.
   */
  @JsonProperty("harassment")
  private List<String> harassment = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;harassment/threatening&#39;.
   */
  @JsonProperty("harassment/threatening")
  private List<String> harassmentThreatening = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;illicit&#39;.
   */
  @JsonProperty("illicit")
  private List<String> illicit = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;illicit/violent&#39;.
   */
  @JsonProperty("illicit/violent")
  private List<String> illicitViolent = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;self-harm&#39;.
   */
  @JsonProperty("self-harm")
  private List<String> selfHarm = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;self-harm/intent&#39;.
   */
  @JsonProperty("self-harm/intent")
  private List<String> selfHarmIntent = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;self-harm/instructions&#39;.
   */
  @JsonProperty("self-harm/instructions")
  private List<String> selfHarmInstructions = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;sexual&#39;.
   */
  @JsonProperty("sexual")
  private List<String> sexual = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;sexual/minors&#39;.
   */
  @JsonProperty("sexual/minors")
  private List<String> sexualMinors = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;violence&#39;.
   */
  @JsonProperty("violence")
  private List<String> violence = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;violence/graphic&#39;.
   */
  @JsonProperty("violence/graphic")
  private List<String> violenceGraphic = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;hate&#39;.
   * @return hate
   */
  public List<String> getHate() {
    return hate;
  }

  public void setHate(List<String> hate) {
    this.hate = hate;
  }

  /**
   * The applied input type(s) for the category &#39;hate/threatening&#39;.
   * @return hateThreatening
   */
  public List<String> getHateThreatening() {
    return hateThreatening;
  }

  public void setHateThreatening(List<String> hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   * The applied input type(s) for the category &#39;harassment&#39;.
   * @return harassment
   */
  public List<String> getHarassment() {
    return harassment;
  }

  public void setHarassment(List<String> harassment) {
    this.harassment = harassment;
  }

  /**
   * The applied input type(s) for the category &#39;harassment/threatening&#39;.
   * @return harassmentThreatening
   */
  public List<String> getHarassmentThreatening() {
    return harassmentThreatening;
  }

  public void setHarassmentThreatening(List<String> harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  /**
   * The applied input type(s) for the category &#39;illicit&#39;.
   * @return illicit
   */
  public List<String> getIllicit() {
    return illicit;
  }

  public void setIllicit(List<String> illicit) {
    this.illicit = illicit;
  }

  /**
   * The applied input type(s) for the category &#39;illicit/violent&#39;.
   * @return illicitViolent
   */
  public List<String> getIllicitViolent() {
    return illicitViolent;
  }

  public void setIllicitViolent(List<String> illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

  /**
   * The applied input type(s) for the category &#39;self-harm&#39;.
   * @return selfHarm
   */
  public List<String> getSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(List<String> selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   * The applied input type(s) for the category &#39;self-harm/intent&#39;.
   * @return selfHarmIntent
   */
  public List<String> getSelfHarmIntent() {
    return selfHarmIntent;
  }

  public void setSelfHarmIntent(List<String> selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  /**
   * The applied input type(s) for the category &#39;self-harm/instructions&#39;.
   * @return selfHarmInstructions
   */
  public List<String> getSelfHarmInstructions() {
    return selfHarmInstructions;
  }

  public void setSelfHarmInstructions(List<String> selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  /**
   * The applied input type(s) for the category &#39;sexual&#39;.
   * @return sexual
   */
  public List<String> getSexual() {
    return sexual;
  }

  public void setSexual(List<String> sexual) {
    this.sexual = sexual;
  }

  /**
   * The applied input type(s) for the category &#39;sexual/minors&#39;.
   * @return sexualMinors
   */
  public List<String> getSexualMinors() {
    return sexualMinors;
  }

  public void setSexualMinors(List<String> sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   * The applied input type(s) for the category &#39;violence&#39;.
   * @return violence
   */
  public List<String> getViolence() {
    return violence;
  }

  public void setViolence(List<String> violence) {
    this.violence = violence;
  }

  /**
   * The applied input type(s) for the category &#39;violence/graphic&#39;.
   * @return violenceGraphic
   */
  public List<String> getViolenceGraphic() {
    return violenceGraphic;
  }

  public void setViolenceGraphic(List<String> violenceGraphic) {
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
    CreateModerationResponseResultsInnerCategoryAppliedInputTypes createModerationResponseResultsInnerCategoryAppliedInputTypes = (CreateModerationResponseResultsInnerCategoryAppliedInputTypes) o;
    return Objects.equals(this.hate, createModerationResponseResultsInnerCategoryAppliedInputTypes.hate) &&
        Objects.equals(this.hateThreatening, createModerationResponseResultsInnerCategoryAppliedInputTypes.hateThreatening) &&
        Objects.equals(this.harassment, createModerationResponseResultsInnerCategoryAppliedInputTypes.harassment) &&
        Objects.equals(this.harassmentThreatening, createModerationResponseResultsInnerCategoryAppliedInputTypes.harassmentThreatening) &&
        Objects.equals(this.illicit, createModerationResponseResultsInnerCategoryAppliedInputTypes.illicit) &&
        Objects.equals(this.illicitViolent, createModerationResponseResultsInnerCategoryAppliedInputTypes.illicitViolent) &&
        Objects.equals(this.selfHarm, createModerationResponseResultsInnerCategoryAppliedInputTypes.selfHarm) &&
        Objects.equals(this.selfHarmIntent, createModerationResponseResultsInnerCategoryAppliedInputTypes.selfHarmIntent) &&
        Objects.equals(this.selfHarmInstructions, createModerationResponseResultsInnerCategoryAppliedInputTypes.selfHarmInstructions) &&
        Objects.equals(this.sexual, createModerationResponseResultsInnerCategoryAppliedInputTypes.sexual) &&
        Objects.equals(this.sexualMinors, createModerationResponseResultsInnerCategoryAppliedInputTypes.sexualMinors) &&
        Objects.equals(this.violence, createModerationResponseResultsInnerCategoryAppliedInputTypes.violence) &&
        Objects.equals(this.violenceGraphic, createModerationResponseResultsInnerCategoryAppliedInputTypes.violenceGraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, harassment, harassmentThreatening, illicit, illicitViolent, selfHarm, selfHarmIntent, selfHarmInstructions, sexual, sexualMinors, violence, violenceGraphic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategoryAppliedInputTypes {\n");
    
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
