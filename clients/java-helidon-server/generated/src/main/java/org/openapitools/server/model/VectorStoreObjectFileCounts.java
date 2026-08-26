package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class VectorStoreObjectFileCounts   {

    private Integer inProgress;
    private Integer completed;
    private Integer failed;
    private Integer cancelled;
    private Integer total;

    /**
     * Default constructor.
     */
    public VectorStoreObjectFileCounts() {
    // JSON-B / Jackson
    }

    /**
     * Create VectorStoreObjectFileCounts.
     *
     * @param inProgress The number of files that are currently being processed.
     * @param completed The number of files that have been successfully processed.
     * @param failed The number of files that have failed to process.
     * @param cancelled The number of files that were cancelled.
     * @param total The total number of files.
     */
    public VectorStoreObjectFileCounts(
        Integer inProgress, 
        Integer completed, 
        Integer failed, 
        Integer cancelled, 
        Integer total
    ) {
        this.inProgress = inProgress;
        this.completed = completed;
        this.failed = failed;
        this.cancelled = cancelled;
        this.total = total;
    }



    /**
     * The number of files that are currently being processed.
     * @return inProgress
     */
    public Integer getInProgress() {
        return inProgress;
    }

    public void setInProgress(Integer inProgress) {
        this.inProgress = inProgress;
    }

    /**
     * The number of files that have been successfully processed.
     * @return completed
     */
    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    /**
     * The number of files that have failed to process.
     * @return failed
     */
    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * The number of files that were cancelled.
     * @return cancelled
     */
    public Integer getCancelled() {
        return cancelled;
    }

    public void setCancelled(Integer cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * The total number of files.
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VectorStoreObjectFileCounts {\n");
        
        sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
        sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

