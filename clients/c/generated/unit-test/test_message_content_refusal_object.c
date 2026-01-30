#ifndef message_content_refusal_object_TEST
#define message_content_refusal_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_content_refusal_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_content_refusal_object.h"
message_content_refusal_object_t* instantiate_message_content_refusal_object(int include_optional);



message_content_refusal_object_t* instantiate_message_content_refusal_object(int include_optional) {
  message_content_refusal_object_t* message_content_refusal_object = NULL;
  if (include_optional) {
    message_content_refusal_object = message_content_refusal_object_create(
      openai_api_message_content_refusal_object_TYPE_refusal,
      "0"
    );
  } else {
    message_content_refusal_object = message_content_refusal_object_create(
      openai_api_message_content_refusal_object_TYPE_refusal,
      "0"
    );
  }

  return message_content_refusal_object;
}


#ifdef message_content_refusal_object_MAIN

void test_message_content_refusal_object(int include_optional) {
    message_content_refusal_object_t* message_content_refusal_object_1 = instantiate_message_content_refusal_object(include_optional);

	cJSON* jsonmessage_content_refusal_object_1 = message_content_refusal_object_convertToJSON(message_content_refusal_object_1);
	printf("message_content_refusal_object :\n%s\n", cJSON_Print(jsonmessage_content_refusal_object_1));
	message_content_refusal_object_t* message_content_refusal_object_2 = message_content_refusal_object_parseFromJSON(jsonmessage_content_refusal_object_1);
	cJSON* jsonmessage_content_refusal_object_2 = message_content_refusal_object_convertToJSON(message_content_refusal_object_2);
	printf("repeating message_content_refusal_object:\n%s\n", cJSON_Print(jsonmessage_content_refusal_object_2));
}

int main() {
  test_message_content_refusal_object(1);
  test_message_content_refusal_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_content_refusal_object_MAIN
#endif // message_content_refusal_object_TEST
