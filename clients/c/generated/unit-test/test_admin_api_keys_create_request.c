#ifndef admin_api_keys_create_request_TEST
#define admin_api_keys_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define admin_api_keys_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/admin_api_keys_create_request.h"
admin_api_keys_create_request_t* instantiate_admin_api_keys_create_request(int include_optional);



admin_api_keys_create_request_t* instantiate_admin_api_keys_create_request(int include_optional) {
  admin_api_keys_create_request_t* admin_api_keys_create_request = NULL;
  if (include_optional) {
    admin_api_keys_create_request = admin_api_keys_create_request_create(
      "New Admin Key"
    );
  } else {
    admin_api_keys_create_request = admin_api_keys_create_request_create(
      "New Admin Key"
    );
  }

  return admin_api_keys_create_request;
}


#ifdef admin_api_keys_create_request_MAIN

void test_admin_api_keys_create_request(int include_optional) {
    admin_api_keys_create_request_t* admin_api_keys_create_request_1 = instantiate_admin_api_keys_create_request(include_optional);

	cJSON* jsonadmin_api_keys_create_request_1 = admin_api_keys_create_request_convertToJSON(admin_api_keys_create_request_1);
	printf("admin_api_keys_create_request :\n%s\n", cJSON_Print(jsonadmin_api_keys_create_request_1));
	admin_api_keys_create_request_t* admin_api_keys_create_request_2 = admin_api_keys_create_request_parseFromJSON(jsonadmin_api_keys_create_request_1);
	cJSON* jsonadmin_api_keys_create_request_2 = admin_api_keys_create_request_convertToJSON(admin_api_keys_create_request_2);
	printf("repeating admin_api_keys_create_request:\n%s\n", cJSON_Print(jsonadmin_api_keys_create_request_2));
}

int main() {
  test_admin_api_keys_create_request(1);
  test_admin_api_keys_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // admin_api_keys_create_request_MAIN
#endif // admin_api_keys_create_request_TEST
