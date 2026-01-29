#ifndef message_stream_event_one_of_3_TEST
#define message_stream_event_one_of_3_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_stream_event_one_of_3_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_stream_event_one_of_3.h"
message_stream_event_one_of_3_t* instantiate_message_stream_event_one_of_3(int include_optional);

#include "test_message_object.c"


message_stream_event_one_of_3_t* instantiate_message_stream_event_one_of_3(int include_optional) {
  message_stream_event_one_of_3_t* message_stream_event_one_of_3 = NULL;
  if (include_optional) {
    message_stream_event_one_of_3 = message_stream_event_one_of_3_create(
      openai_api_message_stream_event_one_of_3_EVENT_thread.message.completed,
       // false, not to have infinite recursion
      instantiate_message_object(0)
    );
  } else {
    message_stream_event_one_of_3 = message_stream_event_one_of_3_create(
      openai_api_message_stream_event_one_of_3_EVENT_thread.message.completed,
      NULL
    );
  }

  return message_stream_event_one_of_3;
}


#ifdef message_stream_event_one_of_3_MAIN

void test_message_stream_event_one_of_3(int include_optional) {
    message_stream_event_one_of_3_t* message_stream_event_one_of_3_1 = instantiate_message_stream_event_one_of_3(include_optional);

	cJSON* jsonmessage_stream_event_one_of_3_1 = message_stream_event_one_of_3_convertToJSON(message_stream_event_one_of_3_1);
	printf("message_stream_event_one_of_3 :\n%s\n", cJSON_Print(jsonmessage_stream_event_one_of_3_1));
	message_stream_event_one_of_3_t* message_stream_event_one_of_3_2 = message_stream_event_one_of_3_parseFromJSON(jsonmessage_stream_event_one_of_3_1);
	cJSON* jsonmessage_stream_event_one_of_3_2 = message_stream_event_one_of_3_convertToJSON(message_stream_event_one_of_3_2);
	printf("repeating message_stream_event_one_of_3:\n%s\n", cJSON_Print(jsonmessage_stream_event_one_of_3_2));
}

int main() {
  test_message_stream_event_one_of_3(1);
  test_message_stream_event_one_of_3(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_stream_event_one_of_3_MAIN
#endif // message_stream_event_one_of_3_TEST
