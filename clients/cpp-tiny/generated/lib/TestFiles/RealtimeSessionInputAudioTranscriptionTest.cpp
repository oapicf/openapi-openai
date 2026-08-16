
#include "RealtimeSession_input_audio_transcription.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RealtimeSession_input_audio_transcription_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "model", "hello"
    };

    RealtimeSession_input_audio_transcription obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getModel().c_str());






}



void test_RealtimeSession_input_audio_transcription_model_is_converted_to_json()
{

    bourne::json input =
    {
        "model", "hello"
    };

    RealtimeSession_input_audio_transcription obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["model"] == output["model"]);



}


