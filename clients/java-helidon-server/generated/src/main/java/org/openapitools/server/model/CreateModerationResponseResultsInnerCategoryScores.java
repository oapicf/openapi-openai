package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A list of the categories along with their scores as predicted by model.
 */
public class CreateModerationResponseResultsInnerCategoryScores   {

    private BigDecimal hate;
    private BigDecimal hateThreatening;
    private BigDecimal harassment;
    private BigDecimal harassmentThreatening;
    private BigDecimal illicit;
    private BigDecimal illicitViolent;
    private BigDecimal selfHarm;
    private BigDecimal selfHarmIntent;
    private BigDecimal selfHarmInstructions;
    private BigDecimal sexual;
    private BigDecimal sexualMinors;
    private BigDecimal violence;
    private BigDecimal violenceGraphic;

    /**
     * Default constructor.
     */
    public CreateModerationResponseResultsInnerCategoryScores() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateModerationResponseResultsInnerCategoryScores.
     *
     * @param hate The score for the category &#39;hate&#39;.
     * @param hateThreatening The score for the category &#39;hate/threatening&#39;.
     * @param harassment The score for the category &#39;harassment&#39;.
     * @param harassmentThreatening The score for the category &#39;harassment/threatening&#39;.
     * @param illicit The score for the category &#39;illicit&#39;.
     * @param illicitViolent The score for the category &#39;illicit/violent&#39;.
     * @param selfHarm The score for the category &#39;self-harm&#39;.
     * @param selfHarmIntent The score for the category &#39;self-harm/intent&#39;.
     * @param selfHarmInstructions The score for the category &#39;self-harm/instructions&#39;.
     * @param sexual The score for the category &#39;sexual&#39;.
     * @param sexualMinors The score for the category &#39;sexual/minors&#39;.
     * @param violence The score for the category &#39;violence&#39;.
     * @param violenceGraphic The score for the category &#39;violence/graphic&#39;.
     */
    public CreateModerationResponseResultsInnerCategoryScores(
        BigDecimal hate, 
        BigDecimal hateThreatening, 
        BigDecimal harassment, 
        BigDecimal harassmentThreatening, 
        BigDecimal illicit, 
        BigDecimal illicitViolent, 
        BigDecimal selfHarm, 
        BigDecimal selfHarmIntent, 
        BigDecimal selfHarmInstructions, 
        BigDecimal sexual, 
        BigDecimal sexualMinors, 
        BigDecimal violence, 
        BigDecimal violenceGraphic
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
     * The score for the category 'hate'.
     * @return hate
     */
    public BigDecimal getHate() {
        return hate;
    }

    public void setHate(BigDecimal hate) {
        this.hate = hate;
    }

    /**
     * The score for the category 'hate/threatening'.
     * @return hateThreatening
     */
    public BigDecimal getHateThreatening() {
        return hateThreatening;
    }

    public void setHateThreatening(BigDecimal hateThreatening) {
        this.hateThreatening = hateThreatening;
    }

    /**
     * The score for the category 'harassment'.
     * @return harassment
     */
    public BigDecimal getHarassment() {
        return harassment;
    }

    public void setHarassment(BigDecimal harassment) {
        this.harassment = harassment;
    }

    /**
     * The score for the category 'harassment/threatening'.
     * @return harassmentThreatening
     */
    public BigDecimal getHarassmentThreatening() {
        return harassmentThreatening;
    }

    public void setHarassmentThreatening(BigDecimal harassmentThreatening) {
        this.harassmentThreatening = harassmentThreatening;
    }

    /**
     * The score for the category 'illicit'.
     * @return illicit
     */
    public BigDecimal getIllicit() {
        return illicit;
    }

    public void setIllicit(BigDecimal illicit) {
        this.illicit = illicit;
    }

    /**
     * The score for the category 'illicit/violent'.
     * @return illicitViolent
     */
    public BigDecimal getIllicitViolent() {
        return illicitViolent;
    }

    public void setIllicitViolent(BigDecimal illicitViolent) {
        this.illicitViolent = illicitViolent;
    }

    /**
     * The score for the category 'self-harm'.
     * @return selfHarm
     */
    public BigDecimal getSelfHarm() {
        return selfHarm;
    }

    public void setSelfHarm(BigDecimal selfHarm) {
        this.selfHarm = selfHarm;
    }

    /**
     * The score for the category 'self-harm/intent'.
     * @return selfHarmIntent
     */
    public BigDecimal getSelfHarmIntent() {
        return selfHarmIntent;
    }

    public void setSelfHarmIntent(BigDecimal selfHarmIntent) {
        this.selfHarmIntent = selfHarmIntent;
    }

    /**
     * The score for the category 'self-harm/instructions'.
     * @return selfHarmInstructions
     */
    public BigDecimal getSelfHarmInstructions() {
        return selfHarmInstructions;
    }

    public void setSelfHarmInstructions(BigDecimal selfHarmInstructions) {
        this.selfHarmInstructions = selfHarmInstructions;
    }

    /**
     * The score for the category 'sexual'.
     * @return sexual
     */
    public BigDecimal getSexual() {
        return sexual;
    }

    public void setSexual(BigDecimal sexual) {
        this.sexual = sexual;
    }

    /**
     * The score for the category 'sexual/minors'.
     * @return sexualMinors
     */
    public BigDecimal getSexualMinors() {
        return sexualMinors;
    }

    public void setSexualMinors(BigDecimal sexualMinors) {
        this.sexualMinors = sexualMinors;
    }

    /**
     * The score for the category 'violence'.
     * @return violence
     */
    public BigDecimal getViolence() {
        return violence;
    }

    public void setViolence(BigDecimal violence) {
        this.violence = violence;
    }

    /**
     * The score for the category 'violence/graphic'.
     * @return violenceGraphic
     */
    public BigDecimal getViolenceGraphic() {
        return violenceGraphic;
    }

    public void setViolenceGraphic(BigDecimal violenceGraphic) {
        this.violenceGraphic = violenceGraphic;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModerationResponseResultsInnerCategoryScores {\n");
        
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

