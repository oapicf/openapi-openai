#ifndef message_delta_content_image_file_object_image_file_TEST
#define message_delta_content_image_file_object_image_file_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_delta_content_image_file_object_image_file_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_delta_content_image_file_object_image_file.h"
message_delta_content_image_file_object_image_file_t* instantiate_message_delta_content_image_file_object_image_file(int include_optional);



message_delta_content_image_file_object_image_file_t* instantiate_message_delta_content_image_file_object_image_file(int include_optional) {
  message_delta_content_image_file_object_image_file_t* message_delta_content_image_file_object_image_file = NULL;
  if (include_optional) {
    message_delta_content_image_file_object_image_file = message_delta_content_image_file_object_image_file_create(
      "0"
    );
  } else {
    message_delta_content_image_file_object_image_file = message_delta_content_image_file_object_image_file_create(
      "0"
    );
  }

  return message_delta_content_image_file_object_image_file;
}


#ifdef message_delta_content_image_file_object_image_file_MAIN

void test_message_delta_content_image_file_object_image_file(int include_optional) {
    message_delta_content_image_file_object_image_file_t* message_delta_content_image_file_object_image_file_1 = instantiate_message_delta_content_image_file_object_image_file(include_optional);

	cJSON* jsonmessage_delta_content_image_file_object_image_file_1 = message_delta_content_image_file_object_image_file_convertToJSON(message_delta_content_image_file_object_image_file_1);
	printf("message_delta_content_image_file_object_image_file :\n%s\n", cJSON_Print(jsonmessage_delta_content_image_file_object_image_file_1));
	message_delta_content_image_file_object_image_file_t* message_delta_content_image_file_object_image_file_2 = message_delta_content_image_file_object_image_file_parseFromJSON(jsonmessage_delta_content_image_file_object_image_file_1);
	cJSON* jsonmessage_delta_content_image_file_object_image_file_2 = message_delta_content_image_file_object_image_file_convertToJSON(message_delta_content_image_file_object_image_file_2);
	printf("repeating message_delta_content_image_file_object_image_file:\n%s\n", cJSON_Print(jsonmessage_delta_content_image_file_object_image_file_2));
}

int main() {
  test_message_delta_content_image_file_object_image_file(1);
  test_message_delta_content_image_file_object_image_file(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_delta_content_image_file_object_image_file_MAIN
#endif // message_delta_content_image_file_object_image_file_TEST
