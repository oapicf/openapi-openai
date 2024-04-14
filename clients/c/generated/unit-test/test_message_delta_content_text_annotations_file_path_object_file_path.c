#ifndef message_delta_content_text_annotations_file_path_object_file_path_TEST
#define message_delta_content_text_annotations_file_path_object_file_path_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_delta_content_text_annotations_file_path_object_file_path_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_delta_content_text_annotations_file_path_object_file_path.h"
message_delta_content_text_annotations_file_path_object_file_path_t* instantiate_message_delta_content_text_annotations_file_path_object_file_path(int include_optional);



message_delta_content_text_annotations_file_path_object_file_path_t* instantiate_message_delta_content_text_annotations_file_path_object_file_path(int include_optional) {
  message_delta_content_text_annotations_file_path_object_file_path_t* message_delta_content_text_annotations_file_path_object_file_path = NULL;
  if (include_optional) {
    message_delta_content_text_annotations_file_path_object_file_path = message_delta_content_text_annotations_file_path_object_file_path_create(
      "0"
    );
  } else {
    message_delta_content_text_annotations_file_path_object_file_path = message_delta_content_text_annotations_file_path_object_file_path_create(
      "0"
    );
  }

  return message_delta_content_text_annotations_file_path_object_file_path;
}


#ifdef message_delta_content_text_annotations_file_path_object_file_path_MAIN

void test_message_delta_content_text_annotations_file_path_object_file_path(int include_optional) {
    message_delta_content_text_annotations_file_path_object_file_path_t* message_delta_content_text_annotations_file_path_object_file_path_1 = instantiate_message_delta_content_text_annotations_file_path_object_file_path(include_optional);

	cJSON* jsonmessage_delta_content_text_annotations_file_path_object_file_path_1 = message_delta_content_text_annotations_file_path_object_file_path_convertToJSON(message_delta_content_text_annotations_file_path_object_file_path_1);
	printf("message_delta_content_text_annotations_file_path_object_file_path :\n%s\n", cJSON_Print(jsonmessage_delta_content_text_annotations_file_path_object_file_path_1));
	message_delta_content_text_annotations_file_path_object_file_path_t* message_delta_content_text_annotations_file_path_object_file_path_2 = message_delta_content_text_annotations_file_path_object_file_path_parseFromJSON(jsonmessage_delta_content_text_annotations_file_path_object_file_path_1);
	cJSON* jsonmessage_delta_content_text_annotations_file_path_object_file_path_2 = message_delta_content_text_annotations_file_path_object_file_path_convertToJSON(message_delta_content_text_annotations_file_path_object_file_path_2);
	printf("repeating message_delta_content_text_annotations_file_path_object_file_path:\n%s\n", cJSON_Print(jsonmessage_delta_content_text_annotations_file_path_object_file_path_2));
}

int main() {
  test_message_delta_content_text_annotations_file_path_object_file_path(1);
  test_message_delta_content_text_annotations_file_path_object_file_path(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_delta_content_text_annotations_file_path_object_file_path_MAIN
#endif // message_delta_content_text_annotations_file_path_object_file_path_TEST
