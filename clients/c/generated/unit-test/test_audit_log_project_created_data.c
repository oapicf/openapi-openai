#ifndef audit_log_project_created_data_TEST
#define audit_log_project_created_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_project_created_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_project_created_data.h"
audit_log_project_created_data_t* instantiate_audit_log_project_created_data(int include_optional);



audit_log_project_created_data_t* instantiate_audit_log_project_created_data(int include_optional) {
  audit_log_project_created_data_t* audit_log_project_created_data = NULL;
  if (include_optional) {
    audit_log_project_created_data = audit_log_project_created_data_create(
      "0",
      "0"
    );
  } else {
    audit_log_project_created_data = audit_log_project_created_data_create(
      "0",
      "0"
    );
  }

  return audit_log_project_created_data;
}


#ifdef audit_log_project_created_data_MAIN

void test_audit_log_project_created_data(int include_optional) {
    audit_log_project_created_data_t* audit_log_project_created_data_1 = instantiate_audit_log_project_created_data(include_optional);

	cJSON* jsonaudit_log_project_created_data_1 = audit_log_project_created_data_convertToJSON(audit_log_project_created_data_1);
	printf("audit_log_project_created_data :\n%s\n", cJSON_Print(jsonaudit_log_project_created_data_1));
	audit_log_project_created_data_t* audit_log_project_created_data_2 = audit_log_project_created_data_parseFromJSON(jsonaudit_log_project_created_data_1);
	cJSON* jsonaudit_log_project_created_data_2 = audit_log_project_created_data_convertToJSON(audit_log_project_created_data_2);
	printf("repeating audit_log_project_created_data:\n%s\n", cJSON_Print(jsonaudit_log_project_created_data_2));
}

int main() {
  test_audit_log_project_created_data(1);
  test_audit_log_project_created_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_project_created_data_MAIN
#endif // audit_log_project_created_data_TEST
