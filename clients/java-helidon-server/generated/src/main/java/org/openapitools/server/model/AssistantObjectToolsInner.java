package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AssistantToolsCode;
import org.openapitools.server.model.AssistantToolsFileSearch;
import org.openapitools.server.model.AssistantToolsFileSearchFileSearch;
import org.openapitools.server.model.AssistantToolsFunction;
import org.openapitools.server.model.FunctionObject;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AssistantObjectToolsInner   {


    /**
    * The type of tool being defined: `code_interpreter`
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
    private AssistantToolsFileSearchFileSearch fileSearch;
    private FunctionObject function;

    /**
     * Default constructor.
     */
    public AssistantObjectToolsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create AssistantObjectToolsInner.
     *
     * @param type The type of tool being defined: &#x60;code_interpreter&#x60;
     * @param fileSearch fileSearch
     * @param function function
     */
    public AssistantObjectToolsInner(
        TypeEnum type, 
        AssistantToolsFileSearchFileSearch fileSearch, 
        FunctionObject function
    ) {
        this.type = type;
        this.fileSearch = fileSearch;
        this.function = function;
    }



    /**
     * The type of tool being defined: `code_interpreter`
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get fileSearch
     * @return fileSearch
     */
    public AssistantToolsFileSearchFileSearch getFileSearch() {
        return fileSearch;
    }

    public void setFileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
        this.fileSearch = fileSearch;
    }

    /**
     * Get function
     * @return function
     */
    public FunctionObject getFunction() {
        return function;
    }

    public void setFunction(FunctionObject function) {
        this.function = function;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistantObjectToolsInner {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

