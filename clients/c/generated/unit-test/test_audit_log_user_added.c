#ifndef audit_log_user_added_TEST
#define audit_log_user_added_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_user_added_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_user_added.h"
audit_log_user_added_t* instantiate_audit_log_user_added(int include_optional);

#include "test_audit_log_user_added_data.c"


audit_log_user_added_t* instantiate_audit_log_user_added(int include_optional) {
  audit_log_user_added_t* audit_log_user_added = NULL;
  if (include_optional) {
    audit_log_user_added = audit_log_user_added_create(
      "0",
       // false, not to have infinite recursion
      instantiate_audit_log_user_added_data(0)
    );
  } else {
    audit_log_user_added = audit_log_user_added_create(
      "0",
      NULL
    );
  }

  return audit_log_user_added;
}


#ifdef audit_log_user_added_MAIN

void test_audit_log_user_added(int include_optional) {
    audit_log_user_added_t* audit_log_user_added_1 = instantiate_audit_log_user_added(include_optional);

	cJSON* jsonaudit_log_user_added_1 = audit_log_user_added_convertToJSON(audit_log_user_added_1);
	printf("audit_log_user_added :\n%s\n", cJSON_Print(jsonaudit_log_user_added_1));
	audit_log_user_added_t* audit_log_user_added_2 = audit_log_user_added_parseFromJSON(jsonaudit_log_user_added_1);
	cJSON* jsonaudit_log_user_added_2 = audit_log_user_added_convertToJSON(audit_log_user_added_2);
	printf("repeating audit_log_user_added:\n%s\n", cJSON_Print(jsonaudit_log_user_added_2));
}

int main() {
  test_audit_log_user_added(1);
  test_audit_log_user_added(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_user_added_MAIN
#endif // audit_log_user_added_TEST
