-module(openapi_fine_tune_method).

-include("openapi.hrl").

-export([openapi_fine_tune_method/0]).

-export([openapi_fine_tune_method/1]).

-export_type([openapi_fine_tune_method/0]).

-type openapi_fine_tune_method() ::
  [ {'type', binary() }
  | {'supervised', openapi_fine_tune_supervised_method:openapi_fine_tune_supervised_method() }
  | {'dpo', openapi_fine_tune_dpo_method:openapi_fine_tune_dpo_method() }
  ].


openapi_fine_tune_method() ->
    openapi_fine_tune_method([]).

openapi_fine_tune_method(Fields) ->
  Default = [ {'type', elements([<<"supervised">>, <<"dpo">>]) }
            , {'supervised', openapi_fine_tune_supervised_method:openapi_fine_tune_supervised_method() }
            , {'dpo', openapi_fine_tune_dpo_method:openapi_fine_tune_dpo_method() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

