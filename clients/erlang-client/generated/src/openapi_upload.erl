-module(openapi_upload).

-export([encode/1]).

-export_type([openapi_upload/0]).

-type openapi_upload() ::
    #{ 'id' := binary(),
       'created_at' := integer(),
       'filename' := binary(),
       'bytes' := integer(),
       'purpose' := binary(),
       'status' := binary(),
       'expires_at' := integer(),
       'object' => binary(),
       'file' => openapi_open_ai_file:openapi_open_ai_file()
     }.

encode(#{ 'id' := Id,
          'created_at' := CreatedAt,
          'filename' := Filename,
          'bytes' := Bytes,
          'purpose' := Purpose,
          'status' := Status,
          'expires_at' := ExpiresAt,
          'object' := Object,
          'file' := File
        }) ->
    #{ 'id' => Id,
       'created_at' => CreatedAt,
       'filename' => Filename,
       'bytes' => Bytes,
       'purpose' => Purpose,
       'status' => Status,
       'expires_at' => ExpiresAt,
       'object' => Object,
       'file' => File
     }.
