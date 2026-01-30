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
  &quot;reasoning_effort&quot; : &quot;medium&quot;,
  &quot;top_logprobs&quot; : 2,
  &quot;metadata&quot; : {
    &quot;key&quot; : &quot;metadata&quot;
  },
  &quot;logit_bias&quot; : {
    &quot;key&quot; : 6
  },
  &quot;seed&quot; : 2147483647,
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
  &quot;function_call&quot; : &quot;none&quot;,
  &quot;presence_penalty&quot; : -1.079145645226094,
  &quot;tools&quot; : [ {
    &quot;function&quot; : {
      &quot;name&quot; : &quot;name&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;strict&quot; : false,
      &quot;parameters&quot; : {
        &quot;key&quot; : &quot;&quot;
      }
    },
    &quot;type&quot; : &quot;function&quot;
  }, {
    &quot;function&quot; : {
      &quot;name&quot; : &quot;name&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;strict&quot; : false,
      &quot;parameters&quot; : {
        &quot;key&quot; : &quot;&quot;
      }
    },
    &quot;type&quot; : &quot;function&quot;
  } ],
  &quot;logprobs&quot; : false,
  &quot;top_p&quot; : 1,
  &quot;max_completion_tokens&quot; : 5,
  &quot;frequency_penalty&quot; : -1.6796687238155954,
  &quot;modalities&quot; : [ &quot;text&quot;, &quot;text&quot; ],
  &quot;response_format&quot; : {
    &quot;type&quot; : &quot;text&quot;
  },
  &quot;stream&quot; : false,
  &quot;temperature&quot; : 1,
  &quot;tool_choice&quot; : &quot;none&quot;,
  &quot;model&quot; : &quot;gpt-4o&quot;,
  &quot;service_tier&quot; : &quot;auto&quot;,
  &quot;audio&quot; : {
    &quot;voice&quot; : &quot;alloy&quot;,
    &quot;format&quot; : &quot;wav&quot;
  },
  &quot;max_tokens&quot; : 5,
  &quot;store&quot; : false,
  &quot;n&quot; : 1,
  &quot;stop&quot; : &quot;CreateChatCompletionRequest_stop&quot;,
  &quot;parallel_tool_calls&quot; : true,
  &quot;prediction&quot; : &quot;&quot;,
  &quot;messages&quot; : [ {
    &quot;role&quot; : &quot;developer&quot;,
    &quot;name&quot; : &quot;name&quot;,
    &quot;content&quot; : &quot;ChatCompletionRequestDeveloperMessage_content&quot;
  }, {
    &quot;role&quot; : &quot;developer&quot;,
    &quot;name&quot; : &quot;name&quot;,
    &quot;content&quot; : &quot;ChatCompletionRequestDeveloperMessage_content&quot;
  } ],
  &quot;stream_options&quot; : {
    &quot;include_usage&quot; : true
  },
  &quot;user&quot; : &quot;user-1234&quot;
}"
  CreateChatCompletionExamples <- CreateChatCompletionExamples.Add("application/json", CreateChatCompletionBody)

  let getCreateChatCompletionExample mediaType =
    CreateChatCompletionExamples.[mediaType]
      |> getConverter mediaType
