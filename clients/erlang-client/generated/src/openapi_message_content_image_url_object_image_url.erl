-module(openapi_message_content_image_url_object_image_url).

-export([encode/1]).

-export_type([openapi_message_content_image_url_object_image_url/0]).

-type openapi_message_content_image_url_object_image_url() ::
    #{ 'url' := openapi_u_ri:openapi_u_ri(),
       'detail' => binary()
     }.

encode(#{ 'url' := Url,
          'detail' := Detail
        }) ->
    #{ 'url' => Url,
       'detail' => Detail
     }.
