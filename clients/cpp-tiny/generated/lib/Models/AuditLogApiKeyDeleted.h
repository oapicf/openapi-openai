
/*
 * AuditLog_api_key_deleted.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_api_key_deleted_H_
#define TINY_CPP_CLIENT_AuditLog_api_key_deleted_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_api_key_deleted{
public:

    /*! \brief Constructor.
	 */
    AuditLog_api_key_deleted();
    AuditLog_api_key_deleted(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_api_key_deleted();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The tracking ID of the API key.
	 */
	std::string getId();

	/*! \brief Set The tracking ID of the API key.
	 */
	void setId(std::string  id);


    private:
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_api_key_deleted_H_ */
