/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CreateModerationResponseResultsInnerCategories
 */
@JsonPropertyOrder({
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_HATE,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_HATE_THREATENING,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_SELF_HARM,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_SEXUAL,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_SEXUAL_MINORS,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_VIOLENCE,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_VIOLENCE_GRAPHIC
})
@JsonTypeName("CreateModerationResponse_results_inner_categories")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-03-16T01:12:38.762786439Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class CreateModerationResponseResultsInnerCategories {
    public static final String JSON_PROPERTY_HATE = "hate";
    private Boolean hate;

    public static final String JSON_PROPERTY_HATE_THREATENING = "hate/threatening";
    private Boolean hateThreatening;

    public static final String JSON_PROPERTY_SELF_HARM = "self-harm";
    private Boolean selfHarm;

    public static final String JSON_PROPERTY_SEXUAL = "sexual";
    private Boolean sexual;

    public static final String JSON_PROPERTY_SEXUAL_MINORS = "sexual/minors";
    private Boolean sexualMinors;

    public static final String JSON_PROPERTY_VIOLENCE = "violence";
    private Boolean violence;

    public static final String JSON_PROPERTY_VIOLENCE_GRAPHIC = "violence/graphic";
    private Boolean violenceGraphic;

    public CreateModerationResponseResultsInnerCategories(Boolean hate, Boolean hateThreatening, Boolean selfHarm, Boolean sexual, Boolean sexualMinors, Boolean violence, Boolean violenceGraphic) {
        this.hate = hate;
        this.hateThreatening = hateThreatening;
        this.selfHarm = selfHarm;
        this.sexual = sexual;
        this.sexualMinors = sexualMinors;
        this.violence = violence;
        this.violenceGraphic = violenceGraphic;
    }

    public CreateModerationResponseResultsInnerCategories hate(Boolean hate) {
        this.hate = hate;
        return this;
    }

    /**
     * Get hate
     * @return hate
     **/
    @NotNull
    @Schema(name = "hate", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_HATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getHate() {
        return hate;
    }

    @JsonProperty(JSON_PROPERTY_HATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setHate(Boolean hate) {
        this.hate = hate;
    }

    public CreateModerationResponseResultsInnerCategories hateThreatening(Boolean hateThreatening) {
        this.hateThreatening = hateThreatening;
        return this;
    }

    /**
     * Get hateThreatening
     * @return hateThreatening
     **/
    @NotNull
    @Schema(name = "hate/threatening", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_HATE_THREATENING)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getHateThreatening() {
        return hateThreatening;
    }

    @JsonProperty(JSON_PROPERTY_HATE_THREATENING)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setHateThreatening(Boolean hateThreatening) {
        this.hateThreatening = hateThreatening;
    }

    public CreateModerationResponseResultsInnerCategories selfHarm(Boolean selfHarm) {
        this.selfHarm = selfHarm;
        return this;
    }

    /**
     * Get selfHarm
     * @return selfHarm
     **/
    @NotNull
    @Schema(name = "self-harm", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SELF_HARM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getSelfHarm() {
        return selfHarm;
    }

    @JsonProperty(JSON_PROPERTY_SELF_HARM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSelfHarm(Boolean selfHarm) {
        this.selfHarm = selfHarm;
    }

    public CreateModerationResponseResultsInnerCategories sexual(Boolean sexual) {
        this.sexual = sexual;
        return this;
    }

    /**
     * Get sexual
     * @return sexual
     **/
    @NotNull
    @Schema(name = "sexual", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SEXUAL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getSexual() {
        return sexual;
    }

    @JsonProperty(JSON_PROPERTY_SEXUAL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSexual(Boolean sexual) {
        this.sexual = sexual;
    }

    public CreateModerationResponseResultsInnerCategories sexualMinors(Boolean sexualMinors) {
        this.sexualMinors = sexualMinors;
        return this;
    }

    /**
     * Get sexualMinors
     * @return sexualMinors
     **/
    @NotNull
    @Schema(name = "sexual/minors", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SEXUAL_MINORS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getSexualMinors() {
        return sexualMinors;
    }

    @JsonProperty(JSON_PROPERTY_SEXUAL_MINORS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSexualMinors(Boolean sexualMinors) {
        this.sexualMinors = sexualMinors;
    }

    public CreateModerationResponseResultsInnerCategories violence(Boolean violence) {
        this.violence = violence;
        return this;
    }

    /**
     * Get violence
     * @return violence
     **/
    @NotNull
    @Schema(name = "violence", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_VIOLENCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getViolence() {
        return violence;
    }

    @JsonProperty(JSON_PROPERTY_VIOLENCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setViolence(Boolean violence) {
        this.violence = violence;
    }

    public CreateModerationResponseResultsInnerCategories violenceGraphic(Boolean violenceGraphic) {
        this.violenceGraphic = violenceGraphic;
        return this;
    }

    /**
     * Get violenceGraphic
     * @return violenceGraphic
     **/
    @NotNull
    @Schema(name = "violence/graphic", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_VIOLENCE_GRAPHIC)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getViolenceGraphic() {
        return violenceGraphic;
    }

    @JsonProperty(JSON_PROPERTY_VIOLENCE_GRAPHIC)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setViolenceGraphic(Boolean violenceGraphic) {
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
        CreateModerationResponseResultsInnerCategories createModerationResponseResultsInnerCategories = (CreateModerationResponseResultsInnerCategories) o;
        return Objects.equals(this.hate, createModerationResponseResultsInnerCategories.hate) &&
            Objects.equals(this.hateThreatening, createModerationResponseResultsInnerCategories.hateThreatening) &&
            Objects.equals(this.selfHarm, createModerationResponseResultsInnerCategories.selfHarm) &&
            Objects.equals(this.sexual, createModerationResponseResultsInnerCategories.sexual) &&
            Objects.equals(this.sexualMinors, createModerationResponseResultsInnerCategories.sexualMinors) &&
            Objects.equals(this.violence, createModerationResponseResultsInnerCategories.violence) &&
            Objects.equals(this.violenceGraphic, createModerationResponseResultsInnerCategories.violenceGraphic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hate, hateThreatening, selfHarm, sexual, sexualMinors, violence, violenceGraphic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModerationResponseResultsInnerCategories {\n");
        sb.append("    hate: ").append(toIndentedString(hate)).append("\n");
        sb.append("    hateThreatening: ").append(toIndentedString(hateThreatening)).append("\n");
        sb.append("    selfHarm: ").append(toIndentedString(selfHarm)).append("\n");
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

