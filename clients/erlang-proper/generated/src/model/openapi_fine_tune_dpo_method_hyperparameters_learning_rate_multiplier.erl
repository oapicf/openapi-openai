-module(openapi_fine_tune_dpo_method_hyperparameters_learning_rate_multiplier).

-include("openapi.hrl").

-export([openapi_fine_tune_dpo_method_hyperparameters_learning_rate_multiplier/0]).

-export([openapi_fine_tune_dpo_method_hyperparameters_learning_rate_multiplier/1]).

-export_type([openapi_fine_tune_dpo_method_hyperparameters_learning_rate_multiplier/0]).

-type openapi_fine_tune_dpo_method_hyperparameters_learning_rate_multiplier() ::
  [ 
  ].


openapi_fine_tune_dpo_method_hyperparameters_learning_rate_multiplier() ->
    openapi_fine_tune_dpo_method_hyperparameters_learning_rate_multiplier([]).

openapi_fine_tune_dpo_method_hyperparameters_learning_rate_multiplier(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

