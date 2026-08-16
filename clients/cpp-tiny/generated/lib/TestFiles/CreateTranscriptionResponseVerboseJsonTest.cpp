
#include "CreateTranscriptionResponseVerboseJson.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateTranscriptionResponseVerboseJson_language_is_assigned_from_json()
{


    bourne::json input =
    {
        "language", "hello"
    };

    CreateTranscriptionResponseVerboseJson obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLanguage().c_str());






}


void test_CreateTranscriptionResponseVerboseJson_duration_is_assigned_from_json()
{


    bourne::json input =
    {
        "duration", "hello"
    };

    CreateTranscriptionResponseVerboseJson obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDuration().c_str());






}


void test_CreateTranscriptionResponseVerboseJson_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    CreateTranscriptionResponseVerboseJson obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}





void test_CreateTranscriptionResponseVerboseJson_language_is_converted_to_json()
{

    bourne::json input =
    {
        "language", "hello"
    };

    CreateTranscriptionResponseVerboseJson obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["language"] == output["language"]);



}


void test_CreateTranscriptionResponseVerboseJson_duration_is_converted_to_json()
{

    bourne::json input =
    {
        "duration", "hello"
    };

    CreateTranscriptionResponseVerboseJson obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["duration"] == output["duration"]);



}


void test_CreateTranscriptionResponseVerboseJson_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    CreateTranscriptionResponseVerboseJson obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}




