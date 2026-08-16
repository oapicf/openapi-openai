
/*
 * AuditLog_api_key_updated.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_api_key_updated_H_
#define TINY_CPP_CLIENT_AuditLog_api_key_updated_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuditLog_api_key_updated_changes_requested.h"

namespace Tiny {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_api_key_updated{
public:

    /*! \brief Constructor.
	 */
    AuditLog_api_key_updated();
    AuditLog_api_key_updated(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_api_key_updated();


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
	AuditLog_api_key_updated_changes_requested getChangesRequested();

	/*! \brief Set 
	 */
	void setChangesRequested(AuditLog_api_key_updated_changes_requested  changes_requested);


    private:
    std::string id{};
    AuditLog_api_key_updated_changes_requested changes_requested;
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_api_key_updated_H_ */
