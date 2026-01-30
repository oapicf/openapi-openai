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
open OpenAPI.FineTuningApiHandler
open OpenAPI.FineTuningApiHandlerParams

module FineTuningApiHandlerTestsHelper =

  ()


  let mutable CreateFineTuningJobExamples = Map.empty
  let mutable CreateFineTuningJobBody = ""

  CreateFineTuningJobBody <- WebUtility.HtmlDecode "{
  &quot;training_file&quot; : &quot;file-abc123&quot;,
  &quot;seed&quot; : 42,
  &quot;method&quot; : {
    &quot;supervised&quot; : {
      &quot;hyperparameters&quot; : {
        &quot;batch_size&quot; : &quot;auto&quot;,
        &quot;n_epochs&quot; : &quot;auto&quot;,
        &quot;learning_rate_multiplier&quot; : &quot;auto&quot;
      }
    },
    &quot;dpo&quot; : {
      &quot;hyperparameters&quot; : {
        &quot;beta&quot; : &quot;auto&quot;
      }
    },
    &quot;type&quot; : &quot;supervised&quot;
  },
  &quot;validation_file&quot; : &quot;file-abc123&quot;,
  &quot;hyperparameters&quot; : {
    &quot;batch_size&quot; : &quot;auto&quot;,
    &quot;n_epochs&quot; : &quot;auto&quot;,
    &quot;learning_rate_multiplier&quot; : &quot;auto&quot;
  },
  &quot;model&quot; : &quot;gpt-4o-mini&quot;,
  &quot;suffix&quot; : &quot;suffix&quot;,
  &quot;integrations&quot; : [ {
    &quot;wandb&quot; : {
      &quot;name&quot; : &quot;name&quot;,
      &quot;project&quot; : &quot;my-wandb-project&quot;,
      &quot;entity&quot; : &quot;entity&quot;,
      &quot;tags&quot; : [ &quot;custom-tag&quot;, &quot;custom-tag&quot; ]
    },
    &quot;type&quot; : &quot;wandb&quot;
  }, {
    &quot;wandb&quot; : {
      &quot;name&quot; : &quot;name&quot;,
      &quot;project&quot; : &quot;my-wandb-project&quot;,
      &quot;entity&quot; : &quot;entity&quot;,
      &quot;tags&quot; : [ &quot;custom-tag&quot;, &quot;custom-tag&quot; ]
    },
    &quot;type&quot; : &quot;wandb&quot;
  } ]
}"
  CreateFineTuningJobExamples <- CreateFineTuningJobExamples.Add("application/json", CreateFineTuningJobBody)

  let getCreateFineTuningJobExample mediaType =
    CreateFineTuningJobExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

