package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A list of the categories along with the input type(s) that the score applies to.
 **/
@ApiModel(description = "A list of the categories along with the input type(s) that the score applies to.")
@JsonTypeName("CreateModerationResponse_results_inner_category_applied_input_types")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateModerationResponseResultsInnerCategoryAppliedInputTypes   {
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static HateEnum fromString(String s) {
        for (HateEnum b : HateEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<HateEnum> hate = new ArrayList<>();
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static HateThreateningEnum fromString(String s) {
        for (HateThreateningEnum b : HateThreateningEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<HateThreateningEnum> hateThreatening = new ArrayList<>();
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static HarassmentEnum fromString(String s) {
        for (HarassmentEnum b : HarassmentEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<HarassmentEnum> harassment = new ArrayList<>();
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static HarassmentThreateningEnum fromString(String s) {
        for (HarassmentThreateningEnum b : HarassmentThreateningEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<HarassmentThreateningEnum> harassmentThreatening = new ArrayList<>();
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static IllicitEnum fromString(String s) {
        for (IllicitEnum b : IllicitEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<IllicitEnum> illicit = new ArrayList<>();
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static IllicitViolentEnum fromString(String s) {
        for (IllicitViolentEnum b : IllicitViolentEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<IllicitViolentEnum> illicitViolent = new ArrayList<>();
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static SelfHarmEnum fromString(String s) {
        for (SelfHarmEnum b : SelfHarmEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<SelfHarmEnum> selfHarm = new ArrayList<>();
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static SelfHarmIntentEnum fromString(String s) {
        for (SelfHarmIntentEnum b : SelfHarmIntentEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<SelfHarmIntentEnum> selfHarmIntent = new ArrayList<>();
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static SelfHarmInstructionsEnum fromString(String s) {
        for (SelfHarmInstructionsEnum b : SelfHarmInstructionsEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<SelfHarmInstructionsEnum> selfHarmInstructions = new ArrayList<>();
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static SexualEnum fromString(String s) {
        for (SexualEnum b : SexualEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<SexualEnum> sexual = new ArrayList<>();
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static SexualMinorsEnum fromString(String s) {
        for (SexualMinorsEnum b : SexualMinorsEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<SexualMinorsEnum> sexualMinors = new ArrayList<>();
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ViolenceEnum fromString(String s) {
        for (ViolenceEnum b : ViolenceEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<ViolenceEnum> violence = new ArrayList<>();
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ViolenceGraphicEnum fromString(String s) {
        for (ViolenceGraphicEnum b : ViolenceGraphicEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<ViolenceGraphicEnum> violenceGraphic = new ArrayList<>();

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes() {
  }

  @JsonCreator
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes(
    @JsonProperty(required = true, value = "hate") List<HateEnum> hate,
    @JsonProperty(required = true, value = "hate/threatening") List<HateThreateningEnum> hateThreatening,
    @JsonProperty(required = true, value = "harassment") List<HarassmentEnum> harassment,
    @JsonProperty(required = true, value = "harassment/threatening") List<HarassmentThreateningEnum> harassmentThreatening,
    @JsonProperty(required = true, value = "illicit") List<IllicitEnum> illicit,
    @JsonProperty(required = true, value = "illicit/violent") List<IllicitViolentEnum> illicitViolent,
    @JsonProperty(required = true, value = "self-harm") List<SelfHarmEnum> selfHarm,
    @JsonProperty(required = true, value = "self-harm/intent") List<SelfHarmIntentEnum> selfHarmIntent,
    @JsonProperty(required = true, value = "self-harm/instructions") List<SelfHarmInstructionsEnum> selfHarmInstructions,
    @JsonProperty(required = true, value = "sexual") List<SexualEnum> sexual,
    @JsonProperty(required = true, value = "sexual/minors") List<SexualMinorsEnum> sexualMinors,
    @JsonProperty(required = true, value = "violence") List<ViolenceEnum> violence,
    @JsonProperty(required = true, value = "violence/graphic") List<ViolenceGraphicEnum> violenceGraphic
  ) {
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

  /**
   * The applied input type(s) for the category &#39;hate&#39;.
   **/
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes hate(List<HateEnum> hate) {
    this.hate = hate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The applied input type(s) for the category 'hate'.")
  @JsonProperty(required = true, value = "hate")
  @NotNull public List<HateEnum> getHate() {
    return hate;
  }

  @JsonProperty(required = true, value = "hate")
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

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes removeHateItem(HateEnum hateItem) {
    if (hateItem != null && this.hate != null) {
      this.hate.remove(hateItem);
    }

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
  @JsonProperty(required = true, value = "hate/threatening")
  @NotNull public List<HateThreateningEnum> getHateThreatening() {
    return hateThreatening;
  }

  @JsonProperty(required = true, value = "hate/threatening")
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

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes removeHateThreateningItem(HateThreateningEnum hateThreateningItem) {
    if (hateThreateningItem != null && this.hateThreatening != null) {
      this.hateThreatening.remove(hateThreateningItem);
    }

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
  @JsonProperty(required = true, value = "harassment")
  @NotNull public List<HarassmentEnum> getHarassment() {
    return harassment;
  }

  @JsonProperty(required = true, value = "harassment")
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

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes removeHarassmentItem(HarassmentEnum harassmentItem) {
    if (harassmentItem != null && this.harassment != null) {
      this.harassment.remove(harassmentItem);
    }

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
  @JsonProperty(required = true, value = "harassment/threatening")
  @NotNull public List<HarassmentThreateningEnum> getHarassmentThreatening() {
    return harassmentThreatening;
  }

  @JsonProperty(required = true, value = "harassment/threatening")
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

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes removeHarassmentThreateningItem(HarassmentThreateningEnum harassmentThreateningItem) {
    if (harassmentThreateningItem != null && this.harassmentThreatening != null) {
      this.harassmentThreatening.remove(harassmentThreateningItem);
    }

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
  @JsonProperty(required = true, value = "illicit")
  @NotNull public List<IllicitEnum> getIllicit() {
    return illicit;
  }

  @JsonProperty(required = true, value = "illicit")
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

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes removeIllicitItem(IllicitEnum illicitItem) {
    if (illicitItem != null && this.illicit != null) {
      this.illicit.remove(illicitItem);
    }

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
  @JsonProperty(required = true, value = "illicit/violent")
  @NotNull public List<IllicitViolentEnum> getIllicitViolent() {
    return illicitViolent;
  }

  @JsonProperty(required = true, value = "illicit/violent")
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

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes removeIllicitViolentItem(IllicitViolentEnum illicitViolentItem) {
    if (illicitViolentItem != null && this.illicitViolent != null) {
      this.illicitViolent.remove(illicitViolentItem);
    }

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
  @JsonProperty(required = true, value = "self-harm")
  @NotNull public List<SelfHarmEnum> getSelfHarm() {
    return selfHarm;
  }

  @JsonProperty(required = true, value = "self-harm")
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

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes removeSelfHarmItem(SelfHarmEnum selfHarmItem) {
    if (selfHarmItem != null && this.selfHarm != null) {
      this.selfHarm.remove(selfHarmItem);
    }

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
  @JsonProperty(required = true, value = "self-harm/intent")
  @NotNull public List<SelfHarmIntentEnum> getSelfHarmIntent() {
    return selfHarmIntent;
  }

  @JsonProperty(required = true, value = "self-harm/intent")
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

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes removeSelfHarmIntentItem(SelfHarmIntentEnum selfHarmIntentItem) {
    if (selfHarmIntentItem != null && this.selfHarmIntent != null) {
      this.selfHarmIntent.remove(selfHarmIntentItem);
    }

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
  @JsonProperty(required = true, value = "self-harm/instructions")
  @NotNull public List<SelfHarmInstructionsEnum> getSelfHarmInstructions() {
    return selfHarmInstructions;
  }

  @JsonProperty(required = true, value = "self-harm/instructions")
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

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes removeSelfHarmInstructionsItem(SelfHarmInstructionsEnum selfHarmInstructionsItem) {
    if (selfHarmInstructionsItem != null && this.selfHarmInstructions != null) {
      this.selfHarmInstructions.remove(selfHarmInstructionsItem);
    }

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
  @JsonProperty(required = true, value = "sexual")
  @NotNull public List<SexualEnum> getSexual() {
    return sexual;
  }

  @JsonProperty(required = true, value = "sexual")
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

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes removeSexualItem(SexualEnum sexualItem) {
    if (sexualItem != null && this.sexual != null) {
      this.sexual.remove(sexualItem);
    }

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
  @JsonProperty(required = true, value = "sexual/minors")
  @NotNull public List<SexualMinorsEnum> getSexualMinors() {
    return sexualMinors;
  }

  @JsonProperty(required = true, value = "sexual/minors")
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

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes removeSexualMinorsItem(SexualMinorsEnum sexualMinorsItem) {
    if (sexualMinorsItem != null && this.sexualMinors != null) {
      this.sexualMinors.remove(sexualMinorsItem);
    }

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
  @JsonProperty(required = true, value = "violence")
  @NotNull public List<ViolenceEnum> getViolence() {
    return violence;
  }

  @JsonProperty(required = true, value = "violence")
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

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes removeViolenceItem(ViolenceEnum violenceItem) {
    if (violenceItem != null && this.violence != null) {
      this.violence.remove(violenceItem);
    }

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
  @JsonProperty(required = true, value = "violence/graphic")
  @NotNull public List<ViolenceGraphicEnum> getViolenceGraphic() {
    return violenceGraphic;
  }

  @JsonProperty(required = true, value = "violence/graphic")
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

  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes removeViolenceGraphicItem(ViolenceGraphicEnum violenceGraphicItem) {
    if (violenceGraphicItem != null && this.violenceGraphic != null) {
      this.violenceGraphic.remove(violenceGraphicItem);
    }

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

