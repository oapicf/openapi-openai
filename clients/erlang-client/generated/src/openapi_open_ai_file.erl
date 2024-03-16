-module(openapi_open_ai_file).

-export([encode/1]).

-export_type([openapi_open_ai_file/0]).

-type openapi_open_ai_file() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'bytes' := integer(),
       'created_at' := integer(),
       'filename' := binary(),
       'purpose' := binary(),
       'status' => binary(),
       'status_details' => maps:map()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'bytes' := Bytes,
          'created_at' := CreatedAt,
          'filename' := Filename,
          'purpose' := Purpose,
          'status' := Status,
          'status_details' := StatusDetails
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'bytes' => Bytes,
       'created_at' => CreatedAt,
       'filename' => Filename,
       'purpose' => Purpose,
       'status' => Status,
       'status_details' => StatusDetails
     }.
