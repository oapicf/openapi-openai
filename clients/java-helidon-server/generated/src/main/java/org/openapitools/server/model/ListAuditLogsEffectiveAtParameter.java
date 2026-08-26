package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ListAuditLogsEffectiveAtParameter   {

    private Integer gt;
    private Integer gte;
    private Integer lt;
    private Integer lte;

    /**
     * Default constructor.
     */
    public ListAuditLogsEffectiveAtParameter() {
    // JSON-B / Jackson
    }

    /**
     * Create ListAuditLogsEffectiveAtParameter.
     *
     * @param gt Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than this value.
     * @param gte Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than or equal to this value.
     * @param lt Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than this value.
     * @param lte Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than or equal to this value.
     */
    public ListAuditLogsEffectiveAtParameter(
        Integer gt, 
        Integer gte, 
        Integer lt, 
        Integer lte
    ) {
        this.gt = gt;
        this.gte = gte;
        this.lt = lt;
        this.lte = lte;
    }



    /**
     * Return only events whose `effective_at` (Unix seconds) is greater than this value.
     * @return gt
     */
    public Integer getGt() {
        return gt;
    }

    public void setGt(Integer gt) {
        this.gt = gt;
    }

    /**
     * Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
     * @return gte
     */
    public Integer getGte() {
        return gte;
    }

    public void setGte(Integer gte) {
        this.gte = gte;
    }

    /**
     * Return only events whose `effective_at` (Unix seconds) is less than this value.
     * @return lt
     */
    public Integer getLt() {
        return lt;
    }

    public void setLt(Integer lt) {
        this.lt = lt;
    }

    /**
     * Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
     * @return lte
     */
    public Integer getLte() {
        return lte;
    }

    public void setLte(Integer lte) {
        this.lte = lte;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditLogsEffectiveAtParameter {\n");
        
        sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
        sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
        sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
        sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
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

