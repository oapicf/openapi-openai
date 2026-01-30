package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ListAuditLogsEffectiveAtParameter
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
   */
  @ApiModelProperty(value = "Return only events whose `effective_at` (Unix seconds) is greater than this value.")
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
  @ApiModelProperty(value = "Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.")
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
  @ApiModelProperty(value = "Return only events whose `effective_at` (Unix seconds) is less than this value.")
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
  @ApiModelProperty(value = "Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.")
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

