#ifndef message_request_content_text_object_TEST
#define message_request_content_text_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_request_content_text_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_request_content_text_object.h"
message_request_content_text_object_t* instantiate_message_request_content_text_object(int include_optional);



message_request_content_text_object_t* instantiate_message_request_content_text_object(int include_optional) {
  message_request_content_text_object_t* message_request_content_text_object = NULL;
  if (include_optional) {
    message_request_content_text_object = message_request_content_text_object_create(
      openai_api_message_request_content_text_object_TYPE_text,
      "0"
    );
  } else {
    message_request_content_text_object = message_request_content_text_object_create(
      openai_api_message_request_content_text_object_TYPE_text,
      "0"
    );
  }

  return message_request_content_text_object;
}


#ifdef message_request_content_text_object_MAIN

void test_message_request_content_text_object(int include_optional) {
    message_request_content_text_object_t* message_request_content_text_object_1 = instantiate_message_request_content_text_object(include_optional);

	cJSON* jsonmessage_request_content_text_object_1 = message_request_content_text_object_convertToJSON(message_request_content_text_object_1);
	printf("message_request_content_text_object :\n%s\n", cJSON_Print(jsonmessage_request_content_text_object_1));
	message_request_content_text_object_t* message_request_content_text_object_2 = message_request_content_text_object_parseFromJSON(jsonmessage_request_content_text_object_1);
	cJSON* jsonmessage_request_content_text_object_2 = message_request_content_text_object_convertToJSON(message_request_content_text_object_2);
	printf("repeating message_request_content_text_object:\n%s\n", cJSON_Print(jsonmessage_request_content_text_object_2));
}

int main() {
  test_message_request_content_text_object(1);
  test_message_request_content_text_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_request_content_text_object_MAIN
#endif // message_request_content_text_object_TEST
