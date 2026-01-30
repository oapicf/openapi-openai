namespace OpenAPI
open VectorStoresApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module VectorStoresApiServiceInterface =

    //#region Service interface
    type IVectorStoresApiService =
      abstract member CancelVectorStoreFileBatch:HttpContext -> CancelVectorStoreFileBatchArgs->CancelVectorStoreFileBatchResult
      abstract member CreateVectorStore:HttpContext -> CreateVectorStoreArgs->CreateVectorStoreResult
      abstract member CreateVectorStoreFile:HttpContext -> CreateVectorStoreFileArgs->CreateVectorStoreFileResult
      abstract member CreateVectorStoreFileBatch:HttpContext -> CreateVectorStoreFileBatchArgs->CreateVectorStoreFileBatchResult
      abstract member DeleteVectorStore:HttpContext -> DeleteVectorStoreArgs->DeleteVectorStoreResult
      abstract member DeleteVectorStoreFile:HttpContext -> DeleteVectorStoreFileArgs->DeleteVectorStoreFileResult
      abstract member GetVectorStore:HttpContext -> GetVectorStoreArgs->GetVectorStoreResult
      abstract member GetVectorStoreFile:HttpContext -> GetVectorStoreFileArgs->GetVectorStoreFileResult
      abstract member GetVectorStoreFileBatch:HttpContext -> GetVectorStoreFileBatchArgs->GetVectorStoreFileBatchResult
      abstract member ListFilesInVectorStoreBatch:HttpContext -> ListFilesInVectorStoreBatchArgs->ListFilesInVectorStoreBatchResult
      abstract member ListVectorStoreFiles:HttpContext -> ListVectorStoreFilesArgs->ListVectorStoreFilesResult
      abstract member ListVectorStores:HttpContext -> ListVectorStoresArgs->ListVectorStoresResult
      abstract member ModifyVectorStore:HttpContext -> ModifyVectorStoreArgs->ModifyVectorStoreResult
    //#endregion