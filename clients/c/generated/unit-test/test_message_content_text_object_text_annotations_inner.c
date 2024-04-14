#ifndef message_content_text_object_text_annotations_inner_TEST
#define message_content_text_object_text_annotations_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_content_text_object_text_annotations_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_content_text_object_text_annotations_inner.h"
message_content_text_object_text_annotations_inner_t* instantiate_message_content_text_object_text_annotations_inner(int include_optional);

#include "test_message_content_text_annotations_file_citation_object_file_citation.c"
#include "test_message_content_text_annotations_file_path_object_file_path.c"


message_content_text_object_text_annotations_inner_t* instantiate_message_content_text_object_text_annotations_inner(int include_optional) {
  message_content_text_object_text_annotations_inner_t* message_content_text_object_text_annotations_inner = NULL;
  if (include_optional) {
    message_content_text_object_text_annotations_inner = message_content_text_object_text_annotations_inner_create(
      openai_api_message_content_text_object_text_annotations_inner_TYPE_file_citation,
      "0",
       // false, not to have infinite recursion
      instantiate_message_content_text_annotations_file_citation_object_file_citation(0),
      0,
      0,
       // false, not to have infinite recursion
      instantiate_message_content_text_annotations_file_path_object_file_path(0)
    );
  } else {
    message_content_text_object_text_annotations_inner = message_content_text_object_text_annotations_inner_create(
      openai_api_message_content_text_object_text_annotations_inner_TYPE_file_citation,
      "0",
      NULL,
      0,
      0,
      NULL
    );
  }

  return message_content_text_object_text_annotations_inner;
}


#ifdef message_content_text_object_text_annotations_inner_MAIN

void test_message_content_text_object_text_annotations_inner(int include_optional) {
    message_content_text_object_text_annotations_inner_t* message_content_text_object_text_annotations_inner_1 = instantiate_message_content_text_object_text_annotations_inner(include_optional);

	cJSON* jsonmessage_content_text_object_text_annotations_inner_1 = message_content_text_object_text_annotations_inner_convertToJSON(message_content_text_object_text_annotations_inner_1);
	printf("message_content_text_object_text_annotations_inner :\n%s\n", cJSON_Print(jsonmessage_content_text_object_text_annotations_inner_1));
	message_content_text_object_text_annotations_inner_t* message_content_text_object_text_annotations_inner_2 = message_content_text_object_text_annotations_inner_parseFromJSON(jsonmessage_content_text_object_text_annotations_inner_1);
	cJSON* jsonmessage_content_text_object_text_annotations_inner_2 = message_content_text_object_text_annotations_inner_convertToJSON(message_content_text_object_text_annotations_inner_2);
	printf("repeating message_content_text_object_text_annotations_inner:\n%s\n", cJSON_Print(jsonmessage_content_text_object_text_annotations_inner_2));
}

int main() {
  test_message_content_text_object_text_annotations_inner(1);
  test_message_content_text_object_text_annotations_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_content_text_object_text_annotations_inner_MAIN
#endif // message_content_text_object_text_annotations_inner_TEST
