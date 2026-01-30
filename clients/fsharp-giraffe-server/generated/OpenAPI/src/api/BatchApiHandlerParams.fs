namespace OpenAPI

open OpenAPI.Model.Batch
open OpenAPI.Model.CreateBatchRequest
open OpenAPI.Model.ListBatchesResponse
open System.Collections.Generic
open System

module BatchApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type CancelBatchPathParams = {
      batchId : string ;
    }
    //#endregion


    type CancelBatchStatusCode200Response = {
      content:Batch;
      
    }
    type CancelBatchResult = CancelBatchStatusCode200 of CancelBatchStatusCode200Response

    type CancelBatchArgs = {
      pathParams:CancelBatchPathParams;
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateBatchBodyParams = CreateBatchRequest
    //#endregion


    type CreateBatchStatusCode200Response = {
      content:Batch;
      
    }
    type CreateBatchResult = CreateBatchStatusCode200 of CreateBatchStatusCode200Response

    type CreateBatchArgs = {
      bodyParams:CreateBatchBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type ListBatchesQueryParams = {
      after : string option;


      limit : int option;

    }
    //#endregion


    type ListBatchesStatusCode200Response = {
      content:ListBatchesResponse;
      
    }
    type ListBatchesResult = ListBatchesStatusCode200 of ListBatchesStatusCode200Response

    type ListBatchesArgs = {
      queryParams:Result<ListBatchesQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RetrieveBatchPathParams = {
      batchId : string ;
    }
    //#endregion


    type RetrieveBatchStatusCode200Response = {
      content:Batch;
      
    }
    type RetrieveBatchResult = RetrieveBatchStatusCode200 of RetrieveBatchStatusCode200Response

    type RetrieveBatchArgs = {
      pathParams:RetrieveBatchPathParams;
    }
