/*
 * AuditLog_service_account_updated.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _AuditLog_service_account_updated_H_
#define _AuditLog_service_account_updated_H_


#include <string>
#include "AuditLog_service_account_updated_changes_requested.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_service_account_updated : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_service_account_updated();
	AuditLog_service_account_updated(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_service_account_updated();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The service account ID.
	 */
	std::string getId();

	/*! \brief Set The service account ID.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	AuditLog_service_account_updated_changes_requested getChangesRequested();

	/*! \brief Set 
	 */
	void setChangesRequested(AuditLog_service_account_updated_changes_requested  changes_requested);

private:
	std::string id;
	AuditLog_service_account_updated_changes_requested changes_requested;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_service_account_updated_H_ */
