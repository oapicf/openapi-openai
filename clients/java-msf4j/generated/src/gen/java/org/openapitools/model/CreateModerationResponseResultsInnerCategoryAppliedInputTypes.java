package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

    @JsonCreator
    public static HateEnum fromValue(String text) {
      for (HateEnum b : HateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("hate")
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

    @JsonCreator
    public static HateThreateningEnum fromValue(String text) {
      for (HateThreateningEnum b : HateThreateningEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("hate/threatening")
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

    @JsonCreator
    public static HarassmentEnum fromValue(String text) {
      for (HarassmentEnum b : HarassmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("harassment")
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

    @JsonCreator
    public static HarassmentThreateningEnum fromValue(String text) {
      for (HarassmentThreateningEnum b : HarassmentThreateningEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("harassment/threatening")
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

    @JsonCreator
    public static IllicitEnum fromValue(String text) {
      for (IllicitEnum b : IllicitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("illicit")
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

    @JsonCreator
    public static IllicitViolentEnum fromValue(String text) {
      for (IllicitViolentEnum b : IllicitViolentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("illicit/violent")
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

    @JsonCreator
    public static SelfHarmEnum fromValue(String text) {
      for (SelfHarmEnum b : SelfHarmEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("self-harm")
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

    @JsonCreator
    public static SelfHarmIntentEnum fromValue(String text) {
      for (SelfHarmIntentEnum b : SelfHarmIntentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("self-harm/intent")
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

    @JsonCreator
    public static SelfHarmInstructionsEnum fromValue(String text) {
      for (SelfHarmInstructionsEnum b : SelfHarmInstructionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("self-harm/instructions")
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

    @JsonCreator
    public static SexualEnum fromValue(String text) {
      for (SexualEnum b : SexualEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("sexual")
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

    @JsonCreator
    public static SexualMinorsEnum fromValue(String text) {
      for (SexualMinorsEnum b : SexualMinorsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("sexual/minors")
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

    @JsonCreator
    public static ViolenceEnum fromValue(String text) {
      for (ViolenceEnum b : ViolenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("violence")
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

    @JsonCreator
    public static ViolenceGraphicEnum fromValue(String text) {
      for (ViolenceGraphicEnum b : ViolenceGraphicEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("violence/graphic")
  private List<ViolenceGraphicEnum> violenceGraphic = new ArrayList<>();

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes hate(List<HateEnum> hate) {
    this.hate = hate;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addHateItem(HateEnum hateItem) {
    this.hate.add(hateItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'hate'.
   * @return hate
  **/
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'hate'.")
  public List<HateEnum> getHate() {
    return hate;
  }

  public void setHate(List<HateEnum> hate) {
    this.hate = hate;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes hateThreatening(List<HateThreateningEnum> hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addHateThreateningItem(HateThreateningEnum hateThreateningItem) {
    this.hateThreatening.add(hateThreateningItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'hate/threatening'.
   * @return hateThreatening
  **/
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'hate/threatening'.")
  public List<HateThreateningEnum> getHateThreatening() {
    return hateThreatening;
  }

  public void setHateThreatening(List<HateThreateningEnum> hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes harassment(List<HarassmentEnum> harassment) {
    this.harassment = harassment;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addHarassmentItem(HarassmentEnum harassmentItem) {
    this.harassment.add(harassmentItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'harassment'.
   * @return harassment
  **/
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'harassment'.")
  public List<HarassmentEnum> getHarassment() {
    return harassment;
  }

  public void setHarassment(List<HarassmentEnum> harassment) {
    this.harassment = harassment;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes harassmentThreatening(List<HarassmentThreateningEnum> harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addHarassmentThreateningItem(HarassmentThreateningEnum harassmentThreateningItem) {
    this.harassmentThreatening.add(harassmentThreateningItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'harassment/threatening'.
   * @return harassmentThreatening
  **/
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'harassment/threatening'.")
  public List<HarassmentThreateningEnum> getHarassmentThreatening() {
    return harassmentThreatening;
  }

  public void setHarassmentThreatening(List<HarassmentThreateningEnum> harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes illicit(List<IllicitEnum> illicit) {
    this.illicit = illicit;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addIllicitItem(IllicitEnum illicitItem) {
    this.illicit.add(illicitItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'illicit'.
   * @return illicit
  **/
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'illicit'.")
  public List<IllicitEnum> getIllicit() {
    return illicit;
  }

  public void setIllicit(List<IllicitEnum> illicit) {
    this.illicit = illicit;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes illicitViolent(List<IllicitViolentEnum> illicitViolent) {
    this.illicitViolent = illicitViolent;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addIllicitViolentItem(IllicitViolentEnum illicitViolentItem) {
    this.illicitViolent.add(illicitViolentItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'illicit/violent'.
   * @return illicitViolent
  **/
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'illicit/violent'.")
  public List<IllicitViolentEnum> getIllicitViolent() {
    return illicitViolent;
  }

  public void setIllicitViolent(List<IllicitViolentEnum> illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes selfHarm(List<SelfHarmEnum> selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addSelfHarmItem(SelfHarmEnum selfHarmItem) {
    this.selfHarm.add(selfHarmItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'self-harm'.
   * @return selfHarm
  **/
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm'.")
  public List<SelfHarmEnum> getSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(List<SelfHarmEnum> selfHarm) {
    this.selfHarm = selfHarm;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes selfHarmIntent(List<SelfHarmIntentEnum> selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addSelfHarmIntentItem(SelfHarmIntentEnum selfHarmIntentItem) {
    this.selfHarmIntent.add(selfHarmIntentItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'self-harm/intent'.
   * @return selfHarmIntent
  **/
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm/intent'.")
  public List<SelfHarmIntentEnum> getSelfHarmIntent() {
    return selfHarmIntent;
  }

  public void setSelfHarmIntent(List<SelfHarmIntentEnum> selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes selfHarmInstructions(List<SelfHarmInstructionsEnum> selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addSelfHarmInstructionsItem(SelfHarmInstructionsEnum selfHarmInstructionsItem) {
    this.selfHarmInstructions.add(selfHarmInstructionsItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'self-harm/instructions'.
   * @return selfHarmInstructions
  **/
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm/instructions'.")
  public List<SelfHarmInstructionsEnum> getSelfHarmInstructions() {
    return selfHarmInstructions;
  }

  public void setSelfHarmInstructions(List<SelfHarmInstructionsEnum> selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes sexual(List<SexualEnum> sexual) {
    this.sexual = sexual;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addSexualItem(SexualEnum sexualItem) {
    this.sexual.add(sexualItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'sexual'.
   * @return sexual
  **/
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'sexual'.")
  public List<SexualEnum> getSexual() {
    return sexual;
  }

  public void setSexual(List<SexualEnum> sexual) {
    this.sexual = sexual;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes sexualMinors(List<SexualMinorsEnum> sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addSexualMinorsItem(SexualMinorsEnum sexualMinorsItem) {
    this.sexualMinors.add(sexualMinorsItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'sexual/minors'.
   * @return sexualMinors
  **/
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'sexual/minors'.")
  public List<SexualMinorsEnum> getSexualMinors() {
    return sexualMinors;
  }

  public void setSexualMinors(List<SexualMinorsEnum> sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes violence(List<ViolenceEnum> violence) {
    this.violence = violence;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addViolenceItem(ViolenceEnum violenceItem) {
    this.violence.add(violenceItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'violence'.
   * @return violence
  **/
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'violence'.")
  public List<ViolenceEnum> getViolence() {
    return violence;
  }

  public void setViolence(List<ViolenceEnum> violence) {
    this.violence = violence;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes violenceGraphic(List<ViolenceGraphicEnum> violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addViolenceGraphicItem(ViolenceGraphicEnum violenceGraphicItem) {
    this.violenceGraphic.add(violenceGraphicItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'violence/graphic'.
   * @return violenceGraphic
  **/
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'violence/graphic'.")
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

