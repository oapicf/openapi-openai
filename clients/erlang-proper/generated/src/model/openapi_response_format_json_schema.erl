-module(openapi_response_format_json_schema).

-include("openapi.hrl").

-export([openapi_response_format_json_schema/0]).

-export([openapi_response_format_json_schema/1]).

-export_type([openapi_response_format_json_schema/0]).

-type openapi_response_format_json_schema() ::
  [ {'type', binary() }
  | {'json_schema', openapi_response_format_json_schema_json_schema:openapi_response_format_json_schema_json_schema() }
  ].


openapi_response_format_json_schema() ->
    openapi_response_format_json_schema([]).

openapi_response_format_json_schema(Fields) ->
  Default = [ {'type', elements([<<"json_schema">>]) }
            , {'json_schema', openapi_response_format_json_schema_json_schema:openapi_response_format_json_schema_json_schema() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

