-module(openapi_chat_completion_message_tool_call_function).

-include("openapi.hrl").

-export([openapi_chat_completion_message_tool_call_function/0]).

-export([openapi_chat_completion_message_tool_call_function/1]).

-export_type([openapi_chat_completion_message_tool_call_function/0]).

-type openapi_chat_completion_message_tool_call_function() ::
  [ {'name', binary() }
  | {'arguments', binary() }
  ].


openapi_chat_completion_message_tool_call_function() ->
    openapi_chat_completion_message_tool_call_function([]).

openapi_chat_completion_message_tool_call_function(Fields) ->
  Default = [ {'name', binary() }
            , {'arguments', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

