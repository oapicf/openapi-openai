namespace OpenAPI
open OpenAPI.Model.RealtimeSessionCreateRequest
open OpenAPI.Model.RealtimeSessionCreateResponse
open RealtimeApiHandlerParams
open RealtimeApiServiceInterface
open System.Collections.Generic
open System

module RealtimeApiServiceImplementation =

    //#region Service implementation
    type RealtimeApiServiceImpl() =
      interface IRealtimeApiService with

        member this.CreateRealtimeSession (parameters:CreateRealtimeSessionBodyParams) =
            let content = "Session created successfully." :> obj :?> RealtimeSessionCreateResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateRealtimeSessionStatusCode200 { content = content }

      //#endregion

    let RealtimeApiService = RealtimeApiServiceImpl() :> IRealtimeApiService