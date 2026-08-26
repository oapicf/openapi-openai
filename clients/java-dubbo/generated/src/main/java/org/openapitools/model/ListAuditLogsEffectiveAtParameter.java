package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ListAuditLogsEffectiveAtParameter implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than this value.
   */
  @JsonProperty("gt")
  private Integer gt;

  /**
   * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than or equal to this value.
   */
  @JsonProperty("gte")
  private Integer gte;

  /**
   * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than this value.
   */
  @JsonProperty("lt")
  private Integer lt;

  /**
   * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than or equal to this value.
   */
  @JsonProperty("lte")
  private Integer lte;

  /**
   * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than this value.
   * @return gt
   */
  public Integer getGt() {
    return gt;
  }

  public void setGt(Integer gt) {
    this.gt = gt;
  }

  /**
   * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than or equal to this value.
   * @return gte
   */
  public Integer getGte() {
    return gte;
  }

  public void setGte(Integer gte) {
    this.gte = gte;
  }

  /**
   * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than this value.
   * @return lt
   */
  public Integer getLt() {
    return lt;
  }

  public void setLt(Integer lt) {
    this.lt = lt;
  }

  /**
   * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than or equal to this value.
   * @return lte
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
