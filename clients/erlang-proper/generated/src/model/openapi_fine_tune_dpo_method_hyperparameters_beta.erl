-module(openapi_fine_tune_dpo_method_hyperparameters_beta).

-include("openapi.hrl").

-export([openapi_fine_tune_dpo_method_hyperparameters_beta/0]).

-export([openapi_fine_tune_dpo_method_hyperparameters_beta/1]).

-export_type([openapi_fine_tune_dpo_method_hyperparameters_beta/0]).

-type openapi_fine_tune_dpo_method_hyperparameters_beta() ::
  [ 
  ].


openapi_fine_tune_dpo_method_hyperparameters_beta() ->
    openapi_fine_tune_dpo_method_hyperparameters_beta([]).

openapi_fine_tune_dpo_method_hyperparameters_beta(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

