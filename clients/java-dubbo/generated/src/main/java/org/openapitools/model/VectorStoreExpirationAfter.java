package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The expiration policy for a vector store.
 */
public class VectorStoreExpirationAfter implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;.
   */
  @JsonProperty("anchor")
  private String anchor;

  /**
   * The number of days after the anchor time that the vector store will expire.
   */
  @JsonProperty("days")
  private Integer days;

  /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;.
   * @return anchor
   */
  public String getAnchor() {
    return anchor;
  }

  public void setAnchor(String anchor) {
    this.anchor = anchor;
  }

  /**
   * The number of days after the anchor time that the vector store will expire.
   * @return days
   */
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
    return Objects.equals(this.anchor, vectorStoreExpirationAfter.anchor) &&
        Objects.equals(this.days, vectorStoreExpirationAfter.days);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
