package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RunStepDeltaStepDetailsToolCallsFileSearchObject   {

    private Integer index;
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
    private Object fileSearch;

    /**
     * Default constructor.
     */
    public RunStepDeltaStepDetailsToolCallsFileSearchObject() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDeltaStepDetailsToolCallsFileSearchObject.
     *
     * @param index The index of the tool call in the tool calls array.
     * @param id The ID of the tool call object.
     * @param type The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call.
     * @param fileSearch For now, this is always going to be an empty object.
     */
    public RunStepDeltaStepDetailsToolCallsFileSearchObject(
        Integer index, 
        String id, 
        TypeEnum type, 
        Object fileSearch
    ) {
        this.index = index;
        this.id = id;
        this.type = type;
        this.fileSearch = fileSearch;
    }



    /**
     * The index of the tool call in the tool calls array.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
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
     * For now, this is always going to be an empty object.
     * @return fileSearch
     */
    public Object getFileSearch() {
        return fileSearch;
    }

    public void setFileSearch(Object fileSearch) {
        this.fileSearch = fileSearch;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDeltaStepDetailsToolCallsFileSearchObject {\n");
        
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

