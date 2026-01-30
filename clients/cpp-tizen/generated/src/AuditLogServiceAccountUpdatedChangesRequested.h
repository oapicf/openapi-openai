/*
 * AuditLog_service_account_updated_changes_requested.h
 *
 * The payload used to updated the service account.
 */

#ifndef _AuditLog_service_account_updated_changes_requested_H_
#define _AuditLog_service_account_updated_changes_requested_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The payload used to updated the service account.
 *
 *  \ingroup Models
 *
 */

class AuditLog_service_account_updated_changes_requested : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_service_account_updated_changes_requested();
	AuditLog_service_account_updated_changes_requested(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_service_account_updated_changes_requested();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The role of the service account. Is either `owner` or `member`.
	 */
	std::string getRole();

	/*! \brief Set The role of the service account. Is either `owner` or `member`.
	 */
	void setRole(std::string  role);

private:
	std::string role;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_service_account_updated_changes_requested_H_ */
