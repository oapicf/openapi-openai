package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FineTuningJob;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ListPaginatedFineTuningJobsResponse   {

    private List<@Valid FineTuningJob> data = new ArrayList<>();
    private Boolean hasMore;

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
    public ListPaginatedFineTuningJobsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create ListPaginatedFineTuningJobsResponse.
     *
     * @param data data
     * @param hasMore hasMore
     * @param _object _object
     */
    public ListPaginatedFineTuningJobsResponse(
        List<@Valid FineTuningJob> data, 
        Boolean hasMore, 
        ObjectEnum _object
    ) {
        this.data = data;
        this.hasMore = hasMore;
        this._object = _object;
    }



    /**
     * Get data
     * @return data
     */
    public List<@Valid FineTuningJob> getData() {
        return data;
    }

    public void setData(List<@Valid FineTuningJob> data) {
        this.data = data;
    }

    /**
     * Get hasMore
     * @return hasMore
     */
    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
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
        sb.append("class ListPaginatedFineTuningJobsResponse {\n");
        
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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

