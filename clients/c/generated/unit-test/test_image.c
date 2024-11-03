#ifndef image_TEST
#define image_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define image_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/image.h"
image_t* instantiate_image(int include_optional);



image_t* instantiate_image(int include_optional) {
  image_t* image = NULL;
  if (include_optional) {
    image = image_create(
      "0",
      "0",
      "0"
    );
  } else {
    image = image_create(
      "0",
      "0",
      "0"
    );
  }

  return image;
}


#ifdef image_MAIN

void test_image(int include_optional) {
    image_t* image_1 = instantiate_image(include_optional);

	cJSON* jsonimage_1 = image_convertToJSON(image_1);
	printf("image :\n%s\n", cJSON_Print(jsonimage_1));
	image_t* image_2 = image_parseFromJSON(jsonimage_1);
	cJSON* jsonimage_2 = image_convertToJSON(image_2);
	printf("repeating image:\n%s\n", cJSON_Print(jsonimage_2));
}

int main() {
  test_image(1);
  test_image(0);

  printf("Hello world \n");
  return 0;
}

#endif // image_MAIN
#endif // image_TEST
