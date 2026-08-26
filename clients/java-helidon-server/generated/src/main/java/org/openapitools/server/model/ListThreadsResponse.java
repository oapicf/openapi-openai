package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ThreadObject;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ListThreadsResponse   {

    private String _object;
    private List<@Valid ThreadObject> data = new ArrayList<>();
    private String firstId;
    private String lastId;
    private Boolean hasMore;

    /**
     * Default constructor.
     */
    public ListThreadsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create ListThreadsResponse.
     *
     * @param _object _object
     * @param data data
     * @param firstId firstId
     * @param lastId lastId
     * @param hasMore hasMore
     */
    public ListThreadsResponse(
        String _object, 
        List<@Valid ThreadObject> data, 
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
    public List<@Valid ThreadObject> getData() {
        return data;
    }

    public void setData(List<@Valid ThreadObject> data) {
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
        sb.append("class ListThreadsResponse {\n");
        
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

