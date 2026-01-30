/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ListAuditLogsEffectiveAtParameter   {
  
  private Integer gt;
  private Integer gte;
  private Integer lt;
  private Integer lte;

  /**
   * Return only events whose `effective_at` (Unix seconds) is greater than this value.
   */
  public ListAuditLogsEffectiveAtParameter gt(Integer gt) {
    this.gt = gt;
    return this;
  }

  
  @ApiModelProperty(value = "Return only events whose `effective_at` (Unix seconds) is greater than this value.")
  @JsonProperty("gt")
  public Integer getGt() {
    return gt;
  }
  public void setGt(Integer gt) {
    this.gt = gt;
  }

  /**
   * Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
   */
  public ListAuditLogsEffectiveAtParameter gte(Integer gte) {
    this.gte = gte;
    return this;
  }

  
  @ApiModelProperty(value = "Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.")
  @JsonProperty("gte")
  public Integer getGte() {
    return gte;
  }
  public void setGte(Integer gte) {
    this.gte = gte;
  }

  /**
   * Return only events whose `effective_at` (Unix seconds) is less than this value.
   */
  public ListAuditLogsEffectiveAtParameter lt(Integer lt) {
    this.lt = lt;
    return this;
  }

  
  @ApiModelProperty(value = "Return only events whose `effective_at` (Unix seconds) is less than this value.")
  @JsonProperty("lt")
  public Integer getLt() {
    return lt;
  }
  public void setLt(Integer lt) {
    this.lt = lt;
  }

  /**
   * Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
   */
  public ListAuditLogsEffectiveAtParameter lte(Integer lte) {
    this.lte = lte;
    return this;
  }

  
  @ApiModelProperty(value = "Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.")
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

