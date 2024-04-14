#ifndef message_stream_event_one_of_TEST
#define message_stream_event_one_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_stream_event_one_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_stream_event_one_of.h"
message_stream_event_one_of_t* instantiate_message_stream_event_one_of(int include_optional);

#include "test_message_object.c"


message_stream_event_one_of_t* instantiate_message_stream_event_one_of(int include_optional) {
  message_stream_event_one_of_t* message_stream_event_one_of = NULL;
  if (include_optional) {
    message_stream_event_one_of = message_stream_event_one_of_create(
      openai_api_message_stream_event_one_of_EVENT_thread.message.created,
       // false, not to have infinite recursion
      instantiate_message_object(0)
    );
  } else {
    message_stream_event_one_of = message_stream_event_one_of_create(
      openai_api_message_stream_event_one_of_EVENT_thread.message.created,
      NULL
    );
  }

  return message_stream_event_one_of;
}


#ifdef message_stream_event_one_of_MAIN

void test_message_stream_event_one_of(int include_optional) {
    message_stream_event_one_of_t* message_stream_event_one_of_1 = instantiate_message_stream_event_one_of(include_optional);

	cJSON* jsonmessage_stream_event_one_of_1 = message_stream_event_one_of_convertToJSON(message_stream_event_one_of_1);
	printf("message_stream_event_one_of :\n%s\n", cJSON_Print(jsonmessage_stream_event_one_of_1));
	message_stream_event_one_of_t* message_stream_event_one_of_2 = message_stream_event_one_of_parseFromJSON(jsonmessage_stream_event_one_of_1);
	cJSON* jsonmessage_stream_event_one_of_2 = message_stream_event_one_of_convertToJSON(message_stream_event_one_of_2);
	printf("repeating message_stream_event_one_of:\n%s\n", cJSON_Print(jsonmessage_stream_event_one_of_2));
}

int main() {
  test_message_stream_event_one_of(1);
  test_message_stream_event_one_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_stream_event_one_of_MAIN
#endif // message_stream_event_one_of_TEST
