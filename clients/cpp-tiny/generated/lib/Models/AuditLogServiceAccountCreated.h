
/*
 * AuditLog_service_account_created.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_service_account_created_H_
#define TINY_CPP_CLIENT_AuditLog_service_account_created_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuditLog_service_account_created_data.h"

namespace Tiny {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_service_account_created{
public:

    /*! \brief Constructor.
	 */
    AuditLog_service_account_created();
    AuditLog_service_account_created(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_service_account_created();


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
	/*! \brief Get 
	 */
	AuditLog_service_account_created_data getData();

	/*! \brief Set 
	 */
	void setData(AuditLog_service_account_created_data  data);


    private:
    std::string id{};
    AuditLog_service_account_created_data data;
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_service_account_created_H_ */
