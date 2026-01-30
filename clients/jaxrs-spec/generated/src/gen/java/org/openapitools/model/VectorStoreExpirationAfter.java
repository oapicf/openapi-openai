package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The expiration policy for a vector store.
 **/
@ApiModel(description = "The expiration policy for a vector store.")
@JsonTypeName("VectorStoreExpirationAfter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreExpirationAfter   {
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AnchorEnum fromString(String s) {
        for (AnchorEnum b : AnchorEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  }

  @JsonCreator
  public VectorStoreExpirationAfter(
    @JsonProperty(required = true, value = "anchor") AnchorEnum anchor,
    @JsonProperty(required = true, value = "days") Integer days
  ) {
    this.anchor = anchor;
    this.days = days;
  }

  /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;.
   **/
  public VectorStoreExpirationAfter anchor(AnchorEnum anchor) {
    this.anchor = anchor;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.")
  @JsonProperty(required = true, value = "anchor")
  @NotNull public AnchorEnum getAnchor() {
    return anchor;
  }

  @JsonProperty(required = true, value = "anchor")
  public void setAnchor(AnchorEnum anchor) {
    this.anchor = anchor;
  }

  /**
   * The number of days after the anchor time that the vector store will expire.
   * minimum: 1
   * maximum: 365
   **/
  public VectorStoreExpirationAfter days(Integer days) {
    this.days = days;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of days after the anchor time that the vector store will expire.")
  @JsonProperty(required = true, value = "days")
  @NotNull  @Min(1) @Max(365)public Integer getDays() {
    return days;
  }

  @JsonProperty(required = true, value = "days")
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

