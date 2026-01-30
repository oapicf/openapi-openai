#ifndef realtime_session_create_response_TEST
#define realtime_session_create_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_session_create_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_session_create_response.h"
realtime_session_create_response_t* instantiate_realtime_session_create_response(int include_optional);

#include "test_realtime_session_create_response_client_secret.c"
#include "test_realtime_session_input_audio_transcription.c"
#include "test_realtime_session_create_response_turn_detection.c"
#include "test_realtime_response_create_params_max_response_output_tokens.c"


realtime_session_create_response_t* instantiate_realtime_session_create_response(int include_optional) {
  realtime_session_create_response_t* realtime_session_create_response = NULL;
  if (include_optional) {
    realtime_session_create_response = realtime_session_create_response_create(
       // false, not to have infinite recursion
      instantiate_realtime_session_create_response_client_secret(0),
      list_createList(),
      "0",
      openai_api_realtime_session_create_response_VOICE_alloy,
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_realtime_session_input_audio_transcription(0),
       // false, not to have infinite recursion
      instantiate_realtime_session_create_response_turn_detection(0),
      list_createList(),
      "0",
      1.337,
      null
    );
  } else {
    realtime_session_create_response = realtime_session_create_response_create(
      NULL,
      list_createList(),
      "0",
      openai_api_realtime_session_create_response_VOICE_alloy,
      "0",
      "0",
      NULL,
      NULL,
      list_createList(),
      "0",
      1.337,
      null
    );
  }

  return realtime_session_create_response;
}


#ifdef realtime_session_create_response_MAIN

void test_realtime_session_create_response(int include_optional) {
    realtime_session_create_response_t* realtime_session_create_response_1 = instantiate_realtime_session_create_response(include_optional);

	cJSON* jsonrealtime_session_create_response_1 = realtime_session_create_response_convertToJSON(realtime_session_create_response_1);
	printf("realtime_session_create_response :\n%s\n", cJSON_Print(jsonrealtime_session_create_response_1));
	realtime_session_create_response_t* realtime_session_create_response_2 = realtime_session_create_response_parseFromJSON(jsonrealtime_session_create_response_1);
	cJSON* jsonrealtime_session_create_response_2 = realtime_session_create_response_convertToJSON(realtime_session_create_response_2);
	printf("repeating realtime_session_create_response:\n%s\n", cJSON_Print(jsonrealtime_session_create_response_2));
}

int main() {
  test_realtime_session_create_response(1);
  test_realtime_session_create_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_session_create_response_MAIN
#endif // realtime_session_create_response_TEST
