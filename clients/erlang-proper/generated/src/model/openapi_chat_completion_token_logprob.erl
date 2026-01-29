-module(openapi_chat_completion_token_logprob).

-include("openapi.hrl").

-export([openapi_chat_completion_token_logprob/0]).

-export([openapi_chat_completion_token_logprob/1]).

-export_type([openapi_chat_completion_token_logprob/0]).

-type openapi_chat_completion_token_logprob() ::
  [ {'token', binary() }
  | {'logprob', integer() }
  | {'bytes', list(integer()) }
  | {'top_logprobs', list(openapi_chat_completion_token_logprob_top_logprobs_inner:openapi_chat_completion_token_logprob_top_logprobs_inner()) }
  ].


openapi_chat_completion_token_logprob() ->
    openapi_chat_completion_token_logprob([]).

openapi_chat_completion_token_logprob(Fields) ->
  Default = [ {'token', binary() }
            , {'logprob', integer() }
            , {'bytes', list(integer()) }
            , {'top_logprobs', list(openapi_chat_completion_token_logprob_top_logprobs_inner:openapi_chat_completion_token_logprob_top_logprobs_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

