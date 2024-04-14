#ifndef message_delta_content_text_annotations_file_path_object_TEST
#define message_delta_content_text_annotations_file_path_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_delta_content_text_annotations_file_path_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_delta_content_text_annotations_file_path_object.h"
message_delta_content_text_annotations_file_path_object_t* instantiate_message_delta_content_text_annotations_file_path_object(int include_optional);

#include "test_message_delta_content_text_annotations_file_path_object_file_path.c"


message_delta_content_text_annotations_file_path_object_t* instantiate_message_delta_content_text_annotations_file_path_object(int include_optional) {
  message_delta_content_text_annotations_file_path_object_t* message_delta_content_text_annotations_file_path_object = NULL;
  if (include_optional) {
    message_delta_content_text_annotations_file_path_object = message_delta_content_text_annotations_file_path_object_create(
      56,
      openai_api_message_delta_content_text_annotations_file_path_object_TYPE_file_path,
      "0",
       // false, not to have infinite recursion
      instantiate_message_delta_content_text_annotations_file_path_object_file_path(0),
      0,
      0
    );
  } else {
    message_delta_content_text_annotations_file_path_object = message_delta_content_text_annotations_file_path_object_create(
      56,
      openai_api_message_delta_content_text_annotations_file_path_object_TYPE_file_path,
      "0",
      NULL,
      0,
      0
    );
  }

  return message_delta_content_text_annotations_file_path_object;
}


#ifdef message_delta_content_text_annotations_file_path_object_MAIN

void test_message_delta_content_text_annotations_file_path_object(int include_optional) {
    message_delta_content_text_annotations_file_path_object_t* message_delta_content_text_annotations_file_path_object_1 = instantiate_message_delta_content_text_annotations_file_path_object(include_optional);

	cJSON* jsonmessage_delta_content_text_annotations_file_path_object_1 = message_delta_content_text_annotations_file_path_object_convertToJSON(message_delta_content_text_annotations_file_path_object_1);
	printf("message_delta_content_text_annotations_file_path_object :\n%s\n", cJSON_Print(jsonmessage_delta_content_text_annotations_file_path_object_1));
	message_delta_content_text_annotations_file_path_object_t* message_delta_content_text_annotations_file_path_object_2 = message_delta_content_text_annotations_file_path_object_parseFromJSON(jsonmessage_delta_content_text_annotations_file_path_object_1);
	cJSON* jsonmessage_delta_content_text_annotations_file_path_object_2 = message_delta_content_text_annotations_file_path_object_convertToJSON(message_delta_content_text_annotations_file_path_object_2);
	printf("repeating message_delta_content_text_annotations_file_path_object:\n%s\n", cJSON_Print(jsonmessage_delta_content_text_annotations_file_path_object_2));
}

int main() {
  test_message_delta_content_text_annotations_file_path_object(1);
  test_message_delta_content_text_annotations_file_path_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_delta_content_text_annotations_file_path_object_MAIN
#endif // message_delta_content_text_annotations_file_path_object_TEST
