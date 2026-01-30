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
open DefaultApiHandlerTestsHelper
open OpenAPI.DefaultApiHandler
open OpenAPI.DefaultApiHandlerParams
open OpenAPI.Model.AdminApiKey
open OpenAPI.Model.AdminApiKeysCreateRequest
open OpenAPI.Model.AdminApiKeysDelete200Response
open OpenAPI.Model.ApiKeyList
open OpenAPI.Model.string option

module DefaultApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AdminApiKeysCreate - Create an organization admin API key returns 200 where The newly created admin API key.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/admin_api_keys"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAdminApiKeysCreateExample "application/json")
      // or pass a body of type AdminApiKeysCreateRequest
      let body = obj() :?> AdminApiKeysCreateRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AdminApiKeysDelete - Delete an organization admin API key returns 200 where Confirmation that the API key was deleted.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/admin_api_keys/{key_id}".Replace("keyId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdminApiKeysGet - Retrieve a single organization API key returns 200 where Details of the requested API key.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/admin_api_keys/{key_id}".Replace("keyId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``AdminApiKeysList - List organization API keys returns 200 where A list of organization API keys.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/admin_api_keys" + "?after=ADDME&order=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

