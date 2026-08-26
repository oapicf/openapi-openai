package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RunStepDetailsToolCallsCodeOutputImageObjectImage   {

    private String fileId;

    /**
     * Default constructor.
     */
    public RunStepDetailsToolCallsCodeOutputImageObjectImage() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDetailsToolCallsCodeOutputImageObjectImage.
     *
     * @param fileId The [file](/docs/api-reference/files) ID of the image.
     */
    public RunStepDetailsToolCallsCodeOutputImageObjectImage(
        String fileId
    ) {
        this.fileId = fileId;
    }



    /**
     * The [file](/docs/api-reference/files) ID of the image.
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDetailsToolCallsCodeOutputImageObjectImage {\n");
        
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
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

