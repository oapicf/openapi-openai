package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A list of the categories along with the input type(s) that the score applies to.
 */
@ApiModel(description="A list of the categories along with the input type(s) that the score applies to.")

public class CreateModerationResponseResultsInnerCategoryAppliedInputTypes  {
  
public enum HateEnum {

TEXT(String.valueOf("text"));


    private String value;

    HateEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static HateEnum fromValue(String value) {
        for (HateEnum b : HateEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The applied input type(s) for the category 'hate'.
  */
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'hate'.")

  private List<HateEnum> hate = new ArrayList<>();

public enum HateThreateningEnum {

TEXT(String.valueOf("text"));


    private String value;

    HateThreateningEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static HateThreateningEnum fromValue(String value) {
        for (HateThreateningEnum b : HateThreateningEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The applied input type(s) for the category 'hate/threatening'.
  */
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'hate/threatening'.")

  private List<HateThreateningEnum> hateThreatening = new ArrayList<>();

public enum HarassmentEnum {

TEXT(String.valueOf("text"));


    private String value;

    HarassmentEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static HarassmentEnum fromValue(String value) {
        for (HarassmentEnum b : HarassmentEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The applied input type(s) for the category 'harassment'.
  */
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'harassment'.")

  private List<HarassmentEnum> harassment = new ArrayList<>();

public enum HarassmentThreateningEnum {

TEXT(String.valueOf("text"));


    private String value;

    HarassmentThreateningEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static HarassmentThreateningEnum fromValue(String value) {
        for (HarassmentThreateningEnum b : HarassmentThreateningEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The applied input type(s) for the category 'harassment/threatening'.
  */
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'harassment/threatening'.")

  private List<HarassmentThreateningEnum> harassmentThreatening = new ArrayList<>();

public enum IllicitEnum {

TEXT(String.valueOf("text"));


    private String value;

    IllicitEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IllicitEnum fromValue(String value) {
        for (IllicitEnum b : IllicitEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The applied input type(s) for the category 'illicit'.
  */
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'illicit'.")

  private List<IllicitEnum> illicit = new ArrayList<>();

public enum IllicitViolentEnum {

TEXT(String.valueOf("text"));


    private String value;

    IllicitViolentEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IllicitViolentEnum fromValue(String value) {
        for (IllicitViolentEnum b : IllicitViolentEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The applied input type(s) for the category 'illicit/violent'.
  */
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'illicit/violent'.")

  private List<IllicitViolentEnum> illicitViolent = new ArrayList<>();

public enum SelfHarmEnum {

TEXT(String.valueOf("text")), IMAGE(String.valueOf("image"));


    private String value;

    SelfHarmEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SelfHarmEnum fromValue(String value) {
        for (SelfHarmEnum b : SelfHarmEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The applied input type(s) for the category 'self-harm'.
  */
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm'.")

  private List<SelfHarmEnum> selfHarm = new ArrayList<>();

public enum SelfHarmIntentEnum {

TEXT(String.valueOf("text")), IMAGE(String.valueOf("image"));


    private String value;

    SelfHarmIntentEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SelfHarmIntentEnum fromValue(String value) {
        for (SelfHarmIntentEnum b : SelfHarmIntentEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The applied input type(s) for the category 'self-harm/intent'.
  */
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm/intent'.")

  private List<SelfHarmIntentEnum> selfHarmIntent = new ArrayList<>();

public enum SelfHarmInstructionsEnum {

TEXT(String.valueOf("text")), IMAGE(String.valueOf("image"));


    private String value;

    SelfHarmInstructionsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SelfHarmInstructionsEnum fromValue(String value) {
        for (SelfHarmInstructionsEnum b : SelfHarmInstructionsEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The applied input type(s) for the category 'self-harm/instructions'.
  */
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm/instructions'.")

  private List<SelfHarmInstructionsEnum> selfHarmInstructions = new ArrayList<>();

public enum SexualEnum {

TEXT(String.valueOf("text")), IMAGE(String.valueOf("image"));


    private String value;

    SexualEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SexualEnum fromValue(String value) {
        for (SexualEnum b : SexualEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The applied input type(s) for the category 'sexual'.
  */
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'sexual'.")

  private List<SexualEnum> sexual = new ArrayList<>();

public enum SexualMinorsEnum {

TEXT(String.valueOf("text"));


    private String value;

    SexualMinorsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SexualMinorsEnum fromValue(String value) {
        for (SexualMinorsEnum b : SexualMinorsEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The applied input type(s) for the category 'sexual/minors'.
  */
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'sexual/minors'.")

  private List<SexualMinorsEnum> sexualMinors = new ArrayList<>();

public enum ViolenceEnum {

TEXT(String.valueOf("text")), IMAGE(String.valueOf("image"));


    private String value;

    ViolenceEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ViolenceEnum fromValue(String value) {
        for (ViolenceEnum b : ViolenceEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The applied input type(s) for the category 'violence'.
  */
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'violence'.")

  private List<ViolenceEnum> violence = new ArrayList<>();

public enum ViolenceGraphicEnum {

TEXT(String.valueOf("text")), IMAGE(String.valueOf("image"));


    private String value;

    ViolenceGraphicEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ViolenceGraphicEnum fromValue(String value) {
        for (ViolenceGraphicEnum b : ViolenceGraphicEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The applied input type(s) for the category 'violence/graphic'.
  */
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'violence/graphic'.")

  private List<ViolenceGraphicEnum> violenceGraphic = new ArrayList<>();
 /**
   * The applied input type(s) for the category &#39;hate&#39;.
   * @return hate
  **/
  @JsonProperty("hate")
  public List<HateEnum> getHate() {
    return hate;
  }

  public void setHate(List<HateEnum> hate) {
    this.hate = hate;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes hate(List<HateEnum> hate) {
    this.hate = hate;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addHateItem(HateEnum hateItem) {
    this.hate.add(hateItem);
    return this;
  }

 /**
   * The applied input type(s) for the category &#39;hate/threatening&#39;.
   * @return hateThreatening
  **/
  @JsonProperty("hate/threatening")
  public List<HateThreateningEnum> getHateThreatening() {
    return hateThreatening;
  }

  public void setHateThreatening(List<HateThreateningEnum> hateThreatening) {
    this.hateThreatening = hateThreatening;
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
   * The applied input type(s) for the category &#39;harassment&#39;.
   * @return harassment
  **/
  @JsonProperty("harassment")
  public List<HarassmentEnum> getHarassment() {
    return harassment;
  }

  public void setHarassment(List<HarassmentEnum> harassment) {
    this.harassment = harassment;
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
   * The applied input type(s) for the category &#39;harassment/threatening&#39;.
   * @return harassmentThreatening
  **/
  @JsonProperty("harassment/threatening")
  public List<HarassmentThreateningEnum> getHarassmentThreatening() {
    return harassmentThreatening;
  }

  public void setHarassmentThreatening(List<HarassmentThreateningEnum> harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
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
   * The applied input type(s) for the category &#39;illicit&#39;.
   * @return illicit
  **/
  @JsonProperty("illicit")
  public List<IllicitEnum> getIllicit() {
    return illicit;
  }

  public void setIllicit(List<IllicitEnum> illicit) {
    this.illicit = illicit;
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
   * The applied input type(s) for the category &#39;illicit/violent&#39;.
   * @return illicitViolent
  **/
  @JsonProperty("illicit/violent")
  public List<IllicitViolentEnum> getIllicitViolent() {
    return illicitViolent;
  }

  public void setIllicitViolent(List<IllicitViolentEnum> illicitViolent) {
    this.illicitViolent = illicitViolent;
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
   * The applied input type(s) for the category &#39;self-harm&#39;.
   * @return selfHarm
  **/
  @JsonProperty("self-harm")
  public List<SelfHarmEnum> getSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(List<SelfHarmEnum> selfHarm) {
    this.selfHarm = selfHarm;
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
   * The applied input type(s) for the category &#39;self-harm/intent&#39;.
   * @return selfHarmIntent
  **/
  @JsonProperty("self-harm/intent")
  public List<SelfHarmIntentEnum> getSelfHarmIntent() {
    return selfHarmIntent;
  }

  public void setSelfHarmIntent(List<SelfHarmIntentEnum> selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
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
   * The applied input type(s) for the category &#39;self-harm/instructions&#39;.
   * @return selfHarmInstructions
  **/
  @JsonProperty("self-harm/instructions")
  public List<SelfHarmInstructionsEnum> getSelfHarmInstructions() {
    return selfHarmInstructions;
  }

  public void setSelfHarmInstructions(List<SelfHarmInstructionsEnum> selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
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
   * The applied input type(s) for the category &#39;sexual&#39;.
   * @return sexual
  **/
  @JsonProperty("sexual")
  public List<SexualEnum> getSexual() {
    return sexual;
  }

  public void setSexual(List<SexualEnum> sexual) {
    this.sexual = sexual;
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
   * The applied input type(s) for the category &#39;sexual/minors&#39;.
   * @return sexualMinors
  **/
  @JsonProperty("sexual/minors")
  public List<SexualMinorsEnum> getSexualMinors() {
    return sexualMinors;
  }

  public void setSexualMinors(List<SexualMinorsEnum> sexualMinors) {
    this.sexualMinors = sexualMinors;
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
   * The applied input type(s) for the category &#39;violence&#39;.
   * @return violence
  **/
  @JsonProperty("violence")
  public List<ViolenceEnum> getViolence() {
    return violence;
  }

  public void setViolence(List<ViolenceEnum> violence) {
    this.violence = violence;
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
   * The applied input type(s) for the category &#39;violence/graphic&#39;.
   * @return violenceGraphic
  **/
  @JsonProperty("violence/graphic")
  public List<ViolenceGraphicEnum> getViolenceGraphic() {
    return violenceGraphic;
  }

  public void setViolenceGraphic(List<ViolenceGraphicEnum> violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes violenceGraphic(List<ViolenceGraphicEnum> violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addViolenceGraphicItem(ViolenceGraphicEnum violenceGraphicItem) {
    this.violenceGraphic.add(violenceGraphicItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

