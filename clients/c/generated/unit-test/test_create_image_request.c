#ifndef create_image_request_TEST
#define create_image_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_image_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_image_request.h"
create_image_request_t* instantiate_create_image_request(int include_optional);

#include "test_create_image_request_model.c"


create_image_request_t* instantiate_create_image_request(int include_optional) {
  create_image_request_t* create_image_request = NULL;
  if (include_optional) {
    create_image_request = create_image_request_create(
      "A cute baby sea otter",
      dall-e-3,
      1,
      openai_api_create_image_request_QUALITY_"standard",
      openai_api_create_image_request_RESPONSEFORMAT_"url",
      openai_api_create_image_request_SIZE_"1024x1024",
      openai_api_create_image_request_STYLE_"vivid",
      "user-1234"
    );
  } else {
    create_image_request = create_image_request_create(
      "A cute baby sea otter",
      dall-e-3,
      1,
      openai_api_create_image_request_QUALITY_"standard",
      openai_api_create_image_request_RESPONSEFORMAT_"url",
      openai_api_create_image_request_SIZE_"1024x1024",
      openai_api_create_image_request_STYLE_"vivid",
      "user-1234"
    );
  }

  return create_image_request;
}


#ifdef create_image_request_MAIN

void test_create_image_request(int include_optional) {
    create_image_request_t* create_image_request_1 = instantiate_create_image_request(include_optional);

	cJSON* jsoncreate_image_request_1 = create_image_request_convertToJSON(create_image_request_1);
	printf("create_image_request :\n%s\n", cJSON_Print(jsoncreate_image_request_1));
	create_image_request_t* create_image_request_2 = create_image_request_parseFromJSON(jsoncreate_image_request_1);
	cJSON* jsoncreate_image_request_2 = create_image_request_convertToJSON(create_image_request_2);
	printf("repeating create_image_request:\n%s\n", cJSON_Print(jsoncreate_image_request_2));
}

int main() {
  test_create_image_request(1);
  test_create_image_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_image_request_MAIN
#endif // create_image_request_TEST
