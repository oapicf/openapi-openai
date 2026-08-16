
#include "CreateTranslation_200_response.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateTranslation_200_response_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    CreateTranslation_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}


void test_CreateTranslation_200_response_language_is_assigned_from_json()
{


    bourne::json input =
    {
        "language", "hello"
    };

    CreateTranslation_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLanguage().c_str());






}


void test_CreateTranslation_200_response_duration_is_assigned_from_json()
{


    bourne::json input =
    {
        "duration", "hello"
    };

    CreateTranslation_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDuration().c_str());






}




void test_CreateTranslation_200_response_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    CreateTranslation_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}


void test_CreateTranslation_200_response_language_is_converted_to_json()
{

    bourne::json input =
    {
        "language", "hello"
    };

    CreateTranslation_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["language"] == output["language"]);



}


void test_CreateTranslation_200_response_duration_is_converted_to_json()
{

    bourne::json input =
    {
        "duration", "hello"
    };

    CreateTranslation_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["duration"] == output["duration"]);



}



