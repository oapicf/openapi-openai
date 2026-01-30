-module(openapi_fine_tune_preference_request_input_input).

-include("openapi.hrl").

-export([openapi_fine_tune_preference_request_input_input/0]).

-export([openapi_fine_tune_preference_request_input_input/1]).

-export_type([openapi_fine_tune_preference_request_input_input/0]).

-type openapi_fine_tune_preference_request_input_input() ::
  [ {'messages', list(openapi_fine_tune_chat_request_input_messages_inner:openapi_fine_tune_chat_request_input_messages_inner()) }
  | {'tools', list(openapi_chat_completion_tool:openapi_chat_completion_tool()) }
  | {'parallel_tool_calls', boolean() }
  ].


openapi_fine_tune_preference_request_input_input() ->
    openapi_fine_tune_preference_request_input_input([]).

openapi_fine_tune_preference_request_input_input(Fields) ->
  Default = [ {'messages', list(openapi_fine_tune_chat_request_input_messages_inner:openapi_fine_tune_chat_request_input_messages_inner(), 1) }
            , {'tools', list(openapi_chat_completion_tool:openapi_chat_completion_tool()) }
            , {'parallel_tool_calls', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

