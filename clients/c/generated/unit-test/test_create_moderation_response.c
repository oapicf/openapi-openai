#ifndef create_moderation_response_TEST
#define create_moderation_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_moderation_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_moderation_response.h"
create_moderation_response_t* instantiate_create_moderation_response(int include_optional);



create_moderation_response_t* instantiate_create_moderation_response(int include_optional) {
  create_moderation_response_t* create_moderation_response = NULL;
  if (include_optional) {
    create_moderation_response = create_moderation_response_create(
      "0",
      "0",
      list_createList()
    );
  } else {
    create_moderation_response = create_moderation_response_create(
      "0",
      "0",
      list_createList()
    );
  }

  return create_moderation_response;
}


#ifdef create_moderation_response_MAIN

void test_create_moderation_response(int include_optional) {
    create_moderation_response_t* create_moderation_response_1 = instantiate_create_moderation_response(include_optional);

	cJSON* jsoncreate_moderation_response_1 = create_moderation_response_convertToJSON(create_moderation_response_1);
	printf("create_moderation_response :\n%s\n", cJSON_Print(jsoncreate_moderation_response_1));
	create_moderation_response_t* create_moderation_response_2 = create_moderation_response_parseFromJSON(jsoncreate_moderation_response_1);
	cJSON* jsoncreate_moderation_response_2 = create_moderation_response_convertToJSON(create_moderation_response_2);
	printf("repeating create_moderation_response:\n%s\n", cJSON_Print(jsoncreate_moderation_response_2));
}

int main() {
  test_create_moderation_response(1);
  test_create_moderation_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_moderation_response_MAIN
#endif // create_moderation_response_TEST
