/*
 * AuditLog_organization_updated.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _AuditLog_organization_updated_H_
#define _AuditLog_organization_updated_H_


#include <string>
#include "AuditLog_organization_updated_changes_requested.h"
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

class AuditLog_organization_updated : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_organization_updated();
	AuditLog_organization_updated(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_organization_updated();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The organization ID.
	 */
	std::string getId();

	/*! \brief Set The organization ID.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	AuditLog_organization_updated_changes_requested getChangesRequested();

	/*! \brief Set 
	 */
	void setChangesRequested(AuditLog_organization_updated_changes_requested  changes_requested);

private:
	std::string id;
	AuditLog_organization_updated_changes_requested changes_requested;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_organization_updated_H_ */
