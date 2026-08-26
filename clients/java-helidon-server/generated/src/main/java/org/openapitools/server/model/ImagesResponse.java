package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.Image;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ImagesResponse   {

    private Integer created;
    private List<@Valid Image> data = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ImagesResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create ImagesResponse.
     *
     * @param created created
     * @param data data
     */
    public ImagesResponse(
        Integer created, 
        List<@Valid Image> data
    ) {
        this.created = created;
        this.data = data;
    }



    /**
     * Get created
     * @return created
     */
    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     * Get data
     * @return data
     */
    public List<@Valid Image> getData() {
        return data;
    }

    public void setData(List<@Valid Image> data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImagesResponse {\n");
        
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

