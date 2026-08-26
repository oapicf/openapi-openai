package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A result instance of the file search.
 */
public class RunStepDetailsToolCallsFileSearchResultObject   {

    private String fileId;
    private String fileName;
    private BigDecimal score;
    private List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> content = new ArrayList<>();

    /**
     * Default constructor.
     */
    public RunStepDetailsToolCallsFileSearchResultObject() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDetailsToolCallsFileSearchResultObject.
     *
     * @param fileId The ID of the file that result was found in.
     * @param fileName The name of the file that result was found in.
     * @param score The score of the result. All values must be a floating point number between 0 and 1.
     * @param content The content of the result that was found. The content is only included if requested via the include query parameter.
     */
    public RunStepDetailsToolCallsFileSearchResultObject(
        String fileId, 
        String fileName, 
        BigDecimal score, 
        List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> content
    ) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.score = score;
        this.content = content;
    }



    /**
     * The ID of the file that result was found in.
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * The name of the file that result was found in.
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * The score of the result. All values must be a floating point number between 0 and 1.
     * minimum: 0
     * maximum: 1
     * @return score
     */
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * The content of the result that was found. The content is only included if requested via the include query parameter.
     * @return content
     */
    public List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> getContent() {
        return content;
    }

    public void setContent(List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
        this.content = content;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDetailsToolCallsFileSearchResultObject {\n");
        
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

