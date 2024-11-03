-module(openapi_create_moderation_request).

-export([encode/1]).

-export_type([openapi_create_moderation_request/0]).

-type openapi_create_moderation_request() ::
    #{ 'input' := openapi_create_moderation_request_input:openapi_create_moderation_request_input(),
       'model' => openapi_create_moderation_request_model:openapi_create_moderation_request_model()
     }.

encode(#{ 'input' := Input,
          'model' := Model
        }) ->
    #{ 'input' => Input,
       'model' => Model
     }.
