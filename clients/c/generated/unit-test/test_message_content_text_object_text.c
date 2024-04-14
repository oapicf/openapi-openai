#ifndef message_content_text_object_text_TEST
#define message_content_text_object_text_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_content_text_object_text_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_content_text_object_text.h"
message_content_text_object_text_t* instantiate_message_content_text_object_text(int include_optional);



message_content_text_object_text_t* instantiate_message_content_text_object_text(int include_optional) {
  message_content_text_object_text_t* message_content_text_object_text = NULL;
  if (include_optional) {
    message_content_text_object_text = message_content_text_object_text_create(
      "0",
      list_createList()
    );
  } else {
    message_content_text_object_text = message_content_text_object_text_create(
      "0",
      list_createList()
    );
  }

  return message_content_text_object_text;
}


#ifdef message_content_text_object_text_MAIN

void test_message_content_text_object_text(int include_optional) {
    message_content_text_object_text_t* message_content_text_object_text_1 = instantiate_message_content_text_object_text(include_optional);

	cJSON* jsonmessage_content_text_object_text_1 = message_content_text_object_text_convertToJSON(message_content_text_object_text_1);
	printf("message_content_text_object_text :\n%s\n", cJSON_Print(jsonmessage_content_text_object_text_1));
	message_content_text_object_text_t* message_content_text_object_text_2 = message_content_text_object_text_parseFromJSON(jsonmessage_content_text_object_text_1);
	cJSON* jsonmessage_content_text_object_text_2 = message_content_text_object_text_convertToJSON(message_content_text_object_text_2);
	printf("repeating message_content_text_object_text:\n%s\n", cJSON_Print(jsonmessage_content_text_object_text_2));
}

int main() {
  test_message_content_text_object_text(1);
  test_message_content_text_object_text(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_content_text_object_text_MAIN
#endif // message_content_text_object_text_TEST
