-module(openapi_fine_tune_dpo_method_hyperparameters_n_epochs).

-include("openapi.hrl").

-export([openapi_fine_tune_dpo_method_hyperparameters_n_epochs/0]).

-export([openapi_fine_tune_dpo_method_hyperparameters_n_epochs/1]).

-export_type([openapi_fine_tune_dpo_method_hyperparameters_n_epochs/0]).

-type openapi_fine_tune_dpo_method_hyperparameters_n_epochs() ::
  [ 
  ].


openapi_fine_tune_dpo_method_hyperparameters_n_epochs() ->
    openapi_fine_tune_dpo_method_hyperparameters_n_epochs([]).

openapi_fine_tune_dpo_method_hyperparameters_n_epochs(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

