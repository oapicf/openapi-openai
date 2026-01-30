-module(openapi_create_chat_completion_response_choices_inner_logprobs).

-include("openapi.hrl").

-export([openapi_create_chat_completion_response_choices_inner_logprobs/0]).

-export([openapi_create_chat_completion_response_choices_inner_logprobs/1]).

-export_type([openapi_create_chat_completion_response_choices_inner_logprobs/0]).

-type openapi_create_chat_completion_response_choices_inner_logprobs() ::
  [ {'content', list(openapi_chat_completion_token_logprob:openapi_chat_completion_token_logprob()) }
  | {'refusal', list(openapi_chat_completion_token_logprob:openapi_chat_completion_token_logprob()) }
  ].


openapi_create_chat_completion_response_choices_inner_logprobs() ->
    openapi_create_chat_completion_response_choices_inner_logprobs([]).

openapi_create_chat_completion_response_choices_inner_logprobs(Fields) ->
  Default = [ {'content', list(openapi_chat_completion_token_logprob:openapi_chat_completion_token_logprob()) }
            , {'refusal', list(openapi_chat_completion_token_logprob:openapi_chat_completion_token_logprob()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

