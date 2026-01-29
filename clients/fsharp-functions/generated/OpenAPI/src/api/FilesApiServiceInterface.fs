namespace OpenAPI
open FilesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module FilesApiServiceInterface =

    //#region Service interface
    type IFilesApiService =
      abstract member CreateFile : unit -> CreateFileResult
      abstract member DeleteFile : unit -> DeleteFileResult
      abstract member DownloadFile : unit -> DownloadFileResult
      abstract member ListFiles : unit -> ListFilesResult
      abstract member RetrieveFile : unit -> RetrieveFileResult
    //#endregion