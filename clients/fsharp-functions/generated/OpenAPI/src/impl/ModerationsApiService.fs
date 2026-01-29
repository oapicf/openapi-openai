namespace OpenAPI
open OpenAPI.Model.CreateModerationRequest
open OpenAPI.Model.CreateModerationResponse
open ModerationsApiHandlerParams
open ModerationsApiServiceInterface
open System.Collections.Generic
open System

module ModerationsApiServiceImplementation =

    //#region Service implementation
    type ModerationsApiServiceImpl() =
      interface IModerationsApiService with

        member this.CreateModeration (parameters:CreateModerationBodyParams) =
            let content = "OK" :> obj :?> CreateModerationResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateModerationStatusCode200 { content = content }

      //#endregion

    let ModerationsApiService = ModerationsApiServiceImpl() :> IModerationsApiService