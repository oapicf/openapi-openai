namespace OpenAPI
open DefaultApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module DefaultApiServiceInterface =

    //#region Service interface
    type IDefaultApiService =
      abstract member AdminApiKeysCreate:HttpContext -> AdminApiKeysCreateArgs->AdminApiKeysCreateResult
      abstract member AdminApiKeysDelete:HttpContext -> AdminApiKeysDeleteArgs->AdminApiKeysDeleteResult
      abstract member AdminApiKeysGet:HttpContext -> AdminApiKeysGetArgs->AdminApiKeysGetResult
      abstract member AdminApiKeysList:HttpContext -> AdminApiKeysListArgs->AdminApiKeysListResult
    //#endregion