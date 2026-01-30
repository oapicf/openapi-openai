namespace OpenAPI

open OpenAPI.Model.AdminApiKey
open OpenAPI.Model.AdminApiKeysCreateRequest
open OpenAPI.Model.AdminApiKeysDelete200Response
open OpenAPI.Model.ApiKeyList
open OpenAPI.Model.string option
open System.Collections.Generic
open System

module DefaultApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type AdminApiKeysCreateBodyParams = AdminApiKeysCreateRequest
    //#endregion


    type AdminApiKeysCreateStatusCode200Response = {
      content:AdminApiKey;
      
    }
    type AdminApiKeysCreateResult = AdminApiKeysCreateStatusCode200 of AdminApiKeysCreateStatusCode200Response

    type AdminApiKeysCreateArgs = {
      bodyParams:AdminApiKeysCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdminApiKeysDeletePathParams = {
      keyId : string ;
    }
    //#endregion


    type AdminApiKeysDeleteStatusCode200Response = {
      content:AdminApiKeysDelete200Response;
      
    }
    type AdminApiKeysDeleteResult = AdminApiKeysDeleteStatusCode200 of AdminApiKeysDeleteStatusCode200Response

    type AdminApiKeysDeleteArgs = {
      pathParams:AdminApiKeysDeletePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdminApiKeysGetPathParams = {
      keyId : string ;
    }
    //#endregion


    type AdminApiKeysGetStatusCode200Response = {
      content:AdminApiKey;
      
    }
    type AdminApiKeysGetResult = AdminApiKeysGetStatusCode200 of AdminApiKeysGetStatusCode200Response

    type AdminApiKeysGetArgs = {
      pathParams:AdminApiKeysGetPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type AdminApiKeysListQueryParams = {
      after : string option option;


      order : string option;


      limit : int option;

    }
    //#endregion


    type AdminApiKeysListStatusCode200Response = {
      content:ApiKeyList;
      
    }
    type AdminApiKeysListResult = AdminApiKeysListStatusCode200 of AdminApiKeysListStatusCode200Response

    type AdminApiKeysListArgs = {
      queryParams:Result<AdminApiKeysListQueryParams,string>;
    }
