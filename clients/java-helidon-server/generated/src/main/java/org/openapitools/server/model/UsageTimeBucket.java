package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.UsageTimeBucketResultInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UsageTimeBucket   {


    /**
    * Gets or Sets _object
    */
    public enum ObjectEnum {
        BUCKET("bucket");

        private String value;

        ObjectEnum(String value) {
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
        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ObjectEnum _object;
    private Integer startTime;
    private Integer endTime;
    private List<UsageTimeBucketResultInner> result = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UsageTimeBucket() {
    // JSON-B / Jackson
    }

    /**
     * Create UsageTimeBucket.
     *
     * @param _object _object
     * @param startTime startTime
     * @param endTime endTime
     * @param result result
     */
    public UsageTimeBucket(
        ObjectEnum _object, 
        Integer startTime, 
        Integer endTime, 
        List<UsageTimeBucketResultInner> result
    ) {
        this._object = _object;
        this.startTime = startTime;
        this.endTime = endTime;
        this.result = result;
    }



    /**
     * Get _object
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * Get startTime
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * Get endTime
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * Get result
     * @return result
     */
    public List<UsageTimeBucketResultInner> getResult() {
        return result;
    }

    public void setResult(List<UsageTimeBucketResultInner> result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

