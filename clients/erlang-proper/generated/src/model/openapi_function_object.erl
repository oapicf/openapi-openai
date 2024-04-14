-module(openapi_function_object).

-include("openapi.hrl").

-export([openapi_function_object/0]).

-export([openapi_function_object/1]).

-export_type([openapi_function_object/0]).

-type openapi_function_object() ::
  [ {'description', binary() }
  | {'name', binary() }
  | {'parameters', map() }
  ].


openapi_function_object() ->
    openapi_function_object([]).

openapi_function_object(Fields) ->
  Default = [ {'description', binary() }
            , {'name', binary() }
            , {'parameters', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

