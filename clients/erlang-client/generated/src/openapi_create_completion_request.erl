-module(openapi_create_completion_request).

-export([encode/1]).

-export_type([openapi_create_completion_request/0]).

-type openapi_create_completion_request() ::
    #{ 'model' := openapi_create_completion_request_model:openapi_create_completion_request_model(),
       'prompt' := openapi_create_completion_request_prompt:openapi_create_completion_request_prompt(),
       'best_of' => integer(),
       'echo' => boolean(),
       'frequency_penalty' => integer(),
       'logit_bias' => maps:map(),
       'logprobs' => integer(),
       'max_tokens' => integer(),
       'n' => integer(),
       'presence_penalty' => integer(),
       'seed' => integer(),
       'stop' => openapi_create_completion_request_stop:openapi_create_completion_request_stop(),
       'stream' => boolean(),
       'suffix' => binary(),
       'temperature' => integer(),
       'top_p' => integer(),
       'user' => binary()
     }.

encode(#{ 'model' := Model,
          'prompt' := Prompt,
          'best_of' := BestOf,
          'echo' := Echo,
          'frequency_penalty' := FrequencyPenalty,
          'logit_bias' := LogitBias,
          'logprobs' := Logprobs,
          'max_tokens' := MaxTokens,
          'n' := N,
          'presence_penalty' := PresencePenalty,
          'seed' := Seed,
          'stop' := Stop,
          'stream' := Stream,
          'suffix' := Suffix,
          'temperature' := Temperature,
          'top_p' := TopP,
          'user' := User
        }) ->
    #{ 'model' => Model,
       'prompt' => Prompt,
       'best_of' => BestOf,
       'echo' => Echo,
       'frequency_penalty' => FrequencyPenalty,
       'logit_bias' => LogitBias,
       'logprobs' => Logprobs,
       'max_tokens' => MaxTokens,
       'n' => N,
       'presence_penalty' => PresencePenalty,
       'seed' => Seed,
       'stop' => Stop,
       'stream' => Stream,
       'suffix' => Suffix,
       'temperature' => Temperature,
       'top_p' => TopP,
       'user' => User
     }.
