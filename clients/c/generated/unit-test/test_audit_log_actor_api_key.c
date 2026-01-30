#ifndef audit_log_actor_api_key_TEST
#define audit_log_actor_api_key_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_actor_api_key_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_actor_api_key.h"
audit_log_actor_api_key_t* instantiate_audit_log_actor_api_key(int include_optional);

#include "test_audit_log_actor_user.c"
#include "test_audit_log_actor_service_account.c"


audit_log_actor_api_key_t* instantiate_audit_log_actor_api_key(int include_optional) {
  audit_log_actor_api_key_t* audit_log_actor_api_key = NULL;
  if (include_optional) {
    audit_log_actor_api_key = audit_log_actor_api_key_create(
      "0",
      openai_api_audit_log_actor_api_key_TYPE_user,
       // false, not to have infinite recursion
      instantiate_audit_log_actor_user(0),
       // false, not to have infinite recursion
      instantiate_audit_log_actor_service_account(0)
    );
  } else {
    audit_log_actor_api_key = audit_log_actor_api_key_create(
      "0",
      openai_api_audit_log_actor_api_key_TYPE_user,
      NULL,
      NULL
    );
  }

  return audit_log_actor_api_key;
}


#ifdef audit_log_actor_api_key_MAIN

void test_audit_log_actor_api_key(int include_optional) {
    audit_log_actor_api_key_t* audit_log_actor_api_key_1 = instantiate_audit_log_actor_api_key(include_optional);

	cJSON* jsonaudit_log_actor_api_key_1 = audit_log_actor_api_key_convertToJSON(audit_log_actor_api_key_1);
	printf("audit_log_actor_api_key :\n%s\n", cJSON_Print(jsonaudit_log_actor_api_key_1));
	audit_log_actor_api_key_t* audit_log_actor_api_key_2 = audit_log_actor_api_key_parseFromJSON(jsonaudit_log_actor_api_key_1);
	cJSON* jsonaudit_log_actor_api_key_2 = audit_log_actor_api_key_convertToJSON(audit_log_actor_api_key_2);
	printf("repeating audit_log_actor_api_key:\n%s\n", cJSON_Print(jsonaudit_log_actor_api_key_2));
}

int main() {
  test_audit_log_actor_api_key(1);
  test_audit_log_actor_api_key(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_actor_api_key_MAIN
#endif // audit_log_actor_api_key_TEST
