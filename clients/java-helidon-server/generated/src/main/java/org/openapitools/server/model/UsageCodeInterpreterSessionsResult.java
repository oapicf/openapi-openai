package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The aggregated code interpreter sessions usage details of the specific time bucket.
 */
public class UsageCodeInterpreterSessionsResult   {


    /**
    * Gets or Sets _object
    */
    public enum ObjectEnum {
        ORGANIZATION_USAGE_CODE_INTERPRETER_SESSIONS_RESULT("organization.usage.code_interpreter_sessions.result");

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
    private Integer sessions;
    private String projectId;

    /**
     * Default constructor.
     */
    public UsageCodeInterpreterSessionsResult() {
    // JSON-B / Jackson
    }

    /**
     * Create UsageCodeInterpreterSessionsResult.
     *
     * @param _object _object
     * @param sessions The number of code interpreter sessions.
     * @param projectId When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
     */
    public UsageCodeInterpreterSessionsResult(
        ObjectEnum _object, 
        Integer sessions, 
        String projectId
    ) {
        this._object = _object;
        this.sessions = sessions;
        this.projectId = projectId;
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
     * The number of code interpreter sessions.
     * @return sessions
     */
    public Integer getSessions() {
        return sessions;
    }

    public void setSessions(Integer sessions) {
        this.sessions = sessions;
    }

    /**
     * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageCodeInterpreterSessionsResult {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

