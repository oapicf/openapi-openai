package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListAuditLogsEffectiveAtParameter  {
  
 /**
  * Return only events whose `effective_at` (Unix seconds) is greater than this value.
  */
  @ApiModelProperty(value = "Return only events whose `effective_at` (Unix seconds) is greater than this value.")

  private Integer gt;

 /**
  * Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
  */
  @ApiModelProperty(value = "Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.")

  private Integer gte;

 /**
  * Return only events whose `effective_at` (Unix seconds) is less than this value.
  */
  @ApiModelProperty(value = "Return only events whose `effective_at` (Unix seconds) is less than this value.")

  private Integer lt;

 /**
  * Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
  */
  @ApiModelProperty(value = "Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.")

  private Integer lte;
 /**
   * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than this value.
   * @return gt
  **/
  @JsonProperty("gt")
  public Integer getGt() {
    return gt;
  }

  public void setGt(Integer gt) {
    this.gt = gt;
  }

  public ListAuditLogsEffectiveAtParameter gt(Integer gt) {
    this.gt = gt;
    return this;
  }

 /**
   * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than or equal to this value.
   * @return gte
  **/
  @JsonProperty("gte")
  public Integer getGte() {
    return gte;
  }

  public void setGte(Integer gte) {
    this.gte = gte;
  }

  public ListAuditLogsEffectiveAtParameter gte(Integer gte) {
    this.gte = gte;
    return this;
  }

 /**
   * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than this value.
   * @return lt
  **/
  @JsonProperty("lt")
  public Integer getLt() {
    return lt;
  }

  public void setLt(Integer lt) {
    this.lt = lt;
  }

  public ListAuditLogsEffectiveAtParameter lt(Integer lt) {
    this.lt = lt;
    return this;
  }

 /**
   * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than or equal to this value.
   * @return lte
  **/
  @JsonProperty("lte")
  public Integer getLte() {
    return lte;
  }

  public void setLte(Integer lte) {
    this.lte = lte;
  }

  public ListAuditLogsEffectiveAtParameter lte(Integer lte) {
    this.lte = lte;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAuditLogsEffectiveAtParameter listAuditLogsEffectiveAtParameter = (ListAuditLogsEffectiveAtParameter) o;
    return Objects.equals(this.gt, listAuditLogsEffectiveAtParameter.gt) &&
        Objects.equals(this.gte, listAuditLogsEffectiveAtParameter.gte) &&
        Objects.equals(this.lt, listAuditLogsEffectiveAtParameter.lt) &&
        Objects.equals(this.lte, listAuditLogsEffectiveAtParameter.lte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gt, gte, lt, lte);
  }

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

