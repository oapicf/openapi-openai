-module(openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier).

-include("openapi.hrl").

-export([openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier/0]).

-export([openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier/1]).

-export_type([openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier/0]).

-type openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier() ::
  [ 
  ].


openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier() ->
    openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier([]).

openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

