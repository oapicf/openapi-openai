
/*
 * AuditLog_login_failed.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_login_failed_H_
#define TINY_CPP_CLIENT_AuditLog_login_failed_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_login_failed{
public:

    /*! \brief Constructor.
	 */
    AuditLog_login_failed();
    AuditLog_login_failed(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_login_failed();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string error_code{};
    std::string error_message{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_login_failed_H_ */
