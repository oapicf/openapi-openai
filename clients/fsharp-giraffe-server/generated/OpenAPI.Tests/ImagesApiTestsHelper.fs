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
open OpenAPI.ImagesApiHandler
open OpenAPI.ImagesApiHandlerParams

module ImagesApiHandlerTestsHelper =


  let mutable CreateImageExamples = Map.empty
  let mutable CreateImageBody = ""

  CreateImageBody <- WebUtility.HtmlDecode "{
  &quot;response_format&quot; : &quot;url&quot;,
  &quot;size&quot; : &quot;1024x1024&quot;,
  &quot;model&quot; : &quot;dall-e-3&quot;,
  &quot;style&quot; : &quot;vivid&quot;,
  &quot;prompt&quot; : &quot;A cute baby sea otter&quot;,
  &quot;user&quot; : &quot;user-1234&quot;,
  &quot;n&quot; : 1,
  &quot;quality&quot; : &quot;standard&quot;
}"
  CreateImageExamples <- CreateImageExamples.Add("application/json", CreateImageBody)

  let getCreateImageExample mediaType =
    CreateImageExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateImageEditExamples = Map.empty
  let mutable CreateImageEditBody = ""

  let getCreateImageEditExample mediaType =
    CreateImageEditExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateImageVariationExamples = Map.empty
  let mutable CreateImageVariationBody = ""

  let getCreateImageVariationExample mediaType =
    CreateImageVariationExamples.[mediaType]
      |> getConverter mediaType
