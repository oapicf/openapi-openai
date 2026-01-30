#ifndef admin_api_key_owner_TEST
#define admin_api_key_owner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define admin_api_key_owner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/admin_api_key_owner.h"
admin_api_key_owner_t* instantiate_admin_api_key_owner(int include_optional);



admin_api_key_owner_t* instantiate_admin_api_key_owner(int include_optional) {
  admin_api_key_owner_t* admin_api_key_owner = NULL;
  if (include_optional) {
    admin_api_key_owner = admin_api_key_owner_create(
      "service_account",
      "sa_456",
      "My Service Account",
      1711471533,
      "member"
    );
  } else {
    admin_api_key_owner = admin_api_key_owner_create(
      "service_account",
      "sa_456",
      "My Service Account",
      1711471533,
      "member"
    );
  }

  return admin_api_key_owner;
}


#ifdef admin_api_key_owner_MAIN

void test_admin_api_key_owner(int include_optional) {
    admin_api_key_owner_t* admin_api_key_owner_1 = instantiate_admin_api_key_owner(include_optional);

	cJSON* jsonadmin_api_key_owner_1 = admin_api_key_owner_convertToJSON(admin_api_key_owner_1);
	printf("admin_api_key_owner :\n%s\n", cJSON_Print(jsonadmin_api_key_owner_1));
	admin_api_key_owner_t* admin_api_key_owner_2 = admin_api_key_owner_parseFromJSON(jsonadmin_api_key_owner_1);
	cJSON* jsonadmin_api_key_owner_2 = admin_api_key_owner_convertToJSON(admin_api_key_owner_2);
	printf("repeating admin_api_key_owner:\n%s\n", cJSON_Print(jsonadmin_api_key_owner_2));
}

int main() {
  test_admin_api_key_owner(1);
  test_admin_api_key_owner(0);

  printf("Hello world \n");
  return 0;
}

#endif // admin_api_key_owner_MAIN
#endif // admin_api_key_owner_TEST
