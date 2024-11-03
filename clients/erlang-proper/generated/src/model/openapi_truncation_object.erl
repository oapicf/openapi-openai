-module(openapi_truncation_object).

-include("openapi.hrl").

-export([openapi_truncation_object/0]).

-export([openapi_truncation_object/1]).

-export_type([openapi_truncation_object/0]).

-type openapi_truncation_object() ::
  [ {'type', binary() }
  | {'last_messages', integer() }
  ].


openapi_truncation_object() ->
    openapi_truncation_object([]).

openapi_truncation_object(Fields) ->
  Default = [ {'type', elements([<<"auto">>, <<"last_messages">>]) }
            , {'last_messages', integer(1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

