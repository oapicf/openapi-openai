namespace OpenAPI

open OpenAPI.Model.CompleteUploadRequest
open OpenAPI.Model.CreateUploadRequest
open OpenAPI.Model.Upload
open OpenAPI.Model.UploadPart
open System.Collections.Generic
open System

module UploadsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AddUploadPartPathParams = {
      uploadId : string ;
    }
    //#endregion

    //#region Form parameters
    [<CLIMutable>]
    type AddUploadPartFormParams = {
      data : System.IO.Stream ;
    }
    //#endregion


    type AddUploadPartStatusCode200Response = {
      content:UploadPart;
      
    }
    type AddUploadPartResult = AddUploadPartStatusCode200 of AddUploadPartStatusCode200Response

    type AddUploadPartArgs = {
      pathParams:AddUploadPartPathParams;
      formParams:Result<AddUploadPartFormParams,string>
    }
    //#region Path parameters
    [<CLIMutable>]
    type CancelUploadPathParams = {
      uploadId : string ;
    }
    //#endregion


    type CancelUploadStatusCode200Response = {
      content:Upload;
      
    }
    type CancelUploadResult = CancelUploadStatusCode200 of CancelUploadStatusCode200Response

    type CancelUploadArgs = {
      pathParams:CancelUploadPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CompleteUploadPathParams = {
      uploadId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CompleteUploadBodyParams = CompleteUploadRequest
    //#endregion


    type CompleteUploadStatusCode200Response = {
      content:Upload;
      
    }
    type CompleteUploadResult = CompleteUploadStatusCode200 of CompleteUploadStatusCode200Response

    type CompleteUploadArgs = {
      pathParams:CompleteUploadPathParams;
      bodyParams:CompleteUploadBodyParams
    }

    //#region Body parameters
    [<CLIMutable>]
    type CreateUploadBodyParams = CreateUploadRequest
    //#endregion


    type CreateUploadStatusCode200Response = {
      content:Upload;
      
    }
    type CreateUploadResult = CreateUploadStatusCode200 of CreateUploadStatusCode200Response

    type CreateUploadArgs = {
      bodyParams:CreateUploadBodyParams
    }
