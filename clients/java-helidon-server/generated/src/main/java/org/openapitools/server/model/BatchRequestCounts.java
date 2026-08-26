package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The request counts for different statuses within the batch.
 */
public class BatchRequestCounts   {

    private Integer total;
    private Integer completed;
    private Integer failed;

    /**
     * Default constructor.
     */
    public BatchRequestCounts() {
    // JSON-B / Jackson
    }

    /**
     * Create BatchRequestCounts.
     *
     * @param total Total number of requests in the batch.
     * @param completed Number of requests that have been completed successfully.
     * @param failed Number of requests that have failed.
     */
    public BatchRequestCounts(
        Integer total, 
        Integer completed, 
        Integer failed
    ) {
        this.total = total;
        this.completed = completed;
        this.failed = failed;
    }



    /**
     * Total number of requests in the batch.
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * Number of requests that have been completed successfully.
     * @return completed
     */
    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    /**
     * Number of requests that have failed.
     * @return failed
     */
    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRequestCounts {\n");
        
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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

