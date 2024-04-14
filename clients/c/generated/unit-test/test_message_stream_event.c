#ifndef message_stream_event_TEST
#define message_stream_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_stream_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_stream_event.h"
message_stream_event_t* instantiate_message_stream_event(int include_optional);

#include "test_message_object.c"


message_stream_event_t* instantiate_message_stream_event(int include_optional) {
  message_stream_event_t* message_stream_event = NULL;
  if (include_optional) {
    message_stream_event = message_stream_event_create(
      openai_api_message_stream_event_EVENT_thread.message.incomplete,
       // false, not to have infinite recursion
      instantiate_message_object(0)
    );
  } else {
    message_stream_event = message_stream_event_create(
      openai_api_message_stream_event_EVENT_thread.message.incomplete,
      NULL
    );
  }

  return message_stream_event;
}


#ifdef message_stream_event_MAIN

void test_message_stream_event(int include_optional) {
    message_stream_event_t* message_stream_event_1 = instantiate_message_stream_event(include_optional);

	cJSON* jsonmessage_stream_event_1 = message_stream_event_convertToJSON(message_stream_event_1);
	printf("message_stream_event :\n%s\n", cJSON_Print(jsonmessage_stream_event_1));
	message_stream_event_t* message_stream_event_2 = message_stream_event_parseFromJSON(jsonmessage_stream_event_1);
	cJSON* jsonmessage_stream_event_2 = message_stream_event_convertToJSON(message_stream_event_2);
	printf("repeating message_stream_event:\n%s\n", cJSON_Print(jsonmessage_stream_event_2));
}

int main() {
  test_message_stream_event(1);
  test_message_stream_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_stream_event_MAIN
#endif // message_stream_event_TEST
