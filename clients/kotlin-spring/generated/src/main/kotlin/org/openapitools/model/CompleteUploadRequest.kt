package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param partIds The ordered list of Part IDs. 
 * @param md5 The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
 */
data class CompleteUploadRequest(

    @Schema(example = "null", required = true, description = "The ordered list of Part IDs. ")
    @get:JsonProperty("part_ids", required = true) val partIds: kotlin.collections.List<kotlin.String>,

    @Schema(example = "null", description = "The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. ")
    @get:JsonProperty("md5") val md5: kotlin.String? = null
) {

}

