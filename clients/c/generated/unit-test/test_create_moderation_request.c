#ifndef create_moderation_request_TEST
#define create_moderation_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_moderation_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_moderation_request.h"
create_moderation_request_t* instantiate_create_moderation_request(int include_optional);

#include "test_create_moderation_request_input.c"
#include "test_create_moderation_request_model.c"


create_moderation_request_t* instantiate_create_moderation_request(int include_optional) {
  create_moderation_request_t* create_moderation_request = NULL;
  if (include_optional) {
    create_moderation_request = create_moderation_request_create(
      null,
      text-moderation-stable
    );
  } else {
    create_moderation_request = create_moderation_request_create(
      null,
      text-moderation-stable
    );
  }

  return create_moderation_request;
}


#ifdef create_moderation_request_MAIN

void test_create_moderation_request(int include_optional) {
    create_moderation_request_t* create_moderation_request_1 = instantiate_create_moderation_request(include_optional);

	cJSON* jsoncreate_moderation_request_1 = create_moderation_request_convertToJSON(create_moderation_request_1);
	printf("create_moderation_request :\n%s\n", cJSON_Print(jsoncreate_moderation_request_1));
	create_moderation_request_t* create_moderation_request_2 = create_moderation_request_parseFromJSON(jsoncreate_moderation_request_1);
	cJSON* jsoncreate_moderation_request_2 = create_moderation_request_convertToJSON(create_moderation_request_2);
	printf("repeating create_moderation_request:\n%s\n", cJSON_Print(jsoncreate_moderation_request_2));
}

int main() {
  test_create_moderation_request(1);
  test_create_moderation_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_moderation_request_MAIN
#endif // create_moderation_request_TEST
