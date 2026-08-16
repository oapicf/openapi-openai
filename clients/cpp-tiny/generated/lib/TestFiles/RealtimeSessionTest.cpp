
#include "RealtimeSession.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeSession_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    RealtimeSession obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}




void test_RealtimeSession_instructions_is_assigned_from_json()
{


    bourne::json input =
    {
        "instructions", "hello"
    };

    RealtimeSession obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInstructions().c_str());






}


void test_RealtimeSession_voice_is_assigned_from_json()
{


    bourne::json input =
    {
        "voice", "hello"
    };

    RealtimeSession obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVoice().c_str());






}


void test_RealtimeSession_input_audio_format_is_assigned_from_json()
{


    bourne::json input =
    {
        "input_audio_format", "hello"
    };

    RealtimeSession obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInputAudioFormat().c_str());






}


void test_RealtimeSession_output_audio_format_is_assigned_from_json()
{


    bourne::json input =
    {
        "output_audio_format", "hello"
    };

    RealtimeSession obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOutputAudioFormat().c_str());






}





void test_RealtimeSession_tool_choice_is_assigned_from_json()
{


    bourne::json input =
    {
        "tool_choice", "hello"
    };

    RealtimeSession obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getToolChoice().c_str());






}


void test_RealtimeSession_temperature_is_assigned_from_json()
{








}




void test_RealtimeSession_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    RealtimeSession obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}




void test_RealtimeSession_instructions_is_converted_to_json()
{

    bourne::json input =
    {
        "instructions", "hello"
    };

    RealtimeSession obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["instructions"] == output["instructions"]);



}


void test_RealtimeSession_voice_is_converted_to_json()
{

    bourne::json input =
    {
        "voice", "hello"
    };

    RealtimeSession obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["voice"] == output["voice"]);



}


void test_RealtimeSession_input_audio_format_is_converted_to_json()
{

    bourne::json input =
    {
        "input_audio_format", "hello"
    };

    RealtimeSession obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["input_audio_format"] == output["input_audio_format"]);



}


void test_RealtimeSession_output_audio_format_is_converted_to_json()
{

    bourne::json input =
    {
        "output_audio_format", "hello"
    };

    RealtimeSession obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output_audio_format"] == output["output_audio_format"]);



}





void test_RealtimeSession_tool_choice_is_converted_to_json()
{

    bourne::json input =
    {
        "tool_choice", "hello"
    };

    RealtimeSession obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["tool_choice"] == output["tool_choice"]);



}


void test_RealtimeSession_temperature_is_converted_to_json()
{




}



