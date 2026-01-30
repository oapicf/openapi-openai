package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The expiration policy for a vector store.
 */
@ApiModel(description="The expiration policy for a vector store.")

public class VectorStoreExpirationAfter  {
  
public enum AnchorEnum {

LAST_ACTIVE_AT(String.valueOf("last_active_at"));


    private String value;

    AnchorEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AnchorEnum fromValue(String value) {
        for (AnchorEnum b : AnchorEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
  */
  @ApiModelProperty(required = true, value = "Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.")

  private AnchorEnum anchor;

 /**
  * The number of days after the anchor time that the vector store will expire.
  */
  @ApiModelProperty(required = true, value = "The number of days after the anchor time that the vector store will expire.")

  private Integer days;
 /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;.
   * @return anchor
  **/
  @JsonProperty("anchor")
  public String getAnchor() {
    if (anchor == null) {
      return null;
    }
    return anchor.value();
  }

  public void setAnchor(AnchorEnum anchor) {
    this.anchor = anchor;
  }

  public VectorStoreExpirationAfter anchor(AnchorEnum anchor) {
    this.anchor = anchor;
    return this;
  }

 /**
   * The number of days after the anchor time that the vector store will expire.
   * minimum: 1
   * maximum: 365
   * @return days
  **/
  @JsonProperty("days")
  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }

  public VectorStoreExpirationAfter days(Integer days) {
    this.days = days;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

