-module(openapi_fine_tuning_job_checkpoint).

-include("openapi.hrl").

-export([openapi_fine_tuning_job_checkpoint/0]).

-export([openapi_fine_tuning_job_checkpoint/1]).

-export_type([openapi_fine_tuning_job_checkpoint/0]).

-type openapi_fine_tuning_job_checkpoint() ::
  [ {'id', binary() }
  | {'created_at', integer() }
  | {'fine_tuned_model_checkpoint', binary() }
  | {'step_number', integer() }
  | {'metrics', openapi_fine_tuning_job_checkpoint_metrics:openapi_fine_tuning_job_checkpoint_metrics() }
  | {'fine_tuning_job_id', binary() }
  | {'object', binary() }
  ].


openapi_fine_tuning_job_checkpoint() ->
    openapi_fine_tuning_job_checkpoint([]).

openapi_fine_tuning_job_checkpoint(Fields) ->
  Default = [ {'id', binary() }
            , {'created_at', integer() }
            , {'fine_tuned_model_checkpoint', binary() }
            , {'step_number', integer() }
            , {'metrics', openapi_fine_tuning_job_checkpoint_metrics:openapi_fine_tuning_job_checkpoint_metrics() }
            , {'fine_tuning_job_id', binary() }
            , {'object', elements([<<"fine_tuning.job.checkpoint">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

