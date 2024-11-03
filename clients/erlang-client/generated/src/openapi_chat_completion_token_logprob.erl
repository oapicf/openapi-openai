-module(openapi_chat_completion_token_logprob).

-export([encode/1]).

-export_type([openapi_chat_completion_token_logprob/0]).

-type openapi_chat_completion_token_logprob() ::
    #{ 'token' := binary(),
       'logprob' := integer(),
       'bytes' := list(),
       'top_logprobs' := list()
     }.

encode(#{ 'token' := Token,
          'logprob' := Logprob,
          'bytes' := Bytes,
          'top_logprobs' := TopLogprobs
        }) ->
    #{ 'token' => Token,
       'logprob' => Logprob,
       'bytes' => Bytes,
       'top_logprobs' => TopLogprobs
     }.
