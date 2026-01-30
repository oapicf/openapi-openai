#ifndef realtime_session_create_request_TEST
#define realtime_session_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_session_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_session_create_request.h"
realtime_session_create_request_t* instantiate_realtime_session_create_request(int include_optional);

#include "test_realtime_session_input_audio_transcription.c"
#include "test_realtime_session_create_request_turn_detection.c"
#include "test_realtime_response_create_params_max_response_output_tokens.c"


realtime_session_create_request_t* instantiate_realtime_session_create_request(int include_optional) {
  realtime_session_create_request_t* realtime_session_create_request = NULL;
  if (include_optional) {
    realtime_session_create_request = realtime_session_create_request_create(
      list_createList(),
      openai_api_realtime_session_create_request_MODEL_gpt-4o-realtime-preview,
      "0",
      openai_api_realtime_session_create_request_VOICE_alloy,
      openai_api_realtime_session_create_request_INPUTAUDIOFORMAT_pcm16,
      openai_api_realtime_session_create_request_OUTPUTAUDIOFORMAT_pcm16,
       // false, not to have infinite recursion
      instantiate_realtime_session_input_audio_transcription(0),
       // false, not to have infinite recursion
      instantiate_realtime_session_create_request_turn_detection(0),
      list_createList(),
      "0",
      1.337,
      null
    );
  } else {
    realtime_session_create_request = realtime_session_create_request_create(
      list_createList(),
      openai_api_realtime_session_create_request_MODEL_gpt-4o-realtime-preview,
      "0",
      openai_api_realtime_session_create_request_VOICE_alloy,
      openai_api_realtime_session_create_request_INPUTAUDIOFORMAT_pcm16,
      openai_api_realtime_session_create_request_OUTPUTAUDIOFORMAT_pcm16,
      NULL,
      NULL,
      list_createList(),
      "0",
      1.337,
      null
    );
  }

  return realtime_session_create_request;
}


#ifdef realtime_session_create_request_MAIN

void test_realtime_session_create_request(int include_optional) {
    realtime_session_create_request_t* realtime_session_create_request_1 = instantiate_realtime_session_create_request(include_optional);

	cJSON* jsonrealtime_session_create_request_1 = realtime_session_create_request_convertToJSON(realtime_session_create_request_1);
	printf("realtime_session_create_request :\n%s\n", cJSON_Print(jsonrealtime_session_create_request_1));
	realtime_session_create_request_t* realtime_session_create_request_2 = realtime_session_create_request_parseFromJSON(jsonrealtime_session_create_request_1);
	cJSON* jsonrealtime_session_create_request_2 = realtime_session_create_request_convertToJSON(realtime_session_create_request_2);
	printf("repeating realtime_session_create_request:\n%s\n", cJSON_Print(jsonrealtime_session_create_request_2));
}

int main() {
  test_realtime_session_create_request(1);
  test_realtime_session_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_session_create_request_MAIN
#endif // realtime_session_create_request_TEST
