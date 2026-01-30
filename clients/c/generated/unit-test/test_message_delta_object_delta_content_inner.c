#ifndef message_delta_object_delta_content_inner_TEST
#define message_delta_object_delta_content_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_delta_object_delta_content_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_delta_object_delta_content_inner.h"
message_delta_object_delta_content_inner_t* instantiate_message_delta_object_delta_content_inner(int include_optional);

#include "test_message_delta_content_image_file_object_image_file.c"
#include "test_message_delta_content_text_object_text.c"
#include "test_message_delta_content_image_url_object_image_url.c"


message_delta_object_delta_content_inner_t* instantiate_message_delta_object_delta_content_inner(int include_optional) {
  message_delta_object_delta_content_inner_t* message_delta_object_delta_content_inner = NULL;
  if (include_optional) {
    message_delta_object_delta_content_inner = message_delta_object_delta_content_inner_create(
      56,
      openai_api_message_delta_object_delta_content_inner_TYPE_image_file,
       // false, not to have infinite recursion
      instantiate_message_delta_content_image_file_object_image_file(0),
       // false, not to have infinite recursion
      instantiate_message_delta_content_text_object_text(0),
      "0",
       // false, not to have infinite recursion
      instantiate_message_delta_content_image_url_object_image_url(0)
    );
  } else {
    message_delta_object_delta_content_inner = message_delta_object_delta_content_inner_create(
      56,
      openai_api_message_delta_object_delta_content_inner_TYPE_image_file,
      NULL,
      NULL,
      "0",
      NULL
    );
  }

  return message_delta_object_delta_content_inner;
}


#ifdef message_delta_object_delta_content_inner_MAIN

void test_message_delta_object_delta_content_inner(int include_optional) {
    message_delta_object_delta_content_inner_t* message_delta_object_delta_content_inner_1 = instantiate_message_delta_object_delta_content_inner(include_optional);

	cJSON* jsonmessage_delta_object_delta_content_inner_1 = message_delta_object_delta_content_inner_convertToJSON(message_delta_object_delta_content_inner_1);
	printf("message_delta_object_delta_content_inner :\n%s\n", cJSON_Print(jsonmessage_delta_object_delta_content_inner_1));
	message_delta_object_delta_content_inner_t* message_delta_object_delta_content_inner_2 = message_delta_object_delta_content_inner_parseFromJSON(jsonmessage_delta_object_delta_content_inner_1);
	cJSON* jsonmessage_delta_object_delta_content_inner_2 = message_delta_object_delta_content_inner_convertToJSON(message_delta_object_delta_content_inner_2);
	printf("repeating message_delta_object_delta_content_inner:\n%s\n", cJSON_Print(jsonmessage_delta_object_delta_content_inner_2));
}

int main() {
  test_message_delta_object_delta_content_inner(1);
  test_message_delta_object_delta_content_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_delta_object_delta_content_inner_MAIN
#endif // message_delta_object_delta_content_inner_TEST
