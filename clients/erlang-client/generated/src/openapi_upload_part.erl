-module(openapi_upload_part).

-export([encode/1]).

-export_type([openapi_upload_part/0]).

-type openapi_upload_part() ::
    #{ 'id' := binary(),
       'created_at' := integer(),
       'upload_id' := binary(),
       'object' := binary()
     }.

encode(#{ 'id' := Id,
          'created_at' := CreatedAt,
          'upload_id' := UploadId,
          'object' := Object
        }) ->
    #{ 'id' => Id,
       'created_at' => CreatedAt,
       'upload_id' => UploadId,
       'object' => Object
     }.
