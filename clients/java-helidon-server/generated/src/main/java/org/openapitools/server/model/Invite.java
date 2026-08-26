package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.InviteProjectsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents an individual `invite` to the organization.
 */
public class Invite   {


    /**
    * The object type, which is always `organization.invite`
    */
    public enum ObjectEnum {
        ORGANIZATION_INVITE("organization.invite");

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
    private String email;

    /**
    * `owner` or `reader`
    */
    public enum RoleEnum {
        OWNER("owner"),
        READER("reader");

        private String value;

        RoleEnum(String value) {
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
        public static RoleEnum fromValue(String text) {
            for (RoleEnum b : RoleEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private RoleEnum role;

    /**
    * `accepted`,`expired`, or `pending`
    */
    public enum StatusEnum {
        ACCEPTED("accepted"),
        EXPIRED("expired"),
        PENDING("pending");

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private StatusEnum status;
    private Integer invitedAt;
    private Integer expiresAt;
    private Integer acceptedAt;
    private List<@Valid InviteProjectsInner> projects = new ArrayList<>();

    /**
     * Default constructor.
     */
    public Invite() {
    // JSON-B / Jackson
    }

    /**
     * Create Invite.
     *
     * @param _object The object type, which is always &#x60;organization.invite&#x60;
     * @param id The identifier, which can be referenced in API endpoints
     * @param email The email address of the individual to whom the invite was sent
     * @param role &#x60;owner&#x60; or &#x60;reader&#x60;
     * @param status &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60;
     * @param invitedAt The Unix timestamp (in seconds) of when the invite was sent.
     * @param expiresAt The Unix timestamp (in seconds) of when the invite expires.
     * @param acceptedAt The Unix timestamp (in seconds) of when the invite was accepted.
     * @param projects The projects that were granted membership upon acceptance of the invite.
     */
    public Invite(
        ObjectEnum _object, 
        String id, 
        String email, 
        RoleEnum role, 
        StatusEnum status, 
        Integer invitedAt, 
        Integer expiresAt, 
        Integer acceptedAt, 
        List<@Valid InviteProjectsInner> projects
    ) {
        this._object = _object;
        this.id = id;
        this.email = email;
        this.role = role;
        this.status = status;
        this.invitedAt = invitedAt;
        this.expiresAt = expiresAt;
        this.acceptedAt = acceptedAt;
        this.projects = projects;
    }



    /**
     * The object type, which is always `organization.invite`
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The identifier, which can be referenced in API endpoints
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The email address of the individual to whom the invite was sent
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * `owner` or `reader`
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    /**
     * `accepted`,`expired`, or `pending`
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * The Unix timestamp (in seconds) of when the invite was sent.
     * @return invitedAt
     */
    public Integer getInvitedAt() {
        return invitedAt;
    }

    public void setInvitedAt(Integer invitedAt) {
        this.invitedAt = invitedAt;
    }

    /**
     * The Unix timestamp (in seconds) of when the invite expires.
     * @return expiresAt
     */
    public Integer getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * The Unix timestamp (in seconds) of when the invite was accepted.
     * @return acceptedAt
     */
    public Integer getAcceptedAt() {
        return acceptedAt;
    }

    public void setAcceptedAt(Integer acceptedAt) {
        this.acceptedAt = acceptedAt;
    }

    /**
     * The projects that were granted membership upon acceptance of the invite.
     * @return projects
     */
    public List<@Valid InviteProjectsInner> getProjects() {
        return projects;
    }

    public void setProjects(List<@Valid InviteProjectsInner> projects) {
        this.projects = projects;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Invite {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    invitedAt: ").append(toIndentedString(invitedAt)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    acceptedAt: ").append(toIndentedString(acceptedAt)).append("\n");
        sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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

