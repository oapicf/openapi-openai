-module(openapi_response_format_json_object).

-include("openapi.hrl").

-export([openapi_response_format_json_object/0]).

-export([openapi_response_format_json_object/1]).

-export_type([openapi_response_format_json_object/0]).

-type openapi_response_format_json_object() ::
  [ {'type', binary() }
  ].


openapi_response_format_json_object() ->
    openapi_response_format_json_object([]).

openapi_response_format_json_object(Fields) ->
  Default = [ {'type', elements([<<"json_object">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

