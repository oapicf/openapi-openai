#ifndef audit_log_organization_updated_TEST
#define audit_log_organization_updated_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_organization_updated_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_organization_updated.h"
audit_log_organization_updated_t* instantiate_audit_log_organization_updated(int include_optional);

#include "test_audit_log_organization_updated_changes_requested.c"


audit_log_organization_updated_t* instantiate_audit_log_organization_updated(int include_optional) {
  audit_log_organization_updated_t* audit_log_organization_updated = NULL;
  if (include_optional) {
    audit_log_organization_updated = audit_log_organization_updated_create(
      "0",
       // false, not to have infinite recursion
      instantiate_audit_log_organization_updated_changes_requested(0)
    );
  } else {
    audit_log_organization_updated = audit_log_organization_updated_create(
      "0",
      NULL
    );
  }

  return audit_log_organization_updated;
}


#ifdef audit_log_organization_updated_MAIN

void test_audit_log_organization_updated(int include_optional) {
    audit_log_organization_updated_t* audit_log_organization_updated_1 = instantiate_audit_log_organization_updated(include_optional);

	cJSON* jsonaudit_log_organization_updated_1 = audit_log_organization_updated_convertToJSON(audit_log_organization_updated_1);
	printf("audit_log_organization_updated :\n%s\n", cJSON_Print(jsonaudit_log_organization_updated_1));
	audit_log_organization_updated_t* audit_log_organization_updated_2 = audit_log_organization_updated_parseFromJSON(jsonaudit_log_organization_updated_1);
	cJSON* jsonaudit_log_organization_updated_2 = audit_log_organization_updated_convertToJSON(audit_log_organization_updated_2);
	printf("repeating audit_log_organization_updated:\n%s\n", cJSON_Print(jsonaudit_log_organization_updated_2));
}

int main() {
  test_audit_log_organization_updated(1);
  test_audit_log_organization_updated(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_organization_updated_MAIN
#endif // audit_log_organization_updated_TEST
