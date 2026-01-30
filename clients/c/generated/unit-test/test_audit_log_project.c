#ifndef audit_log_project_TEST
#define audit_log_project_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_project_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_project.h"
audit_log_project_t* instantiate_audit_log_project(int include_optional);



audit_log_project_t* instantiate_audit_log_project(int include_optional) {
  audit_log_project_t* audit_log_project = NULL;
  if (include_optional) {
    audit_log_project = audit_log_project_create(
      "0",
      "0"
    );
  } else {
    audit_log_project = audit_log_project_create(
      "0",
      "0"
    );
  }

  return audit_log_project;
}


#ifdef audit_log_project_MAIN

void test_audit_log_project(int include_optional) {
    audit_log_project_t* audit_log_project_1 = instantiate_audit_log_project(include_optional);

	cJSON* jsonaudit_log_project_1 = audit_log_project_convertToJSON(audit_log_project_1);
	printf("audit_log_project :\n%s\n", cJSON_Print(jsonaudit_log_project_1));
	audit_log_project_t* audit_log_project_2 = audit_log_project_parseFromJSON(jsonaudit_log_project_1);
	cJSON* jsonaudit_log_project_2 = audit_log_project_convertToJSON(audit_log_project_2);
	printf("repeating audit_log_project:\n%s\n", cJSON_Print(jsonaudit_log_project_2));
}

int main() {
  test_audit_log_project(1);
  test_audit_log_project(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_project_MAIN
#endif // audit_log_project_TEST
