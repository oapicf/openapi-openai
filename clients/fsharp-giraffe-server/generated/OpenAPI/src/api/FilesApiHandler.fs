namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open FilesApiHandlerParams
open FilesApiServiceInterface
open FilesApiServiceImplementation
open OpenAPI.Model.DeleteFileResponse
open OpenAPI.Model.ListFilesResponse
open OpenAPI.Model.OpenAIFile

module FilesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateFile
    /// <summary>
    /// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    /// </summary>

    let CreateFile  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<CreateFileFormParams>()
          let serviceArgs = {   formParams=formParams;   } : CreateFileArgs
          let result = FilesApiService.CreateFile ctx serviceArgs
          return! (match result with
                      | CreateFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteFile
    /// <summary>
    /// Delete a file.
    /// </summary>

    let DeleteFile (pathParams:DeleteFilePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteFileArgs
          let result = FilesApiService.DeleteFile ctx serviceArgs
          return! (match result with
                      | DeleteFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DownloadFile
    /// <summary>
    /// Returns the contents of the specified file.
    /// </summary>

    let DownloadFile (pathParams:DownloadFilePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DownloadFileArgs
          let result = FilesApiService.DownloadFile ctx serviceArgs
          return! (match result with
                      | DownloadFileStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListFiles
    /// <summary>
    /// Returns a list of files that belong to the user&#39;s organization.
    /// </summary>

    let ListFiles  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListFilesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ListFilesArgs
          let result = FilesApiService.ListFiles ctx serviceArgs
          return! (match result with
                      | ListFilesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RetrieveFile
    /// <summary>
    /// Returns information about a specific file.
    /// </summary>

    let RetrieveFile (pathParams:RetrieveFilePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RetrieveFileArgs
          let result = FilesApiService.RetrieveFile ctx serviceArgs
          return! (match result with
                      | RetrieveFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

