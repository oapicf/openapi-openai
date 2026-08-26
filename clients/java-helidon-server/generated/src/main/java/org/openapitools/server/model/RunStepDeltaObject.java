package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RunStepDeltaObjectDelta;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 */
public class RunStepDeltaObject   {

    private String id;

    /**
    * The object type, which is always `thread.run.step.delta`.
    */
    public enum ObjectEnum {
        THREAD_RUN_STEP_DELTA("thread.run.step.delta");

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
    private RunStepDeltaObjectDelta delta;

    /**
     * Default constructor.
     */
    public RunStepDeltaObject() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDeltaObject.
     *
     * @param id The identifier of the run step, which can be referenced in API endpoints.
     * @param _object The object type, which is always &#x60;thread.run.step.delta&#x60;.
     * @param delta delta
     */
    public RunStepDeltaObject(
        String id, 
        ObjectEnum _object, 
        RunStepDeltaObjectDelta delta
    ) {
        this.id = id;
        this._object = _object;
        this.delta = delta;
    }



    /**
     * The identifier of the run step, which can be referenced in API endpoints.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The object type, which is always `thread.run.step.delta`.
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * Get delta
     * @return delta
     */
    public RunStepDeltaObjectDelta getDelta() {
        return delta;
    }

    public void setDelta(RunStepDeltaObjectDelta delta) {
        this.delta = delta;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDeltaObject {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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

