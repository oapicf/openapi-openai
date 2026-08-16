
/*
 * AuditLogActorSession.h
 *
 * The session in which the audit logged action was performed.
 */

#ifndef TINY_CPP_CLIENT_AuditLogActorSession_H_
#define TINY_CPP_CLIENT_AuditLogActorSession_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuditLogActorUser.h"

namespace Tiny {


/*! \brief The session in which the audit logged action was performed.
 *
 *  \ingroup Models
 *
 */

class AuditLogActorSession{
public:

    /*! \brief Constructor.
	 */
    AuditLogActorSession();
    AuditLogActorSession(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLogActorSession();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string ip_address{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLogActorSession_H_ */
