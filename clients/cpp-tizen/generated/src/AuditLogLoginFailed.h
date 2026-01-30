/*
 * AuditLog_login_failed.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef _AuditLog_login_failed_H_
#define _AuditLog_login_failed_H_


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

class AuditLog_login_failed : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_login_failed();
	AuditLog_login_failed(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_login_failed();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The error code of the failure.
	 */
	std::string getErrorCode();

	/*! \brief Set The error code of the failure.
	 */
	void setErrorCode(std::string  error_code);
	/*! \brief Get The error message of the failure.
	 */
	std::string getErrorMessage();

	/*! \brief Set The error message of the failure.
	 */
	void setErrorMessage(std::string  error_message);

private:
	std::string error_code;
	std::string error_message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_login_failed_H_ */
