
/*
 * AuditLog_service_account_created_data.h
 *
 * The payload used to create the service account.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_service_account_created_data_H_
#define TINY_CPP_CLIENT_AuditLog_service_account_created_data_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The payload used to create the service account.
 *
 *  \ingroup Models
 *
 */

class AuditLog_service_account_created_data{
public:

    /*! \brief Constructor.
	 */
    AuditLog_service_account_created_data();
    AuditLog_service_account_created_data(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_service_account_created_data();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The role of the service account. Is either `owner` or `member`.
	 */
	std::string getRole();

	/*! \brief Set The role of the service account. Is either `owner` or `member`.
	 */
	void setRole(std::string  role);


    private:
    std::string role{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_service_account_created_data_H_ */
