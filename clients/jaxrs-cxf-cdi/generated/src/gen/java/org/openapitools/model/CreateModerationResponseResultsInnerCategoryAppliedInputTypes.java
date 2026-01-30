package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A list of the categories along with the input type(s) that the score applies to.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "A list of the categories along with the input type(s) that the score applies to.")
public class CreateModerationResponseResultsInnerCategoryAppliedInputTypes   {
  

public enum HateEnum {

    @JsonProperty("text") TEXT(String.valueOf("text"));


    private String value;

    HateEnum(String v) {
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

  private List<HateEnum> hate = new ArrayList<>();


public enum HateThreateningEnum {

    @JsonProperty("text") TEXT(String.valueOf("text"));


    private String value;

    HateThreateningEnum(String v) {
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

  private List<HateThreateningEnum> hateThreatening = new ArrayList<>();


public enum HarassmentEnum {

    @JsonProperty("text") TEXT(String.valueOf("text"));


    private String value;

    HarassmentEnum(String v) {
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

  private List<HarassmentEnum> harassment = new ArrayList<>();


public enum HarassmentThreateningEnum {

    @JsonProperty("text") TEXT(String.valueOf("text"));


    private String value;

    HarassmentThreateningEnum(String v) {
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

  private List<HarassmentThreateningEnum> harassmentThreatening = new ArrayList<>();


public enum IllicitEnum {

    @JsonProperty("text") TEXT(String.valueOf("text"));


    private String value;

    IllicitEnum(String v) {
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

  private List<IllicitEnum> illicit = new ArrayList<>();


public enum IllicitViolentEnum {

    @JsonProperty("text") TEXT(String.valueOf("text"));


    private String value;

    IllicitViolentEnum(String v) {
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

  private List<IllicitViolentEnum> illicitViolent = new ArrayList<>();


public enum SelfHarmEnum {

    @JsonProperty("text") TEXT(String.valueOf("text")), @JsonProperty("image") IMAGE(String.valueOf("image"));


    private String value;

    SelfHarmEnum(String v) {
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

  private List<SelfHarmEnum> selfHarm = new ArrayList<>();


public enum SelfHarmIntentEnum {

    @JsonProperty("text") TEXT(String.valueOf("text")), @JsonProperty("image") IMAGE(String.valueOf("image"));


    private String value;

    SelfHarmIntentEnum(String v) {
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

  private List<SelfHarmIntentEnum> selfHarmIntent = new ArrayList<>();


public enum SelfHarmInstructionsEnum {

    @JsonProperty("text") TEXT(String.valueOf("text")), @JsonProperty("image") IMAGE(String.valueOf("image"));


    private String value;

    SelfHarmInstructionsEnum(String v) {
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

  private List<SelfHarmInstructionsEnum> selfHarmInstructions = new ArrayList<>();


public enum SexualEnum {

    @JsonProperty("text") TEXT(String.valueOf("text")), @JsonProperty("image") IMAGE(String.valueOf("image"));


    private String value;

    SexualEnum(String v) {
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

  private List<SexualEnum> sexual = new ArrayList<>();


public enum SexualMinorsEnum {

    @JsonProperty("text") TEXT(String.valueOf("text"));


    private String value;

    SexualMinorsEnum(String v) {
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

  private List<SexualMinorsEnum> sexualMinors = new ArrayList<>();


public enum ViolenceEnum {

    @JsonProperty("text") TEXT(String.valueOf("text")), @JsonProperty("image") IMAGE(String.valueOf("image"));


    private String value;

    ViolenceEnum(String v) {
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

  private List<ViolenceEnum> violence = new ArrayList<>();


public enum ViolenceGraphicEnum {

    @JsonProperty("text") TEXT(String.valueOf("text")), @JsonProperty("image") IMAGE(String.valueOf("image"));


    private String value;

    ViolenceGraphicEnum(String v) {
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

  private List<ViolenceGraphicEnum> violenceGraphic = new ArrayList<>();

  /**
   * The applied input type(s) for the category &#39;hate&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes hate(List<HateEnum> hate) {
    this.hate = hate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'hate'.")
  @JsonProperty("hate")
  @NotNull
  public List<HateEnum> getHate() {
    return hate;
  }
  public void setHate(List<HateEnum> hate) {
    this.hate = hate;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addHateItem(HateEnum hateItem) {
    if (this.hate == null) {
      this.hate = new ArrayList<>();
    }
    this.hate.add(hateItem);
    return this;
  }


  /**
   * The applied input type(s) for the category &#39;hate/threatening&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes hateThreatening(List<HateThreateningEnum> hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'hate/threatening'.")
  @JsonProperty("hate/threatening")
  @NotNull
  public List<HateThreateningEnum> getHateThreatening() {
    return hateThreatening;
  }
  public void setHateThreatening(List<HateThreateningEnum> hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addHateThreateningItem(HateThreateningEnum hateThreateningItem) {
    if (this.hateThreatening == null) {
      this.hateThreatening = new ArrayList<>();
    }
    this.hateThreatening.add(hateThreateningItem);
    return this;
  }


  /**
   * The applied input type(s) for the category &#39;harassment&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes harassment(List<HarassmentEnum> harassment) {
    this.harassment = harassment;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'harassment'.")
  @JsonProperty("harassment")
  @NotNull
  public List<HarassmentEnum> getHarassment() {
    return harassment;
  }
  public void setHarassment(List<HarassmentEnum> harassment) {
    this.harassment = harassment;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addHarassmentItem(HarassmentEnum harassmentItem) {
    if (this.harassment == null) {
      this.harassment = new ArrayList<>();
    }
    this.harassment.add(harassmentItem);
    return this;
  }


  /**
   * The applied input type(s) for the category &#39;harassment/threatening&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes harassmentThreatening(List<HarassmentThreateningEnum> harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'harassment/threatening'.")
  @JsonProperty("harassment/threatening")
  @NotNull
  public List<HarassmentThreateningEnum> getHarassmentThreatening() {
    return harassmentThreatening;
  }
  public void setHarassmentThreatening(List<HarassmentThreateningEnum> harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addHarassmentThreateningItem(HarassmentThreateningEnum harassmentThreateningItem) {
    if (this.harassmentThreatening == null) {
      this.harassmentThreatening = new ArrayList<>();
    }
    this.harassmentThreatening.add(harassmentThreateningItem);
    return this;
  }


  /**
   * The applied input type(s) for the category &#39;illicit&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes illicit(List<IllicitEnum> illicit) {
    this.illicit = illicit;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'illicit'.")
  @JsonProperty("illicit")
  @NotNull
  public List<IllicitEnum> getIllicit() {
    return illicit;
  }
  public void setIllicit(List<IllicitEnum> illicit) {
    this.illicit = illicit;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addIllicitItem(IllicitEnum illicitItem) {
    if (this.illicit == null) {
      this.illicit = new ArrayList<>();
    }
    this.illicit.add(illicitItem);
    return this;
  }


  /**
   * The applied input type(s) for the category &#39;illicit/violent&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes illicitViolent(List<IllicitViolentEnum> illicitViolent) {
    this.illicitViolent = illicitViolent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'illicit/violent'.")
  @JsonProperty("illicit/violent")
  @NotNull
  public List<IllicitViolentEnum> getIllicitViolent() {
    return illicitViolent;
  }
  public void setIllicitViolent(List<IllicitViolentEnum> illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addIllicitViolentItem(IllicitViolentEnum illicitViolentItem) {
    if (this.illicitViolent == null) {
      this.illicitViolent = new ArrayList<>();
    }
    this.illicitViolent.add(illicitViolentItem);
    return this;
  }


  /**
   * The applied input type(s) for the category &#39;self-harm&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes selfHarm(List<SelfHarmEnum> selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm'.")
  @JsonProperty("self-harm")
  @NotNull
  public List<SelfHarmEnum> getSelfHarm() {
    return selfHarm;
  }
  public void setSelfHarm(List<SelfHarmEnum> selfHarm) {
    this.selfHarm = selfHarm;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addSelfHarmItem(SelfHarmEnum selfHarmItem) {
    if (this.selfHarm == null) {
      this.selfHarm = new ArrayList<>();
    }
    this.selfHarm.add(selfHarmItem);
    return this;
  }


  /**
   * The applied input type(s) for the category &#39;self-harm/intent&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes selfHarmIntent(List<SelfHarmIntentEnum> selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm/intent'.")
  @JsonProperty("self-harm/intent")
  @NotNull
  public List<SelfHarmIntentEnum> getSelfHarmIntent() {
    return selfHarmIntent;
  }
  public void setSelfHarmIntent(List<SelfHarmIntentEnum> selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addSelfHarmIntentItem(SelfHarmIntentEnum selfHarmIntentItem) {
    if (this.selfHarmIntent == null) {
      this.selfHarmIntent = new ArrayList<>();
    }
    this.selfHarmIntent.add(selfHarmIntentItem);
    return this;
  }


  /**
   * The applied input type(s) for the category &#39;self-harm/instructions&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes selfHarmInstructions(List<SelfHarmInstructionsEnum> selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'self-harm/instructions'.")
  @JsonProperty("self-harm/instructions")
  @NotNull
  public List<SelfHarmInstructionsEnum> getSelfHarmInstructions() {
    return selfHarmInstructions;
  }
  public void setSelfHarmInstructions(List<SelfHarmInstructionsEnum> selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addSelfHarmInstructionsItem(SelfHarmInstructionsEnum selfHarmInstructionsItem) {
    if (this.selfHarmInstructions == null) {
      this.selfHarmInstructions = new ArrayList<>();
    }
    this.selfHarmInstructions.add(selfHarmInstructionsItem);
    return this;
  }


  /**
   * The applied input type(s) for the category &#39;sexual&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes sexual(List<SexualEnum> sexual) {
    this.sexual = sexual;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'sexual'.")
  @JsonProperty("sexual")
  @NotNull
  public List<SexualEnum> getSexual() {
    return sexual;
  }
  public void setSexual(List<SexualEnum> sexual) {
    this.sexual = sexual;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addSexualItem(SexualEnum sexualItem) {
    if (this.sexual == null) {
      this.sexual = new ArrayList<>();
    }
    this.sexual.add(sexualItem);
    return this;
  }


  /**
   * The applied input type(s) for the category &#39;sexual/minors&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes sexualMinors(List<SexualMinorsEnum> sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'sexual/minors'.")
  @JsonProperty("sexual/minors")
  @NotNull
  public List<SexualMinorsEnum> getSexualMinors() {
    return sexualMinors;
  }
  public void setSexualMinors(List<SexualMinorsEnum> sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addSexualMinorsItem(SexualMinorsEnum sexualMinorsItem) {
    if (this.sexualMinors == null) {
      this.sexualMinors = new ArrayList<>();
    }
    this.sexualMinors.add(sexualMinorsItem);
    return this;
  }


  /**
   * The applied input type(s) for the category &#39;violence&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes violence(List<ViolenceEnum> violence) {
    this.violence = violence;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'violence'.")
  @JsonProperty("violence")
  @NotNull
  public List<ViolenceEnum> getViolence() {
    return violence;
  }
  public void setViolence(List<ViolenceEnum> violence) {
    this.violence = violence;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addViolenceItem(ViolenceEnum violenceItem) {
    if (this.violence == null) {
      this.violence = new ArrayList<>();
    }
    this.violence.add(violenceItem);
    return this;
  }


  /**
   * The applied input type(s) for the category &#39;violence/graphic&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes violenceGraphic(List<ViolenceGraphicEnum> violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'violence/graphic'.")
  @JsonProperty("violence/graphic")
  @NotNull
  public List<ViolenceGraphicEnum> getViolenceGraphic() {
    return violenceGraphic;
  }
  public void setViolenceGraphic(List<ViolenceGraphicEnum> violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
  }

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes addViolenceGraphicItem(ViolenceGraphicEnum violenceGraphicItem) {
    if (this.violenceGraphic == null) {
      this.violenceGraphic = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

