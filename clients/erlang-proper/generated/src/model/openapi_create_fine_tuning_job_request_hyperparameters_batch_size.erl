-module(openapi_create_fine_tuning_job_request_hyperparameters_batch_size).

-include("openapi.hrl").

-export([openapi_create_fine_tuning_job_request_hyperparameters_batch_size/0]).

-export([openapi_create_fine_tuning_job_request_hyperparameters_batch_size/1]).

-export_type([openapi_create_fine_tuning_job_request_hyperparameters_batch_size/0]).

-type openapi_create_fine_tuning_job_request_hyperparameters_batch_size() ::
  [ 
  ].


openapi_create_fine_tuning_job_request_hyperparameters_batch_size() ->
    openapi_create_fine_tuning_job_request_hyperparameters_batch_size([]).

openapi_create_fine_tuning_job_request_hyperparameters_batch_size(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

