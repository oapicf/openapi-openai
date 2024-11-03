-module(openapi_assistants_api_response_format_option).

-include("openapi.hrl").

-export([openapi_assistants_api_response_format_option/0]).

-export([openapi_assistants_api_response_format_option/1]).

-export_type([openapi_assistants_api_response_format_option/0]).

-type openapi_assistants_api_response_format_option() ::
  [ {'type', binary() }
  ].


openapi_assistants_api_response_format_option() ->
    openapi_assistants_api_response_format_option([]).

openapi_assistants_api_response_format_option(Fields) ->
  Default = [ {'type', elements([<<"text">>, <<"json_object">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

