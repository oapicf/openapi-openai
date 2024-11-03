#ifndef create_moderation_request_input_TEST
#define create_moderation_request_input_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_moderation_request_input_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_moderation_request_input.h"
create_moderation_request_input_t* instantiate_create_moderation_request_input(int include_optional);



create_moderation_request_input_t* instantiate_create_moderation_request_input(int include_optional) {
  create_moderation_request_input_t* create_moderation_request_input = NULL;
  if (include_optional) {
    create_moderation_request_input = create_moderation_request_input_create(
    );
  } else {
    create_moderation_request_input = create_moderation_request_input_create(
    );
  }

  return create_moderation_request_input;
}


#ifdef create_moderation_request_input_MAIN

void test_create_moderation_request_input(int include_optional) {
    create_moderation_request_input_t* create_moderation_request_input_1 = instantiate_create_moderation_request_input(include_optional);

	cJSON* jsoncreate_moderation_request_input_1 = create_moderation_request_input_convertToJSON(create_moderation_request_input_1);
	printf("create_moderation_request_input :\n%s\n", cJSON_Print(jsoncreate_moderation_request_input_1));
	create_moderation_request_input_t* create_moderation_request_input_2 = create_moderation_request_input_parseFromJSON(jsoncreate_moderation_request_input_1);
	cJSON* jsoncreate_moderation_request_input_2 = create_moderation_request_input_convertToJSON(create_moderation_request_input_2);
	printf("repeating create_moderation_request_input:\n%s\n", cJSON_Print(jsoncreate_moderation_request_input_2));
}

int main() {
  test_create_moderation_request_input(1);
  test_create_moderation_request_input(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_moderation_request_input_MAIN
#endif // create_moderation_request_input_TEST
