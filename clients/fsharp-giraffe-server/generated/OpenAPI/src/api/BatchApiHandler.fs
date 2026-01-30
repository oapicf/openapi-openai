namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BatchApiHandlerParams
open BatchApiServiceInterface
open BatchApiServiceImplementation
open OpenAPI.Model.Batch
open OpenAPI.Model.CreateBatchRequest
open OpenAPI.Model.ListBatchesResponse

module BatchApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CancelBatch
    /// <summary>
    /// Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
    /// </summary>

    let CancelBatch (pathParams:CancelBatchPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : CancelBatchArgs
          let result = BatchApiService.CancelBatch ctx serviceArgs
          return! (match result with
                      | CancelBatchStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateBatch
    /// <summary>
    /// Creates and executes a batch from an uploaded file of requests
    /// </summary>

    let CreateBatch  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateBatchBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateBatchArgs
          let result = BatchApiService.CreateBatch ctx serviceArgs
          return! (match result with
                      | CreateBatchStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListBatches
    /// <summary>
    /// List your organization&#39;s batches.
    /// </summary>

    let ListBatches  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListBatchesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ListBatchesArgs
          let result = BatchApiService.ListBatches ctx serviceArgs
          return! (match result with
                      | ListBatchesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RetrieveBatch
    /// <summary>
    /// Retrieves a batch.
    /// </summary>

    let RetrieveBatch (pathParams:RetrieveBatchPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RetrieveBatchArgs
          let result = BatchApiService.RetrieveBatch ctx serviceArgs
          return! (match result with
                      | RetrieveBatchStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

