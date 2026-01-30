package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The expiration policy for a vector store.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreExpirationAfter   {
  

  /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;.
   */
  public enum AnchorEnum {
    LAST_ACTIVE_AT("last_active_at");
    private String value;

    AnchorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private AnchorEnum anchor;
  private Integer days;

  /**
   * Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.")
  @JsonProperty("anchor")
  @NotNull
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
   **/
  
  @ApiModelProperty(required = true, value = "The number of days after the anchor time that the vector store will expire.")
  @JsonProperty("days")
  @NotNull
 @Min(1) @Max(365)  public Integer getDays() {
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

