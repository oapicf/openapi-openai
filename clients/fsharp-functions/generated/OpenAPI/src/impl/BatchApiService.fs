namespace OpenAPI
open OpenAPI.Model.Batch
open OpenAPI.Model.CreateBatchRequest
open OpenAPI.Model.ListBatchesResponse
open BatchApiHandlerParams
open BatchApiServiceInterface
open System.Collections.Generic
open System

module BatchApiServiceImplementation =

    //#region Service implementation
    type BatchApiServiceImpl() =
      interface IBatchApiService with

        member this.CancelBatch () =
            let content = "Batch is cancelling. Returns the cancelling batch&#39;s details." :> obj :?> Batch // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CancelBatchStatusCode200 { content = content }

        member this.CreateBatch (parameters:CreateBatchBodyParams) =
            let content = "Batch created successfully." :> obj :?> Batch // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateBatchStatusCode200 { content = content }

        member this.ListBatches () =
            let content = "Batch listed successfully." :> obj :?> ListBatchesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListBatchesStatusCode200 { content = content }

        member this.RetrieveBatch () =
            let content = "Batch retrieved successfully." :> obj :?> Batch // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveBatchStatusCode200 { content = content }

      //#endregion

    let BatchApiService = BatchApiServiceImpl() :> IBatchApiService