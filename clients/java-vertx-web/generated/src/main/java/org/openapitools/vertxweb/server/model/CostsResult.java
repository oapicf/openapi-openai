package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CostsResultAmount;

/**
 * The aggregated costs details of the specific time bucket.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CostsResult   {
  


  public enum ObjectEnum {
    ORGANIZATION_COSTS_RESULT("organization.costs.result");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private CostsResultAmount amount;
  private String lineItem;
  private String projectId;

  public CostsResult () {

  }

  public CostsResult (ObjectEnum _object, CostsResultAmount amount, String lineItem, String projectId) {
    this._object = _object;
    this.amount = amount;
    this.lineItem = lineItem;
    this.projectId = projectId;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("amount")
  public CostsResultAmount getAmount() {
    return amount;
  }
  public void setAmount(CostsResultAmount amount) {
    this.amount = amount;
  }

    
  @JsonProperty("line_item")
  public String getLineItem() {
    return lineItem;
  }
  public void setLineItem(String lineItem) {
    this.lineItem = lineItem;
  }

    
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostsResult costsResult = (CostsResult) o;
    return Objects.equals(_object, costsResult._object) &&
        Objects.equals(amount, costsResult.amount) &&
        Objects.equals(lineItem, costsResult.lineItem) &&
        Objects.equals(projectId, costsResult.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, amount, lineItem, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostsResult {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    lineItem: ").append(toIndentedString(lineItem)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
