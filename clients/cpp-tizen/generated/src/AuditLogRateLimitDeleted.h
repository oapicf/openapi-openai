/*
 * AuditLog_rate_limit_deleted.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _AuditLog_rate_limit_deleted_H_
#define _AuditLog_rate_limit_deleted_H_


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

class AuditLog_rate_limit_deleted : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_rate_limit_deleted();
	AuditLog_rate_limit_deleted(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_rate_limit_deleted();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The rate limit ID
	 */
	std::string getId();

	/*! \brief Set The rate limit ID
	 */
	void setId(std::string  id);

private:
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_rate_limit_deleted_H_ */
