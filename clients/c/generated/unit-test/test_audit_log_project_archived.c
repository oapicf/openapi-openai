#ifndef audit_log_project_archived_TEST
#define audit_log_project_archived_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_project_archived_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_project_archived.h"
audit_log_project_archived_t* instantiate_audit_log_project_archived(int include_optional);



audit_log_project_archived_t* instantiate_audit_log_project_archived(int include_optional) {
  audit_log_project_archived_t* audit_log_project_archived = NULL;
  if (include_optional) {
    audit_log_project_archived = audit_log_project_archived_create(
      "0"
    );
  } else {
    audit_log_project_archived = audit_log_project_archived_create(
      "0"
    );
  }

  return audit_log_project_archived;
}


#ifdef audit_log_project_archived_MAIN

void test_audit_log_project_archived(int include_optional) {
    audit_log_project_archived_t* audit_log_project_archived_1 = instantiate_audit_log_project_archived(include_optional);

	cJSON* jsonaudit_log_project_archived_1 = audit_log_project_archived_convertToJSON(audit_log_project_archived_1);
	printf("audit_log_project_archived :\n%s\n", cJSON_Print(jsonaudit_log_project_archived_1));
	audit_log_project_archived_t* audit_log_project_archived_2 = audit_log_project_archived_parseFromJSON(jsonaudit_log_project_archived_1);
	cJSON* jsonaudit_log_project_archived_2 = audit_log_project_archived_convertToJSON(audit_log_project_archived_2);
	printf("repeating audit_log_project_archived:\n%s\n", cJSON_Print(jsonaudit_log_project_archived_2));
}

int main() {
  test_audit_log_project_archived(1);
  test_audit_log_project_archived(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_project_archived_MAIN
#endif // audit_log_project_archived_TEST
