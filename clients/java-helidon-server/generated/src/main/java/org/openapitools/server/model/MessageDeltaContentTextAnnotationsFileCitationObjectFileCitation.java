package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation   {

    private String fileId;
    private String quote;

    /**
     * Default constructor.
     */
    public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.
     *
     * @param fileId The ID of the specific File the citation is from.
     * @param quote The specific quote in the file.
     */
    public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation(
        String fileId, 
        String quote
    ) {
        this.fileId = fileId;
        this.quote = quote;
    }



    /**
     * The ID of the specific File the citation is from.
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * The specific quote in the file.
     * @return quote
     */
    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {\n");
        
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
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

