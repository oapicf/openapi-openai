#ifndef realtime_client_event_input_audio_buffer_clear_TEST
#define realtime_client_event_input_audio_buffer_clear_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_client_event_input_audio_buffer_clear_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_client_event_input_audio_buffer_clear.h"
realtime_client_event_input_audio_buffer_clear_t* instantiate_realtime_client_event_input_audio_buffer_clear(int include_optional);



realtime_client_event_input_audio_buffer_clear_t* instantiate_realtime_client_event_input_audio_buffer_clear(int include_optional) {
  realtime_client_event_input_audio_buffer_clear_t* realtime_client_event_input_audio_buffer_clear = NULL;
  if (include_optional) {
    realtime_client_event_input_audio_buffer_clear = realtime_client_event_input_audio_buffer_clear_create(
      "0",
      openai_api_realtime_client_event_input_audio_buffer_clear_TYPE_input_audio_buffer.clear
    );
  } else {
    realtime_client_event_input_audio_buffer_clear = realtime_client_event_input_audio_buffer_clear_create(
      "0",
      openai_api_realtime_client_event_input_audio_buffer_clear_TYPE_input_audio_buffer.clear
    );
  }

  return realtime_client_event_input_audio_buffer_clear;
}


#ifdef realtime_client_event_input_audio_buffer_clear_MAIN

void test_realtime_client_event_input_audio_buffer_clear(int include_optional) {
    realtime_client_event_input_audio_buffer_clear_t* realtime_client_event_input_audio_buffer_clear_1 = instantiate_realtime_client_event_input_audio_buffer_clear(include_optional);

	cJSON* jsonrealtime_client_event_input_audio_buffer_clear_1 = realtime_client_event_input_audio_buffer_clear_convertToJSON(realtime_client_event_input_audio_buffer_clear_1);
	printf("realtime_client_event_input_audio_buffer_clear :\n%s\n", cJSON_Print(jsonrealtime_client_event_input_audio_buffer_clear_1));
	realtime_client_event_input_audio_buffer_clear_t* realtime_client_event_input_audio_buffer_clear_2 = realtime_client_event_input_audio_buffer_clear_parseFromJSON(jsonrealtime_client_event_input_audio_buffer_clear_1);
	cJSON* jsonrealtime_client_event_input_audio_buffer_clear_2 = realtime_client_event_input_audio_buffer_clear_convertToJSON(realtime_client_event_input_audio_buffer_clear_2);
	printf("repeating realtime_client_event_input_audio_buffer_clear:\n%s\n", cJSON_Print(jsonrealtime_client_event_input_audio_buffer_clear_2));
}

int main() {
  test_realtime_client_event_input_audio_buffer_clear(1);
  test_realtime_client_event_input_audio_buffer_clear(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_client_event_input_audio_buffer_clear_MAIN
#endif // realtime_client_event_input_audio_buffer_clear_TEST
