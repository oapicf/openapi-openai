#ifndef realtime_server_event_input_audio_buffer_speech_stopped_TEST
#define realtime_server_event_input_audio_buffer_speech_stopped_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_input_audio_buffer_speech_stopped_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_input_audio_buffer_speech_stopped.h"
realtime_server_event_input_audio_buffer_speech_stopped_t* instantiate_realtime_server_event_input_audio_buffer_speech_stopped(int include_optional);



realtime_server_event_input_audio_buffer_speech_stopped_t* instantiate_realtime_server_event_input_audio_buffer_speech_stopped(int include_optional) {
  realtime_server_event_input_audio_buffer_speech_stopped_t* realtime_server_event_input_audio_buffer_speech_stopped = NULL;
  if (include_optional) {
    realtime_server_event_input_audio_buffer_speech_stopped = realtime_server_event_input_audio_buffer_speech_stopped_create(
      "0",
      openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_input_audio_buffer.speech_stopped,
      56,
      "0"
    );
  } else {
    realtime_server_event_input_audio_buffer_speech_stopped = realtime_server_event_input_audio_buffer_speech_stopped_create(
      "0",
      openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_input_audio_buffer.speech_stopped,
      56,
      "0"
    );
  }

  return realtime_server_event_input_audio_buffer_speech_stopped;
}


#ifdef realtime_server_event_input_audio_buffer_speech_stopped_MAIN

void test_realtime_server_event_input_audio_buffer_speech_stopped(int include_optional) {
    realtime_server_event_input_audio_buffer_speech_stopped_t* realtime_server_event_input_audio_buffer_speech_stopped_1 = instantiate_realtime_server_event_input_audio_buffer_speech_stopped(include_optional);

	cJSON* jsonrealtime_server_event_input_audio_buffer_speech_stopped_1 = realtime_server_event_input_audio_buffer_speech_stopped_convertToJSON(realtime_server_event_input_audio_buffer_speech_stopped_1);
	printf("realtime_server_event_input_audio_buffer_speech_stopped :\n%s\n", cJSON_Print(jsonrealtime_server_event_input_audio_buffer_speech_stopped_1));
	realtime_server_event_input_audio_buffer_speech_stopped_t* realtime_server_event_input_audio_buffer_speech_stopped_2 = realtime_server_event_input_audio_buffer_speech_stopped_parseFromJSON(jsonrealtime_server_event_input_audio_buffer_speech_stopped_1);
	cJSON* jsonrealtime_server_event_input_audio_buffer_speech_stopped_2 = realtime_server_event_input_audio_buffer_speech_stopped_convertToJSON(realtime_server_event_input_audio_buffer_speech_stopped_2);
	printf("repeating realtime_server_event_input_audio_buffer_speech_stopped:\n%s\n", cJSON_Print(jsonrealtime_server_event_input_audio_buffer_speech_stopped_2));
}

int main() {
  test_realtime_server_event_input_audio_buffer_speech_stopped(1);
  test_realtime_server_event_input_audio_buffer_speech_stopped(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_input_audio_buffer_speech_stopped_MAIN
#endif // realtime_server_event_input_audio_buffer_speech_stopped_TEST
