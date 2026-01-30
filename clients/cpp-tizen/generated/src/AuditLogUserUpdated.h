/*
 * AuditLog_user_updated.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _AuditLog_user_updated_H_
#define _AuditLog_user_updated_H_


#include <string>
#include "AuditLog_user_updated_changes_requested.h"
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

class AuditLog_user_updated : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_user_updated();
	AuditLog_user_updated(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_user_updated();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The project ID.
	 */
	std::string getId();

	/*! \brief Set The project ID.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	AuditLog_user_updated_changes_requested getChangesRequested();

	/*! \brief Set 
	 */
	void setChangesRequested(AuditLog_user_updated_changes_requested  changes_requested);

private:
	std::string id;
	AuditLog_user_updated_changes_requested changes_requested;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_user_updated_H_ */
