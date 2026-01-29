-module(openapi_chat_completion_token_logprob_top_logprobs_inner).

-include("openapi.hrl").

-export([openapi_chat_completion_token_logprob_top_logprobs_inner/0]).

-export([openapi_chat_completion_token_logprob_top_logprobs_inner/1]).

-export_type([openapi_chat_completion_token_logprob_top_logprobs_inner/0]).

-type openapi_chat_completion_token_logprob_top_logprobs_inner() ::
  [ {'token', binary() }
  | {'logprob', integer() }
  | {'bytes', list(integer()) }
  ].


openapi_chat_completion_token_logprob_top_logprobs_inner() ->
    openapi_chat_completion_token_logprob_top_logprobs_inner([]).

openapi_chat_completion_token_logprob_top_logprobs_inner(Fields) ->
  Default = [ {'token', binary() }
            , {'logprob', integer() }
            , {'bytes', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

