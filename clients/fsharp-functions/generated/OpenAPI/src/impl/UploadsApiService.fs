namespace OpenAPI
open OpenAPI.Model.CompleteUploadRequest
open OpenAPI.Model.CreateUploadRequest
open OpenAPI.Model.Upload
open OpenAPI.Model.UploadPart
open UploadsApiHandlerParams
open UploadsApiServiceInterface
open System.Collections.Generic
open System

module UploadsApiServiceImplementation =

    //#region Service implementation
    type UploadsApiServiceImpl() =
      interface IUploadsApiService with

        member this.AddUploadPart () =
            let content = "OK" :> obj :?> UploadPart // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddUploadPartStatusCode200 { content = content }

        member this.CancelUpload () =
            let content = "OK" :> obj :?> Upload // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CancelUploadStatusCode200 { content = content }

        member this.CompleteUpload (parameters:CompleteUploadBodyParams) =
            let content = "OK" :> obj :?> Upload // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CompleteUploadStatusCode200 { content = content }

        member this.CreateUpload (parameters:CreateUploadBodyParams) =
            let content = "OK" :> obj :?> Upload // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateUploadStatusCode200 { content = content }

      //#endregion

    let UploadsApiService = UploadsApiServiceImpl() :> IUploadsApiService