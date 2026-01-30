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
open RealtimeApiHandlerTestsHelper
open OpenAPI.RealtimeApiHandler
open OpenAPI.RealtimeApiHandlerParams
open OpenAPI.Model.RealtimeSessionCreateRequest
open OpenAPI.Model.RealtimeSessionCreateResponse

module RealtimeApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CreateRealtimeSession - Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API.  returns 200 where Session created successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/realtime/sessions"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateRealtimeSessionExample "application/json")
      // or pass a body of type RealtimeSessionCreateRequest
      let body = obj() :?> RealtimeSessionCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

