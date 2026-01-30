#ifndef audit_log_organization_updated_changes_requested_settings_TEST
#define audit_log_organization_updated_changes_requested_settings_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_organization_updated_changes_requested_settings_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_organization_updated_changes_requested_settings.h"
audit_log_organization_updated_changes_requested_settings_t* instantiate_audit_log_organization_updated_changes_requested_settings(int include_optional);



audit_log_organization_updated_changes_requested_settings_t* instantiate_audit_log_organization_updated_changes_requested_settings(int include_optional) {
  audit_log_organization_updated_changes_requested_settings_t* audit_log_organization_updated_changes_requested_settings = NULL;
  if (include_optional) {
    audit_log_organization_updated_changes_requested_settings = audit_log_organization_updated_changes_requested_settings_create(
      "0",
      "0"
    );
  } else {
    audit_log_organization_updated_changes_requested_settings = audit_log_organization_updated_changes_requested_settings_create(
      "0",
      "0"
    );
  }

  return audit_log_organization_updated_changes_requested_settings;
}


#ifdef audit_log_organization_updated_changes_requested_settings_MAIN

void test_audit_log_organization_updated_changes_requested_settings(int include_optional) {
    audit_log_organization_updated_changes_requested_settings_t* audit_log_organization_updated_changes_requested_settings_1 = instantiate_audit_log_organization_updated_changes_requested_settings(include_optional);

	cJSON* jsonaudit_log_organization_updated_changes_requested_settings_1 = audit_log_organization_updated_changes_requested_settings_convertToJSON(audit_log_organization_updated_changes_requested_settings_1);
	printf("audit_log_organization_updated_changes_requested_settings :\n%s\n", cJSON_Print(jsonaudit_log_organization_updated_changes_requested_settings_1));
	audit_log_organization_updated_changes_requested_settings_t* audit_log_organization_updated_changes_requested_settings_2 = audit_log_organization_updated_changes_requested_settings_parseFromJSON(jsonaudit_log_organization_updated_changes_requested_settings_1);
	cJSON* jsonaudit_log_organization_updated_changes_requested_settings_2 = audit_log_organization_updated_changes_requested_settings_convertToJSON(audit_log_organization_updated_changes_requested_settings_2);
	printf("repeating audit_log_organization_updated_changes_requested_settings:\n%s\n", cJSON_Print(jsonaudit_log_organization_updated_changes_requested_settings_2));
}

int main() {
  test_audit_log_organization_updated_changes_requested_settings(1);
  test_audit_log_organization_updated_changes_requested_settings(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_organization_updated_changes_requested_settings_MAIN
#endif // audit_log_organization_updated_changes_requested_settings_TEST
