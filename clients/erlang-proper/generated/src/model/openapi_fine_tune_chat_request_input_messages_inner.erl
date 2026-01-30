-module(openapi_fine_tune_chat_request_input_messages_inner).

-include("openapi.hrl").

-export([openapi_fine_tune_chat_request_input_messages_inner/0]).

-export([openapi_fine_tune_chat_request_input_messages_inner/1]).

-export_type([openapi_fine_tune_chat_request_input_messages_inner/0]).

-type openapi_fine_tune_chat_request_input_messages_inner() ::
  [ {'content', binary() }
  | {'role', binary() }
  | {'name', binary() }
  | {'weight', integer() }
  | {'refusal', binary() }
  | {'audio', openapi_chat_completion_request_assistant_message_audio:openapi_chat_completion_request_assistant_message_audio() }
  | {'tool_calls', list(openapi_chat_completion_message_tool_call:openapi_chat_completion_message_tool_call()) }
  | {'function_call', openapi_chat_completion_request_assistant_message_function_call:openapi_chat_completion_request_assistant_message_function_call() }
  | {'tool_call_id', binary() }
  ].


openapi_fine_tune_chat_request_input_messages_inner() ->
    openapi_fine_tune_chat_request_input_messages_inner([]).

openapi_fine_tune_chat_request_input_messages_inner(Fields) ->
  Default = [ {'content', binary() }
            , {'role', elements([<<"function">>]) }
            , {'name', binary() }
            , {'weight', integer() }
            , {'refusal', binary() }
            , {'audio', openapi_chat_completion_request_assistant_message_audio:openapi_chat_completion_request_assistant_message_audio() }
            , {'tool_calls', list(openapi_chat_completion_message_tool_call:openapi_chat_completion_message_tool_call()) }
            , {'function_call', openapi_chat_completion_request_assistant_message_function_call:openapi_chat_completion_request_assistant_message_function_call() }
            , {'tool_call_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

