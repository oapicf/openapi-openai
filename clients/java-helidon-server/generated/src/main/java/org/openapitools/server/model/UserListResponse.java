package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.User;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UserListResponse   {


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
    private List<@Valid User> data = new ArrayList<>();
    private String firstId;
    private String lastId;
    private Boolean hasMore;

    /**
     * Default constructor.
     */
    public UserListResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create UserListResponse.
     *
     * @param _object _object
     * @param data data
     * @param firstId firstId
     * @param lastId lastId
     * @param hasMore hasMore
     */
    public UserListResponse(
        ObjectEnum _object, 
        List<@Valid User> data, 
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
    public List<@Valid User> getData() {
        return data;
    }

    public void setData(List<@Valid User> data) {
        this.data = data;
    }

    /**
     * Get firstId
     * @return firstId
     */
    public String getFirstId() {
        return firstId;
    }

    public void setFirstId(String firstId) {
        this.firstId = firstId;
    }

    /**
     * Get lastId
     * @return lastId
     */
    public String getLastId() {
        return lastId;
    }

    public void setLastId(String lastId) {
        this.lastId = lastId;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserListResponse {\n");
        
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

