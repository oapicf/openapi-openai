package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.Invite;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class InviteListResponse   {


    /**
    * The object type, which is always `list`
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
    private List<@Valid Invite> data = new ArrayList<>();
    private String firstId;
    private String lastId;
    private Boolean hasMore;

    /**
     * Default constructor.
     */
    public InviteListResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create InviteListResponse.
     *
     * @param _object The object type, which is always &#x60;list&#x60;
     * @param data data
     * @param firstId The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60;
     * @param lastId The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60;
     * @param hasMore The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results.
     */
    public InviteListResponse(
        ObjectEnum _object, 
        List<@Valid Invite> data, 
        String firstId, 
        String lastId, 
        Boolean hasMore
    ) {
        this._object = _object;
        this.data = data;
        this.firstId = firstId;
        this.lastId = lastId;
        this.hasMore = hasMore;
    }



    /**
     * The object type, which is always `list`
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
    public List<@Valid Invite> getData() {
        return data;
    }

    public void setData(List<@Valid Invite> data) {
        this.data = data;
    }

    /**
     * The first `invite_id` in the retrieved `list`
     * @return firstId
     */
    public String getFirstId() {
        return firstId;
    }

    public void setFirstId(String firstId) {
        this.firstId = firstId;
    }

    /**
     * The last `invite_id` in the retrieved `list`
     * @return lastId
     */
    public String getLastId() {
        return lastId;
    }

    public void setLastId(String lastId) {
        this.lastId = lastId;
    }

    /**
     * The `has_more` property is used for pagination to indicate there are additional results.
     * @return hasMore
     */
    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteListResponse {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    firstId: ").append(toIndentedString(firstId)).append("\n");
        sb.append("    lastId: ").append(toIndentedString(lastId)).append("\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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

