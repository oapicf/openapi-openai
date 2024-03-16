-module(openapi_images_response).

-export([encode/1]).

-export_type([openapi_images_response/0]).

-type openapi_images_response() ::
    #{ 'created' := integer(),
       'data' := list()
     }.

encode(#{ 'created' := Created,
          'data' := Data
        }) ->
    #{ 'created' => Created,
       'data' => Data
     }.
