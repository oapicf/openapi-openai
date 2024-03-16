-module(openapi_create_completion_response_choices_inner_logprobs).

-include("openapi.hrl").

-export([openapi_create_completion_response_choices_inner_logprobs/0]).

-export([openapi_create_completion_response_choices_inner_logprobs/1]).

-export_type([openapi_create_completion_response_choices_inner_logprobs/0]).

-type openapi_create_completion_response_choices_inner_logprobs() ::
  [ {'tokens', list(binary()) }
  | {'token_logprobs', list(integer()) }
  | {'top_logprobs', list(map()) }
  | {'text_offset', list(integer()) }
  ].


openapi_create_completion_response_choices_inner_logprobs() ->
    openapi_create_completion_response_choices_inner_logprobs([]).

openapi_create_completion_response_choices_inner_logprobs(Fields) ->
  Default = [ {'tokens', list(binary()) }
            , {'token_logprobs', list(integer()) }
            , {'top_logprobs', list(map()) }
            , {'text_offset', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

