-module(openapi_update_vector_store_request).

-export([encode/1]).

-export_type([openapi_update_vector_store_request/0]).

-type openapi_update_vector_store_request() ::
    #{ 'name' => binary(),
       'expires_after' => openapi_vector_store_expiration_after:openapi_vector_store_expiration_after(),
       'metadata' => maps:map()
     }.

encode(#{ 'name' := Name,
          'expires_after' := ExpiresAfter,
          'metadata' := Metadata
        }) ->
    #{ 'name' => Name,
       'expires_after' => ExpiresAfter,
       'metadata' => Metadata
     }.
