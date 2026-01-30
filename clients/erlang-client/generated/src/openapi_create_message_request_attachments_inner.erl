-module(openapi_create_message_request_attachments_inner).

-export([encode/1]).

-export_type([openapi_create_message_request_attachments_inner/0]).

-type openapi_create_message_request_attachments_inner() ::
    #{ 'file_id' => binary(),
       'tools' => list()
     }.

encode(#{ 'file_id' := FileId,
          'tools' := Tools
        }) ->
    #{ 'file_id' => FileId,
       'tools' => Tools
     }.
