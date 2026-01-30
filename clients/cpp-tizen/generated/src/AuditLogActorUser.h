/*
 * AuditLogActorUser.h
 *
 * The user who performed the audit logged action.
 */

#ifndef _AuditLogActorUser_H_
#define _AuditLogActorUser_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The user who performed the audit logged action.
 *
 *  \ingroup Models
 *
 */

class AuditLogActorUser : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLogActorUser();
	AuditLogActorUser(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLogActorUser();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The user id.
	 */
	std::string getId();

	/*! \brief Set The user id.
	 */
	void setId(std::string  id);
	/*! \brief Get The user email.
	 */
	std::string getEmail();

	/*! \brief Set The user email.
	 */
	void setEmail(std::string  email);

private:
	std::string id;
	std::string email;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLogActorUser_H_ */
