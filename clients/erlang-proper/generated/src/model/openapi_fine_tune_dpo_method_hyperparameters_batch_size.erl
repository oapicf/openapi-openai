-module(openapi_fine_tune_dpo_method_hyperparameters_batch_size).

-include("openapi.hrl").

-export([openapi_fine_tune_dpo_method_hyperparameters_batch_size/0]).

-export([openapi_fine_tune_dpo_method_hyperparameters_batch_size/1]).

-export_type([openapi_fine_tune_dpo_method_hyperparameters_batch_size/0]).

-type openapi_fine_tune_dpo_method_hyperparameters_batch_size() ::
  [ 
  ].


openapi_fine_tune_dpo_method_hyperparameters_batch_size() ->
    openapi_fine_tune_dpo_method_hyperparameters_batch_size([]).

openapi_fine_tune_dpo_method_hyperparameters_batch_size(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

