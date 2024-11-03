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
open OpenAPI.AudioApiHandler
open OpenAPI.AudioApiHandlerParams

module AudioApiHandlerTestsHelper =


  let mutable CreateSpeechExamples = Map.empty
  let mutable CreateSpeechBody = ""

  CreateSpeechBody <- WebUtility.HtmlDecode "{
  &quot;voice&quot; : &quot;alloy&quot;,
  &quot;input&quot; : &quot;input&quot;,
  &quot;response_format&quot; : &quot;mp3&quot;,
  &quot;model&quot; : &quot;CreateSpeechRequest_model&quot;,
  &quot;speed&quot; : 0.5503105714228793
}"
  CreateSpeechExamples <- CreateSpeechExamples.Add("application/json", CreateSpeechBody)

  let getCreateSpeechExample mediaType =
    CreateSpeechExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateTranscriptionExamples = Map.empty
  let mutable CreateTranscriptionBody = ""

  let getCreateTranscriptionExample mediaType =
    CreateTranscriptionExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateTranslationExamples = Map.empty
  let mutable CreateTranslationBody = ""

  let getCreateTranslationExample mediaType =
    CreateTranslationExamples.[mediaType]
      |> getConverter mediaType
