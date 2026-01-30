namespace OpenAPI
open UploadsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module UploadsApiServiceInterface =

    //#region Service interface
    type IUploadsApiService =
      abstract member AddUploadPart : unit -> AddUploadPartResult
      abstract member CancelUpload : unit -> CancelUploadResult
      abstract member CompleteUpload : CompleteUploadBodyParams -> CompleteUploadResult
      abstract member CreateUpload : CreateUploadBodyParams -> CreateUploadResult
    //#endregion