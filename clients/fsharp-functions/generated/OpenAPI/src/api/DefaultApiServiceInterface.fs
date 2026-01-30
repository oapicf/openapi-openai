namespace OpenAPI
open DefaultApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module DefaultApiServiceInterface =

    //#region Service interface
    type IDefaultApiService =
      abstract member AdminApiKeysCreate : AdminApiKeysCreateBodyParams -> AdminApiKeysCreateResult
      abstract member AdminApiKeysDelete : unit -> AdminApiKeysDeleteResult
      abstract member AdminApiKeysGet : unit -> AdminApiKeysGetResult
      abstract member AdminApiKeysList : unit -> AdminApiKeysListResult
    //#endregion