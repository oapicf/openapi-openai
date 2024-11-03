#ifndef message_file_object_TEST
#define message_file_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_file_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_file_object.h"
message_file_object_t* instantiate_message_file_object(int include_optional);



message_file_object_t* instantiate_message_file_object(int include_optional) {
  message_file_object_t* message_file_object = NULL;
  if (include_optional) {
    message_file_object = message_file_object_create(
      "0",
      openai_api_message_file_object_OBJECT_thread.message.file,
      56,
      "0"
    );
  } else {
    message_file_object = message_file_object_create(
      "0",
      openai_api_message_file_object_OBJECT_thread.message.file,
      56,
      "0"
    );
  }

  return message_file_object;
}


#ifdef message_file_object_MAIN

void test_message_file_object(int include_optional) {
    message_file_object_t* message_file_object_1 = instantiate_message_file_object(include_optional);

	cJSON* jsonmessage_file_object_1 = message_file_object_convertToJSON(message_file_object_1);
	printf("message_file_object :\n%s\n", cJSON_Print(jsonmessage_file_object_1));
	message_file_object_t* message_file_object_2 = message_file_object_parseFromJSON(jsonmessage_file_object_1);
	cJSON* jsonmessage_file_object_2 = message_file_object_convertToJSON(message_file_object_2);
	printf("repeating message_file_object:\n%s\n", cJSON_Print(jsonmessage_file_object_2));
}

int main() {
  test_message_file_object(1);
  test_message_file_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_file_object_MAIN
#endif // message_file_object_TEST
