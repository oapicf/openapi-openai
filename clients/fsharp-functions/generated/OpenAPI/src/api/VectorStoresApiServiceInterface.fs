namespace OpenAPI
open VectorStoresApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module VectorStoresApiServiceInterface =

    //#region Service interface
    type IVectorStoresApiService =
      abstract member CancelVectorStoreFileBatch : unit -> CancelVectorStoreFileBatchResult
      abstract member CreateVectorStore : CreateVectorStoreBodyParams -> CreateVectorStoreResult
      abstract member CreateVectorStoreFile : CreateVectorStoreFileBodyParams -> CreateVectorStoreFileResult
      abstract member CreateVectorStoreFileBatch : CreateVectorStoreFileBatchBodyParams -> CreateVectorStoreFileBatchResult
      abstract member DeleteVectorStore : unit -> DeleteVectorStoreResult
      abstract member DeleteVectorStoreFile : unit -> DeleteVectorStoreFileResult
      abstract member GetVectorStore : unit -> GetVectorStoreResult
      abstract member GetVectorStoreFile : unit -> GetVectorStoreFileResult
      abstract member GetVectorStoreFileBatch : unit -> GetVectorStoreFileBatchResult
      abstract member ListFilesInVectorStoreBatch : unit -> ListFilesInVectorStoreBatchResult
      abstract member ListVectorStoreFiles : unit -> ListVectorStoreFilesResult
      abstract member ListVectorStores : unit -> ListVectorStoresResult
      abstract member ModifyVectorStore : ModifyVectorStoreBodyParams -> ModifyVectorStoreResult
    //#endregion