#ifndef create_moderation_request_input_one_of_inner_one_of_image_url_TEST
#define create_moderation_request_input_one_of_inner_one_of_image_url_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_moderation_request_input_one_of_inner_one_of_image_url_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_moderation_request_input_one_of_inner_one_of_image_url.h"
create_moderation_request_input_one_of_inner_one_of_image_url_t* instantiate_create_moderation_request_input_one_of_inner_one_of_image_url(int include_optional);



create_moderation_request_input_one_of_inner_one_of_image_url_t* instantiate_create_moderation_request_input_one_of_inner_one_of_image_url(int include_optional) {
  create_moderation_request_input_one_of_inner_one_of_image_url_t* create_moderation_request_input_one_of_inner_one_of_image_url = NULL;
  if (include_optional) {
    create_moderation_request_input_one_of_inner_one_of_image_url = create_moderation_request_input_one_of_inner_one_of_image_url_create(
      "https://example.com/image.jpg"
    );
  } else {
    create_moderation_request_input_one_of_inner_one_of_image_url = create_moderation_request_input_one_of_inner_one_of_image_url_create(
      "https://example.com/image.jpg"
    );
  }

  return create_moderation_request_input_one_of_inner_one_of_image_url;
}


#ifdef create_moderation_request_input_one_of_inner_one_of_image_url_MAIN

void test_create_moderation_request_input_one_of_inner_one_of_image_url(int include_optional) {
    create_moderation_request_input_one_of_inner_one_of_image_url_t* create_moderation_request_input_one_of_inner_one_of_image_url_1 = instantiate_create_moderation_request_input_one_of_inner_one_of_image_url(include_optional);

	cJSON* jsoncreate_moderation_request_input_one_of_inner_one_of_image_url_1 = create_moderation_request_input_one_of_inner_one_of_image_url_convertToJSON(create_moderation_request_input_one_of_inner_one_of_image_url_1);
	printf("create_moderation_request_input_one_of_inner_one_of_image_url :\n%s\n", cJSON_Print(jsoncreate_moderation_request_input_one_of_inner_one_of_image_url_1));
	create_moderation_request_input_one_of_inner_one_of_image_url_t* create_moderation_request_input_one_of_inner_one_of_image_url_2 = create_moderation_request_input_one_of_inner_one_of_image_url_parseFromJSON(jsoncreate_moderation_request_input_one_of_inner_one_of_image_url_1);
	cJSON* jsoncreate_moderation_request_input_one_of_inner_one_of_image_url_2 = create_moderation_request_input_one_of_inner_one_of_image_url_convertToJSON(create_moderation_request_input_one_of_inner_one_of_image_url_2);
	printf("repeating create_moderation_request_input_one_of_inner_one_of_image_url:\n%s\n", cJSON_Print(jsoncreate_moderation_request_input_one_of_inner_one_of_image_url_2));
}

int main() {
  test_create_moderation_request_input_one_of_inner_one_of_image_url(1);
  test_create_moderation_request_input_one_of_inner_one_of_image_url(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_moderation_request_input_one_of_inner_one_of_image_url_MAIN
#endif // create_moderation_request_input_one_of_inner_one_of_image_url_TEST
