
/*
 * AuditLog_api_key_created.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_api_key_created_H_
#define TINY_CPP_CLIENT_AuditLog_api_key_created_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuditLog_api_key_created_data.h"

namespace Tiny {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_api_key_created{
public:

    /*! \brief Constructor.
	 */
    AuditLog_api_key_created();
    AuditLog_api_key_created(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_api_key_created();


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
	/*! \brief Get 
	 */
	AuditLog_api_key_created_data getData();

	/*! \brief Set 
	 */
	void setData(AuditLog_api_key_created_data  data);


    private:
    std::string id{};
    AuditLog_api_key_created_data data;
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_api_key_created_H_ */
