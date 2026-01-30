#ifndef audit_log_login_failed_TEST
#define audit_log_login_failed_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_login_failed_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_login_failed.h"
audit_log_login_failed_t* instantiate_audit_log_login_failed(int include_optional);



audit_log_login_failed_t* instantiate_audit_log_login_failed(int include_optional) {
  audit_log_login_failed_t* audit_log_login_failed = NULL;
  if (include_optional) {
    audit_log_login_failed = audit_log_login_failed_create(
      "0",
      "0"
    );
  } else {
    audit_log_login_failed = audit_log_login_failed_create(
      "0",
      "0"
    );
  }

  return audit_log_login_failed;
}


#ifdef audit_log_login_failed_MAIN

void test_audit_log_login_failed(int include_optional) {
    audit_log_login_failed_t* audit_log_login_failed_1 = instantiate_audit_log_login_failed(include_optional);

	cJSON* jsonaudit_log_login_failed_1 = audit_log_login_failed_convertToJSON(audit_log_login_failed_1);
	printf("audit_log_login_failed :\n%s\n", cJSON_Print(jsonaudit_log_login_failed_1));
	audit_log_login_failed_t* audit_log_login_failed_2 = audit_log_login_failed_parseFromJSON(jsonaudit_log_login_failed_1);
	cJSON* jsonaudit_log_login_failed_2 = audit_log_login_failed_convertToJSON(audit_log_login_failed_2);
	printf("repeating audit_log_login_failed:\n%s\n", cJSON_Print(jsonaudit_log_login_failed_2));
}

int main() {
  test_audit_log_login_failed(1);
  test_audit_log_login_failed(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_login_failed_MAIN
#endif // audit_log_login_failed_TEST
