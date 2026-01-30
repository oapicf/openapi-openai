-module(openapi_realtime_response_usage).

-include("openapi.hrl").

-export([openapi_realtime_response_usage/0]).

-export([openapi_realtime_response_usage/1]).

-export_type([openapi_realtime_response_usage/0]).

-type openapi_realtime_response_usage() ::
  [ {'total_tokens', integer() }
  | {'input_tokens', integer() }
  | {'output_tokens', integer() }
  | {'input_token_details', openapi_realtime_response_usage_input_token_details:openapi_realtime_response_usage_input_token_details() }
  | {'output_token_details', openapi_realtime_response_usage_output_token_details:openapi_realtime_response_usage_output_token_details() }
  ].


openapi_realtime_response_usage() ->
    openapi_realtime_response_usage([]).

openapi_realtime_response_usage(Fields) ->
  Default = [ {'total_tokens', integer() }
            , {'input_tokens', integer() }
            , {'output_tokens', integer() }
            , {'input_token_details', openapi_realtime_response_usage_input_token_details:openapi_realtime_response_usage_input_token_details() }
            , {'output_token_details', openapi_realtime_response_usage_output_token_details:openapi_realtime_response_usage_output_token_details() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

