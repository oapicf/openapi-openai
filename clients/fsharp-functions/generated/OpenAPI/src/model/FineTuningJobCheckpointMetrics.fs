namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FineTuningJobCheckpointMetrics =

  //#region FineTuningJobCheckpointMetrics

  [<CLIMutable>]
  type FineTuningJobCheckpointMetrics = {
    [<JsonProperty(PropertyName = "step")>]
    Step : decimal;
    [<JsonProperty(PropertyName = "train_loss")>]
    TrainLoss : decimal;
    [<JsonProperty(PropertyName = "train_mean_token_accuracy")>]
    TrainMeanTokenAccuracy : decimal;
    [<JsonProperty(PropertyName = "valid_loss")>]
    ValidLoss : decimal;
    [<JsonProperty(PropertyName = "valid_mean_token_accuracy")>]
    ValidMeanTokenAccuracy : decimal;
    [<JsonProperty(PropertyName = "full_valid_loss")>]
    FullValidLoss : decimal;
    [<JsonProperty(PropertyName = "full_valid_mean_token_accuracy")>]
    FullValidMeanTokenAccuracy : decimal;
  }

  //#endregion
