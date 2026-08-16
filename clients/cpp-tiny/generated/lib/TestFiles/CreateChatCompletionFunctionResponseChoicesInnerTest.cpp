
#include "CreateChatCompletionFunctionResponse_choices_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateChatCompletionFunctionResponse_choices_inner_finish_reason_is_assigned_from_json()
{


    bourne::json input =
    {
        "finish_reason", "hello"
    };

    CreateChatCompletionFunctionResponse_choices_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFinishReason().c_str());






}


void test_CreateChatCompletionFunctionResponse_choices_inner_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "index", 1
    };

    CreateChatCompletionFunctionResponse_choices_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIndex());








}




void test_CreateChatCompletionFunctionResponse_choices_inner_finish_reason_is_converted_to_json()
{

    bourne::json input =
    {
        "finish_reason", "hello"
    };

    CreateChatCompletionFunctionResponse_choices_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["finish_reason"] == output["finish_reason"]);



}


void test_CreateChatCompletionFunctionResponse_choices_inner_index_is_converted_to_json()
{
    bourne::json input =
    {
        "index", 1
    };

    CreateChatCompletionFunctionResponse_choices_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["index"] == output["index"]);




}



