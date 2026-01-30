#ifndef realtime_session_TEST
#define realtime_session_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_session_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_session.h"
realtime_session_t* instantiate_realtime_session(int include_optional);

#include "test_realtime_session_model.c"
#include "test_realtime_session_input_audio_transcription.c"
#include "test_realtime_session_turn_detection.c"
#include "test_realtime_response_create_params_max_response_output_tokens.c"


realtime_session_t* instantiate_realtime_session(int include_optional) {
  realtime_session_t* realtime_session = NULL;
  if (include_optional) {
    realtime_session = realtime_session_create(
      "0",
      list_createList(),
      null,
      "0",
      openai_api_realtime_session_VOICE_alloy,
      openai_api_realtime_session_INPUTAUDIOFORMAT_pcm16,
      openai_api_realtime_session_OUTPUTAUDIOFORMAT_pcm16,
       // false, not to have infinite recursion
      instantiate_realtime_session_input_audio_transcription(0),
       // false, not to have infinite recursion
      instantiate_realtime_session_turn_detection(0),
      list_createList(),
      "0",
      1.337,
      null
    );
  } else {
    realtime_session = realtime_session_create(
      "0",
      list_createList(),
      null,
      "0",
      openai_api_realtime_session_VOICE_alloy,
      openai_api_realtime_session_INPUTAUDIOFORMAT_pcm16,
      openai_api_realtime_session_OUTPUTAUDIOFORMAT_pcm16,
      NULL,
      NULL,
      list_createList(),
      "0",
      1.337,
      null
    );
  }

  return realtime_session;
}


#ifdef realtime_session_MAIN

void test_realtime_session(int include_optional) {
    realtime_session_t* realtime_session_1 = instantiate_realtime_session(include_optional);

	cJSON* jsonrealtime_session_1 = realtime_session_convertToJSON(realtime_session_1);
	printf("realtime_session :\n%s\n", cJSON_Print(jsonrealtime_session_1));
	realtime_session_t* realtime_session_2 = realtime_session_parseFromJSON(jsonrealtime_session_1);
	cJSON* jsonrealtime_session_2 = realtime_session_convertToJSON(realtime_session_2);
	printf("repeating realtime_session:\n%s\n", cJSON_Print(jsonrealtime_session_2));
}

int main() {
  test_realtime_session(1);
  test_realtime_session(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_session_MAIN
#endif // realtime_session_TEST
