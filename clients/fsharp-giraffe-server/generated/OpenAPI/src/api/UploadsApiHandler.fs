namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open UploadsApiHandlerParams
open UploadsApiServiceInterface
open UploadsApiServiceImplementation
open OpenAPI.Model.CompleteUploadRequest
open OpenAPI.Model.CreateUploadRequest
open OpenAPI.Model.Upload
open OpenAPI.Model.UploadPart

module UploadsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AddUploadPart
    /// <summary>
    /// Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
    /// </summary>

    let AddUploadPart (pathParams:AddUploadPartPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<AddUploadPartFormParams>()
          let serviceArgs = {   formParams=formParams; pathParams=pathParams;  } : AddUploadPartArgs
          let result = UploadsApiService.AddUploadPart ctx serviceArgs
          return! (match result with
                      | AddUploadPartStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CancelUpload
    /// <summary>
    /// Cancels the Upload. No Parts may be added after an Upload is cancelled. 
    /// </summary>

    let CancelUpload (pathParams:CancelUploadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : CancelUploadArgs
          let result = UploadsApiService.CancelUpload ctx serviceArgs
          return! (match result with
                      | CancelUploadStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CompleteUpload
    /// <summary>
    /// Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
    /// </summary>

    let CompleteUpload (pathParams:CompleteUploadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CompleteUploadBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CompleteUploadArgs
          let result = UploadsApiService.CompleteUpload ctx serviceArgs
          return! (match result with
                      | CompleteUploadStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateUpload
    /// <summary>
    /// Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
    /// </summary>

    let CreateUpload  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateUploadBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateUploadArgs
          let result = UploadsApiService.CreateUpload ctx serviceArgs
          return! (match result with
                      | CreateUploadStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

