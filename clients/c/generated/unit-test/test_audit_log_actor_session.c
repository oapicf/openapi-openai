#ifndef audit_log_actor_session_TEST
#define audit_log_actor_session_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_actor_session_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_actor_session.h"
audit_log_actor_session_t* instantiate_audit_log_actor_session(int include_optional);

#include "test_audit_log_actor_user.c"


audit_log_actor_session_t* instantiate_audit_log_actor_session(int include_optional) {
  audit_log_actor_session_t* audit_log_actor_session = NULL;
  if (include_optional) {
    audit_log_actor_session = audit_log_actor_session_create(
       // false, not to have infinite recursion
      instantiate_audit_log_actor_user(0),
      "0"
    );
  } else {
    audit_log_actor_session = audit_log_actor_session_create(
      NULL,
      "0"
    );
  }

  return audit_log_actor_session;
}


#ifdef audit_log_actor_session_MAIN

void test_audit_log_actor_session(int include_optional) {
    audit_log_actor_session_t* audit_log_actor_session_1 = instantiate_audit_log_actor_session(include_optional);

	cJSON* jsonaudit_log_actor_session_1 = audit_log_actor_session_convertToJSON(audit_log_actor_session_1);
	printf("audit_log_actor_session :\n%s\n", cJSON_Print(jsonaudit_log_actor_session_1));
	audit_log_actor_session_t* audit_log_actor_session_2 = audit_log_actor_session_parseFromJSON(jsonaudit_log_actor_session_1);
	cJSON* jsonaudit_log_actor_session_2 = audit_log_actor_session_convertToJSON(audit_log_actor_session_2);
	printf("repeating audit_log_actor_session:\n%s\n", cJSON_Print(jsonaudit_log_actor_session_2));
}

int main() {
  test_audit_log_actor_session(1);
  test_audit_log_actor_session(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_actor_session_MAIN
#endif // audit_log_actor_session_TEST
