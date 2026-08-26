package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AssistantToolsFileSearchFileSearch;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AssistantToolsFileSearch   {


    /**
    * The type of tool being defined: `file_search`
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
    private AssistantToolsFileSearchFileSearch fileSearch;

    /**
     * Default constructor.
     */
    public AssistantToolsFileSearch() {
    // JSON-B / Jackson
    }

    /**
     * Create AssistantToolsFileSearch.
     *
     * @param type The type of tool being defined: &#x60;file_search&#x60;
     * @param fileSearch fileSearch
     */
    public AssistantToolsFileSearch(
        TypeEnum type, 
        AssistantToolsFileSearchFileSearch fileSearch
    ) {
        this.type = type;
        this.fileSearch = fileSearch;
    }



    /**
     * The type of tool being defined: `file_search`
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistantToolsFileSearch {\n");
        
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

