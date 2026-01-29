namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open EmbeddingsApiHandlerParams
open EmbeddingsApiServiceInterface
open EmbeddingsApiServiceImplementation
open OpenAPI.Model.CreateEmbeddingRequest
open OpenAPI.Model.CreateEmbeddingResponse

module EmbeddingsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateEmbedding
    /// <summary>
    /// Creates an embedding vector representing the input text.
    /// </summary>

    let CreateEmbedding  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateEmbeddingBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateEmbeddingArgs
          let result = EmbeddingsApiService.CreateEmbedding ctx serviceArgs
          return! (match result with
                      | CreateEmbeddingStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

