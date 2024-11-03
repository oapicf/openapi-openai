#ifndef message_content_text_object_TEST
#define message_content_text_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_content_text_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_content_text_object.h"
message_content_text_object_t* instantiate_message_content_text_object(int include_optional);

#include "test_message_content_text_object_text.c"


message_content_text_object_t* instantiate_message_content_text_object(int include_optional) {
  message_content_text_object_t* message_content_text_object = NULL;
  if (include_optional) {
    message_content_text_object = message_content_text_object_create(
      openai_api_message_content_text_object_TYPE_text,
       // false, not to have infinite recursion
      instantiate_message_content_text_object_text(0)
    );
  } else {
    message_content_text_object = message_content_text_object_create(
      openai_api_message_content_text_object_TYPE_text,
      NULL
    );
  }

  return message_content_text_object;
}


#ifdef message_content_text_object_MAIN

void test_message_content_text_object(int include_optional) {
    message_content_text_object_t* message_content_text_object_1 = instantiate_message_content_text_object(include_optional);

	cJSON* jsonmessage_content_text_object_1 = message_content_text_object_convertToJSON(message_content_text_object_1);
	printf("message_content_text_object :\n%s\n", cJSON_Print(jsonmessage_content_text_object_1));
	message_content_text_object_t* message_content_text_object_2 = message_content_text_object_parseFromJSON(jsonmessage_content_text_object_1);
	cJSON* jsonmessage_content_text_object_2 = message_content_text_object_convertToJSON(message_content_text_object_2);
	printf("repeating message_content_text_object:\n%s\n", cJSON_Print(jsonmessage_content_text_object_2));
}

int main() {
  test_message_content_text_object(1);
  test_message_content_text_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_content_text_object_MAIN
#endif // message_content_text_object_TEST
