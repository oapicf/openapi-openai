namespace OpenAPI
open BatchApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BatchApiServiceInterface =

    //#region Service interface
    type IBatchApiService =
      abstract member CancelBatch:HttpContext -> CancelBatchArgs->CancelBatchResult
      abstract member CreateBatch:HttpContext -> CreateBatchArgs->CreateBatchResult
      abstract member ListBatches:HttpContext -> ListBatchesArgs->ListBatchesResult
      abstract member RetrieveBatch:HttpContext -> RetrieveBatchArgs->RetrieveBatchResult
    //#endregion