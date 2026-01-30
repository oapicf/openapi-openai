package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UsageTimeBucketResultInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UsageTimeBucket  {
  
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
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")

  private ObjectEnum _object;

  @ApiModelProperty(required = true, value = "")

  private Integer startTime;

  @ApiModelProperty(required = true, value = "")

  private Integer endTime;

  @ApiModelProperty(required = true, value = "")

  private List<UsageTimeBucketResultInner> result = new ArrayList<>();
 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public UsageTimeBucket _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get startTime
   * @return startTime
  **/
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public UsageTimeBucket startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Get endTime
   * @return endTime
  **/
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public UsageTimeBucket endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
   * Get result
   * @return result
  **/
  @JsonProperty("result")
  public List<UsageTimeBucketResultInner> getResult() {
    return result;
  }

  public void setResult(List<UsageTimeBucketResultInner> result) {
    this.result = result;
  }

  public UsageTimeBucket result(List<UsageTimeBucketResultInner> result) {
    this.result = result;
    return this;
  }

  public UsageTimeBucket addResultItem(UsageTimeBucketResultInner resultItem) {
    this.result.add(resultItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

