
/*
 * AuditLogActorApiKey.h
 *
 * The API Key used to perform the audit logged action.
 */

#ifndef TINY_CPP_CLIENT_AuditLogActorApiKey_H_
#define TINY_CPP_CLIENT_AuditLogActorApiKey_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuditLogActorServiceAccount.h"
#include "AuditLogActorUser.h"

namespace Tiny {


/*! \brief The API Key used to perform the audit logged action.
 *
 *  \ingroup Models
 *
 */

class AuditLogActorApiKey{
public:

    /*! \brief Constructor.
	 */
    AuditLogActorApiKey();
    AuditLogActorApiKey(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLogActorApiKey();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string id{};
    std::string type{};
    AuditLogActorUser user;
    AuditLogActorServiceAccount service_account;
};
}

#endif /* TINY_CPP_CLIENT_AuditLogActorApiKey_H_ */
