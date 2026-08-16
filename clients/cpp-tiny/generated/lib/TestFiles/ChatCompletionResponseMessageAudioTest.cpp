
#include "ChatCompletionResponseMessage_audio.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ChatCompletionResponseMessage_audio_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    ChatCompletionResponseMessage_audio obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_ChatCompletionResponseMessage_audio_expires_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    ChatCompletionResponseMessage_audio obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExpiresAt());








}


void test_ChatCompletionResponseMessage_audio_data_is_assigned_from_json()
{


    bourne::json input =
    {
        "data", "hello"
    };

    ChatCompletionResponseMessage_audio obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getData().c_str());






}


void test_ChatCompletionResponseMessage_audio_transcript_is_assigned_from_json()
{


    bourne::json input =
    {
        "transcript", "hello"
    };

    ChatCompletionResponseMessage_audio obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTranscript().c_str());






}



void test_ChatCompletionResponseMessage_audio_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    ChatCompletionResponseMessage_audio obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_ChatCompletionResponseMessage_audio_expires_at_is_converted_to_json()
{
    bourne::json input =
    {
        "expires_at", 1
    };

    ChatCompletionResponseMessage_audio obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["expires_at"] == output["expires_at"]);




}


void test_ChatCompletionResponseMessage_audio_data_is_converted_to_json()
{

    bourne::json input =
    {
        "data", "hello"
    };

    ChatCompletionResponseMessage_audio obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["data"] == output["data"]);



}


void test_ChatCompletionResponseMessage_audio_transcript_is_converted_to_json()
{

    bourne::json input =
    {
        "transcript", "hello"
    };

    ChatCompletionResponseMessage_audio obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["transcript"] == output["transcript"]);



}


