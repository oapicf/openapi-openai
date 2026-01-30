#ifndef realtime_server_event_response_content_part_done_part_TEST
#define realtime_server_event_response_content_part_done_part_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_response_content_part_done_part_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_response_content_part_done_part.h"
realtime_server_event_response_content_part_done_part_t* instantiate_realtime_server_event_response_content_part_done_part(int include_optional);



realtime_server_event_response_content_part_done_part_t* instantiate_realtime_server_event_response_content_part_done_part(int include_optional) {
  realtime_server_event_response_content_part_done_part_t* realtime_server_event_response_content_part_done_part = NULL;
  if (include_optional) {
    realtime_server_event_response_content_part_done_part = realtime_server_event_response_content_part_done_part_create(
      openai_api_realtime_server_event_response_content_part_done_part_TYPE_audio,
      "0",
      "0",
      "0"
    );
  } else {
    realtime_server_event_response_content_part_done_part = realtime_server_event_response_content_part_done_part_create(
      openai_api_realtime_server_event_response_content_part_done_part_TYPE_audio,
      "0",
      "0",
      "0"
    );
  }

  return realtime_server_event_response_content_part_done_part;
}


#ifdef realtime_server_event_response_content_part_done_part_MAIN

void test_realtime_server_event_response_content_part_done_part(int include_optional) {
    realtime_server_event_response_content_part_done_part_t* realtime_server_event_response_content_part_done_part_1 = instantiate_realtime_server_event_response_content_part_done_part(include_optional);

	cJSON* jsonrealtime_server_event_response_content_part_done_part_1 = realtime_server_event_response_content_part_done_part_convertToJSON(realtime_server_event_response_content_part_done_part_1);
	printf("realtime_server_event_response_content_part_done_part :\n%s\n", cJSON_Print(jsonrealtime_server_event_response_content_part_done_part_1));
	realtime_server_event_response_content_part_done_part_t* realtime_server_event_response_content_part_done_part_2 = realtime_server_event_response_content_part_done_part_parseFromJSON(jsonrealtime_server_event_response_content_part_done_part_1);
	cJSON* jsonrealtime_server_event_response_content_part_done_part_2 = realtime_server_event_response_content_part_done_part_convertToJSON(realtime_server_event_response_content_part_done_part_2);
	printf("repeating realtime_server_event_response_content_part_done_part:\n%s\n", cJSON_Print(jsonrealtime_server_event_response_content_part_done_part_2));
}

int main() {
  test_realtime_server_event_response_content_part_done_part(1);
  test_realtime_server_event_response_content_part_done_part(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_response_content_part_done_part_MAIN
#endif // realtime_server_event_response_content_part_done_part_TEST
