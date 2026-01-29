namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open Newtonsoft
open TestHelper
open ImagesApiHandlerTestsHelper
open OpenAPI.ImagesApiHandler
open OpenAPI.ImagesApiHandlerParams
open OpenAPI.Model.CreateImageEditRequestModel
open OpenAPI.Model.CreateImageRequest
open OpenAPI.Model.ImagesResponse
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module ImagesApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CreateImage - Creates an image given a prompt. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/images/generations"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateImageExample "application/json")
      // or pass a body of type CreateImageRequest
      let body = obj() :?> CreateImageRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateImageEdit - Creates an edited or extended image given an original image and a prompt. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/images/edits"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getCreateImageEditExample "multipart/form-data")
      // or pass a formformformformformformformform
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateImageVariation - Creates a variation of a given image. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/images/variations"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getCreateImageVariationExample "multipart/form-data")
      // or pass a formformformformformform
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

