-module(openapi_assistants_api_response_format_option).

-include("openapi.hrl").

-export([openapi_assistants_api_response_format_option/0]).

-export([openapi_assistants_api_response_format_option/1]).

-export_type([openapi_assistants_api_response_format_option/0]).

-type openapi_assistants_api_response_format_option() ::
  [ {'type', binary() }
  | {'json_schema', openapi_response_format_json_schema_json_schema:openapi_response_format_json_schema_json_schema() }
  ].


openapi_assistants_api_response_format_option() ->
    openapi_assistants_api_response_format_option([]).

openapi_assistants_api_response_format_option(Fields) ->
  Default = [ {'type', elements([<<"text">>, <<"json_object">>, <<"json_schema">>]) }
            , {'json_schema', openapi_response_format_json_schema_json_schema:openapi_response_format_json_schema_json_schema() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

