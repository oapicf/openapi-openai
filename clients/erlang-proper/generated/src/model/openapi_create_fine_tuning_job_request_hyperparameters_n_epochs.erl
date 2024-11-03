-module(openapi_create_fine_tuning_job_request_hyperparameters_n_epochs).

-include("openapi.hrl").

-export([openapi_create_fine_tuning_job_request_hyperparameters_n_epochs/0]).

-export([openapi_create_fine_tuning_job_request_hyperparameters_n_epochs/1]).

-export_type([openapi_create_fine_tuning_job_request_hyperparameters_n_epochs/0]).

-type openapi_create_fine_tuning_job_request_hyperparameters_n_epochs() ::
  [ 
  ].


openapi_create_fine_tuning_job_request_hyperparameters_n_epochs() ->
    openapi_create_fine_tuning_job_request_hyperparameters_n_epochs([]).

openapi_create_fine_tuning_job_request_hyperparameters_n_epochs(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

