-module(openapi_create_chat_completion_request).

-export([encode/1]).

-export_type([openapi_create_chat_completion_request/0]).

-type openapi_create_chat_completion_request() ::
    #{ 'model' := openapi_create_chat_completion_request_model:openapi_create_chat_completion_request_model(),
       'messages' := list(),
       'functions' => list(),
       'function_call' => openapi_create_chat_completion_request_function_call:openapi_create_chat_completion_request_function_call(),
       'temperature' => integer(),
       'top_p' => integer(),
       'n' => integer(),
       'stream' => boolean(),
       'stop' => openapi_create_chat_completion_request_stop:openapi_create_chat_completion_request_stop(),
       'max_tokens' => integer(),
       'presence_penalty' => integer(),
       'frequency_penalty' => integer(),
       'logit_bias' => maps:map(),
       'user' => binary()
     }.

encode(#{ 'model' := Model,
          'messages' := Messages,
          'functions' := Functions,
          'function_call' := FunctionCall,
          'temperature' := Temperature,
          'top_p' := TopP,
          'n' := N,
          'stream' := Stream,
          'stop' := Stop,
          'max_tokens' := MaxTokens,
          'presence_penalty' := PresencePenalty,
          'frequency_penalty' := FrequencyPenalty,
          'logit_bias' := LogitBias,
          'user' := User
        }) ->
    #{ 'model' => Model,
       'messages' => Messages,
       'functions' => Functions,
       'function_call' => FunctionCall,
       'temperature' => Temperature,
       'top_p' => TopP,
       'n' => N,
       'stream' => Stream,
       'stop' => Stop,
       'max_tokens' => MaxTokens,
       'presence_penalty' => PresencePenalty,
       'frequency_penalty' => FrequencyPenalty,
       'logit_bias' => LogitBias,
       'user' => User
     }.
