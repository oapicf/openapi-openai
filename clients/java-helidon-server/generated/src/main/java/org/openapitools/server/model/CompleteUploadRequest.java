package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CompleteUploadRequest   {

    private List<String> partIds = new ArrayList<>();
    private String md5;

    /**
     * Default constructor.
     */
    public CompleteUploadRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CompleteUploadRequest.
     *
     * @param partIds The ordered list of Part IDs. 
     * @param md5 The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
     */
    public CompleteUploadRequest(
        List<String> partIds, 
        String md5
    ) {
        this.partIds = partIds;
        this.md5 = md5;
    }



    /**
     * The ordered list of Part IDs. 
     * @return partIds
     */
    public List<String> getPartIds() {
        return partIds;
    }

    public void setPartIds(List<String> partIds) {
        this.partIds = partIds;
    }

    /**
     * The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
     * @return md5
     */
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompleteUploadRequest {\n");
        
        sb.append("    partIds: ").append(toIndentedString(partIds)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
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

