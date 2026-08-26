package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A list of the categories along with the input type(s) that the score applies to.
 */
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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


    private List<ViolenceGraphicEnum> violenceGraphic = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CreateModerationResponseResultsInnerCategoryAppliedInputTypes() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateModerationResponseResultsInnerCategoryAppliedInputTypes.
     *
     * @param hate The applied input type(s) for the category &#39;hate&#39;.
     * @param hateThreatening The applied input type(s) for the category &#39;hate/threatening&#39;.
     * @param harassment The applied input type(s) for the category &#39;harassment&#39;.
     * @param harassmentThreatening The applied input type(s) for the category &#39;harassment/threatening&#39;.
     * @param illicit The applied input type(s) for the category &#39;illicit&#39;.
     * @param illicitViolent The applied input type(s) for the category &#39;illicit/violent&#39;.
     * @param selfHarm The applied input type(s) for the category &#39;self-harm&#39;.
     * @param selfHarmIntent The applied input type(s) for the category &#39;self-harm/intent&#39;.
     * @param selfHarmInstructions The applied input type(s) for the category &#39;self-harm/instructions&#39;.
     * @param sexual The applied input type(s) for the category &#39;sexual&#39;.
     * @param sexualMinors The applied input type(s) for the category &#39;sexual/minors&#39;.
     * @param violence The applied input type(s) for the category &#39;violence&#39;.
     * @param violenceGraphic The applied input type(s) for the category &#39;violence/graphic&#39;.
     */
    public CreateModerationResponseResultsInnerCategoryAppliedInputTypes(
        List<HateEnum> hate, 
        List<HateThreateningEnum> hateThreatening, 
        List<HarassmentEnum> harassment, 
        List<HarassmentThreateningEnum> harassmentThreatening, 
        List<IllicitEnum> illicit, 
        List<IllicitViolentEnum> illicitViolent, 
        List<SelfHarmEnum> selfHarm, 
        List<SelfHarmIntentEnum> selfHarmIntent, 
        List<SelfHarmInstructionsEnum> selfHarmInstructions, 
        List<SexualEnum> sexual, 
        List<SexualMinorsEnum> sexualMinors, 
        List<ViolenceEnum> violence, 
        List<ViolenceGraphicEnum> violenceGraphic
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
     * The applied input type(s) for the category 'hate'.
     * @return hate
     */
    public List<HateEnum> getHate() {
        return hate;
    }

    public void setHate(List<HateEnum> hate) {
        this.hate = hate;
    }

    /**
     * The applied input type(s) for the category 'hate/threatening'.
     * @return hateThreatening
     */
    public List<HateThreateningEnum> getHateThreatening() {
        return hateThreatening;
    }

    public void setHateThreatening(List<HateThreateningEnum> hateThreatening) {
        this.hateThreatening = hateThreatening;
    }

    /**
     * The applied input type(s) for the category 'harassment'.
     * @return harassment
     */
    public List<HarassmentEnum> getHarassment() {
        return harassment;
    }

    public void setHarassment(List<HarassmentEnum> harassment) {
        this.harassment = harassment;
    }

    /**
     * The applied input type(s) for the category 'harassment/threatening'.
     * @return harassmentThreatening
     */
    public List<HarassmentThreateningEnum> getHarassmentThreatening() {
        return harassmentThreatening;
    }

    public void setHarassmentThreatening(List<HarassmentThreateningEnum> harassmentThreatening) {
        this.harassmentThreatening = harassmentThreatening;
    }

    /**
     * The applied input type(s) for the category 'illicit'.
     * @return illicit
     */
    public List<IllicitEnum> getIllicit() {
        return illicit;
    }

    public void setIllicit(List<IllicitEnum> illicit) {
        this.illicit = illicit;
    }

    /**
     * The applied input type(s) for the category 'illicit/violent'.
     * @return illicitViolent
     */
    public List<IllicitViolentEnum> getIllicitViolent() {
        return illicitViolent;
    }

    public void setIllicitViolent(List<IllicitViolentEnum> illicitViolent) {
        this.illicitViolent = illicitViolent;
    }

    /**
     * The applied input type(s) for the category 'self-harm'.
     * @return selfHarm
     */
    public List<SelfHarmEnum> getSelfHarm() {
        return selfHarm;
    }

    public void setSelfHarm(List<SelfHarmEnum> selfHarm) {
        this.selfHarm = selfHarm;
    }

    /**
     * The applied input type(s) for the category 'self-harm/intent'.
     * @return selfHarmIntent
     */
    public List<SelfHarmIntentEnum> getSelfHarmIntent() {
        return selfHarmIntent;
    }

    public void setSelfHarmIntent(List<SelfHarmIntentEnum> selfHarmIntent) {
        this.selfHarmIntent = selfHarmIntent;
    }

    /**
     * The applied input type(s) for the category 'self-harm/instructions'.
     * @return selfHarmInstructions
     */
    public List<SelfHarmInstructionsEnum> getSelfHarmInstructions() {
        return selfHarmInstructions;
    }

    public void setSelfHarmInstructions(List<SelfHarmInstructionsEnum> selfHarmInstructions) {
        this.selfHarmInstructions = selfHarmInstructions;
    }

    /**
     * The applied input type(s) for the category 'sexual'.
     * @return sexual
     */
    public List<SexualEnum> getSexual() {
        return sexual;
    }

    public void setSexual(List<SexualEnum> sexual) {
        this.sexual = sexual;
    }

    /**
     * The applied input type(s) for the category 'sexual/minors'.
     * @return sexualMinors
     */
    public List<SexualMinorsEnum> getSexualMinors() {
        return sexualMinors;
    }

    public void setSexualMinors(List<SexualMinorsEnum> sexualMinors) {
        this.sexualMinors = sexualMinors;
    }

    /**
     * The applied input type(s) for the category 'violence'.
     * @return violence
     */
    public List<ViolenceEnum> getViolence() {
        return violence;
    }

    public void setViolence(List<ViolenceEnum> violence) {
        this.violence = violence;
    }

    /**
     * The applied input type(s) for the category 'violence/graphic'.
     * @return violenceGraphic
     */
    public List<ViolenceGraphicEnum> getViolenceGraphic() {
        return violenceGraphic;
    }

    public void setViolenceGraphic(List<ViolenceGraphicEnum> violenceGraphic) {
        this.violenceGraphic = violenceGraphic;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

