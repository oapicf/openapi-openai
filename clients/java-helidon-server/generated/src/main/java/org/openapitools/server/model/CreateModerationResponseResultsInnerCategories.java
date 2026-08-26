package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A list of the categories, and whether they are flagged or not.
 */
public class CreateModerationResponseResultsInnerCategories   {

    private Boolean hate;
    private Boolean hateThreatening;
    private Boolean harassment;
    private Boolean harassmentThreatening;
    private Boolean illicit;
    private Boolean illicitViolent;
    private Boolean selfHarm;
    private Boolean selfHarmIntent;
    private Boolean selfHarmInstructions;
    private Boolean sexual;
    private Boolean sexualMinors;
    private Boolean violence;
    private Boolean violenceGraphic;

    /**
     * Default constructor.
     */
    public CreateModerationResponseResultsInnerCategories() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateModerationResponseResultsInnerCategories.
     *
     * @param hate Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
     * @param hateThreatening Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
     * @param harassment Content that expresses, incites, or promotes harassing language towards any target.
     * @param harassmentThreatening Harassment content that also includes violence or serious harm towards any target.
     * @param illicit Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \&quot;how to shoplift\&quot; would fit this category.
     * @param illicitViolent Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
     * @param selfHarm Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
     * @param selfHarmIntent Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
     * @param selfHarmInstructions Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
     * @param sexual Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
     * @param sexualMinors Sexual content that includes an individual who is under 18 years old.
     * @param violence Content that depicts death, violence, or physical injury.
     * @param violenceGraphic Content that depicts death, violence, or physical injury in graphic detail.
     */
    public CreateModerationResponseResultsInnerCategories(
        Boolean hate, 
        Boolean hateThreatening, 
        Boolean harassment, 
        Boolean harassmentThreatening, 
        Boolean illicit, 
        Boolean illicitViolent, 
        Boolean selfHarm, 
        Boolean selfHarmIntent, 
        Boolean selfHarmInstructions, 
        Boolean sexual, 
        Boolean sexualMinors, 
        Boolean violence, 
        Boolean violenceGraphic
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
     * Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
     * @return hate
     */
    public Boolean getHate() {
        return hate;
    }

    public void setHate(Boolean hate) {
        this.hate = hate;
    }

    /**
     * Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
     * @return hateThreatening
     */
    public Boolean getHateThreatening() {
        return hateThreatening;
    }

    public void setHateThreatening(Boolean hateThreatening) {
        this.hateThreatening = hateThreatening;
    }

    /**
     * Content that expresses, incites, or promotes harassing language towards any target.
     * @return harassment
     */
    public Boolean getHarassment() {
        return harassment;
    }

    public void setHarassment(Boolean harassment) {
        this.harassment = harassment;
    }

    /**
     * Harassment content that also includes violence or serious harm towards any target.
     * @return harassmentThreatening
     */
    public Boolean getHarassmentThreatening() {
        return harassmentThreatening;
    }

    public void setHarassmentThreatening(Boolean harassmentThreatening) {
        this.harassmentThreatening = harassmentThreatening;
    }

    /**
     * Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.
     * @return illicit
     */
    public Boolean getIllicit() {
        return illicit;
    }

    public void setIllicit(Boolean illicit) {
        this.illicit = illicit;
    }

    /**
     * Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
     * @return illicitViolent
     */
    public Boolean getIllicitViolent() {
        return illicitViolent;
    }

    public void setIllicitViolent(Boolean illicitViolent) {
        this.illicitViolent = illicitViolent;
    }

    /**
     * Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
     * @return selfHarm
     */
    public Boolean getSelfHarm() {
        return selfHarm;
    }

    public void setSelfHarm(Boolean selfHarm) {
        this.selfHarm = selfHarm;
    }

    /**
     * Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
     * @return selfHarmIntent
     */
    public Boolean getSelfHarmIntent() {
        return selfHarmIntent;
    }

    public void setSelfHarmIntent(Boolean selfHarmIntent) {
        this.selfHarmIntent = selfHarmIntent;
    }

    /**
     * Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
     * @return selfHarmInstructions
     */
    public Boolean getSelfHarmInstructions() {
        return selfHarmInstructions;
    }

    public void setSelfHarmInstructions(Boolean selfHarmInstructions) {
        this.selfHarmInstructions = selfHarmInstructions;
    }

    /**
     * Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
     * @return sexual
     */
    public Boolean getSexual() {
        return sexual;
    }

    public void setSexual(Boolean sexual) {
        this.sexual = sexual;
    }

    /**
     * Sexual content that includes an individual who is under 18 years old.
     * @return sexualMinors
     */
    public Boolean getSexualMinors() {
        return sexualMinors;
    }

    public void setSexualMinors(Boolean sexualMinors) {
        this.sexualMinors = sexualMinors;
    }

    /**
     * Content that depicts death, violence, or physical injury.
     * @return violence
     */
    public Boolean getViolence() {
        return violence;
    }

    public void setViolence(Boolean violence) {
        this.violence = violence;
    }

    /**
     * Content that depicts death, violence, or physical injury in graphic detail.
     * @return violenceGraphic
     */
    public Boolean getViolenceGraphic() {
        return violenceGraphic;
    }

    public void setViolenceGraphic(Boolean violenceGraphic) {
        this.violenceGraphic = violenceGraphic;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModerationResponseResultsInnerCategories {\n");
        
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

