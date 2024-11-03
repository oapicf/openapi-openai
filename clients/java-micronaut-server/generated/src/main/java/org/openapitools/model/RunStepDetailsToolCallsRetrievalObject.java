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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RunStepDetailsToolCallsRetrievalObject
 */
@JsonPropertyOrder({
  RunStepDetailsToolCallsRetrievalObject.JSON_PROPERTY_ID,
  RunStepDetailsToolCallsRetrievalObject.JSON_PROPERTY_TYPE,
  RunStepDetailsToolCallsRetrievalObject.JSON_PROPERTY_RETRIEVAL
})
@JsonTypeName("RunStepDetailsToolCallsRetrievalObject")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class RunStepDetailsToolCallsRetrievalObject {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    /**
     * The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.
     */
    public enum TypeEnum {
        RETRIEVAL("retrieval");

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    public static final String JSON_PROPERTY_RETRIEVAL = "retrieval";
    private Object retrieval;

    public RunStepDetailsToolCallsRetrievalObject(String id, TypeEnum type, Object retrieval) {
        this.id = id;
        this.type = type;
        this.retrieval = retrieval;
    }

    public RunStepDetailsToolCallsRetrievalObject id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the tool call object.
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "The ID of the tool call object.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public RunStepDetailsToolCallsRetrievalObject type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.
     * @return type
     */
    @NotNull
    @Schema(name = "type", description = "The type of tool call. This is always going to be `retrieval` for this type of tool call.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public RunStepDetailsToolCallsRetrievalObject retrieval(Object retrieval) {
        this.retrieval = retrieval;
        return this;
    }

    /**
     * For now, this is always going to be an empty object.
     * @return retrieval
     */
    @NotNull
    @Schema(name = "retrieval", description = "For now, this is always going to be an empty object.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_RETRIEVAL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Object getRetrieval() {
        return retrieval;
    }

    @JsonProperty(JSON_PROPERTY_RETRIEVAL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRetrieval(Object retrieval) {
        this.retrieval = retrieval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunStepDetailsToolCallsRetrievalObject runStepDetailsToolCallsRetrievalObject = (RunStepDetailsToolCallsRetrievalObject) o;
        return Objects.equals(this.id, runStepDetailsToolCallsRetrievalObject.id) &&
            Objects.equals(this.type, runStepDetailsToolCallsRetrievalObject.type) &&
            Objects.equals(this.retrieval, runStepDetailsToolCallsRetrievalObject.retrieval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, retrieval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDetailsToolCallsRetrievalObject {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    retrieval: ").append(toIndentedString(retrieval)).append("\n");
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

