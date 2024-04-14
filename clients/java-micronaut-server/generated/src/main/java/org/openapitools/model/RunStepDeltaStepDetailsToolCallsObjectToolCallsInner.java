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
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFunctionObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsRetrievalObject;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
 */
@JsonPropertyOrder({
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_INDEX,
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_ID,
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_TYPE,
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_CODE_INTERPRETER,
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_RETRIEVAL,
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_FUNCTION
})
@JsonTypeName("RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {
    public static final String JSON_PROPERTY_INDEX = "index";
    private Integer index;

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
    private RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

    public static final String JSON_PROPERTY_RETRIEVAL = "retrieval";
    private Object retrieval;

    public static final String JSON_PROPERTY_FUNCTION = "function";
    private RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function;

    public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner(Integer index, TypeEnum type) {
        this.index = index;
        this.type = type;
    }

    public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner index(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * The index of the tool call in the tool calls array.
     * @return index
     **/
    @NotNull
    @Schema(name = "index", description = "The index of the tool call in the tool calls array.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getIndex() {
        return index;
    }

    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIndex(Integer index) {
        this.index = index;
    }

    public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the tool call object.
     * @return id
     **/
    @Nullable
    @Schema(name = "id", description = "The ID of the tool call object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
     * @return type
     **/
    @NotNull
    @Schema(name = "type", description = "The type of tool call. This is always going to be `code_interpreter` for this type of tool call.", requiredMode = Schema.RequiredMode.REQUIRED)
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

    public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner codeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
        this.codeInterpreter = codeInterpreter;
        return this;
    }

    /**
     * Get codeInterpreter
     * @return codeInterpreter
     **/
    @Valid
    @Nullable
    @Schema(name = "code_interpreter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CODE_INTERPRETER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
        return codeInterpreter;
    }

    @JsonProperty(JSON_PROPERTY_CODE_INTERPRETER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCodeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
        this.codeInterpreter = codeInterpreter;
    }

    public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner retrieval(Object retrieval) {
        this.retrieval = retrieval;
        return this;
    }

    /**
     * For now, this is always going to be an empty object.
     * @return retrieval
     **/
    @Nullable
    @Schema(name = "retrieval", description = "For now, this is always going to be an empty object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_RETRIEVAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getRetrieval() {
        return retrieval;
    }

    @JsonProperty(JSON_PROPERTY_RETRIEVAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRetrieval(Object retrieval) {
        this.retrieval = retrieval;
    }

    public RunStepDeltaStepDetailsToolCallsObjectToolCallsInner function(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function) {
        this.function = function;
        return this;
    }

    /**
     * Get function
     * @return function
     **/
    @Valid
    @Nullable
    @Schema(name = "function", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_FUNCTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction getFunction() {
        return function;
    }

    @JsonProperty(JSON_PROPERTY_FUNCTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFunction(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function) {
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
        RunStepDeltaStepDetailsToolCallsObjectToolCallsInner runStepDeltaStepDetailsToolCallsObjectToolCallsInner = (RunStepDeltaStepDetailsToolCallsObjectToolCallsInner) o;
        return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.index) &&
            Objects.equals(this.id, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.id) &&
            Objects.equals(this.type, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.type) &&
            Objects.equals(this.codeInterpreter, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.codeInterpreter) &&
            Objects.equals(this.retrieval, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.retrieval) &&
            Objects.equals(this.function, runStepDeltaStepDetailsToolCallsObjectToolCallsInner.function);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, id, type, codeInterpreter, retrieval, function);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

