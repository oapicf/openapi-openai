
#include "RealtimeConversationItem_content_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeConversationItem_content_inner_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeConversationItem_content_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_RealtimeConversationItem_content_inner_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    RealtimeConversationItem_content_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}


void test_RealtimeConversationItem_content_inner_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    RealtimeConversationItem_content_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_RealtimeConversationItem_content_inner_audio_is_assigned_from_json()
{


    bourne::json input =
    {
        "audio", "hello"
    };

    RealtimeConversationItem_content_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAudio().c_str());






}


void test_RealtimeConversationItem_content_inner_transcript_is_assigned_from_json()
{


    bourne::json input =
    {
        "transcript", "hello"
    };

    RealtimeConversationItem_content_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTranscript().c_str());






}



void test_RealtimeConversationItem_content_inner_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    RealtimeConversationItem_content_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_RealtimeConversationItem_content_inner_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    RealtimeConversationItem_content_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}


void test_RealtimeConversationItem_content_inner_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    RealtimeConversationItem_content_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_RealtimeConversationItem_content_inner_audio_is_converted_to_json()
{

    bourne::json input =
    {
        "audio", "hello"
    };

    RealtimeConversationItem_content_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["audio"] == output["audio"]);



}


void test_RealtimeConversationItem_content_inner_transcript_is_converted_to_json()
{

    bourne::json input =
    {
        "transcript", "hello"
    };

    RealtimeConversationItem_content_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["transcript"] == output["transcript"]);



}


