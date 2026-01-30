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
 * @param id Project's public ID
 * @param role Project membership role
 */
data class InviteRequestProjectsInner(

    @Schema(example = "null", required = true, description = "Project's public ID")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "Project membership role")
    @get:JsonProperty("role", required = true) val role: InviteRequestProjectsInner.Role
) {

    /**
    * Project membership role
    * Values: member,owner
    */
    enum class Role(@get:JsonValue val value: kotlin.String) {

        member("member"),
        owner("owner");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Role {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'InviteRequestProjectsInner'")
            }
        }
    }

}

