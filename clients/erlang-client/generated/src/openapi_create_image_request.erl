-module(openapi_create_image_request).

-export([encode/1]).

-export_type([openapi_create_image_request/0]).

-type openapi_create_image_request() ::
    #{ 'prompt' := binary(),
       'n' => integer(),
       'size' => binary(),
       'response_format' => binary(),
       'user' => binary()
     }.

encode(#{ 'prompt' := Prompt,
          'n' := N,
          'size' := Size,
          'response_format' := ResponseFormat,
          'user' := User
        }) ->
    #{ 'prompt' => Prompt,
       'n' => N,
       'size' => Size,
       'response_format' => ResponseFormat,
       'user' => User
     }.
