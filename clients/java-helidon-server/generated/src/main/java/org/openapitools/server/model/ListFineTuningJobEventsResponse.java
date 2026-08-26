package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FineTuningJobEvent;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ListFineTuningJobEventsResponse   {

    private List<@Valid FineTuningJobEvent> data = new ArrayList<>();

    /**
    * Gets or Sets _object
    */
    public enum ObjectEnum {
        LIST("list");

        private String value;

        ObjectEnum(String value) {
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
        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ObjectEnum _object;

    /**
     * Default constructor.
     */
    public ListFineTuningJobEventsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create ListFineTuningJobEventsResponse.
     *
     * @param data data
     * @param _object _object
     */
    public ListFineTuningJobEventsResponse(
        List<@Valid FineTuningJobEvent> data, 
        ObjectEnum _object
    ) {
        this.data = data;
        this._object = _object;
    }



    /**
     * Get data
     * @return data
     */
    public List<@Valid FineTuningJobEvent> getData() {
        return data;
    }

    public void setData(List<@Valid FineTuningJobEvent> data) {
        this.data = data;
    }

    /**
     * Get _object
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFineTuningJobEventsResponse {\n");
        
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

