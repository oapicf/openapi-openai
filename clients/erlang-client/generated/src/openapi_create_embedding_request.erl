-module(openapi_create_embedding_request).

-export([encode/1]).

-export_type([openapi_create_embedding_request/0]).

-type openapi_create_embedding_request() ::
    #{ 'model' := openapi_create_embedding_request_model:openapi_create_embedding_request_model(),
       'input' := openapi_create_embedding_request_input:openapi_create_embedding_request_input(),
       'user' => binary()
     }.

encode(#{ 'model' := Model,
          'input' := Input,
          'user' := User
        }) ->
    #{ 'model' => Model,
       'input' => Input,
       'user' => User
     }.
