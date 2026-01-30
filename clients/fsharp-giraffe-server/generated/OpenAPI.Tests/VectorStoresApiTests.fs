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
open VectorStoresApiHandlerTestsHelper
open OpenAPI.VectorStoresApiHandler
open OpenAPI.VectorStoresApiHandlerParams
open OpenAPI.Model.CreateVectorStoreFileBatchRequest
open OpenAPI.Model.CreateVectorStoreFileRequest
open OpenAPI.Model.CreateVectorStoreRequest
open OpenAPI.Model.DeleteVectorStoreFileResponse
open OpenAPI.Model.DeleteVectorStoreResponse
open OpenAPI.Model.ListVectorStoreFilesResponse
open OpenAPI.Model.ListVectorStoresResponse
open OpenAPI.Model.UpdateVectorStoreRequest
open OpenAPI.Model.VectorStoreFileBatchObject
open OpenAPI.Model.VectorStoreFileObject
open OpenAPI.Model.VectorStoreObject

module VectorStoresApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CancelVectorStoreFileBatch - Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel".Replace("vectorStoreId", "ADDME").Replace("batchId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CreateVectorStore - Create a vector store. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/vector_stores"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateVectorStoreExample "application/json")
      // or pass a body of type CreateVectorStoreRequest
      let body = obj() :?> CreateVectorStoreRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateVectorStoreFile - Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object). returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/vector_stores/{vector_store_id}/files".Replace("vectorStoreId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateVectorStoreFileExample "application/json")
      // or pass a body of type CreateVectorStoreFileRequest
      let body = obj() :?> CreateVectorStoreFileRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateVectorStoreFileBatch - Create a vector store file batch. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/vector_stores/{vector_store_id}/file_batches".Replace("vectorStoreId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateVectorStoreFileBatchExample "application/json")
      // or pass a body of type CreateVectorStoreFileBatchRequest
      let body = obj() :?> CreateVectorStoreFileBatchRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteVectorStore - Delete a vector store. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/vector_stores/{vector_store_id}".Replace("vectorStoreId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DeleteVectorStoreFile - Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/vector_stores/{vector_store_id}/files/{file_id}".Replace("vectorStoreId", "ADDME").Replace("fileId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetVectorStore - Retrieves a vector store. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/vector_stores/{vector_store_id}".Replace("vectorStoreId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetVectorStoreFile - Retrieves a vector store file. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/vector_stores/{vector_store_id}/files/{file_id}".Replace("vectorStoreId", "ADDME").Replace("fileId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetVectorStoreFileBatch - Retrieves a vector store file batch. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}".Replace("vectorStoreId", "ADDME").Replace("batchId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListFilesInVectorStoreBatch - Returns a list of vector store files in a batch. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/files".Replace("vectorStoreId", "ADDME").Replace("batchId", "ADDME") + "?limit=ADDME&order=ADDME&after=ADDME&before=ADDME&filter=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListVectorStoreFiles - Returns a list of vector store files. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/vector_stores/{vector_store_id}/files".Replace("vectorStoreId", "ADDME") + "?limit=ADDME&order=ADDME&after=ADDME&before=ADDME&filter=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ListVectorStores - Returns a list of vector stores. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/vector_stores" + "?limit=ADDME&order=ADDME&after=ADDME&before=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ModifyVectorStore - Modifies a vector store. returns 200 where OK`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/vector_stores/{vector_store_id}".Replace("vectorStoreId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getModifyVectorStoreExample "application/json")
      // or pass a body of type UpdateVectorStoreRequest
      let body = obj() :?> UpdateVectorStoreRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

