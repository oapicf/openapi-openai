-module(openapi_create_upload_request).

-export([encode/1]).

-export_type([openapi_create_upload_request/0]).

-type openapi_create_upload_request() ::
    #{ 'filename' := binary(),
       'purpose' := binary(),
       'bytes' := integer(),
       'mime_type' := binary()
     }.

encode(#{ 'filename' := Filename,
          'purpose' := Purpose,
          'bytes' := Bytes,
          'mime_type' := MimeType
        }) ->
    #{ 'filename' => Filename,
       'purpose' => Purpose,
       'bytes' => Bytes,
       'mime_type' => MimeType
     }.
