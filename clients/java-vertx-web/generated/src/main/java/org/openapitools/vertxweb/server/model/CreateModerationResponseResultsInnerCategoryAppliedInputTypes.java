package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A list of the categories along with the input type(s) that the score applies to.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModerationResponseResultsInnerCategoryAppliedInputTypes   {
  


  public enum HateEnum {
    TEXT("text");

    private String value;

    HateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<HateEnum> hate = new ArrayList<>();


  public enum HateThreateningEnum {
    TEXT("text");

    private String value;

    HateThreateningEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<HateThreateningEnum> hateThreatening = new ArrayList<>();


  public enum HarassmentEnum {
    TEXT("text");

    private String value;

    HarassmentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<HarassmentEnum> harassment = new ArrayList<>();


  public enum HarassmentThreateningEnum {
    TEXT("text");

    private String value;

    HarassmentThreateningEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<HarassmentThreateningEnum> harassmentThreatening = new ArrayList<>();


  public enum IllicitEnum {
    TEXT("text");

    private String value;

    IllicitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<IllicitEnum> illicit = new ArrayList<>();


  public enum IllicitViolentEnum {
    TEXT("text");

    private String value;

    IllicitViolentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<IllicitViolentEnum> illicitViolent = new ArrayList<>();


  public enum SelfHarmEnum {
    TEXT("text"),
    IMAGE("image");

    private String value;

    SelfHarmEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<SelfHarmEnum> selfHarm = new ArrayList<>();


  public enum SelfHarmIntentEnum {
    TEXT("text"),
    IMAGE("image");

    private String value;

    SelfHarmIntentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<SelfHarmIntentEnum> selfHarmIntent = new ArrayList<>();


  public enum SelfHarmInstructionsEnum {
    TEXT("text"),
    IMAGE("image");

    private String value;

    SelfHarmInstructionsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<SelfHarmInstructionsEnum> selfHarmInstructions = new ArrayList<>();


  public enum SexualEnum {
    TEXT("text"),
    IMAGE("image");

    private String value;

    SexualEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<SexualEnum> sexual = new ArrayList<>();


  public enum SexualMinorsEnum {
    TEXT("text");

    private String value;

    SexualMinorsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<SexualMinorsEnum> sexualMinors = new ArrayList<>();


  public enum ViolenceEnum {
    TEXT("text"),
    IMAGE("image");

    private String value;

    ViolenceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<ViolenceEnum> violence = new ArrayList<>();


  public enum ViolenceGraphicEnum {
    TEXT("text"),
    IMAGE("image");

    private String value;

    ViolenceGraphicEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<ViolenceGraphicEnum> violenceGraphic = new ArrayList<>();

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes () {

  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes (List<HateEnum> hate, List<HateThreateningEnum> hateThreatening, List<HarassmentEnum> harassment, List<HarassmentThreateningEnum> harassmentThreatening, List<IllicitEnum> illicit, List<IllicitViolentEnum> illicitViolent, List<SelfHarmEnum> selfHarm, List<SelfHarmIntentEnum> selfHarmIntent, List<SelfHarmInstructionsEnum> selfHarmInstructions, List<SexualEnum> sexual, List<SexualMinorsEnum> sexualMinors, List<ViolenceEnum> violence, List<ViolenceGraphicEnum> violenceGraphic) {
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
  public List<HateEnum> getHate() {
    return hate;
  }
  public void setHate(List<HateEnum> hate) {
    this.hate = hate;
  }

    
  @JsonProperty("hate/threatening")
  public List<HateThreateningEnum> getHateThreatening() {
    return hateThreatening;
  }
  public void setHateThreatening(List<HateThreateningEnum> hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

    
  @JsonProperty("harassment")
  public List<HarassmentEnum> getHarassment() {
    return harassment;
  }
  public void setHarassment(List<HarassmentEnum> harassment) {
    this.harassment = harassment;
  }

    
  @JsonProperty("harassment/threatening")
  public List<HarassmentThreateningEnum> getHarassmentThreatening() {
    return harassmentThreatening;
  }
  public void setHarassmentThreatening(List<HarassmentThreateningEnum> harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

    
  @JsonProperty("illicit")
  public List<IllicitEnum> getIllicit() {
    return illicit;
  }
  public void setIllicit(List<IllicitEnum> illicit) {
    this.illicit = illicit;
  }

    
  @JsonProperty("illicit/violent")
  public List<IllicitViolentEnum> getIllicitViolent() {
    return illicitViolent;
  }
  public void setIllicitViolent(List<IllicitViolentEnum> illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

    
  @JsonProperty("self-harm")
  public List<SelfHarmEnum> getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(List<SelfHarmEnum> selfHarm) {
    this.selfHarm = selfHarm;
  }

    
  @JsonProperty("self-harm/intent")
  public List<SelfHarmIntentEnum> getSelfHarmIntent() {
    return selfHarmIntent;
  }
  public void setSelfHarmIntent(List<SelfHarmIntentEnum> selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

    
  @JsonProperty("self-harm/instructions")
  public List<SelfHarmInstructionsEnum> getSelfHarmInstructions() {
    return selfHarmInstructions;
  }
  public void setSelfHarmInstructions(List<SelfHarmInstructionsEnum> selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

    
  @JsonProperty("sexual")
  public List<SexualEnum> getSexual() {
    return sexual;
  }
  public void setSexual(List<SexualEnum> sexual) {
    this.sexual = sexual;
  }

    
  @JsonProperty("sexual/minors")
  public List<SexualMinorsEnum> getSexualMinors() {
    return sexualMinors;
  }
  public void setSexualMinors(List<SexualMinorsEnum> sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

    
  @JsonProperty("violence")
  public List<ViolenceEnum> getViolence() {
    return violence;
  }
  public void setViolence(List<ViolenceEnum> violence) {
    this.violence = violence;
  }

    
  @JsonProperty("violence/graphic")
  public List<ViolenceGraphicEnum> getViolenceGraphic() {
    return violenceGraphic;
  }
  public void setViolenceGraphic(List<ViolenceGraphicEnum> violenceGraphic) {
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
    return Objects.equals(hate, createModerationResponseResultsInnerCategoryAppliedInputTypes.hate) &&
        Objects.equals(hateThreatening, createModerationResponseResultsInnerCategoryAppliedInputTypes.hateThreatening) &&
        Objects.equals(harassment, createModerationResponseResultsInnerCategoryAppliedInputTypes.harassment) &&
        Objects.equals(harassmentThreatening, createModerationResponseResultsInnerCategoryAppliedInputTypes.harassmentThreatening) &&
        Objects.equals(illicit, createModerationResponseResultsInnerCategoryAppliedInputTypes.illicit) &&
        Objects.equals(illicitViolent, createModerationResponseResultsInnerCategoryAppliedInputTypes.illicitViolent) &&
        Objects.equals(selfHarm, createModerationResponseResultsInnerCategoryAppliedInputTypes.selfHarm) &&
        Objects.equals(selfHarmIntent, createModerationResponseResultsInnerCategoryAppliedInputTypes.selfHarmIntent) &&
        Objects.equals(selfHarmInstructions, createModerationResponseResultsInnerCategoryAppliedInputTypes.selfHarmInstructions) &&
        Objects.equals(sexual, createModerationResponseResultsInnerCategoryAppliedInputTypes.sexual) &&
        Objects.equals(sexualMinors, createModerationResponseResultsInnerCategoryAppliedInputTypes.sexualMinors) &&
        Objects.equals(violence, createModerationResponseResultsInnerCategoryAppliedInputTypes.violence) &&
        Objects.equals(violenceGraphic, createModerationResponseResultsInnerCategoryAppliedInputTypes.violenceGraphic);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
