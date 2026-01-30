/*
 * AuditLog_invite_sent_data.h
 *
 * The payload used to create the invite.
 */

#ifndef _AuditLog_invite_sent_data_H_
#define _AuditLog_invite_sent_data_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The payload used to create the invite.
 *
 *  \ingroup Models
 *
 */

class AuditLog_invite_sent_data : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_invite_sent_data();
	AuditLog_invite_sent_data(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_invite_sent_data();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The email invited to the organization.
	 */
	std::string getEmail();

	/*! \brief Set The email invited to the organization.
	 */
	void setEmail(std::string  email);
	/*! \brief Get The role the email was invited to be. Is either `owner` or `member`.
	 */
	std::string getRole();

	/*! \brief Set The role the email was invited to be. Is either `owner` or `member`.
	 */
	void setRole(std::string  role);

private:
	std::string email;
	std::string role;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_invite_sent_data_H_ */
