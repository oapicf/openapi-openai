
#include "CreateChatCompletionRequest_audio.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateChatCompletionRequest_audio_voice_is_assigned_from_json()
{


    bourne::json input =
    {
        "voice", "hello"
    };

    CreateChatCompletionRequest_audio obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVoice().c_str());






}


void test_CreateChatCompletionRequest_audio_format_is_assigned_from_json()
{


    bourne::json input =
    {
        "format", "hello"
    };

    CreateChatCompletionRequest_audio obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFormat().c_str());






}



void test_CreateChatCompletionRequest_audio_voice_is_converted_to_json()
{

    bourne::json input =
    {
        "voice", "hello"
    };

    CreateChatCompletionRequest_audio obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["voice"] == output["voice"]);



}


void test_CreateChatCompletionRequest_audio_format_is_converted_to_json()
{

    bourne::json input =
    {
        "format", "hello"
    };

    CreateChatCompletionRequest_audio obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["format"] == output["format"]);



}


