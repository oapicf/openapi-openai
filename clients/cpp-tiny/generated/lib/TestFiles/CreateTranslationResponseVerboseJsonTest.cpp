
#include "CreateTranslationResponseVerboseJson.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateTranslationResponseVerboseJson_language_is_assigned_from_json()
{


    bourne::json input =
    {
        "language", "hello"
    };

    CreateTranslationResponseVerboseJson obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLanguage().c_str());






}


void test_CreateTranslationResponseVerboseJson_duration_is_assigned_from_json()
{


    bourne::json input =
    {
        "duration", "hello"
    };

    CreateTranslationResponseVerboseJson obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDuration().c_str());






}


void test_CreateTranslationResponseVerboseJson_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    CreateTranslationResponseVerboseJson obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}




void test_CreateTranslationResponseVerboseJson_language_is_converted_to_json()
{

    bourne::json input =
    {
        "language", "hello"
    };

    CreateTranslationResponseVerboseJson obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["language"] == output["language"]);



}


void test_CreateTranslationResponseVerboseJson_duration_is_converted_to_json()
{

    bourne::json input =
    {
        "duration", "hello"
    };

    CreateTranslationResponseVerboseJson obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["duration"] == output["duration"]);



}


void test_CreateTranslationResponseVerboseJson_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    CreateTranslationResponseVerboseJson obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}



