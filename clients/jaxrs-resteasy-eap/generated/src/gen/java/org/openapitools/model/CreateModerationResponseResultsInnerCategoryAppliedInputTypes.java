package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="A list of the categories along with the input type(s) that the score applies to.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateModerationResponseResultsInnerCategoryAppliedInputTypes   {
  

  /**
   * Gets or Sets hate
   */
  public enum HateEnum {
    TEXT("text");
    private String value;

    HateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<HateEnum> hate = new ArrayList<>();

  /**
   * Gets or Sets hateThreatening
   */
  public enum HateThreateningEnum {
    TEXT("text");
    private String value;

    HateThreateningEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<HateThreateningEnum> hateThreatening = new ArrayList<>();

  /**
   * Gets or Sets harassment
   */
  public enum HarassmentEnum {
    TEXT("text");
    private String value;

    HarassmentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<HarassmentEnum> harassment = new ArrayList<>();

  /**
   * Gets or Sets harassmentThreatening
   */
  public enum HarassmentThreateningEnum {
    TEXT("text");
    private String value;

    HarassmentThreateningEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<HarassmentThreateningEnum> harassmentThreatening = new ArrayList<>();

  /**
   * Gets or Sets illicit
   */
  public enum IllicitEnum {
    TEXT("text");
    private String value;

    IllicitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<IllicitEnum> illicit = new ArrayList<>();

  /**
   * Gets or Sets illicitViolent
   */
  public enum IllicitViolentEnum {
    TEXT("text");
    private String value;

    IllicitViolentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<IllicitViolentEnum> illicitViolent = new ArrayList<>();

  /**
   * Gets or Sets selfHarm
   */
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
      return String.valueOf(value);
    }
  }

  private List<SelfHarmEnum> selfHarm = new ArrayList<>();

  /**
   * Gets or Sets selfHarmIntent
   */
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
      return String.valueOf(value);
    }
  }

  private List<SelfHarmIntentEnum> selfHarmIntent = new ArrayList<>();

  /**
   * Gets or Sets selfHarmInstructions
   */
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
      return String.valueOf(value);
    }
  }

  private List<SelfHarmInstructionsEnum> selfHarmInstructions = new ArrayList<>();

  /**
   * Gets or Sets sexual
   */
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
      return String.valueOf(value);
    }
  }

  private List<SexualEnum> sexual = new ArrayList<>();

  /**
   * Gets or Sets sexualMinors
   */
  public enum SexualMinorsEnum {
    TEXT("text");
    private String value;

    SexualMinorsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<SexualMinorsEnum> sexualMinors = new ArrayList<>();

  /**
   * Gets or Sets violence
   */
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
      return String.valueOf(value);
    }
  }

  private List<ViolenceEnum> violence = new ArrayList<>();

  /**
   * Gets or Sets violenceGraphic
   */
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
      return String.valueOf(value);
    }
  }

  private List<ViolenceGraphicEnum> violenceGraphic = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;hate&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'hate'.")
  @JsonProperty("hate")
  @NotNull
  public List<HateEnum> getHate() {
    return hate;
  }
  public void setHate(List<HateEnum> hate) {
    this.hate = hate;
  }

  /**
   * The applied input type(s) for the category &#39;hate/threatening&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'hate/threatening'.")
  @JsonProperty("hate/threatening")
  @NotNull
  public List<HateThreateningEnum> getHateThreatening() {
    return hateThreatening;
  }
  public void setHateThreatening(List<HateThreateningEnum> hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  /**
   * The applied input type(s) for the category &#39;harassment&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'harassment'.")
  @JsonProperty("harassment")
  @NotNull
  public List<HarassmentEnum> getHarassment() {
    return harassment;
  }
  public void setHarassment(List<HarassmentEnum> harassment) {
    this.harassment = harassment;
  }

  /**
   * The applied input type(s) for the category &#39;harassment/threatening&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'harassment/threatening'.")
  @JsonProperty("harassment/threatening")
  @NotNull
  public List<HarassmentThreateningEnum> getHarassmentThreatening() {
    return harassmentThreatening;
  }
  public void setHarassmentThreatening(List<HarassmentThreateningEnum> harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  /**
   * The applied input type(s) for the category &#39;illicit&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'illicit'.")
  @JsonProperty("illicit")
  @NotNull
  public List<IllicitEnum> getIllicit() {
    return illicit;
  }
  public void setIllicit(List<IllicitEnum> illicit) {
    this.illicit = illicit;
  }

  /**
   * The applied input type(s) for the category &#39;illicit/violent&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'illicit/violent'.")
  @JsonProperty("illicit/violent")
  @NotNull
  public List<IllicitViolentEnum> getIllicitViolent() {
    return illicitViolent;
  }
  public void setIllicitViolent(List<IllicitViolentEnum> illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

  /**
   * The applied input type(s) for the category &#39;self-harm&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm'.")
  @JsonProperty("self-harm")
  @NotNull
  public List<SelfHarmEnum> getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(List<SelfHarmEnum> selfHarm) {
    this.selfHarm = selfHarm;
  }

  /**
   * The applied input type(s) for the category &#39;self-harm/intent&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm/intent'.")
  @JsonProperty("self-harm/intent")
  @NotNull
  public List<SelfHarmIntentEnum> getSelfHarmIntent() {
    return selfHarmIntent;
  }
  public void setSelfHarmIntent(List<SelfHarmIntentEnum> selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  /**
   * The applied input type(s) for the category &#39;self-harm/instructions&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm/instructions'.")
  @JsonProperty("self-harm/instructions")
  @NotNull
  public List<SelfHarmInstructionsEnum> getSelfHarmInstructions() {
    return selfHarmInstructions;
  }
  public void setSelfHarmInstructions(List<SelfHarmInstructionsEnum> selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  /**
   * The applied input type(s) for the category &#39;sexual&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'sexual'.")
  @JsonProperty("sexual")
  @NotNull
  public List<SexualEnum> getSexual() {
    return sexual;
  }
  public void setSexual(List<SexualEnum> sexual) {
    this.sexual = sexual;
  }

  /**
   * The applied input type(s) for the category &#39;sexual/minors&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'sexual/minors'.")
  @JsonProperty("sexual/minors")
  @NotNull
  public List<SexualMinorsEnum> getSexualMinors() {
    return sexualMinors;
  }
  public void setSexualMinors(List<SexualMinorsEnum> sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  /**
   * The applied input type(s) for the category &#39;violence&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'violence'.")
  @JsonProperty("violence")
  @NotNull
  public List<ViolenceEnum> getViolence() {
    return violence;
  }
  public void setViolence(List<ViolenceEnum> violence) {
    this.violence = violence;
  }

  /**
   * The applied input type(s) for the category &#39;violence/graphic&#39;.
   **/
  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'violence/graphic'.")
  @JsonProperty("violence/graphic")
  @NotNull
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

