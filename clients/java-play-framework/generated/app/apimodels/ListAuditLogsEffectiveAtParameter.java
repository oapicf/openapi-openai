package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListAuditLogsEffectiveAtParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ListAuditLogsEffectiveAtParameter   {
  @JsonProperty("gt")
  
  private Integer gt;

  @JsonProperty("gte")
  
  private Integer gte;

  @JsonProperty("lt")
  
  private Integer lt;

  @JsonProperty("lte")
  
  private Integer lte;

  public ListAuditLogsEffectiveAtParameter gt(Integer gt) {
    this.gt = gt;
    return this;
  }

   /**
   * Return only events whose `effective_at` (Unix seconds) is greater than this value.
   * @return gt
  **/
  public Integer getGt() {
    return gt;
  }

  public void setGt(Integer gt) {
    this.gt = gt;
  }

  public ListAuditLogsEffectiveAtParameter gte(Integer gte) {
    this.gte = gte;
    return this;
  }

   /**
   * Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
   * @return gte
  **/
  public Integer getGte() {
    return gte;
  }

  public void setGte(Integer gte) {
    this.gte = gte;
  }

  public ListAuditLogsEffectiveAtParameter lt(Integer lt) {
    this.lt = lt;
    return this;
  }

   /**
   * Return only events whose `effective_at` (Unix seconds) is less than this value.
   * @return lt
  **/
  public Integer getLt() {
    return lt;
  }

  public void setLt(Integer lt) {
    this.lt = lt;
  }

  public ListAuditLogsEffectiveAtParameter lte(Integer lte) {
    this.lte = lte;
    return this;
  }

   /**
   * Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
   * @return lte
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

