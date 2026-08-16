
#include "CreateChatCompletionRequest_response_format.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateChatCompletionRequest_response_format_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    CreateChatCompletionRequest_response_format obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}




void test_CreateChatCompletionRequest_response_format_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    CreateChatCompletionRequest_response_format obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}



