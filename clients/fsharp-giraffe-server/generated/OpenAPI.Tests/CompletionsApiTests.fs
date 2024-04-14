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
open CompletionsApiHandlerTestsHelper
open OpenAPI.CompletionsApiHandler
open OpenAPI.CompletionsApiHandlerParams
open OpenAPI.Model.CreateCompletionRequest
open OpenAPI.Model.CreateCompletionResponse

module CompletionsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CreateCompletion - Creates a completion for the provided prompt and parameters. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/completions"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateCompletionExample "application/json")
      // or pass a body of type CreateCompletionRequest
      let body = obj() :?> CreateCompletionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

