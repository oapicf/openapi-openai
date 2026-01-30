-module(openapi_fine_tune_preference_request_input_input).

-export([encode/1]).

-export_type([openapi_fine_tune_preference_request_input_input/0]).

-type openapi_fine_tune_preference_request_input_input() ::
    #{ 'messages' => list(),
       'tools' => list(),
       'parallel_tool_calls' => boolean()
     }.

encode(#{ 'messages' := Messages,
          'tools' := Tools,
          'parallel_tool_calls' := ParallelToolCalls
        }) ->
    #{ 'messages' => Messages,
       'tools' => Tools,
       'parallel_tool_calls' => ParallelToolCalls
     }.
