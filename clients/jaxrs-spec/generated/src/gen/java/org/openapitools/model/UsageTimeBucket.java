package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UsageTimeBucketResultInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("UsageTimeBucket")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageTimeBucket   {
  public enum ObjectEnum {

    BUCKET(String.valueOf("bucket"));


    private String value;

    ObjectEnum (String v) {
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
    public static ObjectEnum fromString(String s) {
        for (ObjectEnum b : ObjectEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ObjectEnum _object;
  private Integer startTime;
  private Integer endTime;
  private @Valid List<UsageTimeBucketResultInner> result = new ArrayList<>();

  public UsageTimeBucket() {
  }

  @JsonCreator
  public UsageTimeBucket(
    @JsonProperty(required = true, value = "object") ObjectEnum _object,
    @JsonProperty(required = true, value = "start_time") Integer startTime,
    @JsonProperty(required = true, value = "end_time") Integer endTime,
    @JsonProperty(required = true, value = "result") List<@Valid UsageTimeBucketResultInner> result
  ) {
    this._object = _object;
    this.startTime = startTime;
    this.endTime = endTime;
    this.result = result;
  }

  /**
   **/
  public UsageTimeBucket _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "object")
  @NotNull public ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty(required = true, value = "object")
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   **/
  public UsageTimeBucket startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "start_time")
  @NotNull public Integer getStartTime() {
    return startTime;
  }

  @JsonProperty(required = true, value = "start_time")
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   **/
  public UsageTimeBucket endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "end_time")
  @NotNull public Integer getEndTime() {
    return endTime;
  }

  @JsonProperty(required = true, value = "end_time")
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   **/
  public UsageTimeBucket result(List<UsageTimeBucketResultInner> result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "result")
  @NotNull @Valid public List<@Valid UsageTimeBucketResultInner> getResult() {
    return result;
  }

  @JsonProperty(required = true, value = "result")
  public void setResult(List<UsageTimeBucketResultInner> result) {
    this.result = result;
  }

  public UsageTimeBucket addResultItem(UsageTimeBucketResultInner resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }

    this.result.add(resultItem);
    return this;
  }

  public UsageTimeBucket removeResultItem(UsageTimeBucketResultInner resultItem) {
    if (resultItem != null && this.result != null) {
      this.result.remove(resultItem);
    }

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
    UsageTimeBucket usageTimeBucket = (UsageTimeBucket) o;
    return Objects.equals(this._object, usageTimeBucket._object) &&
        Objects.equals(this.startTime, usageTimeBucket.startTime) &&
        Objects.equals(this.endTime, usageTimeBucket.endTime) &&
        Objects.equals(this.result, usageTimeBucket.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, startTime, endTime, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageTimeBucket {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

