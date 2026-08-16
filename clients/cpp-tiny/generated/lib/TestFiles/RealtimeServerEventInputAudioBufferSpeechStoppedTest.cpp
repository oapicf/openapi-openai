
#include "RealtimeServerEventInputAudioBufferSpeechStopped.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeServerEventInputAudioBufferSpeechStopped_event_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventInputAudioBufferSpeechStopped obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventId().c_str());






}


void test_RealtimeServerEventInputAudioBufferSpeechStopped_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventInputAudioBufferSpeechStopped obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RealtimeServerEventInputAudioBufferSpeechStopped_audio_end_ms_is_assigned_from_json()
{
    bourne::json input =
    {
        "audio_end_ms", 1
    };

    RealtimeServerEventInputAudioBufferSpeechStopped obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAudioEndMs());








}


void test_RealtimeServerEventInputAudioBufferSpeechStopped_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_id", "hello"
    };

    RealtimeServerEventInputAudioBufferSpeechStopped obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemId().c_str());






}



void test_RealtimeServerEventInputAudioBufferSpeechStopped_event_id_is_converted_to_json()
{

    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventInputAudioBufferSpeechStopped obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_id"] == output["event_id"]);



}


void test_RealtimeServerEventInputAudioBufferSpeechStopped_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventInputAudioBufferSpeechStopped obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RealtimeServerEventInputAudioBufferSpeechStopped_audio_end_ms_is_converted_to_json()
{
    bourne::json input =
    {
        "audio_end_ms", 1
    };

    RealtimeServerEventInputAudioBufferSpeechStopped obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["audio_end_ms"] == output["audio_end_ms"]);




}


void test_RealtimeServerEventInputAudioBufferSpeechStopped_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_id", "hello"
    };

    RealtimeServerEventInputAudioBufferSpeechStopped obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_id"] == output["item_id"]);



}


