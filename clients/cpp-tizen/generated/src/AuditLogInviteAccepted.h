/*
 * AuditLog_invite_accepted.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _AuditLog_invite_accepted_H_
#define _AuditLog_invite_accepted_H_


#include <string>
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

class AuditLog_invite_accepted : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_invite_accepted();
	AuditLog_invite_accepted(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_invite_accepted();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the invite.
	 */
	std::string getId();

	/*! \brief Set The ID of the invite.
	 */
	void setId(std::string  id);

private:
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_invite_accepted_H_ */
