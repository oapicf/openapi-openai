package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProjectUserCreateRequest   {

    private String userId;

    /**
    * `owner` or `member`
    */
    public enum RoleEnum {
        OWNER("owner"),
        MEMBER("member");

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
     * Default constructor.
     */
    public ProjectUserCreateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create ProjectUserCreateRequest.
     *
     * @param userId The ID of the user.
     * @param role &#x60;owner&#x60; or &#x60;member&#x60;
     */
    public ProjectUserCreateRequest(
        String userId, 
        RoleEnum role
    ) {
        this.userId = userId;
        this.role = role;
    }



    /**
     * The ID of the user.
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * `owner` or `member`
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectUserCreateRequest {\n");
        
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

