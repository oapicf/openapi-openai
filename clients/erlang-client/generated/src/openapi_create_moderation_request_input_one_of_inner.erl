-module(openapi_create_moderation_request_input_one_of_inner).

-export([encode/1]).

-export_type([openapi_create_moderation_request_input_one_of_inner/0]).

-type openapi_create_moderation_request_input_one_of_inner() ::
    #{ 'type' := binary(),
       'image_url' := openapi_create_moderation_request_input_one_of_inner_one_of_image_url:openapi_create_moderation_request_input_one_of_inner_one_of_image_url(),
       'text' := binary()
     }.

encode(#{ 'type' := Type,
          'image_url' := ImageUrl,
          'text' := Text
        }) ->
    #{ 'type' => Type,
       'image_url' => ImageUrl,
       'text' => Text
     }.
