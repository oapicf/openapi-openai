#ifndef images_response_TEST
#define images_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define images_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/images_response.h"
images_response_t* instantiate_images_response(int include_optional);



images_response_t* instantiate_images_response(int include_optional) {
  images_response_t* images_response = NULL;
  if (include_optional) {
    images_response = images_response_create(
      56,
      list_createList()
    );
  } else {
    images_response = images_response_create(
      56,
      list_createList()
    );
  }

  return images_response;
}


#ifdef images_response_MAIN

void test_images_response(int include_optional) {
    images_response_t* images_response_1 = instantiate_images_response(include_optional);

	cJSON* jsonimages_response_1 = images_response_convertToJSON(images_response_1);
	printf("images_response :\n%s\n", cJSON_Print(jsonimages_response_1));
	images_response_t* images_response_2 = images_response_parseFromJSON(jsonimages_response_1);
	cJSON* jsonimages_response_2 = images_response_convertToJSON(images_response_2);
	printf("repeating images_response:\n%s\n", cJSON_Print(jsonimages_response_2));
}

int main() {
  test_images_response(1);
  test_images_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // images_response_MAIN
#endif // images_response_TEST
