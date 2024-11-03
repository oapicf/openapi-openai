namespace OpenAPI
open EmbeddingsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module EmbeddingsApiServiceInterface =

    //#region Service interface
    type IEmbeddingsApiService =
      abstract member CreateEmbedding : CreateEmbeddingBodyParams -> CreateEmbeddingResult
    //#endregion