package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.DeleteFileResponse
import org.openapitools.server.api.model.ListFilesResponse
import org.openapitools.server.api.model.OpenAIFile

/**
* @TODO("Fill out implementation")
*/
@Singleton
class FilesApiAction @Inject constructor(
) : WebAction {

    @Post("/files")
    @Description("Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ")
    @RequestContentType(MediaTypes.FORM_DATA)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createFile(
        @Valid file: HttpCall, 
        @QueryParam(value = "purpose") purpose: kotlin.String 
    ): OpenAIFile {
        TODO()
    }

    @Delete("/files/{file_id}")
    @Description("Delete a file.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteFile(
        @PathParam("file_id") fileId: kotlin.String
    ): DeleteFileResponse {
        TODO()
    }

    @Get("/files/{file_id}/content")
    @Description("Returns the contents of the specified file.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun downloadFile(
        @PathParam("file_id") fileId: kotlin.String
    ): kotlin.String {
        TODO()
    }

    @Get("/files")
    @Description("Returns a list of files.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listFiles(
         @QueryParam(value = "purpose") purpose: kotlin.String?, 
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "order") order: kotlin.String, 
         @QueryParam(value = "after") after: kotlin.String?
    ): ListFilesResponse {
        TODO()
    }

    @Get("/files/{file_id}")
    @Description("Returns information about a specific file.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun retrieveFile(
        @PathParam("file_id") fileId: kotlin.String
    ): OpenAIFile {
        TODO()
    }
}
