namespace OpenAPI
open OpenAPI.Model.CreateVectorStoreFileBatchRequest
open OpenAPI.Model.CreateVectorStoreFileRequest
open OpenAPI.Model.CreateVectorStoreRequest
open OpenAPI.Model.DeleteVectorStoreFileResponse
open OpenAPI.Model.DeleteVectorStoreResponse
open OpenAPI.Model.ListVectorStoreFilesResponse
open OpenAPI.Model.ListVectorStoresResponse
open OpenAPI.Model.UpdateVectorStoreRequest
open OpenAPI.Model.VectorStoreFileBatchObject
open OpenAPI.Model.VectorStoreFileObject
open OpenAPI.Model.VectorStoreObject
open VectorStoresApiHandlerParams
open VectorStoresApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module VectorStoresApiServiceImplementation =

    //#region Service implementation
    type VectorStoresApiServiceImpl() =
      interface IVectorStoresApiService with

        member this.CancelVectorStoreFileBatch ctx args =
            let content = "OK" :> obj :?> VectorStoreFileBatchObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CancelVectorStoreFileBatchStatusCode200 { content = content }

        member this.CreateVectorStore ctx args =
            let content = "OK" :> obj :?> VectorStoreObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateVectorStoreStatusCode200 { content = content }

        member this.CreateVectorStoreFile ctx args =
            let content = "OK" :> obj :?> VectorStoreFileObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateVectorStoreFileStatusCode200 { content = content }

        member this.CreateVectorStoreFileBatch ctx args =
            let content = "OK" :> obj :?> VectorStoreFileBatchObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateVectorStoreFileBatchStatusCode200 { content = content }

        member this.DeleteVectorStore ctx args =
            let content = "OK" :> obj :?> DeleteVectorStoreResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteVectorStoreStatusCode200 { content = content }

        member this.DeleteVectorStoreFile ctx args =
            let content = "OK" :> obj :?> DeleteVectorStoreFileResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteVectorStoreFileStatusCode200 { content = content }

        member this.GetVectorStore ctx args =
            let content = "OK" :> obj :?> VectorStoreObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetVectorStoreStatusCode200 { content = content }

        member this.GetVectorStoreFile ctx args =
            let content = "OK" :> obj :?> VectorStoreFileObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetVectorStoreFileStatusCode200 { content = content }

        member this.GetVectorStoreFileBatch ctx args =
            let content = "OK" :> obj :?> VectorStoreFileBatchObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetVectorStoreFileBatchStatusCode200 { content = content }

        member this.ListFilesInVectorStoreBatch ctx args =
            let content = "OK" :> obj :?> ListVectorStoreFilesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListFilesInVectorStoreBatchStatusCode200 { content = content }

        member this.ListVectorStoreFiles ctx args =
            let content = "OK" :> obj :?> ListVectorStoreFilesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListVectorStoreFilesStatusCode200 { content = content }

        member this.ListVectorStores ctx args =
            let content = "OK" :> obj :?> ListVectorStoresResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListVectorStoresStatusCode200 { content = content }

        member this.ModifyVectorStore ctx args =
            let content = "OK" :> obj :?> VectorStoreObject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ModifyVectorStoreStatusCode200 { content = content }

      //#endregion

    let VectorStoresApiService = VectorStoresApiServiceImpl() :> IVectorStoresApiService