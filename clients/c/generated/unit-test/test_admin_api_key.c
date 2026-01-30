#ifndef admin_api_key_TEST
#define admin_api_key_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define admin_api_key_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/admin_api_key.h"
admin_api_key_t* instantiate_admin_api_key(int include_optional);

#include "test_admin_api_key_owner.c"


admin_api_key_t* instantiate_admin_api_key(int include_optional) {
  admin_api_key_t* admin_api_key = NULL;
  if (include_optional) {
    admin_api_key = admin_api_key_create(
      "organization.admin_api_key",
      "key_abc",
      "Administration Key",
      "sk-admin...def",
      "sk-admin-1234abcd",
      1711471533,
       // false, not to have infinite recursion
      instantiate_admin_api_key_owner(0)
    );
  } else {
    admin_api_key = admin_api_key_create(
      "organization.admin_api_key",
      "key_abc",
      "Administration Key",
      "sk-admin...def",
      "sk-admin-1234abcd",
      1711471533,
      NULL
    );
  }

  return admin_api_key;
}


#ifdef admin_api_key_MAIN

void test_admin_api_key(int include_optional) {
    admin_api_key_t* admin_api_key_1 = instantiate_admin_api_key(include_optional);

	cJSON* jsonadmin_api_key_1 = admin_api_key_convertToJSON(admin_api_key_1);
	printf("admin_api_key :\n%s\n", cJSON_Print(jsonadmin_api_key_1));
	admin_api_key_t* admin_api_key_2 = admin_api_key_parseFromJSON(jsonadmin_api_key_1);
	cJSON* jsonadmin_api_key_2 = admin_api_key_convertToJSON(admin_api_key_2);
	printf("repeating admin_api_key:\n%s\n", cJSON_Print(jsonadmin_api_key_2));
}

int main() {
  test_admin_api_key(1);
  test_admin_api_key(0);

  printf("Hello world \n");
  return 0;
}

#endif // admin_api_key_MAIN
#endif // admin_api_key_TEST
