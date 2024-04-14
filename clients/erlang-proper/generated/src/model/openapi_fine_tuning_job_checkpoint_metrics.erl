-module(openapi_fine_tuning_job_checkpoint_metrics).

-include("openapi.hrl").

-export([openapi_fine_tuning_job_checkpoint_metrics/0]).

-export([openapi_fine_tuning_job_checkpoint_metrics/1]).

-export_type([openapi_fine_tuning_job_checkpoint_metrics/0]).

-type openapi_fine_tuning_job_checkpoint_metrics() ::
  [ {'step', integer() }
  | {'train_loss', integer() }
  | {'train_mean_token_accuracy', integer() }
  | {'valid_loss', integer() }
  | {'valid_mean_token_accuracy', integer() }
  | {'full_valid_loss', integer() }
  | {'full_valid_mean_token_accuracy', integer() }
  ].


openapi_fine_tuning_job_checkpoint_metrics() ->
    openapi_fine_tuning_job_checkpoint_metrics([]).

openapi_fine_tuning_job_checkpoint_metrics(Fields) ->
  Default = [ {'step', integer() }
            , {'train_loss', integer() }
            , {'train_mean_token_accuracy', integer() }
            , {'valid_loss', integer() }
            , {'valid_mean_token_accuracy', integer() }
            , {'full_valid_loss', integer() }
            , {'full_valid_mean_token_accuracy', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

