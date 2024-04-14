-module(openapi_chat_completion_message_tool_call).

-include("openapi.hrl").

-export([openapi_chat_completion_message_tool_call/0]).

-export([openapi_chat_completion_message_tool_call/1]).

-export_type([openapi_chat_completion_message_tool_call/0]).

-type openapi_chat_completion_message_tool_call() ::
  [ {'id', binary() }
  | {'type', binary() }
  | {'function', openapi_chat_completion_message_tool_call_function:openapi_chat_completion_message_tool_call_function() }
  ].


openapi_chat_completion_message_tool_call() ->
    openapi_chat_completion_message_tool_call([]).

openapi_chat_completion_message_tool_call(Fields) ->
  Default = [ {'id', binary() }
            , {'type', elements([<<"function">>]) }
            , {'function', openapi_chat_completion_message_tool_call_function:openapi_chat_completion_message_tool_call_function() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

