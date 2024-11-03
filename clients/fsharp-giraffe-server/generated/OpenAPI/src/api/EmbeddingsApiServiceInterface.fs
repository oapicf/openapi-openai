namespace OpenAPI
open EmbeddingsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module EmbeddingsApiServiceInterface =

    //#region Service interface
    type IEmbeddingsApiService =
      abstract member CreateEmbedding:HttpContext -> CreateEmbeddingArgs->CreateEmbeddingResult
    //#endregion