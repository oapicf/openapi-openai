
#include "RealtimeServerEventInputAudioBufferSpeechStarted.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeServerEventInputAudioBufferSpeechStarted_event_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventInputAudioBufferSpeechStarted obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventId().c_str());






}


void test_RealtimeServerEventInputAudioBufferSpeechStarted_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventInputAudioBufferSpeechStarted obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RealtimeServerEventInputAudioBufferSpeechStarted_audio_start_ms_is_assigned_from_json()
{
    bourne::json input =
    {
        "audio_start_ms", 1
    };

    RealtimeServerEventInputAudioBufferSpeechStarted obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAudioStartMs());








}


void test_RealtimeServerEventInputAudioBufferSpeechStarted_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_id", "hello"
    };

    RealtimeServerEventInputAudioBufferSpeechStarted obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemId().c_str());






}



void test_RealtimeServerEventInputAudioBufferSpeechStarted_event_id_is_converted_to_json()
{

    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventInputAudioBufferSpeechStarted obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_id"] == output["event_id"]);



}


void test_RealtimeServerEventInputAudioBufferSpeechStarted_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventInputAudioBufferSpeechStarted obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RealtimeServerEventInputAudioBufferSpeechStarted_audio_start_ms_is_converted_to_json()
{
    bourne::json input =
    {
        "audio_start_ms", 1
    };

    RealtimeServerEventInputAudioBufferSpeechStarted obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["audio_start_ms"] == output["audio_start_ms"]);




}


void test_RealtimeServerEventInputAudioBufferSpeechStarted_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_id", "hello"
    };

    RealtimeServerEventInputAudioBufferSpeechStarted obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_id"] == output["item_id"]);



}


