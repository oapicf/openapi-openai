namespace OpenAPI
open OpenAPI.Model.DeleteFileResponse
open OpenAPI.Model.ListFilesResponse
open OpenAPI.Model.OpenAIFile
open FilesApiHandlerParams
open FilesApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module FilesApiServiceImplementation =

    //#region Service implementation
    type FilesApiServiceImpl() =
      interface IFilesApiService with

        member this.CreateFile ctx args =
            let content = "OK" :> obj :?> OpenAIFile // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateFileStatusCode200 { content = content }

        member this.DeleteFile ctx args =
            let content = "OK" :> obj :?> DeleteFileResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteFileStatusCode200 { content = content }

        member this.DownloadFile ctx args =
            let content = "OK" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DownloadFileStatusCode200 { content = content }

        member this.ListFiles ctx args =
            let content = "OK" :> obj :?> ListFilesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListFilesStatusCode200 { content = content }

        member this.RetrieveFile ctx args =
            let content = "OK" :> obj :?> OpenAIFile // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveFileStatusCode200 { content = content }

      //#endregion

    let FilesApiService = FilesApiServiceImpl() :> IFilesApiService