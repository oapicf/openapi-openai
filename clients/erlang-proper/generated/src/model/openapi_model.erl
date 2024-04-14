-module(openapi_model).

-include("openapi.hrl").

-export([openapi_model/0]).

-export([openapi_model/1]).

-export_type([openapi_model/0]).

-type openapi_model() ::
  [ {'id', binary() }
  | {'created', integer() }
  | {'object', binary() }
  | {'owned_by', binary() }
  ].


openapi_model() ->
    openapi_model([]).

openapi_model(Fields) ->
  Default = [ {'id', binary() }
            , {'created', integer() }
            , {'object', elements([<<"model">>]) }
            , {'owned_by', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

