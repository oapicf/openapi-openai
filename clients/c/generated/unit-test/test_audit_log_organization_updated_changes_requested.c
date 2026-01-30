#ifndef audit_log_organization_updated_changes_requested_TEST
#define audit_log_organization_updated_changes_requested_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_organization_updated_changes_requested_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_organization_updated_changes_requested.h"
audit_log_organization_updated_changes_requested_t* instantiate_audit_log_organization_updated_changes_requested(int include_optional);

#include "test_audit_log_organization_updated_changes_requested_settings.c"


audit_log_organization_updated_changes_requested_t* instantiate_audit_log_organization_updated_changes_requested(int include_optional) {
  audit_log_organization_updated_changes_requested_t* audit_log_organization_updated_changes_requested = NULL;
  if (include_optional) {
    audit_log_organization_updated_changes_requested = audit_log_organization_updated_changes_requested_create(
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_audit_log_organization_updated_changes_requested_settings(0)
    );
  } else {
    audit_log_organization_updated_changes_requested = audit_log_organization_updated_changes_requested_create(
      "0",
      "0",
      "0",
      NULL
    );
  }

  return audit_log_organization_updated_changes_requested;
}


#ifdef audit_log_organization_updated_changes_requested_MAIN

void test_audit_log_organization_updated_changes_requested(int include_optional) {
    audit_log_organization_updated_changes_requested_t* audit_log_organization_updated_changes_requested_1 = instantiate_audit_log_organization_updated_changes_requested(include_optional);

	cJSON* jsonaudit_log_organization_updated_changes_requested_1 = audit_log_organization_updated_changes_requested_convertToJSON(audit_log_organization_updated_changes_requested_1);
	printf("audit_log_organization_updated_changes_requested :\n%s\n", cJSON_Print(jsonaudit_log_organization_updated_changes_requested_1));
	audit_log_organization_updated_changes_requested_t* audit_log_organization_updated_changes_requested_2 = audit_log_organization_updated_changes_requested_parseFromJSON(jsonaudit_log_organization_updated_changes_requested_1);
	cJSON* jsonaudit_log_organization_updated_changes_requested_2 = audit_log_organization_updated_changes_requested_convertToJSON(audit_log_organization_updated_changes_requested_2);
	printf("repeating audit_log_organization_updated_changes_requested:\n%s\n", cJSON_Print(jsonaudit_log_organization_updated_changes_requested_2));
}

int main() {
  test_audit_log_organization_updated_changes_requested(1);
  test_audit_log_organization_updated_changes_requested(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_organization_updated_changes_requested_MAIN
#endif // audit_log_organization_updated_changes_requested_TEST
