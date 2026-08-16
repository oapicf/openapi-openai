
#include "AssistantsNamedToolChoice.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AssistantsNamedToolChoice_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    AssistantsNamedToolChoice obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}




void test_AssistantsNamedToolChoice_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    AssistantsNamedToolChoice obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}



