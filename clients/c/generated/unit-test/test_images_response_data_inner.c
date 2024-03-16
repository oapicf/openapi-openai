#ifndef images_response_data_inner_TEST
#define images_response_data_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define images_response_data_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/images_response_data_inner.h"
images_response_data_inner_t* instantiate_images_response_data_inner(int include_optional);



images_response_data_inner_t* instantiate_images_response_data_inner(int include_optional) {
  images_response_data_inner_t* images_response_data_inner = NULL;
  if (include_optional) {
    images_response_data_inner = images_response_data_inner_create(
      "0",
      "0"
    );
  } else {
    images_response_data_inner = images_response_data_inner_create(
      "0",
      "0"
    );
  }

  return images_response_data_inner;
}


#ifdef images_response_data_inner_MAIN

void test_images_response_data_inner(int include_optional) {
    images_response_data_inner_t* images_response_data_inner_1 = instantiate_images_response_data_inner(include_optional);

	cJSON* jsonimages_response_data_inner_1 = images_response_data_inner_convertToJSON(images_response_data_inner_1);
	printf("images_response_data_inner :\n%s\n", cJSON_Print(jsonimages_response_data_inner_1));
	images_response_data_inner_t* images_response_data_inner_2 = images_response_data_inner_parseFromJSON(jsonimages_response_data_inner_1);
	cJSON* jsonimages_response_data_inner_2 = images_response_data_inner_convertToJSON(images_response_data_inner_2);
	printf("repeating images_response_data_inner:\n%s\n", cJSON_Print(jsonimages_response_data_inner_2));
}

int main() {
  test_images_response_data_inner(1);
  test_images_response_data_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // images_response_data_inner_MAIN
#endif // images_response_data_inner_TEST
