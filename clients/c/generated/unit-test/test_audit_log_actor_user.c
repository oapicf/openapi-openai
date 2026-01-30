#ifndef audit_log_actor_user_TEST
#define audit_log_actor_user_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_actor_user_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_actor_user.h"
audit_log_actor_user_t* instantiate_audit_log_actor_user(int include_optional);



audit_log_actor_user_t* instantiate_audit_log_actor_user(int include_optional) {
  audit_log_actor_user_t* audit_log_actor_user = NULL;
  if (include_optional) {
    audit_log_actor_user = audit_log_actor_user_create(
      "0",
      "0"
    );
  } else {
    audit_log_actor_user = audit_log_actor_user_create(
      "0",
      "0"
    );
  }

  return audit_log_actor_user;
}


#ifdef audit_log_actor_user_MAIN

void test_audit_log_actor_user(int include_optional) {
    audit_log_actor_user_t* audit_log_actor_user_1 = instantiate_audit_log_actor_user(include_optional);

	cJSON* jsonaudit_log_actor_user_1 = audit_log_actor_user_convertToJSON(audit_log_actor_user_1);
	printf("audit_log_actor_user :\n%s\n", cJSON_Print(jsonaudit_log_actor_user_1));
	audit_log_actor_user_t* audit_log_actor_user_2 = audit_log_actor_user_parseFromJSON(jsonaudit_log_actor_user_1);
	cJSON* jsonaudit_log_actor_user_2 = audit_log_actor_user_convertToJSON(audit_log_actor_user_2);
	printf("repeating audit_log_actor_user:\n%s\n", cJSON_Print(jsonaudit_log_actor_user_2));
}

int main() {
  test_audit_log_actor_user(1);
  test_audit_log_actor_user(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_actor_user_MAIN
#endif // audit_log_actor_user_TEST
