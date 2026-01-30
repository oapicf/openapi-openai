#ifndef realtime_server_event_input_audio_buffer_speech_started_TEST
#define realtime_server_event_input_audio_buffer_speech_started_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_input_audio_buffer_speech_started_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_input_audio_buffer_speech_started.h"
realtime_server_event_input_audio_buffer_speech_started_t* instantiate_realtime_server_event_input_audio_buffer_speech_started(int include_optional);



realtime_server_event_input_audio_buffer_speech_started_t* instantiate_realtime_server_event_input_audio_buffer_speech_started(int include_optional) {
  realtime_server_event_input_audio_buffer_speech_started_t* realtime_server_event_input_audio_buffer_speech_started = NULL;
  if (include_optional) {
    realtime_server_event_input_audio_buffer_speech_started = realtime_server_event_input_audio_buffer_speech_started_create(
      "0",
      openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_input_audio_buffer.speech_started,
      56,
      "0"
    );
  } else {
    realtime_server_event_input_audio_buffer_speech_started = realtime_server_event_input_audio_buffer_speech_started_create(
      "0",
      openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_input_audio_buffer.speech_started,
      56,
      "0"
    );
  }

  return realtime_server_event_input_audio_buffer_speech_started;
}


#ifdef realtime_server_event_input_audio_buffer_speech_started_MAIN

void test_realtime_server_event_input_audio_buffer_speech_started(int include_optional) {
    realtime_server_event_input_audio_buffer_speech_started_t* realtime_server_event_input_audio_buffer_speech_started_1 = instantiate_realtime_server_event_input_audio_buffer_speech_started(include_optional);

	cJSON* jsonrealtime_server_event_input_audio_buffer_speech_started_1 = realtime_server_event_input_audio_buffer_speech_started_convertToJSON(realtime_server_event_input_audio_buffer_speech_started_1);
	printf("realtime_server_event_input_audio_buffer_speech_started :\n%s\n", cJSON_Print(jsonrealtime_server_event_input_audio_buffer_speech_started_1));
	realtime_server_event_input_audio_buffer_speech_started_t* realtime_server_event_input_audio_buffer_speech_started_2 = realtime_server_event_input_audio_buffer_speech_started_parseFromJSON(jsonrealtime_server_event_input_audio_buffer_speech_started_1);
	cJSON* jsonrealtime_server_event_input_audio_buffer_speech_started_2 = realtime_server_event_input_audio_buffer_speech_started_convertToJSON(realtime_server_event_input_audio_buffer_speech_started_2);
	printf("repeating realtime_server_event_input_audio_buffer_speech_started:\n%s\n", cJSON_Print(jsonrealtime_server_event_input_audio_buffer_speech_started_2));
}

int main() {
  test_realtime_server_event_input_audio_buffer_speech_started(1);
  test_realtime_server_event_input_audio_buffer_speech_started(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_input_audio_buffer_speech_started_MAIN
#endif // realtime_server_event_input_audio_buffer_speech_started_TEST
