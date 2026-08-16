
#include "RealtimeServerEventResponseOutputItemDone.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeServerEventResponseOutputItemDone_event_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventResponseOutputItemDone obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventId().c_str());






}


void test_RealtimeServerEventResponseOutputItemDone_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventResponseOutputItemDone obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RealtimeServerEventResponseOutputItemDone_response_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "response_id", "hello"
    };

    RealtimeServerEventResponseOutputItemDone obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResponseId().c_str());






}


void test_RealtimeServerEventResponseOutputItemDone_output_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "output_index", 1
    };

    RealtimeServerEventResponseOutputItemDone obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOutputIndex());








}




void test_RealtimeServerEventResponseOutputItemDone_event_id_is_converted_to_json()
{

    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventResponseOutputItemDone obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_id"] == output["event_id"]);



}


void test_RealtimeServerEventResponseOutputItemDone_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventResponseOutputItemDone obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RealtimeServerEventResponseOutputItemDone_response_id_is_converted_to_json()
{

    bourne::json input =
    {
        "response_id", "hello"
    };

    RealtimeServerEventResponseOutputItemDone obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["response_id"] == output["response_id"]);



}


void test_RealtimeServerEventResponseOutputItemDone_output_index_is_converted_to_json()
{
    bourne::json input =
    {
        "output_index", 1
    };

    RealtimeServerEventResponseOutputItemDone obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output_index"] == output["output_index"]);




}



