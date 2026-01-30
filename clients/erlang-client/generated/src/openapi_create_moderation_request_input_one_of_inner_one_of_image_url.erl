-module(openapi_create_moderation_request_input_one_of_inner_one_of_image_url).

-export([encode/1]).

-export_type([openapi_create_moderation_request_input_one_of_inner_one_of_image_url/0]).

-type openapi_create_moderation_request_input_one_of_inner_one_of_image_url() ::
    #{ 'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'url' := Url
        }) ->
    #{ 'url' => Url
     }.
