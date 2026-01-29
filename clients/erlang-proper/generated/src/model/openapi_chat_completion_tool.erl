-module(openapi_chat_completion_tool).

-include("openapi.hrl").

-export([openapi_chat_completion_tool/0]).

-export([openapi_chat_completion_tool/1]).

-export_type([openapi_chat_completion_tool/0]).

-type openapi_chat_completion_tool() ::
  [ {'type', binary() }
  | {'function', openapi_function_object:openapi_function_object() }
  ].


openapi_chat_completion_tool() ->
    openapi_chat_completion_tool([]).

openapi_chat_completion_tool(Fields) ->
  Default = [ {'type', elements([<<"function">>]) }
            , {'function', openapi_function_object:openapi_function_object() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

