-module(openapi_chat_completion_stream_options).

-export([encode/1]).

-export_type([openapi_chat_completion_stream_options/0]).

-type openapi_chat_completion_stream_options() ::
    #{ 'include_usage' => boolean()
     }.

encode(#{ 'include_usage' := IncludeUsage
        }) ->
    #{ 'include_usage' => IncludeUsage
     }.
