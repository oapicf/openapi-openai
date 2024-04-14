-module(openapi_chat_completion_response_message).

-include("openapi.hrl").

-export([openapi_chat_completion_response_message/0]).

-export([openapi_chat_completion_response_message/1]).

-export_type([openapi_chat_completion_response_message/0]).

-type openapi_chat_completion_response_message() ::
  [ {'content', binary() }
  | {'tool_calls', list(openapi_chat_completion_message_tool_call:openapi_chat_completion_message_tool_call()) }
  | {'role', binary() }
  | {'function_call', openapi_chat_completion_request_assistant_message_function_call:openapi_chat_completion_request_assistant_message_function_call() }
  ].


openapi_chat_completion_response_message() ->
    openapi_chat_completion_response_message([]).

openapi_chat_completion_response_message(Fields) ->
  Default = [ {'content', binary() }
            , {'tool_calls', list(openapi_chat_completion_message_tool_call:openapi_chat_completion_message_tool_call()) }
            , {'role', elements([<<"assistant">>]) }
            , {'function_call', openapi_chat_completion_request_assistant_message_function_call:openapi_chat_completion_request_assistant_message_function_call() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

