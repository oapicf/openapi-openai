namespace OpenAPI
open OpenAPI.Model.DeleteFileResponse
open OpenAPI.Model.ListFilesResponse
open OpenAPI.Model.OpenAIFile
open FilesApiHandlerParams
open FilesApiServiceInterface
open System.Collections.Generic
open System

module FilesApiServiceImplementation =

    //#region Service implementation
    type FilesApiServiceImpl() =
      interface IFilesApiService with

        member this.CreateFile () =
            let content = "OK" :> obj :?> OpenAIFile // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateFileStatusCode200 { content = content }

        member this.DeleteFile () =
            let content = "OK" :> obj :?> DeleteFileResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteFileStatusCode200 { content = content }

        member this.DownloadFile () =
            let content = "OK" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DownloadFileStatusCode200 { content = content }

        member this.ListFiles () =
            let content = "OK" :> obj :?> ListFilesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListFilesStatusCode200 { content = content }

        member this.RetrieveFile () =
            let content = "OK" :> obj :?> OpenAIFile // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveFileStatusCode200 { content = content }

      //#endregion

    let FilesApiService = FilesApiServiceImpl() :> IFilesApiService