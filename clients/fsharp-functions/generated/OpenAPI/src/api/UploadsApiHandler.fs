namespace OpenAPI

open UploadsApiHandlerParams
open UploadsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module UploadsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AddUploadPart
    /// <summary>
    /// Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
    /// </summary>
   [<FunctionName("AddUploadPart")>]
    let AddUploadPart
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/uploads/{upload_id}/parts")>]
        req:HttpRequest ) =

      let result = UploadsApiService.AddUploadPart ()
      match result with
      | AddUploadPartStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CancelUpload
    /// <summary>
    /// Cancels the Upload. No Parts may be added after an Upload is cancelled. 
    /// </summary>
   [<FunctionName("CancelUpload")>]
    let CancelUpload
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/uploads/{upload_id}/cancel")>]
        req:HttpRequest ) =

      let result = UploadsApiService.CancelUpload ()
      match result with
      | CancelUploadStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CompleteUpload
    /// <summary>
    /// Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
    /// </summary>
   [<FunctionName("CompleteUpload")>]
    let CompleteUpload
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/uploads/{upload_id}/complete")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CompleteUploadBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = UploadsApiService.CompleteUpload bodyParams
      match result with
      | CompleteUploadStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateUpload
    /// <summary>
    /// Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
    /// </summary>
   [<FunctionName("CreateUpload")>]
    let CreateUpload
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/uploads")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateUploadBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = UploadsApiService.CreateUpload bodyParams
      match result with
      | CreateUploadStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

