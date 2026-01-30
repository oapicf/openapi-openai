namespace OpenAPI
open UploadsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module UploadsApiServiceInterface =

    //#region Service interface
    type IUploadsApiService =
      abstract member AddUploadPart:HttpContext -> AddUploadPartArgs->AddUploadPartResult
      abstract member CancelUpload:HttpContext -> CancelUploadArgs->CancelUploadResult
      abstract member CompleteUpload:HttpContext -> CompleteUploadArgs->CompleteUploadResult
      abstract member CreateUpload:HttpContext -> CreateUploadArgs->CreateUploadResult
    //#endregion