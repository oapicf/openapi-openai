/*
 * AuditLogActorServiceAccount.h
 *
 * The service account that performed the audit logged action.
 */

#ifndef _AuditLogActorServiceAccount_H_
#define _AuditLogActorServiceAccount_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The service account that performed the audit logged action.
 *
 *  \ingroup Models
 *
 */

class AuditLogActorServiceAccount : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLogActorServiceAccount();
	AuditLogActorServiceAccount(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLogActorServiceAccount();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The service account id.
	 */
	std::string getId();

	/*! \brief Set The service account id.
	 */
	void setId(std::string  id);

private:
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLogActorServiceAccount_H_ */
