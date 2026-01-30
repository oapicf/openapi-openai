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
open OpenAPI.RealtimeApiHandler
open OpenAPI.RealtimeApiHandlerParams

module RealtimeApiHandlerTestsHelper =


  let mutable CreateRealtimeSessionExamples = Map.empty
  let mutable CreateRealtimeSessionBody = ""

  CreateRealtimeSessionBody <- WebUtility.HtmlDecode "{
  &quot;voice&quot; : &quot;alloy&quot;,
  &quot;instructions&quot; : &quot;instructions&quot;,
  &quot;input_audio_format&quot; : &quot;pcm16&quot;,
  &quot;modalities&quot; : [ &quot;text&quot;, &quot;text&quot; ],
  &quot;max_response_output_tokens&quot; : 5,
  &quot;output_audio_format&quot; : &quot;pcm16&quot;,
  &quot;input_audio_transcription&quot; : {
    &quot;model&quot; : &quot;model&quot;
  },
  &quot;temperature&quot; : 5.962133916683182,
  &quot;turn_detection&quot; : {
    &quot;silence_duration_ms&quot; : 1,
    &quot;create_response&quot; : true,
    &quot;prefix_padding_ms&quot; : 6,
    &quot;threshold&quot; : 0.8008281904610115,
    &quot;type&quot; : &quot;type&quot;
  },
  &quot;tool_choice&quot; : &quot;tool_choice&quot;,
  &quot;model&quot; : &quot;gpt-4o-realtime-preview&quot;,
  &quot;tools&quot; : [ {
    &quot;name&quot; : &quot;name&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;type&quot; : &quot;function&quot;,
    &quot;parameters&quot; : &quot;{}&quot;
  }, {
    &quot;name&quot; : &quot;name&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;type&quot; : &quot;function&quot;,
    &quot;parameters&quot; : &quot;{}&quot;
  } ]
}"
  CreateRealtimeSessionExamples <- CreateRealtimeSessionExamples.Add("application/json", CreateRealtimeSessionBody)

  let getCreateRealtimeSessionExample mediaType =
    CreateRealtimeSessionExamples.[mediaType]
      |> getConverter mediaType
