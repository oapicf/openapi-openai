/*
 * AuditLogActorSession.h
 *
 * The session in which the audit logged action was performed.
 */

#ifndef _AuditLogActorSession_H_
#define _AuditLogActorSession_H_


#include <string>
#include "AuditLogActorUser.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The session in which the audit logged action was performed.
 *
 *  \ingroup Models
 *
 */

class AuditLogActorSession : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLogActorSession();
	AuditLogActorSession(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLogActorSession();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AuditLogActorUser getUser();

	/*! \brief Set 
	 */
	void setUser(AuditLogActorUser  user);
	/*! \brief Get The IP address from which the action was performed.
	 */
	std::string getIpAddress();

	/*! \brief Set The IP address from which the action was performed.
	 */
	void setIpAddress(std::string  ip_address);

private:
	AuditLogActorUser user;
	std::string ip_address;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLogActorSession_H_ */
