namespace OpenAPI
open OpenAPI.Model.CompleteUploadRequest
open OpenAPI.Model.CreateUploadRequest
open OpenAPI.Model.Upload
open OpenAPI.Model.UploadPart
open UploadsApiHandlerParams
open UploadsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module UploadsApiServiceImplementation =

    //#region Service implementation
    type UploadsApiServiceImpl() =
      interface IUploadsApiService with

        member this.AddUploadPart ctx args =
            let content = "OK" :> obj :?> UploadPart // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddUploadPartStatusCode200 { content = content }

        member this.CancelUpload ctx args =
            let content = "OK" :> obj :?> Upload // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CancelUploadStatusCode200 { content = content }

        member this.CompleteUpload ctx args =
            let content = "OK" :> obj :?> Upload // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CompleteUploadStatusCode200 { content = content }

        member this.CreateUpload ctx args =
            let content = "OK" :> obj :?> Upload // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateUploadStatusCode200 { content = content }

      //#endregion

    let UploadsApiService = UploadsApiServiceImpl() :> IUploadsApiService