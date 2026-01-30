-module(openapi_complete_upload_request).

-export([encode/1]).

-export_type([openapi_complete_upload_request/0]).

-type openapi_complete_upload_request() ::
    #{ 'part_ids' := list(),
       'md5' => binary()
     }.

encode(#{ 'part_ids' := PartIds,
          'md5' := Md5
        }) ->
    #{ 'part_ids' => PartIds,
       'md5' => Md5
     }.
