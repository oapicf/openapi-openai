namespace OpenAPI

open ImagesApiHandlerParams
open ImagesApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ImagesApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateImage
    /// <summary>
    /// Creates an image given a prompt.
    /// </summary>
   [<FunctionName("CreateImage")>]
    let CreateImage
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/images/generations")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateImageBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = ImagesApiService.CreateImage bodyParams
      match result with
      | CreateImageStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateImageEdit
    /// <summary>
    /// Creates an edited or extended image given an original image and a prompt.
    /// </summary>
   [<FunctionName("CreateImageEdit")>]
    let CreateImageEdit
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/images/edits")>]
        req:HttpRequest ) =

      let result = ImagesApiService.CreateImageEdit ()
      match result with
      | CreateImageEditStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateImageVariation
    /// <summary>
    /// Creates a variation of a given image.
    /// </summary>
   [<FunctionName("CreateImageVariation")>]
    let CreateImageVariation
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/images/variations")>]
        req:HttpRequest ) =

      let result = ImagesApiService.CreateImageVariation ()
      match result with
      | CreateImageVariationStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

