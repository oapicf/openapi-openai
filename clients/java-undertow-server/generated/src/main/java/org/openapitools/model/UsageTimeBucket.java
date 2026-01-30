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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UsageTimeBucketResultInner;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageTimeBucket   {
  


  public enum ObjectEnum {
    BUCKET("bucket");

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
  private Integer startTime;
  private Integer endTime;
  private List<UsageTimeBucketResultInner> result = new ArrayList<>();

  /**
   */
  public UsageTimeBucket _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   */
  public UsageTimeBucket startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   */
  public UsageTimeBucket endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   */
  public UsageTimeBucket result(List<UsageTimeBucketResultInner> result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("result")
  public List<UsageTimeBucketResultInner> getResult() {
    return result;
  }
  public void setResult(List<UsageTimeBucketResultInner> result) {
    this.result = result;
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
    return Objects.equals(_object, usageTimeBucket._object) &&
        Objects.equals(startTime, usageTimeBucket.startTime) &&
        Objects.equals(endTime, usageTimeBucket.endTime) &&
        Objects.equals(result, usageTimeBucket.result);
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

