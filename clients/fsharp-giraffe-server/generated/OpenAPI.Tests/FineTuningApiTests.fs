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
open FineTuningApiHandlerTestsHelper
open OpenAPI.FineTuningApiHandler
open OpenAPI.FineTuningApiHandlerParams
open OpenAPI.Model.CreateFineTuningJobRequest
open OpenAPI.Model.FineTuningJob
open OpenAPI.Model.ListFineTuningJobCheckpointsResponse
open OpenAPI.Model.ListFineTuningJobEventsResponse
open OpenAPI.Model.ListPaginatedFineTuningJobsResponse

module FineTuningApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CancelFineTuningJob - Immediately cancel a fine-tune job.  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel".Replace("fineTuningJobId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CreateFineTuningJob - Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/fine_tuning/jobs"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateFineTuningJobExample "application/json")
      // or pass a body of type CreateFineTuningJobRequest
      let body = obj() :?> CreateFineTuningJobRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ListFineTuningEvents - Get status updates for a fine-tuning job.  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/fine_tuning/jobs/{fine_tuning_job_id}/events".Replace("fineTuningJobId", "ADDME") + "?after=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListFineTuningJobCheckpoints - List checkpoints for a fine-tuning job.  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints".Replace("fineTuningJobId", "ADDME") + "?after=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListPaginatedFineTuningJobs - List your organization&#39;s fine-tuning jobs  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/fine_tuning/jobs" + "?after=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RetrieveFineTuningJob - Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/fine_tuning/jobs/{fine_tuning_job_id}".Replace("fineTuningJobId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

