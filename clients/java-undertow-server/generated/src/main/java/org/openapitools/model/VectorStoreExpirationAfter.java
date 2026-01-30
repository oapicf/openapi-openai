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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * The expiration policy for a vector store.
 */

@ApiModel(description = "The expiration policy for a vector store.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
   */
  public VectorStoreExpirationAfter anchor(AnchorEnum anchor) {
    this.anchor = anchor;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.")
  @JsonProperty("anchor")
  public AnchorEnum getAnchor() {
    return anchor;
  }
  public void setAnchor(AnchorEnum anchor) {
    this.anchor = anchor;
  }

  /**
   * The number of days after the anchor time that the vector store will expire.
   * minimum: 1
   * maximum: 365
   */
  public VectorStoreExpirationAfter days(Integer days) {
    this.days = days;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of days after the anchor time that the vector store will expire.")
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

