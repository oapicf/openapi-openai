
#include "RealtimeSession_turn_detection.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeSession_turn_detection_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeSession_turn_detection obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RealtimeSession_turn_detection_threshold_is_assigned_from_json()
{








}


void test_RealtimeSession_turn_detection_prefix_padding_ms_is_assigned_from_json()
{
    bourne::json input =
    {
        "prefix_padding_ms", 1
    };

    RealtimeSession_turn_detection obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPrefixPaddingMs());








}


void test_RealtimeSession_turn_detection_silence_duration_ms_is_assigned_from_json()
{
    bourne::json input =
    {
        "silence_duration_ms", 1
    };

    RealtimeSession_turn_detection obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSilenceDurationMs());








}



void test_RealtimeSession_turn_detection_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeSession_turn_detection obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RealtimeSession_turn_detection_threshold_is_converted_to_json()
{




}


void test_RealtimeSession_turn_detection_prefix_padding_ms_is_converted_to_json()
{
    bourne::json input =
    {
        "prefix_padding_ms", 1
    };

    RealtimeSession_turn_detection obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["prefix_padding_ms"] == output["prefix_padding_ms"]);




}


void test_RealtimeSession_turn_detection_silence_duration_ms_is_converted_to_json()
{
    bourne::json input =
    {
        "silence_duration_ms", 1
    };

    RealtimeSession_turn_detection obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["silence_duration_ms"] == output["silence_duration_ms"]);




}


