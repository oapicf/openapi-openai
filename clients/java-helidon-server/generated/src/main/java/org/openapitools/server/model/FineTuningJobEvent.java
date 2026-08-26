package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Fine-tuning job event object
 */
public class FineTuningJobEvent   {


    /**
    * The object type, which is always \"fine_tuning.job.event\".
    */
    public enum ObjectEnum {
        FINE_TUNING_JOB_EVENT("fine_tuning.job.event");

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
    private String id;
    private Integer createdAt;

    /**
    * The log level of the event.
    */
    public enum LevelEnum {
        INFO("info"),
        WARN("warn"),
        ERROR("error");

        private String value;

        LevelEnum(String value) {
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
        public static LevelEnum fromValue(String text) {
            for (LevelEnum b : LevelEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private LevelEnum level;
    private String message;

    /**
    * The type of event.
    */
    public enum TypeEnum {
        MESSAGE("message"),
        METRICS("metrics");

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private TypeEnum type;
    private Object data;

    /**
     * Default constructor.
     */
    public FineTuningJobEvent() {
    // JSON-B / Jackson
    }

    /**
     * Create FineTuningJobEvent.
     *
     * @param _object The object type, which is always \&quot;fine_tuning.job.event\&quot;.
     * @param id The object identifier.
     * @param createdAt The Unix timestamp (in seconds) for when the fine-tuning job was created.
     * @param level The log level of the event.
     * @param message The message of the event.
     * @param type The type of event.
     * @param data The data associated with the event.
     */
    public FineTuningJobEvent(
        ObjectEnum _object, 
        String id, 
        Integer createdAt, 
        LevelEnum level, 
        String message, 
        TypeEnum type, 
        Object data
    ) {
        this._object = _object;
        this.id = id;
        this.createdAt = createdAt;
        this.level = level;
        this.message = message;
        this.type = type;
        this.data = data;
    }



    /**
     * The object type, which is always \"fine_tuning.job.event\".
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The object identifier.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The log level of the event.
     * @return level
     */
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    /**
     * The message of the event.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * The type of event.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The data associated with the event.
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTuningJobEvent {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

