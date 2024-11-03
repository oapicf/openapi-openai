namespace OpenAPI

open FilesApiHandlerParams
open FilesApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module FilesApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateFile
    /// <summary>
    /// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    /// </summary>
   [<FunctionName("CreateFile")>]
    let CreateFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/files")>]
        req:HttpRequest ) =

      let result = FilesApiService.CreateFile ()
      match result with
      | CreateFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region DeleteFile
    /// <summary>
    /// Delete a file.
    /// </summary>
   [<FunctionName("DeleteFile")>]
    let DeleteFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/files/{file_id}")>]
        req:HttpRequest ) =

      let result = FilesApiService.DeleteFile ()
      match result with
      | DeleteFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region DownloadFile
    /// <summary>
    /// Returns the contents of the specified file.
    /// </summary>
   [<FunctionName("DownloadFile")>]
    let DownloadFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/files/{file_id}/content")>]
        req:HttpRequest ) =

      let result = FilesApiService.DownloadFile ()
      match result with
      | DownloadFileStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListFiles
    /// <summary>
    /// Returns a list of files that belong to the user&#39;s organization.
    /// </summary>
   [<FunctionName("ListFiles")>]
    let ListFiles
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/files")>]
        req:HttpRequest ) =

      let result = FilesApiService.ListFiles ()
      match result with
      | ListFilesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region RetrieveFile
    /// <summary>
    /// Returns information about a specific file.
    /// </summary>
   [<FunctionName("RetrieveFile")>]
    let RetrieveFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/files/{file_id}")>]
        req:HttpRequest ) =

      let result = FilesApiService.RetrieveFile ()
      match result with
      | RetrieveFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

