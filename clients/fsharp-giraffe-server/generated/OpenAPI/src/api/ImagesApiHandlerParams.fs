namespace OpenAPI

open OpenAPI.Model.CreateImageEditRequestModel
open OpenAPI.Model.CreateImageRequest
open OpenAPI.Model.ImagesResponse
open OpenAPI.Model.int option
open OpenAPI.Model.string option
open System.Collections.Generic
open System

module ImagesApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type CreateImageBodyParams = CreateImageRequest
    //#endregion


    type CreateImageStatusCode200Response = {
      content:ImagesResponse;
      
    }
    type CreateImageResult = CreateImageStatusCode200 of CreateImageStatusCode200Response

    type CreateImageArgs = {
      bodyParams:CreateImageBodyParams
    }

    //#region Form parameters
    [<CLIMutable>]
    type CreateImageEditFormParams = {
      image : System.IO.Stream ;
    //#endregion

    //#region Form parameters
      prompt : string ;
    //#endregion

    //#region Form parameters
      mask : System.IO.Stream option;
    //#endregion

    //#region Form parameters
      model : CreateImageEditRequestModel option;
    //#endregion

    //#region Form parameters
      n : int option option;
    //#endregion

    //#region Form parameters
      size : string option option;
    //#endregion

    //#region Form parameters
      responseFormat : string option option;
    //#endregion

    //#region Form parameters
      user : string option;
    }
    //#endregion


    type CreateImageEditStatusCode200Response = {
      content:ImagesResponse;
      
    }
    type CreateImageEditResult = CreateImageEditStatusCode200 of CreateImageEditStatusCode200Response

    type CreateImageEditArgs = {
      formParams:Result<CreateImageEditFormParams,string>
    }

    //#region Form parameters
    [<CLIMutable>]
    type CreateImageVariationFormParams = {
      image : System.IO.Stream ;
    //#endregion

    //#region Form parameters
      model : CreateImageEditRequestModel option;
    //#endregion

    //#region Form parameters
      n : int option option;
    //#endregion

    //#region Form parameters
      responseFormat : string option option;
    //#endregion

    //#region Form parameters
      size : string option option;
    //#endregion

    //#region Form parameters
      user : string option;
    }
    //#endregion


    type CreateImageVariationStatusCode200Response = {
      content:ImagesResponse;
      
    }
    type CreateImageVariationResult = CreateImageVariationStatusCode200 of CreateImageVariationStatusCode200Response

    type CreateImageVariationArgs = {
      formParams:Result<CreateImageVariationFormParams,string>
    }
