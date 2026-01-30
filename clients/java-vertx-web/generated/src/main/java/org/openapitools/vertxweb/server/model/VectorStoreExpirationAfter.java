package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The expiration policy for a vector store.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VectorStoreExpirationAfter   {
  


  public enum AnchorEnum {
    LAST_ACTIVE_AT("last_active_at");

    private String value;

    AnchorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private AnchorEnum anchor;
  private Integer days;

  public VectorStoreExpirationAfter () {

  }

  public VectorStoreExpirationAfter (AnchorEnum anchor, Integer days) {
    this.anchor = anchor;
    this.days = days;
  }

    
  @JsonProperty("anchor")
  public AnchorEnum getAnchor() {
    return anchor;
  }
  public void setAnchor(AnchorEnum anchor) {
    this.anchor = anchor;
  }

    
  @JsonProperty("days")
  public Integer getDays() {
    return days;
  }
  public void setDays(Integer days) {
    this.days = days;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VectorStoreExpirationAfter vectorStoreExpirationAfter = (VectorStoreExpirationAfter) o;
    return Objects.equals(anchor, vectorStoreExpirationAfter.anchor) &&
        Objects.equals(days, vectorStoreExpirationAfter.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchor, days);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorStoreExpirationAfter {\n");
    
    sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
