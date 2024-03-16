-module(openapi_create_completion_request).

-include("openapi.hrl").

-export([openapi_create_completion_request/0]).

-export([openapi_create_completion_request/1]).

-export_type([openapi_create_completion_request/0]).

-type openapi_create_completion_request() ::
  [ {'model', openapi_create_completion_request_model:openapi_create_completion_request_model() }
  | {'prompt', openapi_create_completion_request_prompt:openapi_create_completion_request_prompt() }
  | {'suffix', binary() }
  | {'max_tokens', integer() }
  | {'temperature', integer() }
  | {'top_p', integer() }
  | {'n', integer() }
  | {'stream', boolean() }
  | {'logprobs', integer() }
  | {'echo', boolean() }
  | {'stop', openapi_create_completion_request_stop:openapi_create_completion_request_stop() }
  | {'presence_penalty', integer() }
  | {'frequency_penalty', integer() }
  | {'best_of', integer() }
  | {'logit_bias', map() }
  | {'user', binary() }
  ].


openapi_create_completion_request() ->
    openapi_create_completion_request([]).

openapi_create_completion_request(Fields) ->
  Default = [ {'model', openapi_create_completion_request_model:openapi_create_completion_request_model() }
            , {'prompt', openapi_create_completion_request_prompt:openapi_create_completion_request_prompt() }
            , {'suffix', binary() }
            , {'max_tokens', integer(0) }
            , {'temperature', integer() }
            , {'top_p', integer() }
            , {'n', integer(1, 128) }
            , {'stream', boolean() }
            , {'logprobs', integer(0, 5) }
            , {'echo', boolean() }
            , {'stop', openapi_create_completion_request_stop:openapi_create_completion_request_stop() }
            , {'presence_penalty', integer() }
            , {'frequency_penalty', integer() }
            , {'best_of', integer(0, 20) }
            , {'logit_bias', map() }
            , {'user', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

