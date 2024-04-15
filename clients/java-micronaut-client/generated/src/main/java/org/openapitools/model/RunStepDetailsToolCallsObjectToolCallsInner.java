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
import org.openapitools.model.RunStepDetailsToolCallsCodeObject;
import org.openapitools.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import org.openapitools.model.RunStepDetailsToolCallsFunctionObject;
import org.openapitools.model.RunStepDetailsToolCallsFunctionObjectFunction;
import org.openapitools.model.RunStepDetailsToolCallsRetrievalObject;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * RunStepDetailsToolCallsObjectToolCallsInner
 */
@JsonPropertyOrder({
  RunStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_ID,
  RunStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_TYPE,
  RunStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_CODE_INTERPRETER,
  RunStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_RETRIEVAL,
  RunStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_FUNCTION
})
@JsonTypeName("RunStepDetailsToolCallsObject_tool_calls_inner")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-04-14T13:37:52.123317469Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class RunStepDetailsToolCallsObjectToolCallsInner {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    /**
     * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
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

    public static final String JSON_PROPERTY_CODE_INTERPRETER = "code_interpreter";
    private RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

    public static final String JSON_PROPERTY_RETRIEVAL = "retrieval";
    private Object retrieval;

    public static final String JSON_PROPERTY_FUNCTION = "function";
    private RunStepDetailsToolCallsFunctionObjectFunction function;

    public RunStepDetailsToolCallsObjectToolCallsInner(String id, TypeEnum type, RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter, Object retrieval, RunStepDetailsToolCallsFunctionObjectFunction function) {
        this.id = id;
        this.type = type;
        this.codeInterpreter = codeInterpreter;
        this.retrieval = retrieval;
        this.function = function;
    }

    public RunStepDetailsToolCallsObjectToolCallsInner id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the tool call object.
     * @return id
     **/
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

    public RunStepDetailsToolCallsObjectToolCallsInner type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
     * @return type
     **/
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

    public RunStepDetailsToolCallsObjectToolCallsInner codeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
        this.codeInterpreter = codeInterpreter;
        return this;
    }

    /**
     * Get codeInterpreter
     * @return codeInterpreter
     **/
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

    public RunStepDetailsToolCallsObjectToolCallsInner retrieval(Object retrieval) {
        this.retrieval = retrieval;
        return this;
    }

    /**
     * For now, this is always going to be an empty object.
     * @return retrieval
     **/
    @NotNull
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

    public RunStepDetailsToolCallsObjectToolCallsInner function(RunStepDetailsToolCallsFunctionObjectFunction function) {
        this.function = function;
        return this;
    }

    /**
     * Get function
     * @return function
     **/
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_FUNCTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public RunStepDetailsToolCallsFunctionObjectFunction getFunction() {
        return function;
    }

    @JsonProperty(JSON_PROPERTY_FUNCTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFunction(RunStepDetailsToolCallsFunctionObjectFunction function) {
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
        RunStepDetailsToolCallsObjectToolCallsInner runStepDetailsToolCallsObjectToolCallsInner = (RunStepDetailsToolCallsObjectToolCallsInner) o;
        return Objects.equals(this.id, runStepDetailsToolCallsObjectToolCallsInner.id) &&
            Objects.equals(this.type, runStepDetailsToolCallsObjectToolCallsInner.type) &&
            Objects.equals(this.codeInterpreter, runStepDetailsToolCallsObjectToolCallsInner.codeInterpreter) &&
            Objects.equals(this.retrieval, runStepDetailsToolCallsObjectToolCallsInner.retrieval) &&
            Objects.equals(this.function, runStepDetailsToolCallsObjectToolCallsInner.function);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, codeInterpreter, retrieval, function);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDetailsToolCallsObjectToolCallsInner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
        sb.append("    retrieval: ").append(toIndentedString(retrieval)).append("\n");
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
