-module(openapi_fine_tuning_job).

-include("openapi.hrl").

-export([openapi_fine_tuning_job/0]).

-export([openapi_fine_tuning_job/1]).

-export_type([openapi_fine_tuning_job/0]).

-type openapi_fine_tuning_job() ::
  [ {'id', binary() }
  | {'created_at', integer() }
  | {'error', openapi_fine_tuning_job_error:openapi_fine_tuning_job_error() }
  | {'fine_tuned_model', binary() }
  | {'finished_at', integer() }
  | {'hyperparameters', openapi_fine_tuning_job_hyperparameters:openapi_fine_tuning_job_hyperparameters() }
  | {'model', binary() }
  | {'object', binary() }
  | {'organization_id', binary() }
  | {'result_files', list(binary()) }
  | {'status', binary() }
  | {'trained_tokens', integer() }
  | {'training_file', binary() }
  | {'validation_file', binary() }
  | {'integrations', list(openapi_fine_tuning_job_integrations_inner:openapi_fine_tuning_job_integrations_inner()) }
  | {'seed', integer() }
  | {'estimated_finish', integer() }
  | {'method', openapi_fine_tune_method:openapi_fine_tune_method() }
  ].


openapi_fine_tuning_job() ->
    openapi_fine_tuning_job([]).

openapi_fine_tuning_job(Fields) ->
  Default = [ {'id', binary() }
            , {'created_at', integer() }
            , {'error', openapi_fine_tuning_job_error:openapi_fine_tuning_job_error() }
            , {'fine_tuned_model', binary() }
            , {'finished_at', integer() }
            , {'hyperparameters', openapi_fine_tuning_job_hyperparameters:openapi_fine_tuning_job_hyperparameters() }
            , {'model', binary() }
            , {'object', elements([<<"fine_tuning.job">>]) }
            , {'organization_id', binary() }
            , {'result_files', list(binary()) }
            , {'status', elements([<<"validating_files">>, <<"queued">>, <<"running">>, <<"succeeded">>, <<"failed">>, <<"cancelled">>]) }
            , {'trained_tokens', integer() }
            , {'training_file', binary() }
            , {'validation_file', binary() }
            , {'integrations', list(openapi_fine_tuning_job_integrations_inner:openapi_fine_tuning_job_integrations_inner()) }
            , {'seed', integer() }
            , {'estimated_finish', integer() }
            , {'method', openapi_fine_tune_method:openapi_fine_tune_method() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

