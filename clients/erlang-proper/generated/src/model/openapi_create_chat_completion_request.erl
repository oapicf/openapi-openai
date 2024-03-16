-module(openapi_create_chat_completion_request).

-include("openapi.hrl").

-export([openapi_create_chat_completion_request/0]).

-export([openapi_create_chat_completion_request/1]).

-export_type([openapi_create_chat_completion_request/0]).

-type openapi_create_chat_completion_request() ::
  [ {'model', openapi_create_chat_completion_request_model:openapi_create_chat_completion_request_model() }
  | {'messages', list(openapi_chat_completion_request_message:openapi_chat_completion_request_message()) }
  | {'functions', list(openapi_chat_completion_functions:openapi_chat_completion_functions()) }
  | {'function_call', openapi_create_chat_completion_request_function_call:openapi_create_chat_completion_request_function_call() }
  | {'temperature', integer() }
  | {'top_p', integer() }
  | {'n', integer() }
  | {'stream', boolean() }
  | {'stop', openapi_create_chat_completion_request_stop:openapi_create_chat_completion_request_stop() }
  | {'max_tokens', integer() }
  | {'presence_penalty', integer() }
  | {'frequency_penalty', integer() }
  | {'logit_bias', map() }
  | {'user', binary() }
  ].


openapi_create_chat_completion_request() ->
    openapi_create_chat_completion_request([]).

openapi_create_chat_completion_request(Fields) ->
  Default = [ {'model', openapi_create_chat_completion_request_model:openapi_create_chat_completion_request_model() }
            , {'messages', list(openapi_chat_completion_request_message:openapi_chat_completion_request_message(), 1) }
            , {'functions', list(openapi_chat_completion_functions:openapi_chat_completion_functions(), 1) }
            , {'function_call', openapi_create_chat_completion_request_function_call:openapi_create_chat_completion_request_function_call() }
            , {'temperature', integer() }
            , {'top_p', integer() }
            , {'n', integer(1, 128) }
            , {'stream', boolean() }
            , {'stop', openapi_create_chat_completion_request_stop:openapi_create_chat_completion_request_stop() }
            , {'max_tokens', integer() }
            , {'presence_penalty', integer() }
            , {'frequency_penalty', integer() }
            , {'logit_bias', map() }
            , {'user', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

