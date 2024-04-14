namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RunObjectRequiredActionSubmitToolOutputs

module RunObjectRequiredAction =

  //#region RunObjectRequiredAction

  [<CLIMutable>]
  type RunObjectRequiredAction = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "submit_tool_outputs")>]
    SubmitToolOutputs : RunObjectRequiredActionSubmitToolOutputs;
  }

  //#endregion
