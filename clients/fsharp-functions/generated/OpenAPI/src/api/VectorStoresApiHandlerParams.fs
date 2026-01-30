namespace OpenAPI

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
open System.Collections.Generic
open System

module VectorStoresApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type CancelVectorStoreFileBatchPathParams = {
      vectorStoreId : string ;
    //#endregion
      batchId : string ;
    }
    //#endregion


    type CancelVectorStoreFileBatchStatusCode200Response = {
      content:VectorStoreFileBatchObject;
      
    }
    type CancelVectorStoreFileBatchResult = CancelVectorStoreFileBatchStatusCode200 of CancelVectorStoreFileBatchStatusCode200Response

    type CancelVectorStoreFileBatchArgs = {
      pathParams:CancelVectorStoreFileBatchPathParams;
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateVectorStoreBodyParams = CreateVectorStoreRequest
    //#endregion


    type CreateVectorStoreStatusCode200Response = {
      content:VectorStoreObject;
      
    }
    type CreateVectorStoreResult = CreateVectorStoreStatusCode200 of CreateVectorStoreStatusCode200Response

    type CreateVectorStoreArgs = {
      bodyParams:CreateVectorStoreBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CreateVectorStoreFilePathParams = {
      vectorStoreId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CreateVectorStoreFileBodyParams = CreateVectorStoreFileRequest
    //#endregion


    type CreateVectorStoreFileStatusCode200Response = {
      content:VectorStoreFileObject;
      
    }
    type CreateVectorStoreFileResult = CreateVectorStoreFileStatusCode200 of CreateVectorStoreFileStatusCode200Response

    type CreateVectorStoreFileArgs = {
      pathParams:CreateVectorStoreFilePathParams;
      bodyParams:CreateVectorStoreFileBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CreateVectorStoreFileBatchPathParams = {
      vectorStoreId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CreateVectorStoreFileBatchBodyParams = CreateVectorStoreFileBatchRequest
    //#endregion


    type CreateVectorStoreFileBatchStatusCode200Response = {
      content:VectorStoreFileBatchObject;
      
    }
    type CreateVectorStoreFileBatchResult = CreateVectorStoreFileBatchStatusCode200 of CreateVectorStoreFileBatchStatusCode200Response

    type CreateVectorStoreFileBatchArgs = {
      pathParams:CreateVectorStoreFileBatchPathParams;
      bodyParams:CreateVectorStoreFileBatchBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteVectorStorePathParams = {
      vectorStoreId : string ;
    }
    //#endregion


    type DeleteVectorStoreStatusCode200Response = {
      content:DeleteVectorStoreResponse;
      
    }
    type DeleteVectorStoreResult = DeleteVectorStoreStatusCode200 of DeleteVectorStoreStatusCode200Response

    type DeleteVectorStoreArgs = {
      pathParams:DeleteVectorStorePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteVectorStoreFilePathParams = {
      vectorStoreId : string ;
    //#endregion
      fileId : string ;
    }
    //#endregion


    type DeleteVectorStoreFileStatusCode200Response = {
      content:DeleteVectorStoreFileResponse;
      
    }
    type DeleteVectorStoreFileResult = DeleteVectorStoreFileStatusCode200 of DeleteVectorStoreFileStatusCode200Response

    type DeleteVectorStoreFileArgs = {
      pathParams:DeleteVectorStoreFilePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetVectorStorePathParams = {
      vectorStoreId : string ;
    }
    //#endregion


    type GetVectorStoreStatusCode200Response = {
      content:VectorStoreObject;
      
    }
    type GetVectorStoreResult = GetVectorStoreStatusCode200 of GetVectorStoreStatusCode200Response

    type GetVectorStoreArgs = {
      pathParams:GetVectorStorePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetVectorStoreFilePathParams = {
      vectorStoreId : string ;
    //#endregion
      fileId : string ;
    }
    //#endregion


    type GetVectorStoreFileStatusCode200Response = {
      content:VectorStoreFileObject;
      
    }
    type GetVectorStoreFileResult = GetVectorStoreFileStatusCode200 of GetVectorStoreFileStatusCode200Response

    type GetVectorStoreFileArgs = {
      pathParams:GetVectorStoreFilePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetVectorStoreFileBatchPathParams = {
      vectorStoreId : string ;
    //#endregion
      batchId : string ;
    }
    //#endregion


    type GetVectorStoreFileBatchStatusCode200Response = {
      content:VectorStoreFileBatchObject;
      
    }
    type GetVectorStoreFileBatchResult = GetVectorStoreFileBatchStatusCode200 of GetVectorStoreFileBatchStatusCode200Response

    type GetVectorStoreFileBatchArgs = {
      pathParams:GetVectorStoreFileBatchPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ListFilesInVectorStoreBatchPathParams = {
      vectorStoreId : string ;
    //#endregion
      batchId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ListFilesInVectorStoreBatchQueryParams = {
      limit : int option;


      order : string option;


      after : string option;


      before : string option;


      filter : string option;

    }
    //#endregion


    type ListFilesInVectorStoreBatchStatusCode200Response = {
      content:ListVectorStoreFilesResponse;
      
    }
    type ListFilesInVectorStoreBatchResult = ListFilesInVectorStoreBatchStatusCode200 of ListFilesInVectorStoreBatchStatusCode200Response

    type ListFilesInVectorStoreBatchArgs = {
      pathParams:ListFilesInVectorStoreBatchPathParams;
      queryParams:Result<ListFilesInVectorStoreBatchQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ListVectorStoreFilesPathParams = {
      vectorStoreId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ListVectorStoreFilesQueryParams = {
      limit : int option;


      order : string option;


      after : string option;


      before : string option;


      filter : string option;

    }
    //#endregion


    type ListVectorStoreFilesStatusCode200Response = {
      content:ListVectorStoreFilesResponse;
      
    }
    type ListVectorStoreFilesResult = ListVectorStoreFilesStatusCode200 of ListVectorStoreFilesStatusCode200Response

    type ListVectorStoreFilesArgs = {
      pathParams:ListVectorStoreFilesPathParams;
      queryParams:Result<ListVectorStoreFilesQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ListVectorStoresQueryParams = {
      limit : int option;


      order : string option;


      after : string option;


      before : string option;

    }
    //#endregion


    type ListVectorStoresStatusCode200Response = {
      content:ListVectorStoresResponse;
      
    }
    type ListVectorStoresResult = ListVectorStoresStatusCode200 of ListVectorStoresStatusCode200Response

    type ListVectorStoresArgs = {
      queryParams:Result<ListVectorStoresQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ModifyVectorStorePathParams = {
      vectorStoreId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ModifyVectorStoreBodyParams = UpdateVectorStoreRequest
    //#endregion


    type ModifyVectorStoreStatusCode200Response = {
      content:VectorStoreObject;
      
    }
    type ModifyVectorStoreResult = ModifyVectorStoreStatusCode200 of ModifyVectorStoreStatusCode200Response

    type ModifyVectorStoreArgs = {
      pathParams:ModifyVectorStorePathParams;
      bodyParams:ModifyVectorStoreBodyParams
    }
