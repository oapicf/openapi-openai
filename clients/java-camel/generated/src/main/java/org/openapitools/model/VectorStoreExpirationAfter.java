package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The expiration policy for a vector store.
 */

@Schema(name = "VectorStoreExpirationAfter", description = "The expiration policy for a vector store.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreExpirationAfter {

  /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
   */
  public enum AnchorEnum {
    LAST_ACTIVE_AT("last_active_at");

    private final String value;

    AnchorEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private AnchorEnum anchor;

  private Integer days;

  public VectorStoreExpirationAfter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VectorStoreExpirationAfter(AnchorEnum anchor, Integer days) {
    this.anchor = anchor;
    this.days = days;
  }

  public VectorStoreExpirationAfter anchor(AnchorEnum anchor) {
    this.anchor = anchor;
    return this;
  }

  /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
   * @return anchor
   */
  @NotNull 
  @Schema(name = "anchor", description = "Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("anchor")
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
   */
  @NotNull @Min(value = 1) @Max(value = 365) 
  @Schema(name = "days", description = "The number of days after the anchor time that the vector store will expire.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

