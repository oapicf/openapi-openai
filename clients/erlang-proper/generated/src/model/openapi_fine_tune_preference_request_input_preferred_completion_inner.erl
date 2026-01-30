-module(openapi_fine_tune_preference_request_input_preferred_completion_inner).

-include("openapi.hrl").

-export([openapi_fine_tune_preference_request_input_preferred_completion_inner/0]).

-export([openapi_fine_tune_preference_request_input_preferred_completion_inner/1]).

-export_type([openapi_fine_tune_preference_request_input_preferred_completion_inner/0]).

-type openapi_fine_tune_preference_request_input_preferred_completion_inner() ::
  [ {'content', openapi_chat_completion_request_assistant_message_content:openapi_chat_completion_request_assistant_message_content() }
  | {'refusal', binary() }
  | {'role', binary() }
  | {'name', binary() }
  | {'audio', openapi_chat_completion_request_assistant_message_audio:openapi_chat_completion_request_assistant_message_audio() }
  | {'tool_calls', list(openapi_chat_completion_message_tool_call:openapi_chat_completion_message_tool_call()) }
  | {'function_call', openapi_chat_completion_request_assistant_message_function_call:openapi_chat_completion_request_assistant_message_function_call() }
  ].


openapi_fine_tune_preference_request_input_preferred_completion_inner() ->
    openapi_fine_tune_preference_request_input_preferred_completion_inner([]).

openapi_fine_tune_preference_request_input_preferred_completion_inner(Fields) ->
  Default = [ {'content', openapi_chat_completion_request_assistant_message_content:openapi_chat_completion_request_assistant_message_content() }
            , {'refusal', binary() }
            , {'role', elements([<<"assistant">>]) }
            , {'name', binary() }
            , {'audio', openapi_chat_completion_request_assistant_message_audio:openapi_chat_completion_request_assistant_message_audio() }
            , {'tool_calls', list(openapi_chat_completion_message_tool_call:openapi_chat_completion_message_tool_call()) }
            , {'function_call', openapi_chat_completion_request_assistant_message_function_call:openapi_chat_completion_request_assistant_message_function_call() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

