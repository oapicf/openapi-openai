-module(openapi_chat_completion_stream_response_delta).

-include("openapi.hrl").

-export([openapi_chat_completion_stream_response_delta/0]).

-export([openapi_chat_completion_stream_response_delta/1]).

-export_type([openapi_chat_completion_stream_response_delta/0]).

-type openapi_chat_completion_stream_response_delta() ::
  [ {'content', binary() }
  | {'function_call', openapi_chat_completion_stream_response_delta_function_call:openapi_chat_completion_stream_response_delta_function_call() }
  | {'tool_calls', list(openapi_chat_completion_message_tool_call_chunk:openapi_chat_completion_message_tool_call_chunk()) }
  | {'role', binary() }
  ].


openapi_chat_completion_stream_response_delta() ->
    openapi_chat_completion_stream_response_delta([]).

openapi_chat_completion_stream_response_delta(Fields) ->
  Default = [ {'content', binary() }
            , {'function_call', openapi_chat_completion_stream_response_delta_function_call:openapi_chat_completion_stream_response_delta_function_call() }
            , {'tool_calls', list(openapi_chat_completion_message_tool_call_chunk:openapi_chat_completion_message_tool_call_chunk()) }
            , {'role', elements([<<"system">>, <<"user">>, <<"assistant">>, <<"tool">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

