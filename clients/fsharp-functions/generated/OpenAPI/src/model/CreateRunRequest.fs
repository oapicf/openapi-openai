namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantObjectToolsInner
open OpenAPI.Model.AssistantsApiResponseFormatOption
open OpenAPI.Model.AssistantsApiToolChoiceOption
open OpenAPI.Model.CreateMessageRequest
open OpenAPI.Model.CreateRunRequestModel
open OpenAPI.Model.TruncationObject
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CreateRunRequest =

  //#region CreateRunRequest

  [<CLIMutable>]
  type CreateRunRequest = {
    [<JsonProperty(PropertyName = "assistant_id")>]
    AssistantId : string;
    [<JsonProperty(PropertyName = "model")>]
    Model : CreateRunRequestModel;
    [<JsonProperty(PropertyName = "instructions")>]
    Instructions : string option;
    [<JsonProperty(PropertyName = "additional_instructions")>]
    AdditionalInstructions : string option;
    [<JsonProperty(PropertyName = "additional_messages")>]
    AdditionalMessages : CreateMessageRequest[];
    [<JsonProperty(PropertyName = "tools")>]
    Tools : AssistantObjectToolsInner[];
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
    [<JsonProperty(PropertyName = "temperature")>]
    Temperature : decimal option;
    [<JsonProperty(PropertyName = "stream")>]
    Stream : bool option;
    [<JsonProperty(PropertyName = "max_prompt_tokens")>]
    MaxPromptTokens : int option;
    [<JsonProperty(PropertyName = "max_completion_tokens")>]
    MaxCompletionTokens : int option;
    [<JsonProperty(PropertyName = "truncation_strategy")>]
    TruncationStrategy : TruncationObject;
    [<JsonProperty(PropertyName = "tool_choice")>]
    ToolChoice : AssistantsApiToolChoiceOption;
    [<JsonProperty(PropertyName = "response_format")>]
    ResponseFormat : AssistantsApiResponseFormatOption;
  }

  //#endregion
