#ifndef audit_log_user_deleted_TEST
#define audit_log_user_deleted_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_user_deleted_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_user_deleted.h"
audit_log_user_deleted_t* instantiate_audit_log_user_deleted(int include_optional);



audit_log_user_deleted_t* instantiate_audit_log_user_deleted(int include_optional) {
  audit_log_user_deleted_t* audit_log_user_deleted = NULL;
  if (include_optional) {
    audit_log_user_deleted = audit_log_user_deleted_create(
      "0"
    );
  } else {
    audit_log_user_deleted = audit_log_user_deleted_create(
      "0"
    );
  }

  return audit_log_user_deleted;
}


#ifdef audit_log_user_deleted_MAIN

void test_audit_log_user_deleted(int include_optional) {
    audit_log_user_deleted_t* audit_log_user_deleted_1 = instantiate_audit_log_user_deleted(include_optional);

	cJSON* jsonaudit_log_user_deleted_1 = audit_log_user_deleted_convertToJSON(audit_log_user_deleted_1);
	printf("audit_log_user_deleted :\n%s\n", cJSON_Print(jsonaudit_log_user_deleted_1));
	audit_log_user_deleted_t* audit_log_user_deleted_2 = audit_log_user_deleted_parseFromJSON(jsonaudit_log_user_deleted_1);
	cJSON* jsonaudit_log_user_deleted_2 = audit_log_user_deleted_convertToJSON(audit_log_user_deleted_2);
	printf("repeating audit_log_user_deleted:\n%s\n", cJSON_Print(jsonaudit_log_user_deleted_2));
}

int main() {
  test_audit_log_user_deleted(1);
  test_audit_log_user_deleted(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_user_deleted_MAIN
#endif // audit_log_user_deleted_TEST
