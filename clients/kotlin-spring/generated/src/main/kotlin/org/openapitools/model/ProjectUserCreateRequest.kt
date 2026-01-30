package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param userId The ID of the user.
 * @param role `owner` or `member`
 */
data class ProjectUserCreateRequest(

    @Schema(example = "null", required = true, description = "The ID of the user.")
    @get:JsonProperty("user_id", required = true) val userId: kotlin.String,

    @Schema(example = "null", required = true, description = "`owner` or `member`")
    @get:JsonProperty("role", required = true) val role: ProjectUserCreateRequest.Role
) {

    /**
    * `owner` or `member`
    * Values: owner,member
    */
    enum class Role(@get:JsonValue val value: kotlin.String) {

        owner("owner"),
        member("member");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Role {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProjectUserCreateRequest'")
            }
        }
    }

}

