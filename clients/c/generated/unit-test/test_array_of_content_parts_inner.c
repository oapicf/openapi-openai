#ifndef array_of_content_parts_inner_TEST
#define array_of_content_parts_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define array_of_content_parts_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/array_of_content_parts_inner.h"
array_of_content_parts_inner_t* instantiate_array_of_content_parts_inner(int include_optional);

#include "test_message_content_image_file_object_image_file.c"
#include "test_message_content_image_url_object_image_url.c"


array_of_content_parts_inner_t* instantiate_array_of_content_parts_inner(int include_optional) {
  array_of_content_parts_inner_t* array_of_content_parts_inner = NULL;
  if (include_optional) {
    array_of_content_parts_inner = array_of_content_parts_inner_create(
      openai_api_array_of_content_parts_inner_TYPE_image_file,
       // false, not to have infinite recursion
      instantiate_message_content_image_file_object_image_file(0),
       // false, not to have infinite recursion
      instantiate_message_content_image_url_object_image_url(0),
      "0"
    );
  } else {
    array_of_content_parts_inner = array_of_content_parts_inner_create(
      openai_api_array_of_content_parts_inner_TYPE_image_file,
      NULL,
      NULL,
      "0"
    );
  }

  return array_of_content_parts_inner;
}


#ifdef array_of_content_parts_inner_MAIN

void test_array_of_content_parts_inner(int include_optional) {
    array_of_content_parts_inner_t* array_of_content_parts_inner_1 = instantiate_array_of_content_parts_inner(include_optional);

	cJSON* jsonarray_of_content_parts_inner_1 = array_of_content_parts_inner_convertToJSON(array_of_content_parts_inner_1);
	printf("array_of_content_parts_inner :\n%s\n", cJSON_Print(jsonarray_of_content_parts_inner_1));
	array_of_content_parts_inner_t* array_of_content_parts_inner_2 = array_of_content_parts_inner_parseFromJSON(jsonarray_of_content_parts_inner_1);
	cJSON* jsonarray_of_content_parts_inner_2 = array_of_content_parts_inner_convertToJSON(array_of_content_parts_inner_2);
	printf("repeating array_of_content_parts_inner:\n%s\n", cJSON_Print(jsonarray_of_content_parts_inner_2));
}

int main() {
  test_array_of_content_parts_inner(1);
  test_array_of_content_parts_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // array_of_content_parts_inner_MAIN
#endif // array_of_content_parts_inner_TEST
