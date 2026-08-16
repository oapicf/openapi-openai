
#include "RealtimeServerEventResponseContentPartDone_part.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeServerEventResponseContentPartDone_part_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventResponseContentPartDone_part obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RealtimeServerEventResponseContentPartDone_part_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    RealtimeServerEventResponseContentPartDone_part obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}


void test_RealtimeServerEventResponseContentPartDone_part_audio_is_assigned_from_json()
{


    bourne::json input =
    {
        "audio", "hello"
    };

    RealtimeServerEventResponseContentPartDone_part obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAudio().c_str());






}


void test_RealtimeServerEventResponseContentPartDone_part_transcript_is_assigned_from_json()
{


    bourne::json input =
    {
        "transcript", "hello"
    };

    RealtimeServerEventResponseContentPartDone_part obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTranscript().c_str());






}



void test_RealtimeServerEventResponseContentPartDone_part_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventResponseContentPartDone_part obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RealtimeServerEventResponseContentPartDone_part_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    RealtimeServerEventResponseContentPartDone_part obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}


void test_RealtimeServerEventResponseContentPartDone_part_audio_is_converted_to_json()
{

    bourne::json input =
    {
        "audio", "hello"
    };

    RealtimeServerEventResponseContentPartDone_part obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["audio"] == output["audio"]);



}


void test_RealtimeServerEventResponseContentPartDone_part_transcript_is_converted_to_json()
{

    bourne::json input =
    {
        "transcript", "hello"
    };

    RealtimeServerEventResponseContentPartDone_part obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["transcript"] == output["transcript"]);



}


