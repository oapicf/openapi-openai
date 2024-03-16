-module(openapi_create_completion_request).

-export([encode/1]).

-export_type([openapi_create_completion_request/0]).

-type openapi_create_completion_request() ::
    #{ 'model' := openapi_create_completion_request_model:openapi_create_completion_request_model(),
       'prompt' := openapi_create_completion_request_prompt:openapi_create_completion_request_prompt(),
       'suffix' => binary(),
       'max_tokens' => integer(),
       'temperature' => integer(),
       'top_p' => integer(),
       'n' => integer(),
       'stream' => boolean(),
       'logprobs' => integer(),
       'echo' => boolean(),
       'stop' => openapi_create_completion_request_stop:openapi_create_completion_request_stop(),
       'presence_penalty' => integer(),
       'frequency_penalty' => integer(),
       'best_of' => integer(),
       'logit_bias' => maps:map(),
       'user' => binary()
     }.

encode(#{ 'model' := Model,
          'prompt' := Prompt,
          'suffix' := Suffix,
          'max_tokens' := MaxTokens,
          'temperature' := Temperature,
          'top_p' := TopP,
          'n' := N,
          'stream' := Stream,
          'logprobs' := Logprobs,
          'echo' := Echo,
          'stop' := Stop,
          'presence_penalty' := PresencePenalty,
          'frequency_penalty' := FrequencyPenalty,
          'best_of' := BestOf,
          'logit_bias' := LogitBias,
          'user' := User
        }) ->
    #{ 'model' => Model,
       'prompt' => Prompt,
       'suffix' => Suffix,
       'max_tokens' => MaxTokens,
       'temperature' => Temperature,
       'top_p' => TopP,
       'n' => N,
       'stream' => Stream,
       'logprobs' => Logprobs,
       'echo' => Echo,
       'stop' => Stop,
       'presence_penalty' => PresencePenalty,
       'frequency_penalty' => FrequencyPenalty,
       'best_of' => BestOf,
       'logit_bias' => LogitBias,
       'user' => User
     }.
