#ifndef realtime_server_event_input_audio_buffer_cleared_TEST
#define realtime_server_event_input_audio_buffer_cleared_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_input_audio_buffer_cleared_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_input_audio_buffer_cleared.h"
realtime_server_event_input_audio_buffer_cleared_t* instantiate_realtime_server_event_input_audio_buffer_cleared(int include_optional);



realtime_server_event_input_audio_buffer_cleared_t* instantiate_realtime_server_event_input_audio_buffer_cleared(int include_optional) {
  realtime_server_event_input_audio_buffer_cleared_t* realtime_server_event_input_audio_buffer_cleared = NULL;
  if (include_optional) {
    realtime_server_event_input_audio_buffer_cleared = realtime_server_event_input_audio_buffer_cleared_create(
      "0",
      openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_input_audio_buffer.cleared
    );
  } else {
    realtime_server_event_input_audio_buffer_cleared = realtime_server_event_input_audio_buffer_cleared_create(
      "0",
      openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_input_audio_buffer.cleared
    );
  }

  return realtime_server_event_input_audio_buffer_cleared;
}


#ifdef realtime_server_event_input_audio_buffer_cleared_MAIN

void test_realtime_server_event_input_audio_buffer_cleared(int include_optional) {
    realtime_server_event_input_audio_buffer_cleared_t* realtime_server_event_input_audio_buffer_cleared_1 = instantiate_realtime_server_event_input_audio_buffer_cleared(include_optional);

	cJSON* jsonrealtime_server_event_input_audio_buffer_cleared_1 = realtime_server_event_input_audio_buffer_cleared_convertToJSON(realtime_server_event_input_audio_buffer_cleared_1);
	printf("realtime_server_event_input_audio_buffer_cleared :\n%s\n", cJSON_Print(jsonrealtime_server_event_input_audio_buffer_cleared_1));
	realtime_server_event_input_audio_buffer_cleared_t* realtime_server_event_input_audio_buffer_cleared_2 = realtime_server_event_input_audio_buffer_cleared_parseFromJSON(jsonrealtime_server_event_input_audio_buffer_cleared_1);
	cJSON* jsonrealtime_server_event_input_audio_buffer_cleared_2 = realtime_server_event_input_audio_buffer_cleared_convertToJSON(realtime_server_event_input_audio_buffer_cleared_2);
	printf("repeating realtime_server_event_input_audio_buffer_cleared:\n%s\n", cJSON_Print(jsonrealtime_server_event_input_audio_buffer_cleared_2));
}

int main() {
  test_realtime_server_event_input_audio_buffer_cleared(1);
  test_realtime_server_event_input_audio_buffer_cleared(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_input_audio_buffer_cleared_MAIN
#endif // realtime_server_event_input_audio_buffer_cleared_TEST
