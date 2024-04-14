namespace OpenAPI
open OpenAPI.Model.DeleteModelResponse
open OpenAPI.Model.ListModelsResponse
open OpenAPI.Model.Model
open ModelsApiHandlerParams
open ModelsApiServiceInterface
open System.Collections.Generic
open System

module ModelsApiServiceImplementation =

    //#region Service implementation
    type ModelsApiServiceImpl() =
      interface IModelsApiService with

        member this.DeleteModel () =
            let content = "OK" :> obj :?> DeleteModelResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteModelStatusCode200 { content = content }

        member this.ListModels () =
            let content = "OK" :> obj :?> ListModelsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListModelsStatusCode200 { content = content }

        member this.RetrieveModel () =
            let content = "OK" :> obj :?> Model // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveModelStatusCode200 { content = content }

      //#endregion

    let ModelsApiService = ModelsApiServiceImpl() :> IModelsApiService