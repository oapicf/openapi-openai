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
open OpenAPI.UploadsApiHandler
open OpenAPI.UploadsApiHandlerParams

module UploadsApiHandlerTestsHelper =


  let mutable AddUploadPartExamples = Map.empty
  let mutable AddUploadPartBody = ""

  let getAddUploadPartExample mediaType =
    AddUploadPartExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable CompleteUploadExamples = Map.empty
  let mutable CompleteUploadBody = ""

  CompleteUploadBody <- WebUtility.HtmlDecode "{
  &quot;part_ids&quot; : [ &quot;part_ids&quot;, &quot;part_ids&quot; ],
  &quot;md5&quot; : &quot;md5&quot;
}"
  CompleteUploadExamples <- CompleteUploadExamples.Add("application/json", CompleteUploadBody)

  let getCompleteUploadExample mediaType =
    CompleteUploadExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateUploadExamples = Map.empty
  let mutable CreateUploadBody = ""

  CreateUploadBody <- WebUtility.HtmlDecode "{
  &quot;filename&quot; : &quot;filename&quot;,
  &quot;purpose&quot; : &quot;assistants&quot;,
  &quot;mime_type&quot; : &quot;mime_type&quot;,
  &quot;bytes&quot; : 0
}"
  CreateUploadExamples <- CreateUploadExamples.Add("application/json", CreateUploadBody)

  let getCreateUploadExample mediaType =
    CreateUploadExamples.[mediaType]
      |> getConverter mediaType
