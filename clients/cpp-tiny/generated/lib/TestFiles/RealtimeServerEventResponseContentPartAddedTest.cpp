
#include "RealtimeServerEventResponseContentPartAdded.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeServerEventResponseContentPartAdded_event_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventResponseContentPartAdded obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventId().c_str());






}


void test_RealtimeServerEventResponseContentPartAdded_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventResponseContentPartAdded obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RealtimeServerEventResponseContentPartAdded_response_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "response_id", "hello"
    };

    RealtimeServerEventResponseContentPartAdded obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResponseId().c_str());






}


void test_RealtimeServerEventResponseContentPartAdded_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_id", "hello"
    };

    RealtimeServerEventResponseContentPartAdded obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemId().c_str());






}


void test_RealtimeServerEventResponseContentPartAdded_output_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "output_index", 1
    };

    RealtimeServerEventResponseContentPartAdded obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOutputIndex());








}


void test_RealtimeServerEventResponseContentPartAdded_content_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "content_index", 1
    };

    RealtimeServerEventResponseContentPartAdded obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getContentIndex());








}




void test_RealtimeServerEventResponseContentPartAdded_event_id_is_converted_to_json()
{

    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventResponseContentPartAdded obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_id"] == output["event_id"]);



}


void test_RealtimeServerEventResponseContentPartAdded_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventResponseContentPartAdded obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RealtimeServerEventResponseContentPartAdded_response_id_is_converted_to_json()
{

    bourne::json input =
    {
        "response_id", "hello"
    };

    RealtimeServerEventResponseContentPartAdded obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["response_id"] == output["response_id"]);



}


void test_RealtimeServerEventResponseContentPartAdded_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_id", "hello"
    };

    RealtimeServerEventResponseContentPartAdded obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_id"] == output["item_id"]);



}


void test_RealtimeServerEventResponseContentPartAdded_output_index_is_converted_to_json()
{
    bourne::json input =
    {
        "output_index", 1
    };

    RealtimeServerEventResponseContentPartAdded obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output_index"] == output["output_index"]);




}


void test_RealtimeServerEventResponseContentPartAdded_content_index_is_converted_to_json()
{
    bourne::json input =
    {
        "content_index", 1
    };

    RealtimeServerEventResponseContentPartAdded obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content_index"] == output["content_index"]);




}



