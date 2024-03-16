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
open OpenAIApiHandlerTestsHelper
open OpenAPI.OpenAIApiHandler
open OpenAPI.OpenAIApiHandlerParams
open OpenAPI.Model.CreateChatCompletionRequest
open OpenAPI.Model.CreateChatCompletionResponse
open OpenAPI.Model.CreateCompletionRequest
open OpenAPI.Model.CreateCompletionResponse
open OpenAPI.Model.CreateEditRequest
open OpenAPI.Model.CreateEditResponse
open OpenAPI.Model.CreateEmbeddingRequest
open OpenAPI.Model.CreateEmbeddingResponse
open OpenAPI.Model.CreateFineTuneRequest
open OpenAPI.Model.CreateImageRequest
open OpenAPI.Model.CreateModerationRequest
open OpenAPI.Model.CreateModerationResponse
open OpenAPI.Model.CreateTranscriptionRequestModel
open OpenAPI.Model.CreateTranscriptionResponse
open OpenAPI.Model.CreateTranslationResponse
open OpenAPI.Model.DeleteFileResponse
open OpenAPI.Model.DeleteModelResponse
open OpenAPI.Model.FineTune
open OpenAPI.Model.ImagesResponse
open OpenAPI.Model.ListFilesResponse
open OpenAPI.Model.ListFineTuneEventsResponse
open OpenAPI.Model.ListFineTunesResponse
open OpenAPI.Model.ListModelsResponse
open OpenAPI.Model.Model
open OpenAPI.Model.OpenAIFile
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module OpenAIApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CancelFineTune - Immediately cancel a fine-tune job.  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/fine-tunes/{fine_tune_id}/cancel".Replace("fineTuneId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CreateChatCompletion - Creates a model response for the given chat conversation. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/chat/completions"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatCompletionExample "application/json")
      // or pass a body of type CreateChatCompletionRequest
      let body = obj() :?> CreateChatCompletionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

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

  [<Fact>]
  let ``CreateEdit - Creates a new edit for the provided input, instruction, and parameters. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/edits"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateEditExample "application/json")
      // or pass a body of type CreateEditRequest
      let body = obj() :?> CreateEditRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateEmbedding - Creates an embedding vector representing the input text. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/embeddings"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateEmbeddingExample "application/json")
      // or pass a body of type CreateEmbeddingRequest
      let body = obj() :?> CreateEmbeddingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateFile - Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/files"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getCreateFileExample "multipart/form-data")
      // or pass a formform
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateFineTune - Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/fine-tunes"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateFineTuneExample "application/json")
      // or pass a body of type CreateFineTuneRequest
      let body = obj() :?> CreateFineTuneRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

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
      // or pass a formformformformformformform
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
      // or pass a formformformformform
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateModeration - Classifies if text violates OpenAI&#39;s Content Policy returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/moderations"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateModerationExample "application/json")
      // or pass a body of type CreateModerationRequest
      let body = obj() :?> CreateModerationRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

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
      // or pass a formformformformformform
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

  [<Fact>]
  let ``DeleteFile - Delete a file. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/files/{file_id}".Replace("fileId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteModel - Delete a fine-tuned model. You must have the Owner role in your organization. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/models/{model}".Replace("model", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadFile - Returns the contents of the specified file returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/files/{file_id}/content".Replace("fileId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListFiles - Returns a list of files that belong to the user&#39;s organization. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/files"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListFineTuneEvents - Get fine-grained status updates for a fine-tune job.  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/fine-tunes/{fine_tune_id}/events".Replace("fineTuneId", "ADDME") + "?stream=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListFineTunes - List your organization&#39;s fine-tuning jobs  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/fine-tunes"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListModels - Lists the currently available models, and provides basic information about each one such as the owner and availability. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/models"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RetrieveFile - Returns information about a specific file. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/files/{file_id}".Replace("fileId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RetrieveFineTune - Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/fine-tunes/{fine_tune_id}".Replace("fineTuneId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RetrieveModel - Retrieves a model instance, providing basic information about the model such as the owner and permissioning. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/models/{model}".Replace("model", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

