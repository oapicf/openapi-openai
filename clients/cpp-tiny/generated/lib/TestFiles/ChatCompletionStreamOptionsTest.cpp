
#include "ChatCompletionStreamOptions.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ChatCompletionStreamOptions_include_usage_is_assigned_from_json()
{




    bourne::json input =
    {
        "include_usage", true
    };

    ChatCompletionStreamOptions obj(input.dump());

    TEST_ASSERT(true == obj.isIncludeUsage());




}



void test_ChatCompletionStreamOptions_include_usage_is_converted_to_json()
{


    bourne::json input =
    {
        "include_usage", true
    };

    ChatCompletionStreamOptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["include_usage"] == output["include_usage"]);


}


