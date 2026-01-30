namespace OpenAPI
open OpenAPI.Model.AdminApiKey
open OpenAPI.Model.AdminApiKeysCreateRequest
open OpenAPI.Model.AdminApiKeysDelete200Response
open OpenAPI.Model.ApiKeyList
open OpenAPI.Model.string option
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module DefaultApiServiceImplementation =

    //#region Service implementation
    type DefaultApiServiceImpl() =
      interface IDefaultApiService with

        member this.AdminApiKeysCreate ctx args =
            let content = "The newly created admin API key." :> obj :?> AdminApiKey // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdminApiKeysCreateStatusCode200 { content = content }

        member this.AdminApiKeysDelete ctx args =
            let content = "Confirmation that the API key was deleted." :> obj :?> AdminApiKeysDelete200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdminApiKeysDeleteStatusCode200 { content = content }

        member this.AdminApiKeysGet ctx args =
            let content = "Details of the requested API key." :> obj :?> AdminApiKey // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdminApiKeysGetStatusCode200 { content = content }

        member this.AdminApiKeysList ctx args =
            let content = "A list of organization API keys." :> obj :?> ApiKeyList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdminApiKeysListStatusCode200 { content = content }

      //#endregion

    let DefaultApiService = DefaultApiServiceImpl() :> IDefaultApiService