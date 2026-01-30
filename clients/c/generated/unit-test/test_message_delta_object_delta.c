#ifndef message_delta_object_delta_TEST
#define message_delta_object_delta_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_delta_object_delta_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_delta_object_delta.h"
message_delta_object_delta_t* instantiate_message_delta_object_delta(int include_optional);



message_delta_object_delta_t* instantiate_message_delta_object_delta(int include_optional) {
  message_delta_object_delta_t* message_delta_object_delta = NULL;
  if (include_optional) {
    message_delta_object_delta = message_delta_object_delta_create(
      openai_api_message_delta_object_delta_ROLE_user,
      list_createList()
    );
  } else {
    message_delta_object_delta = message_delta_object_delta_create(
      openai_api_message_delta_object_delta_ROLE_user,
      list_createList()
    );
  }

  return message_delta_object_delta;
}


#ifdef message_delta_object_delta_MAIN

void test_message_delta_object_delta(int include_optional) {
    message_delta_object_delta_t* message_delta_object_delta_1 = instantiate_message_delta_object_delta(include_optional);

	cJSON* jsonmessage_delta_object_delta_1 = message_delta_object_delta_convertToJSON(message_delta_object_delta_1);
	printf("message_delta_object_delta :\n%s\n", cJSON_Print(jsonmessage_delta_object_delta_1));
	message_delta_object_delta_t* message_delta_object_delta_2 = message_delta_object_delta_parseFromJSON(jsonmessage_delta_object_delta_1);
	cJSON* jsonmessage_delta_object_delta_2 = message_delta_object_delta_convertToJSON(message_delta_object_delta_2);
	printf("repeating message_delta_object_delta:\n%s\n", cJSON_Print(jsonmessage_delta_object_delta_2));
}

int main() {
  test_message_delta_object_delta(1);
  test_message_delta_object_delta(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_delta_object_delta_MAIN
#endif // message_delta_object_delta_TEST
