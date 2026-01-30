-module(openapi_vector_store_object).

-export([encode/1]).

-export_type([openapi_vector_store_object/0]).

-type openapi_vector_store_object() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'created_at' := integer(),
       'name' := binary(),
       'usage_bytes' := integer(),
       'file_counts' := openapi_vector_store_object_file_counts:openapi_vector_store_object_file_counts(),
       'status' := binary(),
       'expires_after' => openapi_vector_store_expiration_after:openapi_vector_store_expiration_after(),
       'expires_at' => integer(),
       'last_active_at' := integer(),
       'metadata' := maps:map()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'created_at' := CreatedAt,
          'name' := Name,
          'usage_bytes' := UsageBytes,
          'file_counts' := FileCounts,
          'status' := Status,
          'expires_after' := ExpiresAfter,
          'expires_at' := ExpiresAt,
          'last_active_at' := LastActiveAt,
          'metadata' := Metadata
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'created_at' => CreatedAt,
       'name' => Name,
       'usage_bytes' => UsageBytes,
       'file_counts' => FileCounts,
       'status' => Status,
       'expires_after' => ExpiresAfter,
       'expires_at' => ExpiresAt,
       'last_active_at' => LastActiveAt,
       'metadata' => Metadata
     }.
