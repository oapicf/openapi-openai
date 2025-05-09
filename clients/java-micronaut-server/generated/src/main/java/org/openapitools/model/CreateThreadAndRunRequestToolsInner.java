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
import org.openapitools.model.AssistantToolsCode;
import org.openapitools.model.AssistantToolsFunction;
import org.openapitools.model.AssistantToolsRetrieval;
import org.openapitools.model.FunctionObject;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CreateThreadAndRunRequestToolsInner
 */
@JsonPropertyOrder({
  CreateThreadAndRunRequestToolsInner.JSON_PROPERTY_TYPE,
  CreateThreadAndRunRequestToolsInner.JSON_PROPERTY_FUNCTION
})
@JsonTypeName("CreateThreadAndRunRequest_tools_inner")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CreateThreadAndRunRequestToolsInner {
    /**
     * The type of tool being defined: &#x60;code_interpreter&#x60;
     */
    public enum TypeEnum {
        CODE_INTERPRETER("code_interpreter"),
        RETRIEVAL("retrieval"),
        FUNCTION("function");

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

    public static final String JSON_PROPERTY_FUNCTION = "function";
    private FunctionObject function;

    public CreateThreadAndRunRequestToolsInner(TypeEnum type, FunctionObject function) {
        this.type = type;
        this.function = function;
    }

    public CreateThreadAndRunRequestToolsInner type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of tool being defined: &#x60;code_interpreter&#x60;
     * @return type
     */
    @NotNull
    @Schema(name = "type", description = "The type of tool being defined: `code_interpreter`", requiredMode = Schema.RequiredMode.REQUIRED)
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

    public CreateThreadAndRunRequestToolsInner function(FunctionObject function) {
        this.function = function;
        return this;
    }

    /**
     * Get function
     * @return function
     */
    @Valid
    @NotNull
    @Schema(name = "function", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_FUNCTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public FunctionObject getFunction() {
        return function;
    }

    @JsonProperty(JSON_PROPERTY_FUNCTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFunction(FunctionObject function) {
        this.function = function;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateThreadAndRunRequestToolsInner createThreadAndRunRequestToolsInner = (CreateThreadAndRunRequestToolsInner) o;
        return Objects.equals(this.type, createThreadAndRunRequestToolsInner.type) &&
            Objects.equals(this.function, createThreadAndRunRequestToolsInner.function);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, function);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateThreadAndRunRequestToolsInner {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

