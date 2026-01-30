-module(openapi_create_chat_completion_request).

-include("openapi.hrl").

-export([openapi_create_chat_completion_request/0]).

-export([openapi_create_chat_completion_request/1]).

-export_type([openapi_create_chat_completion_request/0]).

-type openapi_create_chat_completion_request() ::
  [ {'messages', list(openapi_chat_completion_request_message:openapi_chat_completion_request_message()) }
  | {'model', openapi_create_chat_completion_request_model:openapi_create_chat_completion_request_model() }
  | {'store', boolean() }
  | {'reasoning_effort', binary() }
  | {'metadata', map() }
  | {'frequency_penalty', integer() }
  | {'logit_bias', map() }
  | {'logprobs', boolean() }
  | {'top_logprobs', integer() }
  | {'max_tokens', integer() }
  | {'max_completion_tokens', integer() }
  | {'n', integer() }
  | {'modalities', list(binary()) }
  | {'prediction', openapi_prediction_content:openapi_prediction_content() }
  | {'audio', openapi_create_chat_completion_request_audio:openapi_create_chat_completion_request_audio() }
  | {'presence_penalty', integer() }
  | {'response_format', openapi_create_chat_completion_request_response_format:openapi_create_chat_completion_request_response_format() }
  | {'seed', integer() }
  | {'service_tier', binary() }
  | {'stop', openapi_create_chat_completion_request_stop:openapi_create_chat_completion_request_stop() }
  | {'stream', boolean() }
  | {'stream_options', openapi_chat_completion_stream_options:openapi_chat_completion_stream_options() }
  | {'temperature', integer() }
  | {'top_p', integer() }
  | {'tools', list(openapi_chat_completion_tool:openapi_chat_completion_tool()) }
  | {'tool_choice', openapi_chat_completion_tool_choice_option:openapi_chat_completion_tool_choice_option() }
  | {'parallel_tool_calls', boolean() }
  | {'user', binary() }
  | {'function_call', openapi_create_chat_completion_request_function_call:openapi_create_chat_completion_request_function_call() }
  | {'functions', list(openapi_chat_completion_functions:openapi_chat_completion_functions()) }
  ].


openapi_create_chat_completion_request() ->
    openapi_create_chat_completion_request([]).

openapi_create_chat_completion_request(Fields) ->
  Default = [ {'messages', list(openapi_chat_completion_request_message:openapi_chat_completion_request_message(), 1) }
            , {'model', openapi_create_chat_completion_request_model:openapi_create_chat_completion_request_model() }
            , {'store', boolean() }
            , {'reasoning_effort', elements([<<"low">>, <<"medium">>, <<"high">>]) }
            , {'metadata', map() }
            , {'frequency_penalty', integer() }
            , {'logit_bias', map() }
            , {'logprobs', boolean() }
            , {'top_logprobs', integer(0, 20) }
            , {'max_tokens', integer() }
            , {'max_completion_tokens', integer() }
            , {'n', integer(1, 128) }
            , {'modalities', list(binary()) }
            , {'prediction', openapi_prediction_content:openapi_prediction_content() }
            , {'audio', openapi_create_chat_completion_request_audio:openapi_create_chat_completion_request_audio() }
            , {'presence_penalty', integer() }
            , {'response_format', openapi_create_chat_completion_request_response_format:openapi_create_chat_completion_request_response_format() }
            , {'seed', integer(-9223372036854776000, 9223372036854776000) }
            , {'service_tier', elements([<<"auto">>, <<"default">>]) }
            , {'stop', openapi_create_chat_completion_request_stop:openapi_create_chat_completion_request_stop() }
            , {'stream', boolean() }
            , {'stream_options', openapi_chat_completion_stream_options:openapi_chat_completion_stream_options() }
            , {'temperature', integer() }
            , {'top_p', integer() }
            , {'tools', list(openapi_chat_completion_tool:openapi_chat_completion_tool()) }
            , {'tool_choice', openapi_chat_completion_tool_choice_option:openapi_chat_completion_tool_choice_option() }
            , {'parallel_tool_calls', boolean() }
            , {'user', binary() }
            , {'function_call', openapi_create_chat_completion_request_function_call:openapi_create_chat_completion_request_function_call() }
            , {'functions', list(openapi_chat_completion_functions:openapi_chat_completion_functions(), 1, 128) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

