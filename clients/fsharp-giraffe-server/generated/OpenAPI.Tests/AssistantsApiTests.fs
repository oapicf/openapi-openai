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
open AssistantsApiHandlerTestsHelper
open OpenAPI.AssistantsApiHandler
open OpenAPI.AssistantsApiHandlerParams
open OpenAPI.Model.AssistantObject
open OpenAPI.Model.CreateAssistantRequest
open OpenAPI.Model.CreateMessageRequest
open OpenAPI.Model.CreateRunRequest
open OpenAPI.Model.CreateThreadAndRunRequest
open OpenAPI.Model.CreateThreadRequest
open OpenAPI.Model.DeleteAssistantResponse
open OpenAPI.Model.DeleteMessageResponse
open OpenAPI.Model.DeleteThreadResponse
open OpenAPI.Model.ListAssistantsResponse
open OpenAPI.Model.ListMessagesResponse
open OpenAPI.Model.ListRunStepsResponse
open OpenAPI.Model.ListRunsResponse
open OpenAPI.Model.MessageObject
open OpenAPI.Model.ModifyAssistantRequest
open OpenAPI.Model.ModifyMessageRequest
open OpenAPI.Model.ModifyRunRequest
open OpenAPI.Model.ModifyThreadRequest
open OpenAPI.Model.RunObject
open OpenAPI.Model.RunStepObject
open OpenAPI.Model.SubmitToolOutputsRunRequest
open OpenAPI.Model.ThreadObject

module AssistantsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CancelRun - Cancels a run that is &#x60;in_progress&#x60;. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}/runs/{run_id}/cancel".Replace("threadId", "ADDME").Replace("runId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CreateAssistant - Create an assistant with a model and instructions. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/assistants"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateAssistantExample "application/json")
      // or pass a body of type CreateAssistantRequest
      let body = obj() :?> CreateAssistantRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateMessage - Create a message. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}/messages".Replace("threadId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateMessageExample "application/json")
      // or pass a body of type CreateMessageRequest
      let body = obj() :?> CreateMessageRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateRun - Create a run. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}/runs".Replace("threadId", "ADDME") + "?include=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateRunExample "application/json")
      // or pass a body of type CreateRunRequest
      let body = obj() :?> CreateRunRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateThread - Create a thread. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateThreadExample "application/json")
      // or pass a body of type CreateThreadRequest
      let body = obj() :?> CreateThreadRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateThreadAndRun - Create a thread and run it in one request. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/runs"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateThreadAndRunExample "application/json")
      // or pass a body of type CreateThreadAndRunRequest
      let body = obj() :?> CreateThreadAndRunRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteAssistant - Delete an assistant. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/assistants/{assistant_id}".Replace("assistantId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteMessage - Deletes a message. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}/messages/{message_id}".Replace("threadId", "ADDME").Replace("messageId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteThread - Delete a thread. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}".Replace("threadId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAssistant - Retrieves an assistant. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/assistants/{assistant_id}".Replace("assistantId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetMessage - Retrieve a message. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}/messages/{message_id}".Replace("threadId", "ADDME").Replace("messageId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetRun - Retrieves a run. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}/runs/{run_id}".Replace("threadId", "ADDME").Replace("runId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetRunStep - Retrieves a run step. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}".Replace("threadId", "ADDME").Replace("runId", "ADDME").Replace("stepId", "ADDME") + "?include=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetThread - Retrieves a thread. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}".Replace("threadId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListAssistants - Returns a list of assistants. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/assistants" + "?limit=ADDME&order=ADDME&after=ADDME&before=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListMessages - Returns a list of messages for a given thread. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}/messages".Replace("threadId", "ADDME") + "?limit=ADDME&order=ADDME&after=ADDME&before=ADDME&runId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListRunSteps - Returns a list of run steps belonging to a run. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}/runs/{run_id}/steps".Replace("threadId", "ADDME").Replace("runId", "ADDME") + "?limit=ADDME&order=ADDME&after=ADDME&before=ADDME&include=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListRuns - Returns a list of runs belonging to a thread. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}/runs".Replace("threadId", "ADDME") + "?limit=ADDME&order=ADDME&after=ADDME&before=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ModifyAssistant - Modifies an assistant. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/assistants/{assistant_id}".Replace("assistantId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getModifyAssistantExample "application/json")
      // or pass a body of type ModifyAssistantRequest
      let body = obj() :?> ModifyAssistantRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ModifyMessage - Modifies a message. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}/messages/{message_id}".Replace("threadId", "ADDME").Replace("messageId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getModifyMessageExample "application/json")
      // or pass a body of type ModifyMessageRequest
      let body = obj() :?> ModifyMessageRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ModifyRun - Modifies a run. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}/runs/{run_id}".Replace("threadId", "ADDME").Replace("runId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getModifyRunExample "application/json")
      // or pass a body of type ModifyRunRequest
      let body = obj() :?> ModifyRunRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ModifyThread - Modifies a thread. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}".Replace("threadId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getModifyThreadExample "application/json")
      // or pass a body of type ModifyThreadRequest
      let body = obj() :?> ModifyThreadRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SubmitToolOuputsToRun - When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request.  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs".Replace("threadId", "ADDME").Replace("runId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSubmitToolOuputsToRunExample "application/json")
      // or pass a body of type SubmitToolOutputsRunRequest
      let body = obj() :?> SubmitToolOutputsRunRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

