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
open AudioApiHandlerTestsHelper
open OpenAPI.AudioApiHandler
open OpenAPI.AudioApiHandlerParams
open OpenAPI.Model.CreateSpeechRequest
open OpenAPI.Model.CreateTranscription200Response
open OpenAPI.Model.CreateTranscriptionRequestModel
open OpenAPI.Model.CreateTranslation200Response

module AudioApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CreateSpeech - Generates audio from the input text. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/audio/speech"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateSpeechExample "application/json")
      // or pass a body of type CreateSpeechRequest
      let body = obj() :?> CreateSpeechRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateTranscription - Transcribes audio into the input language. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/audio/transcriptions"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getCreateTranscriptionExample "multipart/form-data")
      // or pass a formformformformformformform
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateTranslation - Translates audio into English. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/audio/translations"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getCreateTranslationExample "multipart/form-data")
      // or pass a formformformformform
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

