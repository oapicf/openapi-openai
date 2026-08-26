package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.UsageTimeBucket;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UsageResponse   {


    /**
    * Gets or Sets _object
    */
    public enum ObjectEnum {
        PAGE("page");

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
    private List<@Valid UsageTimeBucket> data = new ArrayList<>();
    private Boolean hasMore;
    private String nextPage;

    /**
     * Default constructor.
     */
    public UsageResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create UsageResponse.
     *
     * @param _object _object
     * @param data data
     * @param hasMore hasMore
     * @param nextPage nextPage
     */
    public UsageResponse(
        ObjectEnum _object, 
        List<@Valid UsageTimeBucket> data, 
        Boolean hasMore, 
        String nextPage
    ) {
        this._object = _object;
        this.data = data;
        this.hasMore = hasMore;
        this.nextPage = nextPage;
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
     * Get data
     * @return data
     */
    public List<@Valid UsageTimeBucket> getData() {
        return data;
    }

    public void setData(List<@Valid UsageTimeBucket> data) {
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
     * Get nextPage
     * @return nextPage
     */
    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageResponse {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
        sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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

