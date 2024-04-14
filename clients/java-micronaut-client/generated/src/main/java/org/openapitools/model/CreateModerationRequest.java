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
import org.openapitools.model.CreateModerationRequestInput;
import org.openapitools.model.CreateModerationRequestModel;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * CreateModerationRequest
 */
@JsonPropertyOrder({
  CreateModerationRequest.JSON_PROPERTY_INPUT,
  CreateModerationRequest.JSON_PROPERTY_MODEL
})
@JsonTypeName("CreateModerationRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-04-14T13:37:52.123317469Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class CreateModerationRequest {
    public static final String JSON_PROPERTY_INPUT = "input";
    private CreateModerationRequestInput input;

    public static final String JSON_PROPERTY_MODEL = "model";
    private CreateModerationRequestModel model = text-moderation-latest;

    public CreateModerationRequest(CreateModerationRequestInput input) {
        this.input = input;
    }

    public CreateModerationRequest input(CreateModerationRequestInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get input
     * @return input
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_INPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreateModerationRequestInput getInput() {
        return input;
    }

    @JsonProperty(JSON_PROPERTY_INPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setInput(CreateModerationRequestInput input) {
        this.input = input;
    }

    public CreateModerationRequest model(CreateModerationRequestModel model) {
        this.model = model;
        return this;
    }

    /**
     * Get model
     * @return model
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CreateModerationRequestModel getModel() {
        return model;
    }

    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setModel(CreateModerationRequestModel model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateModerationRequest createModerationRequest = (CreateModerationRequest) o;
        return Objects.equals(this.input, createModerationRequest.input) &&
            Objects.equals(this.model, createModerationRequest.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModerationRequest {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

