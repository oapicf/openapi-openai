/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
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
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInnerType;
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInnerWandb;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CreateFineTuningJobRequestIntegrationsInner
 */
@JsonPropertyOrder({
  CreateFineTuningJobRequestIntegrationsInner.JSON_PROPERTY_TYPE,
  CreateFineTuningJobRequestIntegrationsInner.JSON_PROPERTY_WANDB
})
@JsonTypeName("CreateFineTuningJobRequest_integrations_inner")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class CreateFineTuningJobRequestIntegrationsInner {
    public static final String JSON_PROPERTY_TYPE = "type";
    private CreateFineTuningJobRequestIntegrationsInnerType type;

    public static final String JSON_PROPERTY_WANDB = "wandb";
    private CreateFineTuningJobRequestIntegrationsInnerWandb wandb;

    public CreateFineTuningJobRequestIntegrationsInner(CreateFineTuningJobRequestIntegrationsInnerType type, CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
        this.type = type;
        this.wandb = wandb;
    }

    public CreateFineTuningJobRequestIntegrationsInner type(CreateFineTuningJobRequestIntegrationsInnerType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     **/
    @Valid
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreateFineTuningJobRequestIntegrationsInnerType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(CreateFineTuningJobRequestIntegrationsInnerType type) {
        this.type = type;
    }

    public CreateFineTuningJobRequestIntegrationsInner wandb(CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
        this.wandb = wandb;
        return this;
    }

    /**
     * Get wandb
     * @return wandb
     **/
    @Valid
    @NotNull
    @Schema(name = "wandb", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_WANDB)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreateFineTuningJobRequestIntegrationsInnerWandb getWandb() {
        return wandb;
    }

    @JsonProperty(JSON_PROPERTY_WANDB)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setWandb(CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
        this.wandb = wandb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFineTuningJobRequestIntegrationsInner createFineTuningJobRequestIntegrationsInner = (CreateFineTuningJobRequestIntegrationsInner) o;
        return Objects.equals(this.type, createFineTuningJobRequestIntegrationsInner.type) &&
            Objects.equals(this.wandb, createFineTuningJobRequestIntegrationsInner.wandb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, wandb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFineTuningJobRequestIntegrationsInner {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    wandb: ").append(toIndentedString(wandb)).append("\n");
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

