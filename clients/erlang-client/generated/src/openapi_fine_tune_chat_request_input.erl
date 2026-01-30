-module(openapi_fine_tune_chat_request_input).

-export([encode/1]).

-export_type([openapi_fine_tune_chat_request_input/0]).

-type openapi_fine_tune_chat_request_input() ::
    #{ 'messages' => list(),
       'tools' => list(),
       'parallel_tool_calls' => boolean(),
       'functions' => list()
     }.

encode(#{ 'messages' := Messages,
          'tools' := Tools,
          'parallel_tool_calls' := ParallelToolCalls,
          'functions' := Functions
        }) ->
    #{ 'messages' => Messages,
       'tools' => Tools,
       'parallel_tool_calls' => ParallelToolCalls,
       'functions' => Functions
     }.
