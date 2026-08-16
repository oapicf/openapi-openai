
#include "ChatCompletionRequestMessageContentPartAudio_input_audio.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ChatCompletionRequestMessageContentPartAudio_input_audio_data_is_assigned_from_json()
{


    bourne::json input =
    {
        "data", "hello"
    };

    ChatCompletionRequestMessageContentPartAudio_input_audio obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getData().c_str());






}


void test_ChatCompletionRequestMessageContentPartAudio_input_audio_format_is_assigned_from_json()
{


    bourne::json input =
    {
        "format", "hello"
    };

    ChatCompletionRequestMessageContentPartAudio_input_audio obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFormat().c_str());






}



void test_ChatCompletionRequestMessageContentPartAudio_input_audio_data_is_converted_to_json()
{

    bourne::json input =
    {
        "data", "hello"
    };

    ChatCompletionRequestMessageContentPartAudio_input_audio obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["data"] == output["data"]);



}


void test_ChatCompletionRequestMessageContentPartAudio_input_audio_format_is_converted_to_json()
{

    bourne::json input =
    {
        "format", "hello"
    };

    ChatCompletionRequestMessageContentPartAudio_input_audio obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["format"] == output["format"]);



}


