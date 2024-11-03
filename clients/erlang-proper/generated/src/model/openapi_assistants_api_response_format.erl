-module(openapi_assistants_api_response_format).

-include("openapi.hrl").

-export([openapi_assistants_api_response_format/0]).

-export([openapi_assistants_api_response_format/1]).

-export_type([openapi_assistants_api_response_format/0]).

-type openapi_assistants_api_response_format() ::
  [ {'type', binary() }
  ].


openapi_assistants_api_response_format() ->
    openapi_assistants_api_response_format([]).

openapi_assistants_api_response_format(Fields) ->
  Default = [ {'type', elements([<<"text">>, <<"json_object">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

