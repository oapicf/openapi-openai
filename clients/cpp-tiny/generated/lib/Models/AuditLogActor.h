
/*
 * AuditLogActor.h
 *
 * The actor who performed the audit logged action.
 */

#ifndef TINY_CPP_CLIENT_AuditLogActor_H_
#define TINY_CPP_CLIENT_AuditLogActor_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuditLogActorApiKey.h"
#include "AuditLogActorSession.h"

namespace Tiny {


/*! \brief The actor who performed the audit logged action.
 *
 *  \ingroup Models
 *
 */

class AuditLogActor{
public:

    /*! \brief Constructor.
	 */
    AuditLogActor();
    AuditLogActor(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLogActor();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of actor. Is either `session` or `api_key`.
	 */
	std::string getType();

	/*! \brief Set The type of actor. Is either `session` or `api_key`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	AuditLogActorSession getSession();

	/*! \brief Set 
	 */
	void setSession(AuditLogActorSession  session);
	/*! \brief Get 
	 */
	AuditLogActorApiKey getApiKey();

	/*! \brief Set 
	 */
	void setApiKey(AuditLogActorApiKey  api_key);


    private:
    std::string type{};
    AuditLogActorSession session;
    AuditLogActorApiKey api_key;
};
}

#endif /* TINY_CPP_CLIENT_AuditLogActor_H_ */
