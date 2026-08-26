package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BatchErrorsDataInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BatchErrors   {

    private String _object;
    private List<@Valid BatchErrorsDataInner> data = new ArrayList<>();

    /**
     * Default constructor.
     */
    public BatchErrors() {
    // JSON-B / Jackson
    }

    /**
     * Create BatchErrors.
     *
     * @param _object The object type, which is always &#x60;list&#x60;.
     * @param data data
     */
    public BatchErrors(
        String _object, 
        List<@Valid BatchErrorsDataInner> data
    ) {
        this._object = _object;
        this.data = data;
    }



    /**
     * The object type, which is always `list`.
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
    public List<@Valid BatchErrorsDataInner> getData() {
        return data;
    }

    public void setData(List<@Valid BatchErrorsDataInner> data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchErrors {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

