-module(openapi_create_completion_response_choices_inner_logprobs).

-export([encode/1]).

-export_type([openapi_create_completion_response_choices_inner_logprobs/0]).

-type openapi_create_completion_response_choices_inner_logprobs() ::
    #{ 'tokens' => list(),
       'token_logprobs' => list(),
       'top_logprobs' => list(),
       'text_offset' => list()
     }.

encode(#{ 'tokens' := Tokens,
          'token_logprobs' := TokenLogprobs,
          'top_logprobs' := TopLogprobs,
          'text_offset' := TextOffset
        }) ->
    #{ 'tokens' => Tokens,
       'token_logprobs' => TokenLogprobs,
       'top_logprobs' => TopLogprobs,
       'text_offset' => TextOffset
     }.
