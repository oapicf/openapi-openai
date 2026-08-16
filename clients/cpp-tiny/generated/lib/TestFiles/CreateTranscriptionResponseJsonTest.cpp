
#include "CreateTranscriptionResponseJson.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateTranscriptionResponseJson_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    CreateTranscriptionResponseJson obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}



void test_CreateTranscriptionResponseJson_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    CreateTranscriptionResponseJson obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}


