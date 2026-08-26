package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AdminApiKey;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ApiKeyList   {

    private String _object;
    private List<@Valid AdminApiKey> data = new ArrayList<>();
    private Boolean hasMore;
    private String firstId;
    private String lastId;

    /**
     * Default constructor.
     */
    public ApiKeyList() {
    // JSON-B / Jackson
    }

    /**
     * Create ApiKeyList.
     *
     * @param _object _object
     * @param data data
     * @param hasMore hasMore
     * @param firstId firstId
     * @param lastId lastId
     */
    public ApiKeyList(
        String _object, 
        List<@Valid AdminApiKey> data, 
        Boolean hasMore, 
        String firstId, 
        String lastId
    ) {
        this._object = _object;
        this.data = data;
        this.hasMore = hasMore;
        this.firstId = firstId;
        this.lastId = lastId;
    }



    /**
     * Get _object
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    /**
     * Get data
     * @return data
     */
    public List<@Valid AdminApiKey> getData() {
        return data;
    }

    public void setData(List<@Valid AdminApiKey> data) {
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiKeyList {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
        sb.append("    firstId: ").append(toIndentedString(firstId)).append("\n");
        sb.append("    lastId: ").append(toIndentedString(lastId)).append("\n");
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

