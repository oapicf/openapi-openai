#ifndef user_delete_response_TEST
#define user_delete_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_delete_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_delete_response.h"
user_delete_response_t* instantiate_user_delete_response(int include_optional);



user_delete_response_t* instantiate_user_delete_response(int include_optional) {
  user_delete_response_t* user_delete_response = NULL;
  if (include_optional) {
    user_delete_response = user_delete_response_create(
      openai_api_user_delete_response_OBJECT_organization.user.deleted,
      "0",
      1
    );
  } else {
    user_delete_response = user_delete_response_create(
      openai_api_user_delete_response_OBJECT_organization.user.deleted,
      "0",
      1
    );
  }

  return user_delete_response;
}


#ifdef user_delete_response_MAIN

void test_user_delete_response(int include_optional) {
    user_delete_response_t* user_delete_response_1 = instantiate_user_delete_response(include_optional);

	cJSON* jsonuser_delete_response_1 = user_delete_response_convertToJSON(user_delete_response_1);
	printf("user_delete_response :\n%s\n", cJSON_Print(jsonuser_delete_response_1));
	user_delete_response_t* user_delete_response_2 = user_delete_response_parseFromJSON(jsonuser_delete_response_1);
	cJSON* jsonuser_delete_response_2 = user_delete_response_convertToJSON(user_delete_response_2);
	printf("repeating user_delete_response:\n%s\n", cJSON_Print(jsonuser_delete_response_2));
}

int main() {
  test_user_delete_response(1);
  test_user_delete_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_delete_response_MAIN
#endif // user_delete_response_TEST
