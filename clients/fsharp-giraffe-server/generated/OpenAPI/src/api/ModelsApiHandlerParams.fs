namespace OpenAPI

open OpenAPI.Model.DeleteModelResponse
open OpenAPI.Model.ListModelsResponse
open OpenAPI.Model.Model
open System.Collections.Generic
open System

module ModelsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type DeleteModelPathParams = {
      model : string ;
    }
    //#endregion


    type DeleteModelStatusCode200Response = {
      content:DeleteModelResponse;
      
    }
    type DeleteModelResult = DeleteModelStatusCode200 of DeleteModelStatusCode200Response

    type DeleteModelArgs = {
      pathParams:DeleteModelPathParams;
    }


    type ListModelsStatusCode200Response = {
      content:ListModelsResponse;
      
    }
    type ListModelsResult = ListModelsStatusCode200 of ListModelsStatusCode200Response

    //#region Path parameters
    [<CLIMutable>]
    type RetrieveModelPathParams = {
      model : string ;
    }
    //#endregion


    type RetrieveModelStatusCode200Response = {
      content:Model;
      
    }
    type RetrieveModelResult = RetrieveModelStatusCode200 of RetrieveModelStatusCode200Response

    type RetrieveModelArgs = {
      pathParams:RetrieveModelPathParams;
    }
