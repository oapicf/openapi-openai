-module(openapi_create_completion_request).

-include("openapi.hrl").

-export([openapi_create_completion_request/0]).

-export([openapi_create_completion_request/1]).

-export_type([openapi_create_completion_request/0]).

-type openapi_create_completion_request() ::
  [ {'model', openapi_create_completion_request_model:openapi_create_completion_request_model() }
  | {'prompt', openapi_create_completion_request_prompt:openapi_create_completion_request_prompt() }
  | {'best_of', integer() }
  | {'echo', boolean() }
  | {'frequency_penalty', integer() }
  | {'logit_bias', map() }
  | {'logprobs', integer() }
  | {'max_tokens', integer() }
  | {'n', integer() }
  | {'presence_penalty', integer() }
  | {'seed', integer() }
  | {'stop', openapi_create_completion_request_stop:openapi_create_completion_request_stop() }
  | {'stream', boolean() }
  | {'stream_options', openapi_chat_completion_stream_options:openapi_chat_completion_stream_options() }
  | {'suffix', binary() }
  | {'temperature', integer() }
  | {'top_p', integer() }
  | {'user', binary() }
  ].


openapi_create_completion_request() ->
    openapi_create_completion_request([]).

openapi_create_completion_request(Fields) ->
  Default = [ {'model', openapi_create_completion_request_model:openapi_create_completion_request_model() }
            , {'prompt', openapi_create_completion_request_prompt:openapi_create_completion_request_prompt() }
            , {'best_of', integer(0, 20) }
            , {'echo', boolean() }
            , {'frequency_penalty', integer() }
            , {'logit_bias', map() }
            , {'logprobs', integer(0, 5) }
            , {'max_tokens', integer(0) }
            , {'n', integer(1, 128) }
            , {'presence_penalty', integer() }
            , {'seed', integer(-9223372036854776000, 9223372036854776000) }
            , {'stop', openapi_create_completion_request_stop:openapi_create_completion_request_stop() }
            , {'stream', boolean() }
            , {'stream_options', openapi_chat_completion_stream_options:openapi_chat_completion_stream_options() }
            , {'suffix', binary() }
            , {'temperature', integer() }
            , {'top_p', integer() }
            , {'user', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

