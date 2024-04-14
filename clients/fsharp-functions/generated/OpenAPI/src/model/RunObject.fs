namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantObjectToolsInner
open OpenAPI.Model.AssistantsApiResponseFormatOption
open OpenAPI.Model.AssistantsApiToolChoiceOption
open OpenAPI.Model.RunCompletionUsage
open OpenAPI.Model.RunObjectIncompleteDetails
open OpenAPI.Model.RunObjectLastError
open OpenAPI.Model.RunObjectRequiredAction
open OpenAPI.Model.TruncationObject
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option

module RunObject =

  //#region RunObject

  [<CLIMutable>]
  type RunObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "thread_id")>]
    ThreadId : string;
    [<JsonProperty(PropertyName = "assistant_id")>]
    AssistantId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "required_action")>]
    RequiredAction : RunObjectRequiredAction;
    [<JsonProperty(PropertyName = "last_error")>]
    LastError : RunObjectLastError;
    [<JsonProperty(PropertyName = "expires_at")>]
    ExpiresAt : int option;
    [<JsonProperty(PropertyName = "started_at")>]
    StartedAt : int option;
    [<JsonProperty(PropertyName = "cancelled_at")>]
    CancelledAt : int option;
    [<JsonProperty(PropertyName = "failed_at")>]
    FailedAt : int option;
    [<JsonProperty(PropertyName = "completed_at")>]
    CompletedAt : int option;
    [<JsonProperty(PropertyName = "incomplete_details")>]
    IncompleteDetails : RunObjectIncompleteDetails;
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "instructions")>]
    Instructions : string;
    [<JsonProperty(PropertyName = "tools")>]
    Tools : AssistantObjectToolsInner[];
    [<JsonProperty(PropertyName = "file_ids")>]
    FileIds : string[];
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
    [<JsonProperty(PropertyName = "usage")>]
    Usage : RunCompletionUsage;
    [<JsonProperty(PropertyName = "temperature")>]
    Temperature : decimal option;
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
