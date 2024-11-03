-module(openapi_create_chat_completion_request).

-export([encode/1]).

-export_type([openapi_create_chat_completion_request/0]).

-type openapi_create_chat_completion_request() ::
    #{ 'messages' := list(),
       'model' := openapi_create_chat_completion_request_model:openapi_create_chat_completion_request_model(),
       'frequency_penalty' => integer(),
       'logit_bias' => maps:map(),
       'logprobs' => boolean(),
       'top_logprobs' => integer(),
       'max_tokens' => integer(),
       'n' => integer(),
       'presence_penalty' => integer(),
       'response_format' => openapi_create_chat_completion_request_response_format:openapi_create_chat_completion_request_response_format(),
       'seed' => integer(),
       'stop' => openapi_create_chat_completion_request_stop:openapi_create_chat_completion_request_stop(),
       'stream' => boolean(),
       'temperature' => integer(),
       'top_p' => integer(),
       'tools' => list(),
       'tool_choice' => openapi_chat_completion_tool_choice_option:openapi_chat_completion_tool_choice_option(),
       'user' => binary(),
       'function_call' => openapi_create_chat_completion_request_function_call:openapi_create_chat_completion_request_function_call(),
       'functions' => list()
     }.

encode(#{ 'messages' := Messages,
          'model' := Model,
          'frequency_penalty' := FrequencyPenalty,
          'logit_bias' := LogitBias,
          'logprobs' := Logprobs,
          'top_logprobs' := TopLogprobs,
          'max_tokens' := MaxTokens,
          'n' := N,
          'presence_penalty' := PresencePenalty,
          'response_format' := ResponseFormat,
          'seed' := Seed,
          'stop' := Stop,
          'stream' := Stream,
          'temperature' := Temperature,
          'top_p' := TopP,
          'tools' := Tools,
          'tool_choice' := ToolChoice,
          'user' := User,
          'function_call' := FunctionCall,
          'functions' := Functions
        }) ->
    #{ 'messages' => Messages,
       'model' => Model,
       'frequency_penalty' => FrequencyPenalty,
       'logit_bias' => LogitBias,
       'logprobs' => Logprobs,
       'top_logprobs' => TopLogprobs,
       'max_tokens' => MaxTokens,
       'n' => N,
       'presence_penalty' => PresencePenalty,
       'response_format' => ResponseFormat,
       'seed' => Seed,
       'stop' => Stop,
       'stream' => Stream,
       'temperature' => Temperature,
       'top_p' => TopP,
       'tools' => Tools,
       'tool_choice' => ToolChoice,
       'user' => User,
       'function_call' => FunctionCall,
       'functions' => Functions
     }.
