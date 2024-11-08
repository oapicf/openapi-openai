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
import org.openapitools.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Details of the Code Interpreter tool call the run step was involved in.
 */
@JsonPropertyOrder({
  RunStepDetailsToolCallsCodeObject.JSON_PROPERTY_ID,
  RunStepDetailsToolCallsCodeObject.JSON_PROPERTY_TYPE,
  RunStepDetailsToolCallsCodeObject.JSON_PROPERTY_CODE_INTERPRETER
})
@JsonTypeName("RunStepDetailsToolCallsCodeObject")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class RunStepDetailsToolCallsCodeObject {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    /**
     * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
     */
    public enum TypeEnum {
        CODE_INTERPRETER("code_interpreter");

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

    public static final String JSON_PROPERTY_CODE_INTERPRETER = "code_interpreter";
    private RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

    public RunStepDetailsToolCallsCodeObject(String id, TypeEnum type, RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
        this.id = id;
        this.type = type;
        this.codeInterpreter = codeInterpreter;
    }

    public RunStepDetailsToolCallsCodeObject id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the tool call.
     * @return id
     */
    @NotNull
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

    public RunStepDetailsToolCallsCodeObject type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
     * @return type
     */
    @NotNull
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

    public RunStepDetailsToolCallsCodeObject codeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
        this.codeInterpreter = codeInterpreter;
        return this;
    }

    /**
     * Get codeInterpreter
     * @return codeInterpreter
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_CODE_INTERPRETER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public RunStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
        return codeInterpreter;
    }

    @JsonProperty(JSON_PROPERTY_CODE_INTERPRETER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCodeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
        this.codeInterpreter = codeInterpreter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObject = (RunStepDetailsToolCallsCodeObject) o;
        return Objects.equals(this.id, runStepDetailsToolCallsCodeObject.id) &&
            Objects.equals(this.type, runStepDetailsToolCallsCodeObject.type) &&
            Objects.equals(this.codeInterpreter, runStepDetailsToolCallsCodeObject.codeInterpreter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, codeInterpreter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDetailsToolCallsCodeObject {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
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

