
#include "RealtimeServerEventInputAudioBufferCommitted.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeServerEventInputAudioBufferCommitted_event_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventInputAudioBufferCommitted obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventId().c_str());






}


void test_RealtimeServerEventInputAudioBufferCommitted_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventInputAudioBufferCommitted obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RealtimeServerEventInputAudioBufferCommitted_previous_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "previous_item_id", "hello"
    };

    RealtimeServerEventInputAudioBufferCommitted obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPreviousItemId().c_str());






}


void test_RealtimeServerEventInputAudioBufferCommitted_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_id", "hello"
    };

    RealtimeServerEventInputAudioBufferCommitted obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemId().c_str());






}



void test_RealtimeServerEventInputAudioBufferCommitted_event_id_is_converted_to_json()
{

    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventInputAudioBufferCommitted obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_id"] == output["event_id"]);



}


void test_RealtimeServerEventInputAudioBufferCommitted_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventInputAudioBufferCommitted obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RealtimeServerEventInputAudioBufferCommitted_previous_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "previous_item_id", "hello"
    };

    RealtimeServerEventInputAudioBufferCommitted obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["previous_item_id"] == output["previous_item_id"]);



}


void test_RealtimeServerEventInputAudioBufferCommitted_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_id", "hello"
    };

    RealtimeServerEventInputAudioBufferCommitted obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_id"] == output["item_id"]);



}


