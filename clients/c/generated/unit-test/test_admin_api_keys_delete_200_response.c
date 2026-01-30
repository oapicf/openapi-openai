#ifndef admin_api_keys_delete_200_response_TEST
#define admin_api_keys_delete_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define admin_api_keys_delete_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/admin_api_keys_delete_200_response.h"
admin_api_keys_delete_200_response_t* instantiate_admin_api_keys_delete_200_response(int include_optional);



admin_api_keys_delete_200_response_t* instantiate_admin_api_keys_delete_200_response(int include_optional) {
  admin_api_keys_delete_200_response_t* admin_api_keys_delete_200_response = NULL;
  if (include_optional) {
    admin_api_keys_delete_200_response = admin_api_keys_delete_200_response_create(
      "key_abc",
      "organization.admin_api_key.deleted",
      true
    );
  } else {
    admin_api_keys_delete_200_response = admin_api_keys_delete_200_response_create(
      "key_abc",
      "organization.admin_api_key.deleted",
      true
    );
  }

  return admin_api_keys_delete_200_response;
}


#ifdef admin_api_keys_delete_200_response_MAIN

void test_admin_api_keys_delete_200_response(int include_optional) {
    admin_api_keys_delete_200_response_t* admin_api_keys_delete_200_response_1 = instantiate_admin_api_keys_delete_200_response(include_optional);

	cJSON* jsonadmin_api_keys_delete_200_response_1 = admin_api_keys_delete_200_response_convertToJSON(admin_api_keys_delete_200_response_1);
	printf("admin_api_keys_delete_200_response :\n%s\n", cJSON_Print(jsonadmin_api_keys_delete_200_response_1));
	admin_api_keys_delete_200_response_t* admin_api_keys_delete_200_response_2 = admin_api_keys_delete_200_response_parseFromJSON(jsonadmin_api_keys_delete_200_response_1);
	cJSON* jsonadmin_api_keys_delete_200_response_2 = admin_api_keys_delete_200_response_convertToJSON(admin_api_keys_delete_200_response_2);
	printf("repeating admin_api_keys_delete_200_response:\n%s\n", cJSON_Print(jsonadmin_api_keys_delete_200_response_2));
}

int main() {
  test_admin_api_keys_delete_200_response(1);
  test_admin_api_keys_delete_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // admin_api_keys_delete_200_response_MAIN
#endif // admin_api_keys_delete_200_response_TEST
