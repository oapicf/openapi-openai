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
open OpenAPI.OpenAIApiHandler
open OpenAPI.OpenAIApiHandlerParams

module OpenAIApiHandlerTestsHelper =

  ()


  let mutable CreateChatCompletionExamples = Map.empty
  let mutable CreateChatCompletionBody = ""

  CreateChatCompletionBody <- WebUtility.HtmlDecode "{
  &quot;logit_bias&quot; : &quot;{}&quot;,
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
  } ],
  &quot;function_call&quot; : &quot;none&quot;,
  &quot;max_tokens&quot; : 0,
  &quot;presence_penalty&quot; : 0.4109824732281613,
  &quot;n&quot; : 1,
  &quot;top_p&quot; : 1,
  &quot;frequency_penalty&quot; : -1.413674807798822,
  &quot;stop&quot; : &quot;CreateChatCompletionRequest_stop&quot;,
  &quot;stream&quot; : false,
  &quot;temperature&quot; : 1,
  &quot;messages&quot; : [ {
    &quot;role&quot; : &quot;system&quot;,
    &quot;function_call&quot; : {
      &quot;name&quot; : &quot;name&quot;,
      &quot;arguments&quot; : &quot;arguments&quot;
    },
    &quot;name&quot; : &quot;name&quot;,
    &quot;content&quot; : &quot;content&quot;
  }, {
    &quot;role&quot; : &quot;system&quot;,
    &quot;function_call&quot; : {
      &quot;name&quot; : &quot;name&quot;,
      &quot;arguments&quot; : &quot;arguments&quot;
    },
    &quot;name&quot; : &quot;name&quot;,
    &quot;content&quot; : &quot;content&quot;
  } ],
  &quot;model&quot; : &quot;gpt-3.5-turbo&quot;,
  &quot;user&quot; : &quot;user-1234&quot;
}"
  CreateChatCompletionExamples <- CreateChatCompletionExamples.Add("application/json", CreateChatCompletionBody)

  let getCreateChatCompletionExample mediaType =
    CreateChatCompletionExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateCompletionExamples = Map.empty
  let mutable CreateCompletionBody = ""

  CreateCompletionBody <- WebUtility.HtmlDecode "{
  &quot;logit_bias&quot; : &quot;{}&quot;,
  &quot;max_tokens&quot; : 16,
  &quot;presence_penalty&quot; : 0.4109824732281613,
  &quot;echo&quot; : false,
  &quot;suffix&quot; : &quot;test.&quot;,
  &quot;n&quot; : 1,
  &quot;logprobs&quot; : 0,
  &quot;top_p&quot; : 1,
  &quot;frequency_penalty&quot; : -1.413674807798822,
  &quot;stop&quot; : &quot;\n&quot;,
  &quot;best_of&quot; : 11,
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

  let mutable CreateEditExamples = Map.empty
  let mutable CreateEditBody = ""

  CreateEditBody <- WebUtility.HtmlDecode "{
  &quot;top_p&quot; : 1,
  &quot;input&quot; : &quot;What day of the wek is it?&quot;,
  &quot;instruction&quot; : &quot;Fix the spelling mistakes.&quot;,
  &quot;temperature&quot; : 1,
  &quot;model&quot; : &quot;text-davinci-edit-001&quot;,
  &quot;n&quot; : 1
}"
  CreateEditExamples <- CreateEditExamples.Add("application/json", CreateEditBody)

  let getCreateEditExample mediaType =
    CreateEditExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateEmbeddingExamples = Map.empty
  let mutable CreateEmbeddingBody = ""

  CreateEmbeddingBody <- WebUtility.HtmlDecode "{
  &quot;input&quot; : &quot;The quick brown fox jumped over the lazy dog&quot;,
  &quot;model&quot; : &quot;text-embedding-ada-002&quot;,
  &quot;user&quot; : &quot;user-1234&quot;
}"
  CreateEmbeddingExamples <- CreateEmbeddingExamples.Add("application/json", CreateEmbeddingBody)

  let getCreateEmbeddingExample mediaType =
    CreateEmbeddingExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateFileExamples = Map.empty
  let mutable CreateFileBody = ""

  let getCreateFileExample mediaType =
    CreateFileExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateFineTuneExamples = Map.empty
  let mutable CreateFineTuneBody = ""

  CreateFineTuneBody <- WebUtility.HtmlDecode "{
  &quot;training_file&quot; : &quot;file-ajSREls59WBbvgSzJSVWxMCB&quot;,
  &quot;n_epochs&quot; : 0,
  &quot;batch_size&quot; : 6,
  &quot;classification_n_classes&quot; : 5,
  &quot;validation_file&quot; : &quot;file-XjSREls59WBbvgSzJSVWxMCa&quot;,
  &quot;classification_betas&quot; : [ 0.6, 1, 1.5, 2 ],
  &quot;prompt_loss_weight&quot; : 5.962133916683182,
  &quot;model&quot; : &quot;curie&quot;,
  &quot;compute_classification_metrics&quot; : false,
  &quot;classification_positive_class&quot; : &quot;classification_positive_class&quot;,
  &quot;suffix&quot; : &quot;suffix&quot;,
  &quot;learning_rate_multiplier&quot; : 1.4658129805029452
}"
  CreateFineTuneExamples <- CreateFineTuneExamples.Add("application/json", CreateFineTuneBody)

  let getCreateFineTuneExample mediaType =
    CreateFineTuneExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateImageExamples = Map.empty
  let mutable CreateImageBody = ""

  CreateImageBody <- WebUtility.HtmlDecode "{
  &quot;response_format&quot; : &quot;url&quot;,
  &quot;size&quot; : &quot;1024x1024&quot;,
  &quot;prompt&quot; : &quot;A cute baby sea otter&quot;,
  &quot;user&quot; : &quot;user-1234&quot;,
  &quot;n&quot; : 1
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

  let mutable CreateModerationExamples = Map.empty
  let mutable CreateModerationBody = ""

  CreateModerationBody <- WebUtility.HtmlDecode "{
  &quot;input&quot; : &quot;I want to kill them.&quot;,
  &quot;model&quot; : &quot;text-moderation-stable&quot;
}"
  CreateModerationExamples <- CreateModerationExamples.Add("application/json", CreateModerationBody)

  let getCreateModerationExample mediaType =
    CreateModerationExamples.[mediaType]
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
  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

