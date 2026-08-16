
#include "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeServerEventConversationItemInputAudioTranscriptionCompleted_event_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventConversationItemInputAudioTranscriptionCompleted obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventId().c_str());






}


void test_RealtimeServerEventConversationItemInputAudioTranscriptionCompleted_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventConversationItemInputAudioTranscriptionCompleted obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RealtimeServerEventConversationItemInputAudioTranscriptionCompleted_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_id", "hello"
    };

    RealtimeServerEventConversationItemInputAudioTranscriptionCompleted obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemId().c_str());






}


void test_RealtimeServerEventConversationItemInputAudioTranscriptionCompleted_content_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "content_index", 1
    };

    RealtimeServerEventConversationItemInputAudioTranscriptionCompleted obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getContentIndex());








}


void test_RealtimeServerEventConversationItemInputAudioTranscriptionCompleted_transcript_is_assigned_from_json()
{


    bourne::json input =
    {
        "transcript", "hello"
    };

    RealtimeServerEventConversationItemInputAudioTranscriptionCompleted obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTranscript().c_str());






}



void test_RealtimeServerEventConversationItemInputAudioTranscriptionCompleted_event_id_is_converted_to_json()
{

    bourne::json input =
    {
        "event_id", "hello"
    };

    RealtimeServerEventConversationItemInputAudioTranscriptionCompleted obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_id"] == output["event_id"]);



}


void test_RealtimeServerEventConversationItemInputAudioTranscriptionCompleted_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeServerEventConversationItemInputAudioTranscriptionCompleted obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RealtimeServerEventConversationItemInputAudioTranscriptionCompleted_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_id", "hello"
    };

    RealtimeServerEventConversationItemInputAudioTranscriptionCompleted obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_id"] == output["item_id"]);



}


void test_RealtimeServerEventConversationItemInputAudioTranscriptionCompleted_content_index_is_converted_to_json()
{
    bourne::json input =
    {
        "content_index", 1
    };

    RealtimeServerEventConversationItemInputAudioTranscriptionCompleted obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content_index"] == output["content_index"]);




}


void test_RealtimeServerEventConversationItemInputAudioTranscriptionCompleted_transcript_is_converted_to_json()
{

    bourne::json input =
    {
        "transcript", "hello"
    };

    RealtimeServerEventConversationItemInputAudioTranscriptionCompleted obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["transcript"] == output["transcript"]);



}


