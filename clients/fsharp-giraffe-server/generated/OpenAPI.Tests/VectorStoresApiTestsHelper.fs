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
open TestHelper
open OpenAPI.VectorStoresApiHandler
open OpenAPI.VectorStoresApiHandlerParams

module VectorStoresApiHandlerTestsHelper =

  ()


  let mutable CreateVectorStoreExamples = Map.empty
  let mutable CreateVectorStoreBody = ""

  CreateVectorStoreBody <- WebUtility.HtmlDecode "{
  &quot;chunking_strategy&quot; : {
    &quot;type&quot; : &quot;auto&quot;
  },
  &quot;metadata&quot; : &quot;{}&quot;,
  &quot;expires_after&quot; : {
    &quot;anchor&quot; : &quot;last_active_at&quot;,
    &quot;days&quot; : 339
  },
  &quot;file_ids&quot; : [ &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot; ],
  &quot;name&quot; : &quot;name&quot;
}"
  CreateVectorStoreExamples <- CreateVectorStoreExamples.Add("application/json", CreateVectorStoreBody)

  let getCreateVectorStoreExample mediaType =
    CreateVectorStoreExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateVectorStoreFileExamples = Map.empty
  let mutable CreateVectorStoreFileBody = ""

  CreateVectorStoreFileBody <- WebUtility.HtmlDecode "{
  &quot;chunking_strategy&quot; : {
    &quot;type&quot; : &quot;auto&quot;
  },
  &quot;file_id&quot; : &quot;file_id&quot;
}"
  CreateVectorStoreFileExamples <- CreateVectorStoreFileExamples.Add("application/json", CreateVectorStoreFileBody)

  let getCreateVectorStoreFileExample mediaType =
    CreateVectorStoreFileExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateVectorStoreFileBatchExamples = Map.empty
  let mutable CreateVectorStoreFileBatchBody = ""

  CreateVectorStoreFileBatchBody <- WebUtility.HtmlDecode "{
  &quot;chunking_strategy&quot; : {
    &quot;type&quot; : &quot;auto&quot;
  },
  &quot;file_ids&quot; : [ &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot; ]
}"
  CreateVectorStoreFileBatchExamples <- CreateVectorStoreFileBatchExamples.Add("application/json", CreateVectorStoreFileBatchBody)

  let getCreateVectorStoreFileBatchExample mediaType =
    CreateVectorStoreFileBatchExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()


  let mutable ModifyVectorStoreExamples = Map.empty
  let mutable ModifyVectorStoreBody = ""

  ModifyVectorStoreBody <- WebUtility.HtmlDecode "{
  &quot;metadata&quot; : &quot;{}&quot;,
  &quot;expires_after&quot; : {
    &quot;anchor&quot; : &quot;last_active_at&quot;,
    &quot;days&quot; : 339
  },
  &quot;name&quot; : &quot;name&quot;
}"
  ModifyVectorStoreExamples <- ModifyVectorStoreExamples.Add("application/json", ModifyVectorStoreBody)

  let getModifyVectorStoreExample mediaType =
    ModifyVectorStoreExamples.[mediaType]
      |> getConverter mediaType
