/*
 * AuditLogActorApiKey.h
 *
 * The API Key used to perform the audit logged action.
 */

#ifndef _AuditLogActorApiKey_H_
#define _AuditLogActorApiKey_H_


#include <string>
#include "AuditLogActorServiceAccount.h"
#include "AuditLogActorUser.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The API Key used to perform the audit logged action.
 *
 *  \ingroup Models
 *
 */

class AuditLogActorApiKey : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLogActorApiKey();
	AuditLogActorApiKey(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLogActorApiKey();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The tracking id of the API key.
	 */
	std::string getId();

	/*! \brief Set The tracking id of the API key.
	 */
	void setId(std::string  id);
	/*! \brief Get The type of API key. Can be either `user` or `service_account`.
	 */
	std::string getType();

	/*! \brief Set The type of API key. Can be either `user` or `service_account`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	AuditLogActorUser getUser();

	/*! \brief Set 
	 */
	void setUser(AuditLogActorUser  user);
	/*! \brief Get 
	 */
	AuditLogActorServiceAccount getServiceAccount();

	/*! \brief Set 
	 */
	void setServiceAccount(AuditLogActorServiceAccount  service_account);

private:
	std::string id;
	std::string type;
	AuditLogActorUser user;
	AuditLogActorServiceAccount service_account;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLogActorApiKey_H_ */
