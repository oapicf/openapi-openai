
#include "CreateSpeechRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CreateSpeechRequest_input_is_assigned_from_json()
{


    bourne::json input =
    {
        "input", "hello"
    };

    CreateSpeechRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInput().c_str());






}


void test_CreateSpeechRequest_voice_is_assigned_from_json()
{


    bourne::json input =
    {
        "voice", "hello"
    };

    CreateSpeechRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVoice().c_str());






}


void test_CreateSpeechRequest_response_format_is_assigned_from_json()
{


    bourne::json input =
    {
        "response_format", "hello"
    };

    CreateSpeechRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResponseFormat().c_str());






}


void test_CreateSpeechRequest_speed_is_assigned_from_json()
{








}




void test_CreateSpeechRequest_input_is_converted_to_json()
{

    bourne::json input =
    {
        "input", "hello"
    };

    CreateSpeechRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["input"] == output["input"]);



}


void test_CreateSpeechRequest_voice_is_converted_to_json()
{

    bourne::json input =
    {
        "voice", "hello"
    };

    CreateSpeechRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["voice"] == output["voice"]);



}


void test_CreateSpeechRequest_response_format_is_converted_to_json()
{

    bourne::json input =
    {
        "response_format", "hello"
    };

    CreateSpeechRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["response_format"] == output["response_format"]);



}


void test_CreateSpeechRequest_speed_is_converted_to_json()
{




}


