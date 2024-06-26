-module(openapi_create_completion_response_choices_inner_logprobs).

-include("openapi.hrl").

-export([openapi_create_completion_response_choices_inner_logprobs/0]).

-export([openapi_create_completion_response_choices_inner_logprobs/1]).

-export_type([openapi_create_completion_response_choices_inner_logprobs/0]).

-type openapi_create_completion_response_choices_inner_logprobs() ::
  [ {'text_offset', list(integer()) }
  | {'token_logprobs', list(integer()) }
  | {'tokens', list(binary()) }
  | {'top_logprobs', list(map()) }
  ].


openapi_create_completion_response_choices_inner_logprobs() ->
    openapi_create_completion_response_choices_inner_logprobs([]).

openapi_create_completion_response_choices_inner_logprobs(Fields) ->
  Default = [ {'text_offset', list(integer()) }
            , {'token_logprobs', list(integer()) }
            , {'tokens', list(binary()) }
            , {'top_logprobs', list(map()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

