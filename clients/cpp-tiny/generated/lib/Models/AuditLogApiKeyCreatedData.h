
/*
 * AuditLog_api_key_created_data.h
 *
 * The payload used to create the API key.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_api_key_created_data_H_
#define TINY_CPP_CLIENT_AuditLog_api_key_created_data_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief The payload used to create the API key.
 *
 *  \ingroup Models
 *
 */

class AuditLog_api_key_created_data{
public:

    /*! \brief Constructor.
	 */
    AuditLog_api_key_created_data();
    AuditLog_api_key_created_data(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_api_key_created_data();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
	 */
	std::list<std::string> getScopes();

	/*! \brief Set A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
	 */
	void setScopes(std::list <std::string> scopes);


    private:
    std::list<std::string> scopes;
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_api_key_created_data_H_ */
