/*
 * AuditLog_api_key_updated.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _AuditLog_api_key_updated_H_
#define _AuditLog_api_key_updated_H_


#include <string>
#include "AuditLog_api_key_updated_changes_requested.h"
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

class AuditLog_api_key_updated : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_api_key_updated();
	AuditLog_api_key_updated(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_api_key_updated();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The tracking ID of the API key.
	 */
	std::string getId();

	/*! \brief Set The tracking ID of the API key.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	AuditLog_api_key_updated_changes_requested getChangesRequested();

	/*! \brief Set 
	 */
	void setChangesRequested(AuditLog_api_key_updated_changes_requested  changes_requested);

private:
	std::string id;
	AuditLog_api_key_updated_changes_requested changes_requested;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_api_key_updated_H_ */
