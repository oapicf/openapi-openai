package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RunStepDetailsToolCallsCodeObject;
import org.openapitools.server.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import org.openapitools.server.model.RunStepDetailsToolCallsFileSearchObject;
import org.openapitools.server.model.RunStepDetailsToolCallsFileSearchObjectFileSearch;
import org.openapitools.server.model.RunStepDetailsToolCallsFunctionObject;
import org.openapitools.server.model.RunStepDetailsToolCallsFunctionObjectFunction;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RunStepDetailsToolCallsObjectToolCallsInner   {

    private String id;

    /**
    * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
    */
    public enum TypeEnum {
        CODE_INTERPRETER("code_interpreter"),
        FILE_SEARCH("file_search"),
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
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private TypeEnum type;
    private RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;
    private RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch;
    private RunStepDetailsToolCallsFunctionObjectFunction function;

    /**
     * Default constructor.
     */
    public RunStepDetailsToolCallsObjectToolCallsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDetailsToolCallsObjectToolCallsInner.
     *
     * @param id The ID of the tool call object.
     * @param type The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
     * @param codeInterpreter codeInterpreter
     * @param fileSearch fileSearch
     * @param function function
     */
    public RunStepDetailsToolCallsObjectToolCallsInner(
        String id, 
        TypeEnum type, 
        RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter, 
        RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch, 
        RunStepDetailsToolCallsFunctionObjectFunction function
    ) {
        this.id = id;
        this.type = type;
        this.codeInterpreter = codeInterpreter;
        this.fileSearch = fileSearch;
        this.function = function;
    }



    /**
     * The ID of the tool call object.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get codeInterpreter
     * @return codeInterpreter
     */
    public RunStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
        return codeInterpreter;
    }

    public void setCodeInterpreter(RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
        this.codeInterpreter = codeInterpreter;
    }

    /**
     * Get fileSearch
     * @return fileSearch
     */
    public RunStepDetailsToolCallsFileSearchObjectFileSearch getFileSearch() {
        return fileSearch;
    }

    public void setFileSearch(RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
        this.fileSearch = fileSearch;
    }

    /**
     * Get function
     * @return function
     */
    public RunStepDetailsToolCallsFunctionObjectFunction getFunction() {
        return function;
    }

    public void setFunction(RunStepDetailsToolCallsFunctionObjectFunction function) {
        this.function = function;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDetailsToolCallsObjectToolCallsInner {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
        sb.append("    fileSearch: ").append(toIndentedString(fileSearch)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

