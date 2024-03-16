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
import org.openapitools.model.CreateEmbeddingRequestInput;
import org.openapitools.model.CreateEmbeddingRequestModel;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CreateEmbeddingRequest
 */
@JsonPropertyOrder({
  CreateEmbeddingRequest.JSON_PROPERTY_MODEL,
  CreateEmbeddingRequest.JSON_PROPERTY_INPUT,
  CreateEmbeddingRequest.JSON_PROPERTY_USER
})
@JsonTypeName("CreateEmbeddingRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-03-16T01:12:38.762786439Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class CreateEmbeddingRequest {
    public static final String JSON_PROPERTY_MODEL = "model";
    private CreateEmbeddingRequestModel model;

    public static final String JSON_PROPERTY_INPUT = "input";
    private CreateEmbeddingRequestInput input;

    public static final String JSON_PROPERTY_USER = "user";
    private String user;

    public CreateEmbeddingRequest(CreateEmbeddingRequestModel model, CreateEmbeddingRequestInput input) {
        this.model = model;
        this.input = input;
    }

    public CreateEmbeddingRequest model(CreateEmbeddingRequestModel model) {
        this.model = model;
        return this;
    }

    /**
     * Get model
     * @return model
     **/
    @Valid
    @NotNull
    @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreateEmbeddingRequestModel getModel() {
        return model;
    }

    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setModel(CreateEmbeddingRequestModel model) {
        this.model = model;
    }

    public CreateEmbeddingRequest input(CreateEmbeddingRequestInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get input
     * @return input
     **/
    @Valid
    @NotNull
    @Schema(name = "input", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_INPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreateEmbeddingRequestInput getInput() {
        return input;
    }

    @JsonProperty(JSON_PROPERTY_INPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setInput(CreateEmbeddingRequestInput input) {
        this.input = input;
    }

    public CreateEmbeddingRequest user(String user) {
        this.user = user;
        return this;
    }

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     * @return user
     **/
    @Nullable
    @Schema(name = "user", example = "user-1234", description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_USER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUser() {
        return user;
    }

    @JsonProperty(JSON_PROPERTY_USER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEmbeddingRequest createEmbeddingRequest = (CreateEmbeddingRequest) o;
        return Objects.equals(this.model, createEmbeddingRequest.model) &&
            Objects.equals(this.input, createEmbeddingRequest.input) &&
            Objects.equals(this.user, createEmbeddingRequest.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, input, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEmbeddingRequest {\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

