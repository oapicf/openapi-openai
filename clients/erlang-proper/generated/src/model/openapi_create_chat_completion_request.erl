-module(openapi_create_chat_completion_request).

-include("openapi.hrl").

-export([openapi_create_chat_completion_request/0]).

-export([openapi_create_chat_completion_request/1]).

-export_type([openapi_create_chat_completion_request/0]).

-type openapi_create_chat_completion_request() ::
  [ {'messages', list(openapi_chat_completion_request_message:openapi_chat_completion_request_message()) }
  | {'model', openapi_create_chat_completion_request_model:openapi_create_chat_completion_request_model() }
  | {'frequency_penalty', integer() }
  | {'logit_bias', map() }
  | {'logprobs', boolean() }
  | {'top_logprobs', integer() }
  | {'max_tokens', integer() }
  | {'n', integer() }
  | {'presence_penalty', integer() }
  | {'response_format', openapi_create_chat_completion_request_response_format:openapi_create_chat_completion_request_response_format() }
  | {'seed', integer() }
  | {'stop', openapi_create_chat_completion_request_stop:openapi_create_chat_completion_request_stop() }
  | {'stream', boolean() }
  | {'temperature', integer() }
  | {'top_p', integer() }
  | {'tools', list(openapi_chat_completion_tool:openapi_chat_completion_tool()) }
  | {'tool_choice', openapi_chat_completion_tool_choice_option:openapi_chat_completion_tool_choice_option() }
  | {'user', binary() }
  | {'function_call', openapi_create_chat_completion_request_function_call:openapi_create_chat_completion_request_function_call() }
  | {'functions', list(openapi_chat_completion_functions:openapi_chat_completion_functions()) }
  ].


openapi_create_chat_completion_request() ->
    openapi_create_chat_completion_request([]).

openapi_create_chat_completion_request(Fields) ->
  Default = [ {'messages', list(openapi_chat_completion_request_message:openapi_chat_completion_request_message(), 1) }
            , {'model', openapi_create_chat_completion_request_model:openapi_create_chat_completion_request_model() }
            , {'frequency_penalty', integer() }
            , {'logit_bias', map() }
            , {'logprobs', boolean() }
            , {'top_logprobs', integer(0, 20) }
            , {'max_tokens', integer() }
            , {'n', integer(1, 128) }
            , {'presence_penalty', integer() }
            , {'response_format', openapi_create_chat_completion_request_response_format:openapi_create_chat_completion_request_response_format() }
            , {'seed', integer(-9223372036854775808, 9223372036854775807) }
            , {'stop', openapi_create_chat_completion_request_stop:openapi_create_chat_completion_request_stop() }
            , {'stream', boolean() }
            , {'temperature', integer() }
            , {'top_p', integer() }
            , {'tools', list(openapi_chat_completion_tool:openapi_chat_completion_tool()) }
            , {'tool_choice', openapi_chat_completion_tool_choice_option:openapi_chat_completion_tool_choice_option() }
            , {'user', binary() }
            , {'function_call', openapi_create_chat_completion_request_function_call:openapi_create_chat_completion_request_function_call() }
            , {'functions', list(openapi_chat_completion_functions:openapi_chat_completion_functions(), 1, 128) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

