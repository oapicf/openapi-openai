-module(openapi_create_completion_response_choices_inner_logprobs).

-export([encode/1]).

-export_type([openapi_create_completion_response_choices_inner_logprobs/0]).

-type openapi_create_completion_response_choices_inner_logprobs() ::
    #{ 'text_offset' => list(),
       'token_logprobs' => list(),
       'tokens' => list(),
       'top_logprobs' => list()
     }.

encode(#{ 'text_offset' := TextOffset,
          'token_logprobs' := TokenLogprobs,
          'tokens' := Tokens,
          'top_logprobs' := TopLogprobs
        }) ->
    #{ 'text_offset' => TextOffset,
       'token_logprobs' => TokenLogprobs,
       'tokens' => Tokens,
       'top_logprobs' => TopLogprobs
     }.
