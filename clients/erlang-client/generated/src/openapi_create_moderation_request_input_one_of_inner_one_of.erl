-module(openapi_create_moderation_request_input_one_of_inner_one_of).

-export([encode/1]).

-export_type([openapi_create_moderation_request_input_one_of_inner_one_of/0]).

-type openapi_create_moderation_request_input_one_of_inner_one_of() ::
    #{ 'type' := binary(),
       'image_url' := openapi_create_moderation_request_input_one_of_inner_one_of_image_url:openapi_create_moderation_request_input_one_of_inner_one_of_image_url()
     }.

encode(#{ 'type' := Type,
          'image_url' := ImageUrl
        }) ->
    #{ 'type' => Type,
       'image_url' => ImageUrl
     }.
