-module(openapi_chat_completion_request_assistant_message).

-include("openapi.hrl").

-export([openapi_chat_completion_request_assistant_message/0]).

-export([openapi_chat_completion_request_assistant_message/1]).

-export_type([openapi_chat_completion_request_assistant_message/0]).

-type openapi_chat_completion_request_assistant_message() ::
  [ {'content', binary() }
  | {'role', binary() }
  | {'name', binary() }
  | {'tool_calls', list(openapi_chat_completion_message_tool_call:openapi_chat_completion_message_tool_call()) }
  | {'function_call', openapi_chat_completion_request_assistant_message_function_call:openapi_chat_completion_request_assistant_message_function_call() }
  ].


openapi_chat_completion_request_assistant_message() ->
    openapi_chat_completion_request_assistant_message([]).

openapi_chat_completion_request_assistant_message(Fields) ->
  Default = [ {'content', binary() }
            , {'role', elements([<<"assistant">>]) }
            , {'name', binary() }
            , {'tool_calls', list(openapi_chat_completion_message_tool_call:openapi_chat_completion_message_tool_call()) }
            , {'function_call', openapi_chat_completion_request_assistant_message_function_call:openapi_chat_completion_request_assistant_message_function_call() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

