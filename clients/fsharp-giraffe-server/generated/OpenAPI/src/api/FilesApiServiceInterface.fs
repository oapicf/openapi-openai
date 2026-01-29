namespace OpenAPI
open FilesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module FilesApiServiceInterface =

    //#region Service interface
    type IFilesApiService =
      abstract member CreateFile:HttpContext -> CreateFileArgs->CreateFileResult
      abstract member DeleteFile:HttpContext -> DeleteFileArgs->DeleteFileResult
      abstract member DownloadFile:HttpContext -> DownloadFileArgs->DownloadFileResult
      abstract member ListFiles:HttpContext -> ListFilesArgs->ListFilesResult
      abstract member RetrieveFile:HttpContext -> RetrieveFileArgs->RetrieveFileResult
    //#endregion