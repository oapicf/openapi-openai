package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The expiration policy for a vector store.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class VectorStoreExpirationAfter   {
  /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
   */
  public enum AnchorEnum {
    LAST_ACTIVE_AT("last_active_at");

    private final String value;

    AnchorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AnchorEnum fromValue(String value) {
      for (AnchorEnum b : AnchorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("anchor")
  @NotNull

  private AnchorEnum anchor;

  @JsonProperty("days")
  @NotNull
@Min(1)
@Max(365)

  private Integer days;

  public VectorStoreExpirationAfter anchor(AnchorEnum anchor) {
    this.anchor = anchor;
    return this;
  }

   /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
   * @return anchor
  **/
  public AnchorEnum getAnchor() {
    return anchor;
  }

  public void setAnchor(AnchorEnum anchor) {
    this.anchor = anchor;
  }

  public VectorStoreExpirationAfter days(Integer days) {
    this.days = days;
    return this;
  }

   /**
   * The number of days after the anchor time that the vector store will expire.
   * minimum: 1
   * maximum: 365
   * @return days
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

