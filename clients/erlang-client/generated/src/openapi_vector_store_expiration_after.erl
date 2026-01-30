-module(openapi_vector_store_expiration_after).

-export([encode/1]).

-export_type([openapi_vector_store_expiration_after/0]).

-type openapi_vector_store_expiration_after() ::
    #{ 'anchor' := binary(),
       'days' := integer()
     }.

encode(#{ 'anchor' := Anchor,
          'days' := Days
        }) ->
    #{ 'anchor' => Anchor,
       'days' => Days
     }.
