package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A list of the categories along with the input type(s) that the score applies to.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateModerationResponseResultsInnerCategoryAppliedInputTypes   {
  /**
   * Gets or Sets hate
   */
  public enum HateEnum {
    TEXT("text");

    private final String value;

    HateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HateEnum fromValue(String value) {
      for (HateEnum b : HateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("hate")
  @NotNull

  private List<HateEnum> hate = new ArrayList<>();

  /**
   * Gets or Sets hateThreatening
   */
  public enum HateThreateningEnum {
    TEXT("text");

    private final String value;

    HateThreateningEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HateThreateningEnum fromValue(String value) {
      for (HateThreateningEnum b : HateThreateningEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("hate/threatening")
  @NotNull

  private List<HateThreateningEnum> hateThreatening = new ArrayList<>();

  /**
   * Gets or Sets harassment
   */
  public enum HarassmentEnum {
    TEXT("text");

    private final String value;

    HarassmentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HarassmentEnum fromValue(String value) {
      for (HarassmentEnum b : HarassmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("harassment")
  @NotNull

  private List<HarassmentEnum> harassment = new ArrayList<>();

  /**
   * Gets or Sets harassmentThreatening
   */
  public enum HarassmentThreateningEnum {
    TEXT("text");

    private final String value;

    HarassmentThreateningEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HarassmentThreateningEnum fromValue(String value) {
      for (HarassmentThreateningEnum b : HarassmentThreateningEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("harassment/threatening")
  @NotNull

  private List<HarassmentThreateningEnum> harassmentThreatening = new ArrayList<>();

  /**
   * Gets or Sets illicit
   */
  public enum IllicitEnum {
    TEXT("text");

    private final String value;

    IllicitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IllicitEnum fromValue(String value) {
      for (IllicitEnum b : IllicitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("illicit")
  @NotNull

  private List<IllicitEnum> illicit = new ArrayList<>();

  /**
   * Gets or Sets illicitViolent
   */
  public enum IllicitViolentEnum {
    TEXT("text");

    private final String value;

    IllicitViolentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IllicitViolentEnum fromValue(String value) {
      for (IllicitViolentEnum b : IllicitViolentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("illicit/violent")
  @NotNull

  private List<IllicitViolentEnum> illicitViolent = new ArrayList<>();

  /**
   * Gets or Sets selfHarm
   */
  public enum SelfHarmEnum {
    TEXT("text"),
    
    IMAGE("image");

    private final String value;

    SelfHarmEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SelfHarmEnum fromValue(String value) {
      for (SelfHarmEnum b : SelfHarmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("self-harm")
  @NotNull

  private List<SelfHarmEnum> selfHarm = new ArrayList<>();

  /**
   * Gets or Sets selfHarmIntent
   */
  public enum SelfHarmIntentEnum {
    TEXT("text"),
    
    IMAGE("image");

    private final String value;

    SelfHarmIntentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SelfHarmIntentEnum fromValue(String value) {
      for (SelfHarmIntentEnum b : SelfHarmIntentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("self-harm/intent")
  @NotNull

  private List<SelfHarmIntentEnum> selfHarmIntent = new ArrayList<>();

  /**
   * Gets or Sets selfHarmInstructions
   */
  public enum SelfHarmInstructionsEnum {
    TEXT("text"),
    
    IMAGE("image");

    private final String value;

    SelfHarmInstructionsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SelfHarmInstructionsEnum fromValue(String value) {
      for (SelfHarmInstructionsEnum b : SelfHarmInstructionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("self-harm/instructions")
  @NotNull

  private List<SelfHarmInstructionsEnum> selfHarmInstructions = new ArrayList<>();

  /**
   * Gets or Sets sexual
   */
  public enum SexualEnum {
    TEXT("text"),
    
    IMAGE("image");

    private final String value;

    SexualEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SexualEnum fromValue(String value) {
      for (SexualEnum b : SexualEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("sexual")
  @NotNull

  private List<SexualEnum> sexual = new ArrayList<>();

  /**
   * Gets or Sets sexualMinors
   */
  public enum SexualMinorsEnum {
    TEXT("text");

    private final String value;

    SexualMinorsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SexualMinorsEnum fromValue(String value) {
      for (SexualMinorsEnum b : SexualMinorsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("sexual/minors")
  @NotNull

  private List<SexualMinorsEnum> sexualMinors = new ArrayList<>();

  /**
   * Gets or Sets violence
   */
  public enum ViolenceEnum {
    TEXT("text"),
    
    IMAGE("image");

    private final String value;

    ViolenceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ViolenceEnum fromValue(String value) {
      for (ViolenceEnum b : ViolenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("violence")
  @NotNull

  private List<ViolenceEnum> violence = new ArrayList<>();

  /**
   * Gets or Sets violenceGraphic
   */
  public enum ViolenceGraphicEnum {
    TEXT("text"),
    
    IMAGE("image");

    private final String value;

    ViolenceGraphicEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ViolenceGraphicEnum fromValue(String value) {
      for (ViolenceGraphicEnum b : ViolenceGraphicEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("violence/graphic")
  @NotNull

  private List<ViolenceGraphicEnum> violenceGraphic = new ArrayList<>();

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes hate(List<HateEnum> hate) {
    this.hate = hate;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addHateItem(HateEnum hateItem) {
    if (this.hate == null) {
      this.hate = new ArrayList<>();
    }
    this.hate.add(hateItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'hate'.
   * @return hate
  **/
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
    if (this.hateThreatening == null) {
      this.hateThreatening = new ArrayList<>();
    }
    this.hateThreatening.add(hateThreateningItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'hate/threatening'.
   * @return hateThreatening
  **/
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
    if (this.harassment == null) {
      this.harassment = new ArrayList<>();
    }
    this.harassment.add(harassmentItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'harassment'.
   * @return harassment
  **/
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
    if (this.harassmentThreatening == null) {
      this.harassmentThreatening = new ArrayList<>();
    }
    this.harassmentThreatening.add(harassmentThreateningItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'harassment/threatening'.
   * @return harassmentThreatening
  **/
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
    if (this.illicit == null) {
      this.illicit = new ArrayList<>();
    }
    this.illicit.add(illicitItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'illicit'.
   * @return illicit
  **/
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
    if (this.illicitViolent == null) {
      this.illicitViolent = new ArrayList<>();
    }
    this.illicitViolent.add(illicitViolentItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'illicit/violent'.
   * @return illicitViolent
  **/
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
    if (this.selfHarm == null) {
      this.selfHarm = new ArrayList<>();
    }
    this.selfHarm.add(selfHarmItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'self-harm'.
   * @return selfHarm
  **/
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
    if (this.selfHarmIntent == null) {
      this.selfHarmIntent = new ArrayList<>();
    }
    this.selfHarmIntent.add(selfHarmIntentItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'self-harm/intent'.
   * @return selfHarmIntent
  **/
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
    if (this.selfHarmInstructions == null) {
      this.selfHarmInstructions = new ArrayList<>();
    }
    this.selfHarmInstructions.add(selfHarmInstructionsItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'self-harm/instructions'.
   * @return selfHarmInstructions
  **/
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
    if (this.sexual == null) {
      this.sexual = new ArrayList<>();
    }
    this.sexual.add(sexualItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'sexual'.
   * @return sexual
  **/
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
    if (this.sexualMinors == null) {
      this.sexualMinors = new ArrayList<>();
    }
    this.sexualMinors.add(sexualMinorsItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'sexual/minors'.
   * @return sexualMinors
  **/
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
    if (this.violence == null) {
      this.violence = new ArrayList<>();
    }
    this.violence.add(violenceItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'violence'.
   * @return violence
  **/
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
    if (this.violenceGraphic == null) {
      this.violenceGraphic = new ArrayList<>();
    }
    this.violenceGraphic.add(violenceGraphicItem);
    return this;
  }

   /**
   * The applied input type(s) for the category 'violence/graphic'.
   * @return violenceGraphic
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

