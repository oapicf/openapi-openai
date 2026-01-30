#ifndef audit_log_TEST
#define audit_log_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log.h"
audit_log_t* instantiate_audit_log(int include_optional);

#include "test_audit_log_project.c"
#include "test_audit_log_actor.c"
#include "test_audit_log_api_key_created.c"
#include "test_audit_log_api_key_updated.c"
#include "test_audit_log_api_key_deleted.c"
#include "test_audit_log_invite_sent.c"
#include "test_audit_log_invite_accepted.c"
#include "test_audit_log_invite_accepted.c"
#include "test_audit_log_login_failed.c"
#include "test_audit_log_login_failed.c"
#include "test_audit_log_organization_updated.c"
#include "test_audit_log_project_created.c"
#include "test_audit_log_project_updated.c"
#include "test_audit_log_project_archived.c"
#include "test_audit_log_rate_limit_updated.c"
#include "test_audit_log_rate_limit_deleted.c"
#include "test_audit_log_service_account_created.c"
#include "test_audit_log_service_account_updated.c"
#include "test_audit_log_service_account_deleted.c"
#include "test_audit_log_user_added.c"
#include "test_audit_log_user_updated.c"
#include "test_audit_log_user_deleted.c"


audit_log_t* instantiate_audit_log(int include_optional) {
  audit_log_t* audit_log = NULL;
  if (include_optional) {
    audit_log = audit_log_create(
      "0",
      openai_api_audit_log__api_key.created,
      56,
       // false, not to have infinite recursion
      instantiate_audit_log_project(0),
       // false, not to have infinite recursion
      instantiate_audit_log_actor(0),
       // false, not to have infinite recursion
      instantiate_audit_log_api_key_created(0),
       // false, not to have infinite recursion
      instantiate_audit_log_api_key_updated(0),
       // false, not to have infinite recursion
      instantiate_audit_log_api_key_deleted(0),
       // false, not to have infinite recursion
      instantiate_audit_log_invite_sent(0),
       // false, not to have infinite recursion
      instantiate_audit_log_invite_accepted(0),
       // false, not to have infinite recursion
      instantiate_audit_log_invite_accepted(0),
       // false, not to have infinite recursion
      instantiate_audit_log_login_failed(0),
       // false, not to have infinite recursion
      instantiate_audit_log_login_failed(0),
       // false, not to have infinite recursion
      instantiate_audit_log_organization_updated(0),
       // false, not to have infinite recursion
      instantiate_audit_log_project_created(0),
       // false, not to have infinite recursion
      instantiate_audit_log_project_updated(0),
       // false, not to have infinite recursion
      instantiate_audit_log_project_archived(0),
       // false, not to have infinite recursion
      instantiate_audit_log_rate_limit_updated(0),
       // false, not to have infinite recursion
      instantiate_audit_log_rate_limit_deleted(0),
       // false, not to have infinite recursion
      instantiate_audit_log_service_account_created(0),
       // false, not to have infinite recursion
      instantiate_audit_log_service_account_updated(0),
       // false, not to have infinite recursion
      instantiate_audit_log_service_account_deleted(0),
       // false, not to have infinite recursion
      instantiate_audit_log_user_added(0),
       // false, not to have infinite recursion
      instantiate_audit_log_user_updated(0),
       // false, not to have infinite recursion
      instantiate_audit_log_user_deleted(0)
    );
  } else {
    audit_log = audit_log_create(
      "0",
      openai_api_audit_log__api_key.created,
      56,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL
    );
  }

  return audit_log;
}


#ifdef audit_log_MAIN

void test_audit_log(int include_optional) {
    audit_log_t* audit_log_1 = instantiate_audit_log(include_optional);

	cJSON* jsonaudit_log_1 = audit_log_convertToJSON(audit_log_1);
	printf("audit_log :\n%s\n", cJSON_Print(jsonaudit_log_1));
	audit_log_t* audit_log_2 = audit_log_parseFromJSON(jsonaudit_log_1);
	cJSON* jsonaudit_log_2 = audit_log_convertToJSON(audit_log_2);
	printf("repeating audit_log:\n%s\n", cJSON_Print(jsonaudit_log_2));
}

int main() {
  test_audit_log(1);
  test_audit_log(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_MAIN
#endif // audit_log_TEST
