namespace OpenAPI
open BatchApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BatchApiServiceInterface =

    //#region Service interface
    type IBatchApiService =
      abstract member CancelBatch : unit -> CancelBatchResult
      abstract member CreateBatch : CreateBatchBodyParams -> CreateBatchResult
      abstract member ListBatches : unit -> ListBatchesResult
      abstract member RetrieveBatch : unit -> RetrieveBatchResult
    //#endregion