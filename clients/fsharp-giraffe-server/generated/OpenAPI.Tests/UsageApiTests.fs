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
open UsageApiHandlerTestsHelper
open OpenAPI.UsageApiHandler
open OpenAPI.UsageApiHandlerParams
open OpenAPI.Model.UsageResponse

module UsageApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``UsageAudioSpeeches - Get audio speeches usage details for the organization. returns 200 where Usage data retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/usage/audio_speeches" + "?startTime=ADDME&endTime=ADDME&bucketWidth=ADDME&projectIds=ADDME&userIds=ADDME&apiKeyIds=ADDME&models=ADDME&groupBy=ADDME&limit=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UsageAudioTranscriptions - Get audio transcriptions usage details for the organization. returns 200 where Usage data retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/usage/audio_transcriptions" + "?startTime=ADDME&endTime=ADDME&bucketWidth=ADDME&projectIds=ADDME&userIds=ADDME&apiKeyIds=ADDME&models=ADDME&groupBy=ADDME&limit=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UsageCodeInterpreterSessions - Get code interpreter sessions usage details for the organization. returns 200 where Usage data retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/usage/code_interpreter_sessions" + "?startTime=ADDME&endTime=ADDME&bucketWidth=ADDME&projectIds=ADDME&groupBy=ADDME&limit=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UsageCompletions - Get completions usage details for the organization. returns 200 where Usage data retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/usage/completions" + "?startTime=ADDME&endTime=ADDME&bucketWidth=ADDME&projectIds=ADDME&userIds=ADDME&apiKeyIds=ADDME&models=ADDME&batch=ADDME&groupBy=ADDME&limit=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UsageCosts - Get costs details for the organization. returns 200 where Costs data retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/costs" + "?startTime=ADDME&endTime=ADDME&bucketWidth=ADDME&projectIds=ADDME&groupBy=ADDME&limit=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UsageEmbeddings - Get embeddings usage details for the organization. returns 200 where Usage data retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/usage/embeddings" + "?startTime=ADDME&endTime=ADDME&bucketWidth=ADDME&projectIds=ADDME&userIds=ADDME&apiKeyIds=ADDME&models=ADDME&groupBy=ADDME&limit=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UsageImages - Get images usage details for the organization. returns 200 where Usage data retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/usage/images" + "?startTime=ADDME&endTime=ADDME&bucketWidth=ADDME&sources=ADDME&sizes=ADDME&projectIds=ADDME&userIds=ADDME&apiKeyIds=ADDME&models=ADDME&groupBy=ADDME&limit=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UsageModerations - Get moderations usage details for the organization. returns 200 where Usage data retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/usage/moderations" + "?startTime=ADDME&endTime=ADDME&bucketWidth=ADDME&projectIds=ADDME&userIds=ADDME&apiKeyIds=ADDME&models=ADDME&groupBy=ADDME&limit=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UsageVectorStores - Get vector stores usage details for the organization. returns 200 where Usage data retrieved successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/organization/usage/vector_stores" + "?startTime=ADDME&endTime=ADDME&bucketWidth=ADDME&projectIds=ADDME&groupBy=ADDME&limit=ADDME&page=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

