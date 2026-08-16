
/*
 * AuditLog_service_account_deleted.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_service_account_deleted_H_
#define TINY_CPP_CLIENT_AuditLog_service_account_deleted_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_service_account_deleted{
public:

    /*! \brief Constructor.
	 */
    AuditLog_service_account_deleted();
    AuditLog_service_account_deleted(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_service_account_deleted();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The service account ID.
	 */
	std::string getId();

	/*! \brief Set The service account ID.
	 */
	void setId(std::string  id);


    private:
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_service_account_deleted_H_ */
