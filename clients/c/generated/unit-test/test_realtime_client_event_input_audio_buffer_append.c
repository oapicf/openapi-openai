#ifndef realtime_client_event_input_audio_buffer_append_TEST
#define realtime_client_event_input_audio_buffer_append_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_client_event_input_audio_buffer_append_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_client_event_input_audio_buffer_append.h"
realtime_client_event_input_audio_buffer_append_t* instantiate_realtime_client_event_input_audio_buffer_append(int include_optional);



realtime_client_event_input_audio_buffer_append_t* instantiate_realtime_client_event_input_audio_buffer_append(int include_optional) {
  realtime_client_event_input_audio_buffer_append_t* realtime_client_event_input_audio_buffer_append = NULL;
  if (include_optional) {
    realtime_client_event_input_audio_buffer_append = realtime_client_event_input_audio_buffer_append_create(
      "0",
      openai_api_realtime_client_event_input_audio_buffer_append_TYPE_input_audio_buffer.append,
      "0"
    );
  } else {
    realtime_client_event_input_audio_buffer_append = realtime_client_event_input_audio_buffer_append_create(
      "0",
      openai_api_realtime_client_event_input_audio_buffer_append_TYPE_input_audio_buffer.append,
      "0"
    );
  }

  return realtime_client_event_input_audio_buffer_append;
}


#ifdef realtime_client_event_input_audio_buffer_append_MAIN

void test_realtime_client_event_input_audio_buffer_append(int include_optional) {
    realtime_client_event_input_audio_buffer_append_t* realtime_client_event_input_audio_buffer_append_1 = instantiate_realtime_client_event_input_audio_buffer_append(include_optional);

	cJSON* jsonrealtime_client_event_input_audio_buffer_append_1 = realtime_client_event_input_audio_buffer_append_convertToJSON(realtime_client_event_input_audio_buffer_append_1);
	printf("realtime_client_event_input_audio_buffer_append :\n%s\n", cJSON_Print(jsonrealtime_client_event_input_audio_buffer_append_1));
	realtime_client_event_input_audio_buffer_append_t* realtime_client_event_input_audio_buffer_append_2 = realtime_client_event_input_audio_buffer_append_parseFromJSON(jsonrealtime_client_event_input_audio_buffer_append_1);
	cJSON* jsonrealtime_client_event_input_audio_buffer_append_2 = realtime_client_event_input_audio_buffer_append_convertToJSON(realtime_client_event_input_audio_buffer_append_2);
	printf("repeating realtime_client_event_input_audio_buffer_append:\n%s\n", cJSON_Print(jsonrealtime_client_event_input_audio_buffer_append_2));
}

int main() {
  test_realtime_client_event_input_audio_buffer_append(1);
  test_realtime_client_event_input_audio_buffer_append(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_client_event_input_audio_buffer_append_MAIN
#endif // realtime_client_event_input_audio_buffer_append_TEST
