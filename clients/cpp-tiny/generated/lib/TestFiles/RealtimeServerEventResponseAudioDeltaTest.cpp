
#include "RealtimeServerEventResponseAudioDelta.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeServerEventResponseAudioDelta_event_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventId().c_str());






}


void test_RealtimeServerEventResponseAudioDelta_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RealtimeServerEventResponseAudioDelta_response_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "response_id", "hello"
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResponseId().c_str());






}


void test_RealtimeServerEventResponseAudioDelta_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_id", "hello"
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemId().c_str());






}


void test_RealtimeServerEventResponseAudioDelta_output_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "output_index", 1
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOutputIndex());








}


void test_RealtimeServerEventResponseAudioDelta_content_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "content_index", 1
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getContentIndex());








}


void test_RealtimeServerEventResponseAudioDelta_delta_is_assigned_from_json()
{


    bourne::json input =
    {
        "delta", "hello"
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDelta().c_str());






}



void test_RealtimeServerEventResponseAudioDelta_event_id_is_converted_to_json()
{

    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_id"] == output["event_id"]);



}


void test_RealtimeServerEventResponseAudioDelta_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RealtimeServerEventResponseAudioDelta_response_id_is_converted_to_json()
{

    bourne::json input =
    {
        "response_id", "hello"
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["response_id"] == output["response_id"]);



}


void test_RealtimeServerEventResponseAudioDelta_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_id", "hello"
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_id"] == output["item_id"]);



}


void test_RealtimeServerEventResponseAudioDelta_output_index_is_converted_to_json()
{
    bourne::json input =
    {
        "output_index", 1
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output_index"] == output["output_index"]);




}


void test_RealtimeServerEventResponseAudioDelta_content_index_is_converted_to_json()
{
    bourne::json input =
    {
        "content_index", 1
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content_index"] == output["content_index"]);




}


void test_RealtimeServerEventResponseAudioDelta_delta_is_converted_to_json()
{

    bourne::json input =
    {
        "delta", "hello"
    };

    RealtimeServerEventResponseAudioDelta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["delta"] == output["delta"]);



}


