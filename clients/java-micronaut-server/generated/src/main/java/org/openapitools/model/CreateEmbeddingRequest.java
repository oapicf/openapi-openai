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
  CreateEmbeddingRequest.JSON_PROPERTY_INPUT,
  CreateEmbeddingRequest.JSON_PROPERTY_MODEL,
  CreateEmbeddingRequest.JSON_PROPERTY_ENCODING_FORMAT,
  CreateEmbeddingRequest.JSON_PROPERTY_DIMENSIONS,
  CreateEmbeddingRequest.JSON_PROPERTY_USER
})
@JsonTypeName("CreateEmbeddingRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CreateEmbeddingRequest {
    public static final String JSON_PROPERTY_INPUT = "input";
    private CreateEmbeddingRequestInput input;

    public static final String JSON_PROPERTY_MODEL = "model";
    private CreateEmbeddingRequestModel model;

    /**
     * The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/).
     */
    public enum EncodingFormatEnum {
        FLOAT("float"),
        BASE64("base64");

        private String value;

        EncodingFormatEnum(String value) {
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
        public static EncodingFormatEnum fromValue(String value) {
            for (EncodingFormatEnum b : EncodingFormatEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_ENCODING_FORMAT = "encoding_format";
    private EncodingFormatEnum encodingFormat = EncodingFormatEnum.FLOAT;

    public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
    private Integer dimensions;

    public static final String JSON_PROPERTY_USER = "user";
    private String user;

    public CreateEmbeddingRequest(CreateEmbeddingRequestInput input, CreateEmbeddingRequestModel model) {
        this.input = input;
        this.model = model;
    }

    public CreateEmbeddingRequest input(CreateEmbeddingRequestInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get input
     * @return input
     */
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

    public CreateEmbeddingRequest model(CreateEmbeddingRequestModel model) {
        this.model = model;
        return this;
    }

    /**
     * Get model
     * @return model
     */
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

    public CreateEmbeddingRequest encodingFormat(EncodingFormatEnum encodingFormat) {
        this.encodingFormat = encodingFormat;
        return this;
    }

    /**
     * The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/).
     * @return encodingFormat
     */
    @Nullable
    @Schema(name = "encoding_format", example = "float", description = "The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ENCODING_FORMAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public EncodingFormatEnum getEncodingFormat() {
        return encodingFormat;
    }

    @JsonProperty(JSON_PROPERTY_ENCODING_FORMAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEncodingFormat(EncodingFormatEnum encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public CreateEmbeddingRequest dimensions(Integer dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models. 
     * minimum: 1
     * @return dimensions
     */
    @Nullable
    @Min(1)
    @Schema(name = "dimensions", description = "The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DIMENSIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getDimensions() {
        return dimensions;
    }

    @JsonProperty(JSON_PROPERTY_DIMENSIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDimensions(Integer dimensions) {
        this.dimensions = dimensions;
    }

    public CreateEmbeddingRequest user(String user) {
        this.user = user;
        return this;
    }

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     * @return user
     */
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
        return Objects.equals(this.input, createEmbeddingRequest.input) &&
            Objects.equals(this.model, createEmbeddingRequest.model) &&
            Objects.equals(this.encodingFormat, createEmbeddingRequest.encodingFormat) &&
            Objects.equals(this.dimensions, createEmbeddingRequest.dimensions) &&
            Objects.equals(this.user, createEmbeddingRequest.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, model, encodingFormat, dimensions, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEmbeddingRequest {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    encodingFormat: ").append(toIndentedString(encodingFormat)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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

