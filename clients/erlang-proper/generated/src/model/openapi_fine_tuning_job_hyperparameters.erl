-module(openapi_fine_tuning_job_hyperparameters).

-include("openapi.hrl").

-export([openapi_fine_tuning_job_hyperparameters/0]).

-export([openapi_fine_tuning_job_hyperparameters/1]).

-export_type([openapi_fine_tuning_job_hyperparameters/0]).

-type openapi_fine_tuning_job_hyperparameters() ::
  [ {'n_epochs', openapi_fine_tuning_job_hyperparameters_n_epochs:openapi_fine_tuning_job_hyperparameters_n_epochs() }
  ].


openapi_fine_tuning_job_hyperparameters() ->
    openapi_fine_tuning_job_hyperparameters([]).

openapi_fine_tuning_job_hyperparameters(Fields) ->
  Default = [ {'n_epochs', openapi_fine_tuning_job_hyperparameters_n_epochs:openapi_fine_tuning_job_hyperparameters_n_epochs() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

