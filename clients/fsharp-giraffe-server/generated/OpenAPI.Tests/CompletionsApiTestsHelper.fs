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
open OpenAPI.CompletionsApiHandler
open OpenAPI.CompletionsApiHandlerParams

module CompletionsApiHandlerTestsHelper =


  let mutable CreateCompletionExamples = Map.empty
  let mutable CreateCompletionBody = ""

  CreateCompletionBody <- WebUtility.HtmlDecode "{
  &quot;logit_bias&quot; : {
    &quot;key&quot; : 1
  },
  &quot;seed&quot; : -2147483648,
  &quot;max_tokens&quot; : 16,
  &quot;presence_penalty&quot; : 0.25495066265333133,
  &quot;echo&quot; : false,
  &quot;suffix&quot; : &quot;test.&quot;,
  &quot;n&quot; : 1,
  &quot;logprobs&quot; : 2,
  &quot;top_p&quot; : 1,
  &quot;frequency_penalty&quot; : 0.4109824732281613,
  &quot;best_of&quot; : 1,
  &quot;stop&quot; : &quot;\n&quot;,
  &quot;stream&quot; : false,
  &quot;temperature&quot; : 1,
  &quot;model&quot; : &quot;CreateCompletionRequest_model&quot;,
  &quot;prompt&quot; : &quot;This is a test.&quot;,
  &quot;user&quot; : &quot;user-1234&quot;
}"
  CreateCompletionExamples <- CreateCompletionExamples.Add("application/json", CreateCompletionBody)

  let getCreateCompletionExample mediaType =
    CreateCompletionExamples.[mediaType]
      |> getConverter mediaType
