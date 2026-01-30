-module(openapi_create_chat_completion_request_response_format).

-include("openapi.hrl").

-export([openapi_create_chat_completion_request_response_format/0]).

-export([openapi_create_chat_completion_request_response_format/1]).

-export_type([openapi_create_chat_completion_request_response_format/0]).

-type openapi_create_chat_completion_request_response_format() ::
  [ {'type', binary() }
  | {'json_schema', openapi_response_format_json_schema_json_schema:openapi_response_format_json_schema_json_schema() }
  ].


openapi_create_chat_completion_request_response_format() ->
    openapi_create_chat_completion_request_response_format([]).

openapi_create_chat_completion_request_response_format(Fields) ->
  Default = [ {'type', elements([<<"text">>, <<"json_object">>, <<"json_schema">>]) }
            , {'json_schema', openapi_response_format_json_schema_json_schema:openapi_response_format_json_schema_json_schema() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

