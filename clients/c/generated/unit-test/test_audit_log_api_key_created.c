#ifndef audit_log_api_key_created_TEST
#define audit_log_api_key_created_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_api_key_created_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_api_key_created.h"
audit_log_api_key_created_t* instantiate_audit_log_api_key_created(int include_optional);

#include "test_audit_log_api_key_created_data.c"


audit_log_api_key_created_t* instantiate_audit_log_api_key_created(int include_optional) {
  audit_log_api_key_created_t* audit_log_api_key_created = NULL;
  if (include_optional) {
    audit_log_api_key_created = audit_log_api_key_created_create(
      "0",
       // false, not to have infinite recursion
      instantiate_audit_log_api_key_created_data(0)
    );
  } else {
    audit_log_api_key_created = audit_log_api_key_created_create(
      "0",
      NULL
    );
  }

  return audit_log_api_key_created;
}


#ifdef audit_log_api_key_created_MAIN

void test_audit_log_api_key_created(int include_optional) {
    audit_log_api_key_created_t* audit_log_api_key_created_1 = instantiate_audit_log_api_key_created(include_optional);

	cJSON* jsonaudit_log_api_key_created_1 = audit_log_api_key_created_convertToJSON(audit_log_api_key_created_1);
	printf("audit_log_api_key_created :\n%s\n", cJSON_Print(jsonaudit_log_api_key_created_1));
	audit_log_api_key_created_t* audit_log_api_key_created_2 = audit_log_api_key_created_parseFromJSON(jsonaudit_log_api_key_created_1);
	cJSON* jsonaudit_log_api_key_created_2 = audit_log_api_key_created_convertToJSON(audit_log_api_key_created_2);
	printf("repeating audit_log_api_key_created:\n%s\n", cJSON_Print(jsonaudit_log_api_key_created_2));
}

int main() {
  test_audit_log_api_key_created(1);
  test_audit_log_api_key_created(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_api_key_created_MAIN
#endif // audit_log_api_key_created_TEST
