-module(openapi_open_ai_file).

-export([encode/1]).

-export_type([openapi_open_ai_file/0]).

-type openapi_open_ai_file() ::
    #{ 'id' := binary(),
       'bytes' := integer(),
       'created_at' := integer(),
       'filename' := binary(),
       'object' := binary(),
       'purpose' := binary(),
       'status' := binary(),
       'status_details' => binary()
     }.

encode(#{ 'id' := Id,
          'bytes' := Bytes,
          'created_at' := CreatedAt,
          'filename' := Filename,
          'object' := Object,
          'purpose' := Purpose,
          'status' := Status,
          'status_details' := StatusDetails
        }) ->
    #{ 'id' => Id,
       'bytes' => Bytes,
       'created_at' => CreatedAt,
       'filename' => Filename,
       'object' => Object,
       'purpose' => Purpose,
       'status' => Status,
       'status_details' => StatusDetails
     }.
