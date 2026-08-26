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
import org.openapitools.server.api.model.CompleteUploadRequest
import org.openapitools.server.api.model.CreateUploadRequest
import org.openapitools.server.api.model.Upload
import org.openapitools.server.api.model.UploadPart

/**
* @TODO("Fill out implementation")
*/
@Singleton
class UploadsApiAction @Inject constructor(
) : WebAction {

    @Post("/uploads/{upload_id}/parts")
    @Description("Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). ")
    @RequestContentType(MediaTypes.FORM_DATA)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun addUploadPart(
        @PathParam("upload_id") uploadId: kotlin.String, 
        @Valid `data`: HttpCall
    ): UploadPart {
        TODO()
    }

    @Post("/uploads/{upload_id}/cancel")
    @Description("Cancels the Upload. No Parts may be added after an Upload is cancelled. ")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun cancelUpload(
        @PathParam("upload_id") uploadId: kotlin.String
    ): Upload {
        TODO()
    }

    @Post("/uploads/{upload_id}/complete")
    @Description("Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. ")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun completeUpload(
        @PathParam("upload_id") uploadId: kotlin.String, 
        @Valid @RequestBody completeUploadRequest: CompleteUploadRequest
    ): Upload {
        TODO()
    }

    @Post("/uploads")
    @Description("Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). ")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createUpload(
        @Valid @RequestBody createUploadRequest: CreateUploadRequest
    ): Upload {
        TODO()
    }
}
