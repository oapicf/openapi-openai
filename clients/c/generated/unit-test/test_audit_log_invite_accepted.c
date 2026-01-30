#ifndef audit_log_invite_accepted_TEST
#define audit_log_invite_accepted_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_invite_accepted_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_invite_accepted.h"
audit_log_invite_accepted_t* instantiate_audit_log_invite_accepted(int include_optional);



audit_log_invite_accepted_t* instantiate_audit_log_invite_accepted(int include_optional) {
  audit_log_invite_accepted_t* audit_log_invite_accepted = NULL;
  if (include_optional) {
    audit_log_invite_accepted = audit_log_invite_accepted_create(
      "0"
    );
  } else {
    audit_log_invite_accepted = audit_log_invite_accepted_create(
      "0"
    );
  }

  return audit_log_invite_accepted;
}


#ifdef audit_log_invite_accepted_MAIN

void test_audit_log_invite_accepted(int include_optional) {
    audit_log_invite_accepted_t* audit_log_invite_accepted_1 = instantiate_audit_log_invite_accepted(include_optional);

	cJSON* jsonaudit_log_invite_accepted_1 = audit_log_invite_accepted_convertToJSON(audit_log_invite_accepted_1);
	printf("audit_log_invite_accepted :\n%s\n", cJSON_Print(jsonaudit_log_invite_accepted_1));
	audit_log_invite_accepted_t* audit_log_invite_accepted_2 = audit_log_invite_accepted_parseFromJSON(jsonaudit_log_invite_accepted_1);
	cJSON* jsonaudit_log_invite_accepted_2 = audit_log_invite_accepted_convertToJSON(audit_log_invite_accepted_2);
	printf("repeating audit_log_invite_accepted:\n%s\n", cJSON_Print(jsonaudit_log_invite_accepted_2));
}

int main() {
  test_audit_log_invite_accepted(1);
  test_audit_log_invite_accepted(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_invite_accepted_MAIN
#endif // audit_log_invite_accepted_TEST
