package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.InviteRequestProjectsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class InviteRequest   {

    private String email;

    /**
    * `owner` or `reader`
    */
    public enum RoleEnum {
        READER("reader"),
        OWNER("owner");

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
    private List<@Valid InviteRequestProjectsInner> projects = new ArrayList<>();

    /**
     * Default constructor.
     */
    public InviteRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create InviteRequest.
     *
     * @param email Send an email to this address
     * @param role &#x60;owner&#x60; or &#x60;reader&#x60;
     * @param projects An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
     */
    public InviteRequest(
        String email, 
        RoleEnum role, 
        List<@Valid InviteRequestProjectsInner> projects
    ) {
        this.email = email;
        this.role = role;
        this.projects = projects;
    }



    /**
     * Send an email to this address
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
     * An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
     * @return projects
     */
    public List<@Valid InviteRequestProjectsInner> getProjects() {
        return projects;
    }

    public void setProjects(List<@Valid InviteRequestProjectsInner> projects) {
        this.projects = projects;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteRequest {\n");
        
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

