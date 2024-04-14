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
open OpenAPI.ChatApiHandler
open OpenAPI.ChatApiHandlerParams

module ChatApiHandlerTestsHelper =


  let mutable CreateChatCompletionExamples = Map.empty
  let mutable CreateChatCompletionBody = ""

  CreateChatCompletionBody <- WebUtility.HtmlDecode "{
  &quot;top_logprobs&quot; : 2,
  &quot;logit_bias&quot; : {
    &quot;key&quot; : 6
  },
  &quot;seed&quot; : -2147483648,
  &quot;functions&quot; : [ {
    &quot;name&quot; : &quot;name&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;parameters&quot; : {
      &quot;key&quot; : &quot;&quot;
    }
  }, {
    &quot;name&quot; : &quot;name&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;parameters&quot; : {
      &quot;key&quot; : &quot;&quot;
    }
  }, {
    &quot;name&quot; : &quot;name&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;parameters&quot; : {
      &quot;key&quot; : &quot;&quot;
    }
  }, {
    &quot;name&quot; : &quot;name&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;parameters&quot; : {
      &quot;key&quot; : &quot;&quot;
    }
  }, {
    &quot;name&quot; : &quot;name&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;parameters&quot; : {
      &quot;key&quot; : &quot;&quot;
    }
  } ],
  &quot;max_tokens&quot; : 5,
  &quot;function_call&quot; : &quot;none&quot;,
  &quot;presence_penalty&quot; : 0.25495066265333133,
  &quot;tools&quot; : [ {
    &quot;function&quot; : {
      &quot;name&quot; : &quot;name&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;parameters&quot; : {
        &quot;key&quot; : &quot;&quot;
      }
    },
    &quot;type&quot; : &quot;function&quot;
  }, {
    &quot;function&quot; : {
      &quot;name&quot; : &quot;name&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;parameters&quot; : {
        &quot;key&quot; : &quot;&quot;
      }
    },
    &quot;type&quot; : &quot;function&quot;
  } ],
  &quot;n&quot; : 1,
  &quot;logprobs&quot; : false,
  &quot;top_p&quot; : 1,
  &quot;frequency_penalty&quot; : -1.6796687238155954,
  &quot;response_format&quot; : {
    &quot;type&quot; : &quot;json_object&quot;
  },
  &quot;stop&quot; : &quot;CreateChatCompletionRequest_stop&quot;,
  &quot;stream&quot; : false,
  &quot;temperature&quot; : 1,
  &quot;messages&quot; : [ {
    &quot;role&quot; : &quot;system&quot;,
    &quot;name&quot; : &quot;name&quot;,
    &quot;content&quot; : &quot;content&quot;
  }, {
    &quot;role&quot; : &quot;system&quot;,
    &quot;name&quot; : &quot;name&quot;,
    &quot;content&quot; : &quot;content&quot;
  } ],
  &quot;tool_choice&quot; : &quot;none&quot;,
  &quot;model&quot; : &quot;gpt-4-turbo&quot;,
  &quot;user&quot; : &quot;user-1234&quot;
}"
  CreateChatCompletionExamples <- CreateChatCompletionExamples.Add("application/json", CreateChatCompletionBody)

  let getCreateChatCompletionExample mediaType =
    CreateChatCompletionExamples.[mediaType]
      |> getConverter mediaType
