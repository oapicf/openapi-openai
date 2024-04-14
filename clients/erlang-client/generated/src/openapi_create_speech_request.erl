-module(openapi_create_speech_request).

-export([encode/1]).

-export_type([openapi_create_speech_request/0]).

-type openapi_create_speech_request() ::
    #{ 'model' := openapi_create_speech_request_model:openapi_create_speech_request_model(),
       'input' := binary(),
       'voice' := binary(),
       'response_format' => binary(),
       'speed' => integer()
     }.

encode(#{ 'model' := Model,
          'input' := Input,
          'voice' := Voice,
          'response_format' := ResponseFormat,
          'speed' := Speed
        }) ->
    #{ 'model' => Model,
       'input' => Input,
       'voice' => Voice,
       'response_format' => ResponseFormat,
       'speed' => Speed
     }.
