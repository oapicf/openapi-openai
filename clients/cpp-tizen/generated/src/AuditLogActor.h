/*
 * AuditLogActor.h
 *
 * The actor who performed the audit logged action.
 */

#ifndef _AuditLogActor_H_
#define _AuditLogActor_H_


#include <string>
#include "AuditLogActorApiKey.h"
#include "AuditLogActorSession.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The actor who performed the audit logged action.
 *
 *  \ingroup Models
 *
 */

class AuditLogActor : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLogActor();
	AuditLogActor(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLogActor();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string type;
	AuditLogActorSession session;
	AuditLogActorApiKey api_key;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLogActor_H_ */
