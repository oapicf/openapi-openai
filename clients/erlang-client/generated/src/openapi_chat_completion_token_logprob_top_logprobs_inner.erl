-module(openapi_chat_completion_token_logprob_top_logprobs_inner).

-export([encode/1]).

-export_type([openapi_chat_completion_token_logprob_top_logprobs_inner/0]).

-type openapi_chat_completion_token_logprob_top_logprobs_inner() ::
    #{ 'token' := binary(),
       'logprob' := integer(),
       'bytes' := list()
     }.

encode(#{ 'token' := Token,
          'logprob' := Logprob,
          'bytes' := Bytes
        }) ->
    #{ 'token' => Token,
       'logprob' => Logprob,
       'bytes' => Bytes
     }.
