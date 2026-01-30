#ifndef user_role_update_request_TEST
#define user_role_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_role_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_role_update_request.h"
user_role_update_request_t* instantiate_user_role_update_request(int include_optional);



user_role_update_request_t* instantiate_user_role_update_request(int include_optional) {
  user_role_update_request_t* user_role_update_request = NULL;
  if (include_optional) {
    user_role_update_request = user_role_update_request_create(
      openai_api_user_role_update_request_ROLE_owner
    );
  } else {
    user_role_update_request = user_role_update_request_create(
      openai_api_user_role_update_request_ROLE_owner
    );
  }

  return user_role_update_request;
}


#ifdef user_role_update_request_MAIN

void test_user_role_update_request(int include_optional) {
    user_role_update_request_t* user_role_update_request_1 = instantiate_user_role_update_request(include_optional);

	cJSON* jsonuser_role_update_request_1 = user_role_update_request_convertToJSON(user_role_update_request_1);
	printf("user_role_update_request :\n%s\n", cJSON_Print(jsonuser_role_update_request_1));
	user_role_update_request_t* user_role_update_request_2 = user_role_update_request_parseFromJSON(jsonuser_role_update_request_1);
	cJSON* jsonuser_role_update_request_2 = user_role_update_request_convertToJSON(user_role_update_request_2);
	printf("repeating user_role_update_request:\n%s\n", cJSON_Print(jsonuser_role_update_request_2));
}

int main() {
  test_user_role_update_request(1);
  test_user_role_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_role_update_request_MAIN
#endif // user_role_update_request_TEST
