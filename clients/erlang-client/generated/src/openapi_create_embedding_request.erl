-module(openapi_create_embedding_request).

-export([encode/1]).

-export_type([openapi_create_embedding_request/0]).

-type openapi_create_embedding_request() ::
    #{ 'input' := openapi_create_embedding_request_input:openapi_create_embedding_request_input(),
       'model' := openapi_create_embedding_request_model:openapi_create_embedding_request_model(),
       'encoding_format' => binary(),
       'dimensions' => integer(),
       'user' => binary()
     }.

encode(#{ 'input' := Input,
          'model' := Model,
          'encoding_format' := EncodingFormat,
          'dimensions' := Dimensions,
          'user' := User
        }) ->
    #{ 'input' => Input,
       'model' => Model,
       'encoding_format' => EncodingFormat,
       'dimensions' => Dimensions,
       'user' => User
     }.
