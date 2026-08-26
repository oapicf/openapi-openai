package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RunStepDetailsToolCallsFileSearchObjectFileSearch;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RunStepDetailsToolCallsFileSearchObject   {

    private String id;

    /**
    * The type of tool call. This is always going to be `file_search` for this type of tool call.
    */
    public enum TypeEnum {
        FILE_SEARCH("file_search");

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
    private RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch;

    /**
     * Default constructor.
     */
    public RunStepDetailsToolCallsFileSearchObject() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDetailsToolCallsFileSearchObject.
     *
     * @param id The ID of the tool call object.
     * @param type The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call.
     * @param fileSearch fileSearch
     */
    public RunStepDetailsToolCallsFileSearchObject(
        String id, 
        TypeEnum type, 
        RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch
    ) {
        this.id = id;
        this.type = type;
        this.fileSearch = fileSearch;
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
     * The type of tool call. This is always going to be `file_search` for this type of tool call.
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
    public RunStepDetailsToolCallsFileSearchObjectFileSearch getFileSearch() {
        return fileSearch;
    }

    public void setFileSearch(RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
        this.fileSearch = fileSearch;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDetailsToolCallsFileSearchObject {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    fileSearch: ").append(toIndentedString(fileSearch)).append("\n");
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

