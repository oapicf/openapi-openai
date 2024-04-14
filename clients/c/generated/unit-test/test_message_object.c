#ifndef message_object_TEST
#define message_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_object.h"
message_object_t* instantiate_message_object(int include_optional);

#include "test_message_object_incomplete_details.c"


message_object_t* instantiate_message_object(int include_optional) {
  message_object_t* message_object = NULL;
  if (include_optional) {
    message_object = message_object_create(
      "0",
      openai_api_message_object_OBJECT_thread.message,
      56,
      "0",
      openai_api_message_object_STATUS_in_progress,
       // false, not to have infinite recursion
      instantiate_message_object_incomplete_details(0),
      56,
      56,
      openai_api_message_object_ROLE_user,
      list_createList(),
      "0",
      "0",
      list_createList(),
      0
    );
  } else {
    message_object = message_object_create(
      "0",
      openai_api_message_object_OBJECT_thread.message,
      56,
      "0",
      openai_api_message_object_STATUS_in_progress,
      NULL,
      56,
      56,
      openai_api_message_object_ROLE_user,
      list_createList(),
      "0",
      "0",
      list_createList(),
      0
    );
  }

  return message_object;
}


#ifdef message_object_MAIN

void test_message_object(int include_optional) {
    message_object_t* message_object_1 = instantiate_message_object(include_optional);

	cJSON* jsonmessage_object_1 = message_object_convertToJSON(message_object_1);
	printf("message_object :\n%s\n", cJSON_Print(jsonmessage_object_1));
	message_object_t* message_object_2 = message_object_parseFromJSON(jsonmessage_object_1);
	cJSON* jsonmessage_object_2 = message_object_convertToJSON(message_object_2);
	printf("repeating message_object:\n%s\n", cJSON_Print(jsonmessage_object_2));
}

int main() {
  test_message_object(1);
  test_message_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_object_MAIN
#endif // message_object_TEST
