-module(openapi_fine_tune_supervised_method).

-include("openapi.hrl").

-export([openapi_fine_tune_supervised_method/0]).

-export([openapi_fine_tune_supervised_method/1]).

-export_type([openapi_fine_tune_supervised_method/0]).

-type openapi_fine_tune_supervised_method() ::
  [ {'hyperparameters', openapi_fine_tune_supervised_method_hyperparameters:openapi_fine_tune_supervised_method_hyperparameters() }
  ].


openapi_fine_tune_supervised_method() ->
    openapi_fine_tune_supervised_method([]).

openapi_fine_tune_supervised_method(Fields) ->
  Default = [ {'hyperparameters', openapi_fine_tune_supervised_method_hyperparameters:openapi_fine_tune_supervised_method_hyperparameters() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

