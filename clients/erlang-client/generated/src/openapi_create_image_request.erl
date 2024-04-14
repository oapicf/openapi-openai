-module(openapi_create_image_request).

-export([encode/1]).

-export_type([openapi_create_image_request/0]).

-type openapi_create_image_request() ::
    #{ 'prompt' := binary(),
       'model' => openapi_create_image_request_model:openapi_create_image_request_model(),
       'n' => integer(),
       'quality' => binary(),
       'response_format' => binary(),
       'size' => binary(),
       'style' => binary(),
       'user' => binary()
     }.

encode(#{ 'prompt' := Prompt,
          'model' := Model,
          'n' := N,
          'quality' := Quality,
          'response_format' := ResponseFormat,
          'size' := Size,
          'style' := Style,
          'user' := User
        }) ->
    #{ 'prompt' => Prompt,
       'model' => Model,
       'n' => N,
       'quality' => Quality,
       'response_format' => ResponseFormat,
       'size' => Size,
       'style' => Style,
       'user' => User
     }.
