
#include "FineTuneChatRequestInput.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_FineTuneChatRequestInput_parallel_tool_calls_is_assigned_from_json()
{




    bourne::json input =
    {
        "parallel_tool_calls", true
    };

    FineTuneChatRequestInput obj(input.dump());

    TEST_ASSERT(true == obj.isParallelToolCalls());




}






void test_FineTuneChatRequestInput_parallel_tool_calls_is_converted_to_json()
{


    bourne::json input =
    {
        "parallel_tool_calls", true
    };

    FineTuneChatRequestInput obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parallel_tool_calls"] == output["parallel_tool_calls"]);


}



