namespace OpenAPI
open OpenAPI.Model.CreateEmbeddingRequest
open OpenAPI.Model.CreateEmbeddingResponse
open EmbeddingsApiHandlerParams
open EmbeddingsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module EmbeddingsApiServiceImplementation =

    //#region Service implementation
    type EmbeddingsApiServiceImpl() =
      interface IEmbeddingsApiService with

        member this.CreateEmbedding ctx args =
            let content = "OK" :> obj :?> CreateEmbeddingResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateEmbeddingStatusCode200 { content = content }

      //#endregion

    let EmbeddingsApiService = EmbeddingsApiServiceImpl() :> IEmbeddingsApiService