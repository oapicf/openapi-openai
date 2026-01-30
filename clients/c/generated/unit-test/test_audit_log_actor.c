#ifndef audit_log_actor_TEST
#define audit_log_actor_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_actor_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_actor.h"
audit_log_actor_t* instantiate_audit_log_actor(int include_optional);



audit_log_actor_t* instantiate_audit_log_actor(int include_optional) {
  audit_log_actor_t* audit_log_actor = NULL;
  if (include_optional) {
    audit_log_actor = audit_log_actor_create(
      openai_api_audit_log_actor_TYPE_session,
      0,
      0
    );
  } else {
    audit_log_actor = audit_log_actor_create(
      openai_api_audit_log_actor_TYPE_session,
      0,
      0
    );
  }

  return audit_log_actor;
}


#ifdef audit_log_actor_MAIN

void test_audit_log_actor(int include_optional) {
    audit_log_actor_t* audit_log_actor_1 = instantiate_audit_log_actor(include_optional);

	cJSON* jsonaudit_log_actor_1 = audit_log_actor_convertToJSON(audit_log_actor_1);
	printf("audit_log_actor :\n%s\n", cJSON_Print(jsonaudit_log_actor_1));
	audit_log_actor_t* audit_log_actor_2 = audit_log_actor_parseFromJSON(jsonaudit_log_actor_1);
	cJSON* jsonaudit_log_actor_2 = audit_log_actor_convertToJSON(audit_log_actor_2);
	printf("repeating audit_log_actor:\n%s\n", cJSON_Print(jsonaudit_log_actor_2));
}

int main() {
  test_audit_log_actor(1);
  test_audit_log_actor(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_actor_MAIN
#endif // audit_log_actor_TEST
