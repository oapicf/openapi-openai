namespace OpenAPI
open OpenAPI.Model.CreateImageEditRequestModel
open OpenAPI.Model.CreateImageRequest
open OpenAPI.Model.ImagesResponse
open OpenAPI.Model.int option
open OpenAPI.Model.string option
open ImagesApiHandlerParams
open ImagesApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ImagesApiServiceImplementation =

    //#region Service implementation
    type ImagesApiServiceImpl() =
      interface IImagesApiService with

        member this.CreateImage ctx args =
            let content = "OK" :> obj :?> ImagesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateImageStatusCode200 { content = content }

        member this.CreateImageEdit ctx args =
            let content = "OK" :> obj :?> ImagesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateImageEditStatusCode200 { content = content }

        member this.CreateImageVariation ctx args =
            let content = "OK" :> obj :?> ImagesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateImageVariationStatusCode200 { content = content }

      //#endregion

    let ImagesApiService = ImagesApiServiceImpl() :> IImagesApiService