#ifndef audit_log_actor_service_account_TEST
#define audit_log_actor_service_account_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_actor_service_account_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_actor_service_account.h"
audit_log_actor_service_account_t* instantiate_audit_log_actor_service_account(int include_optional);



audit_log_actor_service_account_t* instantiate_audit_log_actor_service_account(int include_optional) {
  audit_log_actor_service_account_t* audit_log_actor_service_account = NULL;
  if (include_optional) {
    audit_log_actor_service_account = audit_log_actor_service_account_create(
      "0"
    );
  } else {
    audit_log_actor_service_account = audit_log_actor_service_account_create(
      "0"
    );
  }

  return audit_log_actor_service_account;
}


#ifdef audit_log_actor_service_account_MAIN

void test_audit_log_actor_service_account(int include_optional) {
    audit_log_actor_service_account_t* audit_log_actor_service_account_1 = instantiate_audit_log_actor_service_account(include_optional);

	cJSON* jsonaudit_log_actor_service_account_1 = audit_log_actor_service_account_convertToJSON(audit_log_actor_service_account_1);
	printf("audit_log_actor_service_account :\n%s\n", cJSON_Print(jsonaudit_log_actor_service_account_1));
	audit_log_actor_service_account_t* audit_log_actor_service_account_2 = audit_log_actor_service_account_parseFromJSON(jsonaudit_log_actor_service_account_1);
	cJSON* jsonaudit_log_actor_service_account_2 = audit_log_actor_service_account_convertToJSON(audit_log_actor_service_account_2);
	printf("repeating audit_log_actor_service_account:\n%s\n", cJSON_Print(jsonaudit_log_actor_service_account_2));
}

int main() {
  test_audit_log_actor_service_account(1);
  test_audit_log_actor_service_account(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_actor_service_account_MAIN
#endif // audit_log_actor_service_account_TEST
