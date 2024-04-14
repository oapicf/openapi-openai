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
open OpenAPI.EmbeddingsApiHandler
open OpenAPI.EmbeddingsApiHandlerParams

module EmbeddingsApiHandlerTestsHelper =


  let mutable CreateEmbeddingExamples = Map.empty
  let mutable CreateEmbeddingBody = ""

  CreateEmbeddingBody <- WebUtility.HtmlDecode "{
  &quot;input&quot; : &quot;The quick brown fox jumped over the lazy dog&quot;,
  &quot;encoding_format&quot; : &quot;float&quot;,
  &quot;model&quot; : &quot;text-embedding-3-small&quot;,
  &quot;user&quot; : &quot;user-1234&quot;,
  &quot;dimensions&quot; : 1
}"
  CreateEmbeddingExamples <- CreateEmbeddingExamples.Add("application/json", CreateEmbeddingBody)

  let getCreateEmbeddingExample mediaType =
    CreateEmbeddingExamples.[mediaType]
      |> getConverter mediaType
