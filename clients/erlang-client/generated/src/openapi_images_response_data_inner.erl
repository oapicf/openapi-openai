-module(openapi_images_response_data_inner).

-export([encode/1]).

-export_type([openapi_images_response_data_inner/0]).

-type openapi_images_response_data_inner() ::
    #{ 'url' => binary(),
       'b64_json' => binary()
     }.

encode(#{ 'url' := Url,
          'b64_json' := B64Json
        }) ->
    #{ 'url' => Url,
       'b64_json' => B64Json
     }.
