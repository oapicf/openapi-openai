package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAuditLogsEffectiveAtParameter   {
  
  private Integer gt;
  private Integer gte;
  private Integer lt;
  private Integer lte;

  public ListAuditLogsEffectiveAtParameter () {

  }

  public ListAuditLogsEffectiveAtParameter (Integer gt, Integer gte, Integer lt, Integer lte) {
    this.gt = gt;
    this.gte = gte;
    this.lt = lt;
    this.lte = lte;
  }

    
  @JsonProperty("gt")
  public Integer getGt() {
    return gt;
  }
  public void setGt(Integer gt) {
    this.gt = gt;
  }

    
  @JsonProperty("gte")
  public Integer getGte() {
    return gte;
  }
  public void setGte(Integer gte) {
    this.gte = gte;
  }

    
  @JsonProperty("lt")
  public Integer getLt() {
    return lt;
  }
  public void setLt(Integer lt) {
    this.lt = lt;
  }

    
  @JsonProperty("lte")
  public Integer getLte() {
    return lte;
  }
  public void setLte(Integer lte) {
    this.lte = lte;
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
    return Objects.equals(gt, listAuditLogsEffectiveAtParameter.gt) &&
        Objects.equals(gte, listAuditLogsEffectiveAtParameter.gte) &&
        Objects.equals(lt, listAuditLogsEffectiveAtParameter.lt) &&
        Objects.equals(lte, listAuditLogsEffectiveAtParameter.lte);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
