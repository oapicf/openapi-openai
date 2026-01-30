namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open VectorStoresApiHandlerParams
open VectorStoresApiServiceInterface
open VectorStoresApiServiceImplementation
open OpenAPI.Model.CreateVectorStoreFileBatchRequest
open OpenAPI.Model.CreateVectorStoreFileRequest
open OpenAPI.Model.CreateVectorStoreRequest
open OpenAPI.Model.DeleteVectorStoreFileResponse
open OpenAPI.Model.DeleteVectorStoreResponse
open OpenAPI.Model.ListVectorStoreFilesResponse
open OpenAPI.Model.ListVectorStoresResponse
open OpenAPI.Model.UpdateVectorStoreRequest
open OpenAPI.Model.VectorStoreFileBatchObject
open OpenAPI.Model.VectorStoreFileObject
open OpenAPI.Model.VectorStoreObject

module VectorStoresApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CancelVectorStoreFileBatch
    /// <summary>
    /// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    /// </summary>

    let CancelVectorStoreFileBatch (pathParams:CancelVectorStoreFileBatchPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : CancelVectorStoreFileBatchArgs
          let result = VectorStoresApiService.CancelVectorStoreFileBatch ctx serviceArgs
          return! (match result with
                      | CancelVectorStoreFileBatchStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateVectorStore
    /// <summary>
    /// Create a vector store.
    /// </summary>

    let CreateVectorStore  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateVectorStoreBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateVectorStoreArgs
          let result = VectorStoresApiService.CreateVectorStore ctx serviceArgs
          return! (match result with
                      | CreateVectorStoreStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateVectorStoreFile
    /// <summary>
    /// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    /// </summary>

    let CreateVectorStoreFile (pathParams:CreateVectorStoreFilePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateVectorStoreFileBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CreateVectorStoreFileArgs
          let result = VectorStoresApiService.CreateVectorStoreFile ctx serviceArgs
          return! (match result with
                      | CreateVectorStoreFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateVectorStoreFileBatch
    /// <summary>
    /// Create a vector store file batch.
    /// </summary>

    let CreateVectorStoreFileBatch (pathParams:CreateVectorStoreFileBatchPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateVectorStoreFileBatchBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CreateVectorStoreFileBatchArgs
          let result = VectorStoresApiService.CreateVectorStoreFileBatch ctx serviceArgs
          return! (match result with
                      | CreateVectorStoreFileBatchStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteVectorStore
    /// <summary>
    /// Delete a vector store.
    /// </summary>

    let DeleteVectorStore (pathParams:DeleteVectorStorePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteVectorStoreArgs
          let result = VectorStoresApiService.DeleteVectorStore ctx serviceArgs
          return! (match result with
                      | DeleteVectorStoreStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteVectorStoreFile
    /// <summary>
    /// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    /// </summary>

    let DeleteVectorStoreFile (pathParams:DeleteVectorStoreFilePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteVectorStoreFileArgs
          let result = VectorStoresApiService.DeleteVectorStoreFile ctx serviceArgs
          return! (match result with
                      | DeleteVectorStoreFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetVectorStore
    /// <summary>
    /// Retrieves a vector store.
    /// </summary>

    let GetVectorStore (pathParams:GetVectorStorePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetVectorStoreArgs
          let result = VectorStoresApiService.GetVectorStore ctx serviceArgs
          return! (match result with
                      | GetVectorStoreStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetVectorStoreFile
    /// <summary>
    /// Retrieves a vector store file.
    /// </summary>

    let GetVectorStoreFile (pathParams:GetVectorStoreFilePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetVectorStoreFileArgs
          let result = VectorStoresApiService.GetVectorStoreFile ctx serviceArgs
          return! (match result with
                      | GetVectorStoreFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetVectorStoreFileBatch
    /// <summary>
    /// Retrieves a vector store file batch.
    /// </summary>

    let GetVectorStoreFileBatch (pathParams:GetVectorStoreFileBatchPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetVectorStoreFileBatchArgs
          let result = VectorStoresApiService.GetVectorStoreFileBatch ctx serviceArgs
          return! (match result with
                      | GetVectorStoreFileBatchStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListFilesInVectorStoreBatch
    /// <summary>
    /// Returns a list of vector store files in a batch.
    /// </summary>

    let ListFilesInVectorStoreBatch (pathParams:ListFilesInVectorStoreBatchPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListFilesInVectorStoreBatchQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListFilesInVectorStoreBatchArgs
          let result = VectorStoresApiService.ListFilesInVectorStoreBatch ctx serviceArgs
          return! (match result with
                      | ListFilesInVectorStoreBatchStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListVectorStoreFiles
    /// <summary>
    /// Returns a list of vector store files.
    /// </summary>

    let ListVectorStoreFiles (pathParams:ListVectorStoreFilesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListVectorStoreFilesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListVectorStoreFilesArgs
          let result = VectorStoresApiService.ListVectorStoreFiles ctx serviceArgs
          return! (match result with
                      | ListVectorStoreFilesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListVectorStores
    /// <summary>
    /// Returns a list of vector stores.
    /// </summary>

    let ListVectorStores  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListVectorStoresQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ListVectorStoresArgs
          let result = VectorStoresApiService.ListVectorStores ctx serviceArgs
          return! (match result with
                      | ListVectorStoresStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ModifyVectorStore
    /// <summary>
    /// Modifies a vector store.
    /// </summary>

    let ModifyVectorStore (pathParams:ModifyVectorStorePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ModifyVectorStoreBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ModifyVectorStoreArgs
          let result = VectorStoresApiService.ModifyVectorStore ctx serviceArgs
          return! (match result with
                      | ModifyVectorStoreStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

