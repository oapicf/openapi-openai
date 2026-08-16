
/*
 * AuditLog_rate_limit_deleted.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_rate_limit_deleted_H_
#define TINY_CPP_CLIENT_AuditLog_rate_limit_deleted_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_rate_limit_deleted{
public:

    /*! \brief Constructor.
	 */
    AuditLog_rate_limit_deleted();
    AuditLog_rate_limit_deleted(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_rate_limit_deleted();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The rate limit ID
	 */
	std::string getId();

	/*! \brief Set The rate limit ID
	 */
	void setId(std::string  id);


    private:
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_rate_limit_deleted_H_ */
