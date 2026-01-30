package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListAuditLogsEffectiveAtParameter
 */

@JsonTypeName("list_audit_logs_effective_at_parameter")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ListAuditLogsEffectiveAtParameter {

  private Integer gt;

  private Integer gte;

  private Integer lt;

  private Integer lte;

  public ListAuditLogsEffectiveAtParameter gt(Integer gt) {
    this.gt = gt;
    return this;
  }

  /**
   * Return only events whose `effective_at` (Unix seconds) is greater than this value.
   * @return gt
   */
  
  @Schema(name = "gt", description = "Return only events whose `effective_at` (Unix seconds) is greater than this value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gt")
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
   */
  
  @Schema(name = "gte", description = "Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gte")
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
   */
  
  @Schema(name = "lt", description = "Return only events whose `effective_at` (Unix seconds) is less than this value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lt")
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
   */
  
  @Schema(name = "lte", description = "Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

