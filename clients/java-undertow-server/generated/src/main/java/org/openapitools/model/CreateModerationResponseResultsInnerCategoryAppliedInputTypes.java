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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * A list of the categories along with the input type(s) that the score applies to.
 */

@ApiModel(description = "A list of the categories along with the input type(s) that the score applies to.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  /**
   * The applied input type(s) for the category 'hate'.
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes hate(List<HateEnum> hate) {
    this.hate = hate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'hate'.")
  @JsonProperty("hate")
  public List<HateEnum> getHate() {
    return hate;
  }
  public void setHate(List<HateEnum> hate) {
    this.hate = hate;
  }

  /**
   * The applied input type(s) for the category 'hate/threatening'.
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes hateThreatening(List<HateThreateningEnum> hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'hate/threatening'.")
  @JsonProperty("hate/threatening")
  public List<HateThreateningEnum> getHateThreatening() {
    return hateThreatening;
  }
  public void setHateThreatening(List<HateThreateningEnum> hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   * The applied input type(s) for the category 'harassment'.
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes harassment(List<HarassmentEnum> harassment) {
    this.harassment = harassment;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'harassment'.")
  @JsonProperty("harassment")
  public List<HarassmentEnum> getHarassment() {
    return harassment;
  }
  public void setHarassment(List<HarassmentEnum> harassment) {
    this.harassment = harassment;
  }

  /**
   * The applied input type(s) for the category 'harassment/threatening'.
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes harassmentThreatening(List<HarassmentThreateningEnum> harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'harassment/threatening'.")
  @JsonProperty("harassment/threatening")
  public List<HarassmentThreateningEnum> getHarassmentThreatening() {
    return harassmentThreatening;
  }
  public void setHarassmentThreatening(List<HarassmentThreateningEnum> harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  /**
   * The applied input type(s) for the category 'illicit'.
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes illicit(List<IllicitEnum> illicit) {
    this.illicit = illicit;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'illicit'.")
  @JsonProperty("illicit")
  public List<IllicitEnum> getIllicit() {
    return illicit;
  }
  public void setIllicit(List<IllicitEnum> illicit) {
    this.illicit = illicit;
  }

  /**
   * The applied input type(s) for the category 'illicit/violent'.
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes illicitViolent(List<IllicitViolentEnum> illicitViolent) {
    this.illicitViolent = illicitViolent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'illicit/violent'.")
  @JsonProperty("illicit/violent")
  public List<IllicitViolentEnum> getIllicitViolent() {
    return illicitViolent;
  }
  public void setIllicitViolent(List<IllicitViolentEnum> illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

  /**
   * The applied input type(s) for the category 'self-harm'.
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes selfHarm(List<SelfHarmEnum> selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm'.")
  @JsonProperty("self-harm")
  public List<SelfHarmEnum> getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(List<SelfHarmEnum> selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   * The applied input type(s) for the category 'self-harm/intent'.
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes selfHarmIntent(List<SelfHarmIntentEnum> selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm/intent'.")
  @JsonProperty("self-harm/intent")
  public List<SelfHarmIntentEnum> getSelfHarmIntent() {
    return selfHarmIntent;
  }
  public void setSelfHarmIntent(List<SelfHarmIntentEnum> selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  /**
   * The applied input type(s) for the category 'self-harm/instructions'.
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes selfHarmInstructions(List<SelfHarmInstructionsEnum> selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm/instructions'.")
  @JsonProperty("self-harm/instructions")
  public List<SelfHarmInstructionsEnum> getSelfHarmInstructions() {
    return selfHarmInstructions;
  }
  public void setSelfHarmInstructions(List<SelfHarmInstructionsEnum> selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  /**
   * The applied input type(s) for the category 'sexual'.
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes sexual(List<SexualEnum> sexual) {
    this.sexual = sexual;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'sexual'.")
  @JsonProperty("sexual")
  public List<SexualEnum> getSexual() {
    return sexual;
  }
  public void setSexual(List<SexualEnum> sexual) {
    this.sexual = sexual;
  }

  /**
   * The applied input type(s) for the category 'sexual/minors'.
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes sexualMinors(List<SexualMinorsEnum> sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'sexual/minors'.")
  @JsonProperty("sexual/minors")
  public List<SexualMinorsEnum> getSexualMinors() {
    return sexualMinors;
  }
  public void setSexualMinors(List<SexualMinorsEnum> sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   * The applied input type(s) for the category 'violence'.
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes violence(List<ViolenceEnum> violence) {
    this.violence = violence;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'violence'.")
  @JsonProperty("violence")
  public List<ViolenceEnum> getViolence() {
    return violence;
  }
  public void setViolence(List<ViolenceEnum> violence) {
    this.violence = violence;
  }

  /**
   * The applied input type(s) for the category 'violence/graphic'.
   */
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes violenceGraphic(List<ViolenceGraphicEnum> violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'violence/graphic'.")
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

