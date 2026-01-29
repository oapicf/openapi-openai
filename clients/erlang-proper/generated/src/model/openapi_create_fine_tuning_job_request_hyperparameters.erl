-module(openapi_create_fine_tuning_job_request_hyperparameters).

-include("openapi.hrl").

-export([openapi_create_fine_tuning_job_request_hyperparameters/0]).

-export([openapi_create_fine_tuning_job_request_hyperparameters/1]).

-export_type([openapi_create_fine_tuning_job_request_hyperparameters/0]).

-type openapi_create_fine_tuning_job_request_hyperparameters() ::
  [ {'batch_size', openapi_create_fine_tuning_job_request_hyperparameters_batch_size:openapi_create_fine_tuning_job_request_hyperparameters_batch_size() }
  | {'learning_rate_multiplier', openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier:openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier() }
  | {'n_epochs', openapi_create_fine_tuning_job_request_hyperparameters_n_epochs:openapi_create_fine_tuning_job_request_hyperparameters_n_epochs() }
  ].


openapi_create_fine_tuning_job_request_hyperparameters() ->
    openapi_create_fine_tuning_job_request_hyperparameters([]).

openapi_create_fine_tuning_job_request_hyperparameters(Fields) ->
  Default = [ {'batch_size', openapi_create_fine_tuning_job_request_hyperparameters_batch_size:openapi_create_fine_tuning_job_request_hyperparameters_batch_size() }
            , {'learning_rate_multiplier', openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier:openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier() }
            , {'n_epochs', openapi_create_fine_tuning_job_request_hyperparameters_n_epochs:openapi_create_fine_tuning_job_request_hyperparameters_n_epochs() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

